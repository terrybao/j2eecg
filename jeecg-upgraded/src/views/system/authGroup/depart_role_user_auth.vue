
<template>
  <div class="vue-component">
    <div id="divUserList" class="easyui-layout" style="width:100%;">
    <div data-options="region:'west',split:true" title="<t:mutiLang langKey='common.department'/>" style="width:200px;">
        <ul id="departSelect" class="ztree" ></ul>
    </div>
    <div data-options="region:'center'">
        <t:datagrid checkbox="true" name="userLists" title="common.user.select" actionUrl="departAuthGroupController.do?departRoleUserDataGrid"
                    fit="true" fitColumns="true" idField="id" queryMode="group" sortName="createDate" sortOrder="desc">
            <el-table-column prop="id" label="common.id"></el-table-column>
            <el-table-column prop="userName" label="common.username"></el-table-column>
            <el-table-column prop="realName" label="common.real.name"></el-table-column>
            <el-table-column prop="orgNames" label="common.department"></el-table-column>
            <el-table-column prop="userKey" label="common.role"></el-table-column>
            <el-table-column prop="createBy" label="common.createby"></el-table-column>
            <el-table-column prop="createDate" label="common.createtime"></el-table-column>
            <el-table-column prop="updateBy" label="common.updateby"></el-table-column>
            <el-table-column prop="updateDate" label="common.updatetime"></el-table-column>
            <el-table-column prop="status" label="common.status"></el-table-column>
            <el-table-column prop="opt" label="common.operation"></el-table-column>
            <t:dgFunOpt funname="openAuthorizeSet(id)" title="分配部门角色" urlclass="ace_button"  urlfont="fa-cog" urlStyle="background-color:#18a689;"></t:dgFunOpt>
        </el-table>
    </div>
</div>
<div region="east" title="授权部门角色" style="width: 300px;" split="true" id="functionListPanel">
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
