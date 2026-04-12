#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
JEECG 项目代码分析工具
用于分析 JSP 文件结构，生成迁移报告
"""

import os
import re
import json
from collections import Counter

class JspAnalyzer:
    def __init__(self, base_dir):
        self.base_dir = base_dir
        self.jsp_files = []
        self.analysis_result = {
            'total_files': 0,
            'total_lines': 0,
            'file_details': [],
            'tag_usage': Counter(),
            'script_usage': Counter(),
            'complexity_distribution': {
                'low': 0,
                'medium': 0,
                'high': 0
            }
        }
    
    def find_jsp_files(self):
        """查找所有 JSP 文件"""
        for root, dirs, files in os.walk(self.base_dir):
            for file in files:
                if file.endswith('.jsp') or file.endswith('.jspi'):
                    file_path = os.path.join(root, file)
                    self.jsp_files.append(file_path)
        
    def analyze_file(self, file_path):
        """分析单个 JSP 文件"""
        try:
            with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
        except Exception as e:
            print(f"Error reading {file_path}: {e}")
            return
        
        lines = content.split('\n')
        line_count = len(lines)
        
        # 分析 JSP 标签使用情况
        jsp_tags = re.findall(r'<\s*[jt]:\w+', content)
        self.analysis_result['tag_usage'].update(jsp_tags)
        
        # 分析脚本使用情况
        script_tags = re.findall(r'<\s*script[^>]*>', content)
        self.analysis_result['script_usage'].update(script_tags)
        
        # 评估复杂度
        complexity = 'low'
        if line_count > 500:
            complexity = 'high'
        elif line_count > 200:
            complexity = 'medium'
        
        self.analysis_result['complexity_distribution'][complexity] += 1
        
        # 保存文件详情
        relative_path = os.path.relpath(file_path, self.base_dir)
        self.analysis_result['file_details'].append({
            'path': relative_path,
            'lines': line_count,
            'complexity': complexity
        })
        
        self.analysis_result['total_files'] += 1
        self.analysis_result['total_lines'] += line_count
    
    def generate_report(self):
        """生成分析报告"""
        # 按复杂度排序文件
        self.analysis_result['file_details'].sort(key=lambda x: x['lines'], reverse=True)
        
        # 生成 JSON 报告
        report_path = os.path.join(os.path.dirname(__file__), 'analysis-report.json')
        with open(report_path, 'w', encoding='utf-8') as f:
            json.dump(self.analysis_result, f, ensure_ascii=False, indent=2)
        
        # 生成文本报告
        text_report_path = os.path.join(os.path.dirname(__file__), 'analysis-report.txt')
        with open(text_report_path, 'w', encoding='utf-8') as f:
            f.write("JEECG 项目 JSP 文件分析报告\n")
            f.write("=" * 60 + "\n")
            f.write(f"总文件数: {self.analysis_result['total_files']}\n")
            f.write(f"总行数: {self.analysis_result['total_lines']}\n")
            f.write(f"平均行数: {self.analysis_result['total_lines'] // self.analysis_result['total_files'] if self.analysis_result['total_files'] > 0 else 0}\n")
            f.write("\n复杂度分布:\n")
            for level, count in self.analysis_result['complexity_distribution'].items():
                f.write(f"{level}: {count} files\n")
            f.write("\nJSP 标签使用情况:\n")
            for tag, count in self.analysis_result['tag_usage'].most_common(10):
                f.write(f"{tag}: {count}\n")
            f.write("\n脚本标签使用情况:\n")
            for script, count in self.analysis_result['script_usage'].most_common(5):
                f.write(f"{script}: {count}\n")
            f.write("\n文件复杂度排名前10:\n")
            for i, file_info in enumerate(self.analysis_result['file_details'][:10], 1):
                f.write(f"{i}. {file_info['path']} - {file_info['lines']} lines - {file_info['complexity']}\n")
        
        print(f"分析完成！报告已生成到 {report_path} 和 {text_report_path}")
    
    def run(self):
        """运行分析"""
        print(f"开始分析 {self.base_dir} 目录下的 JSP 文件...")
        self.find_jsp_files()
        print(f"找到 {len(self.jsp_files)} 个 JSP 文件")
        
        for i, file_path in enumerate(self.jsp_files, 1):
            if i % 10 == 0:
                print(f"分析中... {i}/{len(self.jsp_files)}")
            self.analyze_file(file_path)
        
        self.generate_report()

if __name__ == '__main__':
    # 分析 jeecg 项目的 webapp 目录
    base_dir = '/workspace/src/main/webapp'
    analyzer = JspAnalyzer(base_dir)
    analyzer.run()