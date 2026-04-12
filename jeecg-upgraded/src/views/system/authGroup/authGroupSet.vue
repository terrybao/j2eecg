
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
			<tr>								
				<th style="width:350px;"><span>管理员组名称:</span></th>
				<td class="ng-binding">
					<input type="text" name="groupName" id="groupName" value="${departAuthGroup.groupName }" />
				</td>
			</tr>
			
			<c:set var="curId" value="${departAuthGroup.id}"></c:set>
			<tr>
				<th><span>部门名称:</span></th>
				<td class="ng-binding">
					<input id="deptId" name="deptId" type="hidden" value="${departAuthGroup.deptId}">
					<input id="deptName" name="deptName" type="text" value="${departAuthGroup.deptName}" <c:if test="${not empty curId}">onclick="javascript:void(0)" readonly="readonly"</c:if> onclick="openDepartmentSelect()">
				</td>
			</tr>
			<tr style="display:none">
				<th><span>部门编码:</span></th>
				<td class="ng-binding">
					<input type="hidden" value="${departAuthGroup.departType}" id="departType" name="departType">
					<input type="text" name="deptCode" id="deptCode" value="${departAuthGroup.deptCode }" />
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
