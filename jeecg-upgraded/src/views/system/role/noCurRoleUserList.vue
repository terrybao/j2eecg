
<template>
  <div class="vue-component">
    </t:base>
<div id="main_role_list" class="easyui-layout" fit="true">
    <div region="center" style="padding:0px;border:0px">
        <t:datagrid name="noCurRoleUserList" title="common.operation"
                    actionUrl="roleController.do?addUserToRoleList&roleId=${param.roleId}" fit="true" fitColumns="true"
                    idField="id" checkbox="true" queryMode="group">
            <el-table-column prop="id" label="编号"></el-table-column>
            <el-table-column prop="userName" label="common.username"></el-table-column>
            <el-table-column prop="realName" label="common.real.name"></el-table-column>
            <el-table-column prop="userType" label="common.user.type"></el-table-column>
            <el-table-column prop="status" label="common.status"></el-table-column>
        </el-table>
    </div>
</div>

<div style="display: none">
    <el-form :model="form" ref="form" label-width="80px">
        <input id="userIds" name="userIds">
    </el-form>
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
