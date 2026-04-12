
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
<div class="datagrid-toolbar">
	<a class="easyui-linkbutton l-btn l-btn-plain" onclick="saveObj()">
		<i class="fa fa-plus"></i><span class="bigger-110 no-text-shadow"> 保  存</span>
	</a>
</div>
<input type="hidden" id="id" name="id" value="${departAuthGroup.id}"/>
<input type="hidden" id="level" name="level" value="${departAuthGroup.level}"/>
	<table class="table-form" cellspacing="0">
		<tbody>
			<c:set var="curId" value="${departAuthGroup.id}"></c:set>
			<tr>
				<th><span>管理员组名称:</span></th>
				<td class="ng-binding">
					<input type="text" id="groupName" readonly="readonly" name="groupName" value="${departAuthGroup.groupName}"/>
				</td>
			</tr>
			<tr>								
				<th style="width:350px;"><span>角色名称:</span></th>
				<td class="ng-binding">
					<input type="text" name="roleName" id="roleName" />
				</td>
			</tr>
			<tr>								
				<th style="width:350px;"><span>角色编码:</span></th>
				<td class="ng-binding">
					<input type="text" name="roleCode" id="roleCode" />
				</td>
			</tr>
			<input id="deptId" name="deptId" type="hidden" value="${departAuthGroup.deptId}">
			<input id="deptName" name="deptName" type="hidden" value="${departAuthGroup.deptName}">
			<input type="hidden" name="deptCode" id="deptCode" value="${departAuthGroup.deptCode }"/>
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
