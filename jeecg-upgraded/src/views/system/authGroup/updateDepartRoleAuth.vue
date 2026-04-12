
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
<div class="datagrid-toolbar">
	<a class="easyui-linkbutton l-btn l-btn-plain" onclick="saveObj()">
		<i class="fa fa-plus"></i><span class="bigger-110 no-text-shadow"> 保  存</span>
	</a>
</div>
<input type="hidden" id="id" name="id" value="${role.id}"/>
<input type="hidden" id="groupId" name="groupId" value="${role.departAgId}"/>
<input type="hidden" id="roleType" name="roleType" value="${role.roleType}"/>
	<table class="table-form" cellspacing="0">
		<tbody>
			<tr>								
				<th style="width:350px;"><span>角色名称:</span></th>
				<td class="ng-binding">
					<input type="text" name="roleName" id="roleName" value="${role.roleName}"/>
				</td>
			</tr>
			<tr>								
				<th style="width:350px;"><span>角色编码:</span></th>
				<td class="ng-binding">
					<input type="text" name="roleCode" id="roleCode" value="${role.roleCode }" />
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
