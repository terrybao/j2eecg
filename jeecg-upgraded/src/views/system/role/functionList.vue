
<template>
  <div class="vue-component">
    <t:datagrid name="functionList" title="permission.manage" actionUrl="roleController.do?setOperate&roleId=${roleId}" idField="functionid" treegrid="true" pagination="false">
	<el-table-column prop="id" label="common.id"></el-table-column>
	<el-table-column prop="functionName" label="permission.name"></el-table-column>
	<el-table-column prop="TOperations" label="common.operation"></el-table-column>
</el-table>
<div id="functionListtb" style="padding: 5px; height: 30px">
<div style="float: left;"><input type="hidden" name="roleId" id="roleId" value="${roleId }"> <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="op();">保存</a> <a
	href="#" class="easyui-linkbutton" plain="true" icon="icon-back" onClick="history.go(-1)">返回</a></div>
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
