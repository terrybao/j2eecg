
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jeecgDemoList" checkbox="true" sortName="birthday,name" pagination="true" fitColumns="true" title="多表头列表 Demo" 
  												   actionUrl="jeecgListDemoController.do?datagrid" idField="id" fit="true" queryMode="group">
    <el-table-column prop="id" label="id"></el-table-column>
    <el-table-column prop="salary" label="<b>多表头标签列表</b>"></el-table-column>
     <el-table-column prop="status" label="入职状态"></el-table-column>
     <el-table-column prop="createDate" label="创建日期"></el-table-column>
   <el-table-column prop="opt" label="操作"></el-table-column>
    
    <el-table-column prop="name" label="名称"></el-table-column>
    <el-table-column prop="age" label="年龄"></el-table-column>
    <el-table-column prop="sex" label="性别"></el-table-column>
    <el-table-column prop="phone" label="电话"></el-table-column>
    <el-table-column prop="depId" label="部门"></el-table-column>
   	<el-table-column prop="extField" label="部门code"></el-table-column>
   
   <t:dgDelOpt title="删除" url="jeecgListDemoController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgFunOpt exp="status#eq#N" title="审核" funname="szqm(id)" urlclass="ace_button"  urlfont="fa-check" />
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
