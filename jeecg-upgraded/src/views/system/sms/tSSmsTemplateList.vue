
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="tSSmsTemplateList" checkbox="true" fitColumns="false" title="common.msgTemplateTable" actionUrl="tSSmsTemplateController.do?datagrid" idField="id" fit="true" queryMode="group">
   <el-table-column prop="id" label="common.isId"></el-table-column>
   <el-table-column prop="templateCode" label="common.templateCode"></el-table-column>
   <el-table-column prop="templateName" label="common.templateName"></el-table-column>
   <el-table-column prop="templateType" label="common.templateType"></el-table-column>
   <el-table-column prop="templateContent" label="common.templateContent"></el-table-column>
   <el-table-column prop="opt" label="common.opt"></el-table-column>
   <t:dgDelOpt title="common.deleteTo" url="tSSmsTemplateController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o" />
   <t:dgFunOpt funname="pushTest(id,templateCode)" title="common.pushTest" urlclass="ace_button" urlfont="fa-upload"></t:dgFunOpt>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
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
