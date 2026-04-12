
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="tSSmsList" checkbox="true" fitColumns="false" title="我的消息列表" actionUrl="tSSmsController.do?mydatagrid" idField="id" fit="true" queryMode="group" sortName="createDate" sortOrder="desc">
   <el-table-column prop="id" label="common.esId"></el-table-column>
   <el-table-column prop="isRead" label="common.isRead"></el-table-column>
   
   <el-table-column prop="esTitle" label="common.messageHeader"></el-table-column>
   <el-table-column prop="esSender" label="common.sender"></el-table-column>
   <el-table-column prop="esContent" label="common.content_2"></el-table-column>
  
   <el-table-column prop="esSendtime" label="common.sendtime"></el-table-column>
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
