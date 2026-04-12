
<template>
  <div class="vue-component">
    <t:datagrid name="noticeAuthorityRoleList" checkbox="true" fitColumns="false" title="common.authority.role" actionUrl="noticeAuthorityRoleController.do?datagrid&noticeId=${noticeId}" idField="id" fit="true" queryMode="group">
   <el-table-column prop="id" label="ID"></el-table-column>
   <el-table-column prop="noticeId" label="通告ID"></el-table-column>
   <el-table-column prop="role.roleName" label="common.role.name"></el-table-column>
   <el-table-column prop="opt" label="common.operation"></el-table-column>
   <t:dgDelOpt title="common.delete" url="noticeAuthorityRoleController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <div class="toolbar"></div>
  </el-table>
   <input type="hidden" id="pNoticeId" value="${noticeId}" />
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
