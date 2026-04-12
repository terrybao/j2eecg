
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="noticeList" title="common.notice" actionUrl="noticeController.do?datagrid" idField="id" fit="true" sortName="createTime" sortOrder="desc">
   <el-table-column prop="id" label="编号"></el-table-column>
   <el-table-column prop="isRead" label="状态"></el-table-column>
   <el-table-column prop="noticeTitle" label="标题"></el-table-column>
   <el-table-column prop="createTime" label="时间"></el-table-column>
   <el-table-column prop="opt" label="common.operation"></el-table-column>
   <t:dgFunOpt funname="doRead(id,isRead)" title="common.read" urlclass="ace_button"  urlfont="fa-trash-o"></t:dgFunOpt>
  </el-table>
  </div>
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
