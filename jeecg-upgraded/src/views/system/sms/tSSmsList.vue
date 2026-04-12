
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="tSSmsList" checkbox="true" fitColumns="false" title="common.messageSend.record" actionUrl="tSSmsController.do?datagrid" idField="id" fit="true" queryMode="group" sortName="createDate" sortOrder="desc">
   <el-table-column prop="id" label="common.esId"></el-table-column>
   <el-table-column prop="esType" label="common.messageType"></el-table-column>
   <el-table-column prop="esTitle" label="common.messageHeader"></el-table-column>
   <el-table-column prop="esSender" label="common.sender"></el-table-column>
   <el-table-column prop="esReceiver" label="common.receiver"></el-table-column>
   <el-table-column prop="esContent" label="common.content_2"></el-table-column>
   <el-table-column prop="createDate" label="common.dateCreated"></el-table-column>
   <el-table-column prop="esSendtime" label="common.sendtime"></el-table-column>
   <el-table-column prop="esStatus" label="common.sendState"></el-table-column>
   <el-table-column prop="remark" label="common.remark"></el-table-column>
   <div class="toolbar"></div>
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
