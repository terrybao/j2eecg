
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<table class="table-form" cellspacing="0">
		<tbody>
			<tr>
				<th><span>管理员组名称:</span></th>
				<td class="ng-binding">
					<lable name="deptName">${departAuthGroup.deptName}</lable>
				</td>
			</tr>
			<tr>
				<th><span>部门名称:</span></th>
				<td class="ng-binding">
					<lable name="deptName">${departAuthGroup.groupName}</lable>
				</td>
			</tr>
			<tr>
				<th><span>部门编码:</span></th>
				<td class="ng-binding">
					<lable name="deptCode">${departAuthGroup.deptCode}</lable>
				</td>
			</tr>
		</tbody>
	</table>
</el-form>
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
