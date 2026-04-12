
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
	<div region="center" style="padding: 1px;">
	<t:datagrid name="userList" title="common.user.select" actionUrl="userController.do?datagrid" fitColumns="true" idField="id" queryMode="group"  checkbox="true"  sortName="createDate" sortOrder="desc" onLoadSuccess="initCheck">
		<el-table-column prop="id" label="common.code"></el-table-column>
		<el-table-column prop="userName" label="common.username"></el-table-column>
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
