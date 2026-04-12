
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jeecgrowList"  checkbox="true" pagination="true" fitColumns="true" 
  title="jeecg_rowedit" actionUrl="jeecgListDemoController.do?datagrid" idField="id"  queryMode="group">
    <el-table-column prop="id" label="id"></el-table-column>
    <el-table-column prop="name" label="名称"></el-table-column>
    <el-table-column prop="age" label="年龄"></el-table-column>
    <el-table-column prop="birthday" label="生日"></el-table-column>
    <el-table-column prop="sex" label="性别"></el-table-column>
    <el-table-column prop="salary" label="工资"></el-table-column>
    <el-table-column prop="status" label="入职状态"></el-table-column>
    <el-table-column prop="content" label="个人介绍"></el-table-column>
  
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
