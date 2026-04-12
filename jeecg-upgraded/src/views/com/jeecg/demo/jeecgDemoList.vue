
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jeecgDemoList" checkbox="true" sortName="birthday,name" pagination="true" fitColumns="false" title="jeecg_demo" 
  	  superQuery="true" actionUrl="jeecgListDemoController.do?datagrid" idField="id" fit="true" queryMode="group" filter="true">
    <el-table-column prop="id" label="id"></el-table-column>
    <el-table-column prop="name" label="名称"></el-table-column>
    
    <!-- 字段 formatterjs 例子 -->
    <el-table-column prop="age" label="年龄"></el-table-column>
    
    <el-table-column prop="birthday" label="生日"></el-table-column>
    <el-table-column prop="depId" label="部门"></el-table-column>
    <el-table-column prop="extField" label="部门编码(拓展字段)"></el-table-column>
    <el-table-column prop="sex" label="性别"></el-table-column>
    <el-table-column prop="phone" label="电话"></el-table-column>
    <el-table-column prop="salary" label="工资"></el-table-column>
    <el-table-column prop="createDate" label="创建日期"></el-table-column>
    <!-- 列表查询条件popup例子 -->
    <el-table-column prop="email" label="邮箱"></el-table-column>
    <el-table-column prop="status" label="入职状态"></el-table-column>
    <el-table-column prop="content" label="个人介绍"></el-table-column>
   <el-table-column prop="touxiang" label="头像"></el-table-column>
    <el-table-column prop="createBy" label="创建人id"></el-table-column>
    <el-table-column prop="createName" label="创建人"></el-table-column>
    <el-table-column prop="updateBy" label="修改人id"></el-table-column>
    <el-table-column prop="updateDate" label="修改时间"></el-table-column>
    <el-table-column prop="updateName" label="修改人"></el-table-column>
   <el-table-column prop="opt" label="操作"></el-table-column>
   <t:dgDelOpt title="删除" url="jeecgListDemoController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgFunOpt exp="status#eq#N" title="审核" funname="szqm(id)" urlclass="ace_button"  urlfont="fa-check" />
   <div class="toolbar"></div>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
    
  </el-table>
  </div>
 </div>
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
