
<template>
  <div class="vue-component">
    </t:base>
<input type="hidden" id="groupId" name="groupId" value="${groupId}">
<t:datagrid name="userList" title="common.operation" actionUrl="departAuthGroupController.do?getDepartGroupUser&groupId=${groupId}" fit="true" fitColumns="true" idField="id" queryMode="group" sortName="createDate,userName" sortOrder="asc,desc">
	<el-table-column prop="id" label="common.id"></el-table-column>
	<el-table-column prop="userName" label="common.username"></el-table-column>
	<el-table-column prop="realName" label="common.real.name"></el-table-column>
	<el-table-column prop="roles" label="common.role"></el-table-column>
	<el-table-column prop="opt" label="common.operation"></el-table-column>
	<t:dgFunOpt funname="deleteDialog(userName)" title="common.delete" urlclass="ace_button"  urlfont="fa-trash-o"></t:dgFunOpt>
	<input id="roleId" name="roleId" type="hidden" value="${roleId}"/>
    <input name="roleName" id="roleName" type="hidden" value="${roleName}" readonly="readonly" datatype="*" />
    <t:dgFunOpt funname="openSelectRoles(id)" title="分配角色" urlclass="ace_button" urlfont="fa fa-book"></t:dgFunOpt>
</el-table>
<div id="userListtb" style="padding: 3px; height: 25px;border-top: 1px solid #D7D7D7">
	 <div style="float: left;">
	<a class="easyui-linkbutton l-btn l-btn-plain" style="position: absolute;top: 40px" onclick="openSelectSort()">
		<i class="fa fa-plus"></i><span class="bigger-110 no-text-shadow"> 添加用户</span>
	</a>
	 </div>
	</div>
<!--  -->
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
