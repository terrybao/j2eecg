
<template>
  <div class="vue-component">
    <div id="divUserList" class="easyui-layout" style="width:100%;">
    <div data-options="region:'center'">
	<t:datagrid name="departUserList" title="common.operation"
	            actionUrl="organzationController.do?userDatagrid&departid=${departid}" fit="true" fitColumns="true" idField="id" queryMode="group">
		<el-table-column prop="id" label="编号"></el-table-column>
		<el-table-column prop="userName" label="common.username"></el-table-column>
		<el-table-column prop="realName" label="common.real.name"></el-table-column>
		<el-table-column prop="userOrgList.tsDepart.departname" label="common.department"></el-table-column>
		<el-table-column prop="positionName" label="common.position.name"></el-table-column>
		<el-table-column prop="status" label="common.status"></el-table-column>
		<el-table-column prop="opt" label="common.operation"></el-table-column>
		<t:dgDelOpt title="解除机构关系" url="organzationController.do?delUserOrg&userid={id}&departid=${departid }" urlclass="ace_button"  urlfont="fa-trash-o"/>
		<t:dgFunOpt funname="setUsersCompanyPosition(id)" title="分配职务" urlclass="ace_button"  urlfont="fa-user"></t:dgFunOpt>
		<div class="toolbar"></div>
		<div class="toolbar"></div>
		<div class="toolbar"></div>
	    <t:dgFunOpt funname="openAuthorizeSet(id)" title="分配部门角色" urlclass="ace_button"  urlfont="fa-cog" urlStyle="background-color:#18a689;"></t:dgFunOpt>
	</el-table>
 </div>
</div>
<div region="east" title="分配职务" style="width: 300px;" split="true" id="functionListPanel">
	<div id="orgTree" class="ztree"></div>
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
