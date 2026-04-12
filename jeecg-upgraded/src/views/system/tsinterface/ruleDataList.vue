
<template>
  <div class="vue-component">
    <t:datagrid name="operationList" title="接口权限规则" actionUrl="interfaceController.do?ruledatagrid&interfaceId=${interfaceId}" idField="id">
	<el-table-column prop="id" label="common.id"></el-table-column>
	<el-table-column prop="ruleName" label=" 规则名称"></el-table-column>
    <el-table-column prop="ruleColumn" label=" 规则字段"></el-table-column>
    <el-table-column prop="ruleConditions" label=" 规则条件"></el-table-column>
    <el-table-column prop="ruleValue" label=" 规则值"></el-table-column>
    <el-table-column prop="opt" label="common.operation"></el-table-column>
	<t:dgDelOpt url="interfaceController.do?delrule&id={id}" title="common.delete" urlclass="ace_button"  urlfont="fa-trash-o"></t:dgDelOpt>
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
