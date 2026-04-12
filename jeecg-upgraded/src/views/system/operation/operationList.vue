
<template>
  <div class="vue-component">
    <t:datagrid name="operationList" title="operate.manage" actionUrl="functionController.do?opdategrid&functionId=${functionId}" idField="id">
	<el-table-column prop="id" label="common.id"></el-table-column>
	<el-table-column prop="operationname" label="operate.name"></el-table-column>
	<el-table-column prop="operationcode" label="operate.code"></el-table-column>
	<el-table-column prop="operationType" label="common.type"></el-table-column>


	<el-table-column prop="opt" label="common.operation"></el-table-column>
	<t:dgDelOpt url="functionController.do?delop&id={id}" title="common.delete" urlclass="ace_button"  urlfont="fa-trash-o"></t:dgDelOpt>
	<t:dgFunOpt funname="editoperation(id,operationname)" title="common.edit" urlclass="ace_button"  urlfont="fa-edit"></t:dgFunOpt>
	<div class="toolbar"></div>
</el-table>
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
