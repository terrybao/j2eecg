
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
<div region="center" style="padding:0px;border:0px">
 <t:datagrid name="roleList" title="接口角色列表" actionUrl="interroleController.do?roleGrid" fitColumns="true"  idField="id" sortName="id" sortOrder="desc" queryMode="group"   >
	<el-table-column prop="id" label="common.code"></el-table-column>
	<el-table-column prop="roleCode" label="接口角色编码"></el-table-column>
	<el-table-column prop="roleName" label="接口角色名称"></el-table-column>
	<el-table-column prop="createBy" label="common.createby"></el-table-column>
	<el-table-column prop="createDate" label="common.createtime"></el-table-column>
	<el-table-column prop="updateBy" label="common.updateby"></el-table-column>
	<el-table-column prop="updateDate" label="common.updatetime"></el-table-column>
	<el-table-column prop="opt" label="common.operation"></el-table-column>
	<t:dgFunOpt funname="delRole(id)"  title="common.delete" urlclass="ace_button"  urlStyle="background-color:#ec4758;" urlfont="fa-trash-o"></t:dgFunOpt>
    <t:dgFunOpt funname="userListbyrole(id,roleName)" title="common.user" urlclass="ace_button"  urlfont="fa-user"></t:dgFunOpt>
	<t:dgFunOpt funname="setfunbyrole(id,roleName)" title="permission.set" urlclass="ace_button" urlStyle="background-color:#18a689;"  urlfont="fa-cog"></t:dgFunOpt>
	<div class="toolbar"></div>
	<div class="toolbar"></div>
	
 </el-table></div>
</div>
<div region="east" style="width: 600px;" split="true">
<div tools="#tt" class="easyui-panel" title='{{ $t("接口权限设置") }}' style="padding: 10px;" fit="true" border="false" id="function-panel"></div>
</div>
<div id="tt"></div>
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
