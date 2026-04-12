
<template>
  <div class="vue-component">
    </t:base>

<t:datagrid name="userList" title="common.operation" actionUrl="userController.do?interfaceUserDatagrid" fit="true" fitColumns="true" idField="id" queryMode="group" sortName="createDate,userName" sortOrder="asc,desc">
	<el-table-column prop="id" label="common.id"></el-table-column>
	<el-table-column prop="userName" label="common.username"></el-table-column>
	<el-table-column prop="realName" label="common.real.name"></el-table-column>
	<el-table-column prop="userType" label="common.user.type"></el-table-column>
	<el-table-column prop="userKey" label="common.role"></el-table-column>
	<el-table-column prop="mobilePhone" label="手机号码"></el-table-column>
	<el-table-column prop="opt" label="common.operation"></el-table-column>
	<t:dgDelOpt title="common.delete" url="userController.do?delInterfaceUser&userid={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
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
