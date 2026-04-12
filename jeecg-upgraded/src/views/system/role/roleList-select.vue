
<template>
  <div class="vue-component">
    <t:datagrid name="roleList" title="common.role.select" actionUrl="userController.do?datagridRole" idField="id"  showRefresh="false" >
	<el-table-column prop="id" label="common.code"></el-table-column>
	<el-table-column prop="roleName" label="common.role.name"></el-table-column>
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
