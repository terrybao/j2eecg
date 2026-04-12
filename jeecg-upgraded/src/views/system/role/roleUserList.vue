
<template>
  <div class="vue-component">
    <t:datagrid name="roleUserList" title="common.operation"
            actionUrl="roleController.do?roleUserDatagrid&roleId=${roleId}" fit="true" fitColumns="true" idField="id" queryMode="group">
	<el-table-column prop="id" label="编号"></el-table-column>
	<el-table-column prop="userName" label="common.username"></el-table-column>
	<el-table-column prop="realName" label="common.real.name"></el-table-column>
	<el-table-column prop="status" label="common.status"></el-table-column>
	<el-table-column prop="opt" label="common.operation"></el-table-column>
	<t:dgDelOpt title="common.delete" url="roleController.do?delUserRole&userid={id}&roleid=${roleId }" urlclass="ace_button"  urlfont="fa-trash-o"/>
	<div class="toolbar"></div>
	<div class="toolbar"></div>
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
