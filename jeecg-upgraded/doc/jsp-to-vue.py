#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
JEECG 项目 JSP 到 Vue 迁移工具
用于批量将 JSP 文件转换为 Vue 组件
"""

import os
import re
import html

class JspToVueConverter:
    def __init__(self, base_dir, output_dir):
        self.base_dir = base_dir
        self.output_dir = output_dir
        self.conversion_count = 0
    
    def find_jsp_files(self):
        """查找所有 JSP 文件"""
        jsp_files = []
        for root, dirs, files in os.walk(self.base_dir):
            for file in files:
                if file.endswith('.jsp'):
                    file_path = os.path.join(root, file)
                    jsp_files.append(file_path)
        return jsp_files
    
    def convert_file(self, file_path):
        """转换单个 JSP 文件为 Vue 组件"""
        try:
            with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
        except Exception as e:
            print(f"Error reading {file_path}: {e}")
            return
        
        # 提取文件信息
        relative_path = os.path.relpath(file_path, self.base_dir)
        vue_file_path = os.path.join(self.output_dir, relative_path.replace('.jsp', '.vue'))
        
        # 创建输出目录
        os.makedirs(os.path.dirname(vue_file_path), exist_ok=True)
        
        # 转换内容
        vue_content = self.convert_content(content)
        
        # 写入 Vue 文件
        try:
            with open(vue_file_path, 'w', encoding='utf-8') as f:
                f.write(vue_content)
            self.conversion_count += 1
            print(f"Converted: {relative_path} -> {vue_file_path}")
        except Exception as e:
            print(f"Error writing {vue_file_path}: {e}")
    
    def convert_content(self, content):
        """转换 JSP 内容为 Vue 组件"""
        # 移除 JSP 指令
        content = re.sub(r'<%@.*?%>', '', content, flags=re.DOTALL)
        
        # 移除 JSP 脚本
        content = re.sub(r'<\%.*?\%>', '', content, flags=re.DOTALL)
        
        # 转换 JSP 表达式
        content = re.sub(r'<\$\{(.*?)\}', r'{{ \1 }}', content)
        
        # 转换多语言标签
        content = re.sub(r'<t:mutiLang langKey="(.*?)"/>', r'{{ $t("\1") }}', content)
        content = re.sub(r'<t:mutiLang langKey="(.*?)">(.*?)</t:mutiLang>', r'{{ $t("\1") }}', content)
        
        # 转换基础标签
        content = re.sub(r'<t:base.*?>', '', content)
        
        # 转换数据表格相关标签
        content = self.convert_datagrid_tags(content)
        
        # 转换表单验证标签
        content = self.convert_form_valid_tags(content)
        
        # 转换字典选择标签
        content = self.convert_dict_select_tags(content)
        
        # 转换脚本标签
        content = self.convert_script_tags(content)
        
        # 提取标题
        title_match = re.search(r'<title>(.*?)</title>', content)
        title = title_match.group(1) if title_match else 'Vue Component'
        
        # 提取 body 内容
        body_match = re.search(r'<body[^>]*>(.*?)</body>', content, flags=re.DOTALL)
        body_content = body_match.group(1) if body_match else content
        
        # 生成 Vue 组件
        vue_template = '''
<template>
  <div class="vue-component">
    ''' + body_content.strip() + '''
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import { ElMessage, ElNotification } from 'element-plus'

// Component logic here
onMounted(() => {
  // Initialization code here
})
</script>

<style scoped>
/* Component styles here */
</style>
'''
        
        return vue_template
    
    def convert_datagrid_tags(self, content):
        """转换数据表格相关标签"""
        # 转换 datagrid 标签
        content = re.sub(r'<t:datagrid.*?id="(.*?)".*?url="(.*?)".*?>', 
                       r'<el-table :data="tableData" style="width: 100%">', content, flags=re.DOTALL)
        content = re.sub(r'</t:datagrid>', r'</el-table>', content)
        
        # 转换 dgCol 标签
        content = re.sub(r'<t:dgCol.*?title="(.*?)".*?field="(.*?)".*?>', 
                       r'<el-table-column prop="\2" label="\1">', content, flags=re.DOTALL)
        content = re.sub(r'</t:dgCol>', r'</el-table-column>', content)
        
        # 转换 dgToolBar 标签
        content = re.sub(r'<t:dgToolBar.*?>', r'<div class="toolbar">', content, flags=re.DOTALL)
        content = re.sub(r'</t:dgToolBar>', r'</div>', content)
        
        return content
    
    def convert_form_valid_tags(self, content):
        """转换表单验证标签"""
        # 转换 formvalid 标签
        content = re.sub(r'<t:formvalid.*?formid="(.*?)".*?>', 
                       r'<el-form :model="form" ref="form" label-width="80px">', content, flags=re.DOTALL)
        content = re.sub(r'</t:formvalid>', r'</el-form>', content)
        
        return content
    
    def convert_dict_select_tags(self, content):
        """转换字典选择标签"""
        # 转换 dictSelect 标签
        content = re.sub(r'<t:dictSelect.*?id="(.*?)".*?field="(.*?)".*?typeGroupCode="(.*?)".*?>', 
                       r'<el-select v-model="form.\2" placeholder="请选择">', content, flags=re.DOTALL)
        content = re.sub(r'</t:dictSelect>', r'</el-select>', content)
        
        return content
    
    def convert_script_tags(self, content):
        """转换脚本标签"""
        # 提取脚本内容
        script_matches = re.findall(r'<script[^>]*>(.*?)</script>', content, flags=re.DOTALL)
        script_content = '\n'.join(script_matches)
        
        # 移除脚本标签
        content = re.sub(r'<script[^>]*>.*?</script>', '', content, flags=re.DOTALL)
        
        # 转换 jQuery 代码为 Vue 代码
        if script_content:
            # 转换 $(document).ready
            script_content = re.sub(r'\$\(document\)\.ready\(function\(\)\{', 'onMounted(() => {', script_content)
            script_content = re.sub(r'\}\);', '});', script_content)
            
            # 转换 jQuery 选择器
            script_content = re.sub(r'\$\(("|)(.*?)("|)\)', r'document.querySelector("\2")', script_content)
            
            # 转换 click 事件
            script_content = re.sub(r'\.click\(function\(\)\{', '.addEventListener("click", () => {', script_content)
            
            # 添加到 Vue 组件的 script 部分
            content = content.replace('// Component logic here', script_content)
        
        return content
    
    def run(self):
        """运行转换"""
        print(f"开始转换 {self.base_dir} 目录下的 JSP 文件...")
        jsp_files = self.find_jsp_files()
        print(f"找到 {len(jsp_files)} 个 JSP 文件")
        
        for i, file_path in enumerate(jsp_files, 1):
            if i % 10 == 0:
                print(f"转换中... {i}/{len(jsp_files)}")
            self.convert_file(file_path)
        
        print(f"转换完成！成功转换 {self.conversion_count} 个文件到 {self.output_dir}")

if __name__ == '__main__':
    # 转换 jeecg 项目的 login 和 main 目录
    base_dir = '/workspace/src/main/webapp/webpage'
    output_dir = '/workspace/jeecg-upgraded/src/views'
    
    converter = JspToVueConverter(base_dir, output_dir)
    converter.run()