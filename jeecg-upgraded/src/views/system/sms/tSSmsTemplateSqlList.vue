
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="tSSmsTemplateSqlList" checkbox="true" fitColumns="false" title="common.sqlDataTable" actionUrl="tSSmsTemplateSqlController.do?datagrid" idField="id" fit="true" queryMode="group">
   <el-table-column prop="id" label="common.esId"></el-table-column>
   <el-table-column prop="code" label="common.configurationCODE"></el-table-column>
   <el-table-column prop="name" label="common.configurationName"></el-table-column>
   <el-table-column prop="sqlId" label="common.sqlBusinessId"></el-table-column>
   <el-table-column prop="templateId" label="common.msgModeliD"></el-table-column>
   <el-table-column prop="createDate" label="common.createDate"></el-table-column>
   <el-table-column prop="opt" label="common.opt"></el-table-column>
   <t:dgDelOpt title="common.delete" url="tSSmsTemplateSqlController.do?doDel&id={id}" urlclass="ace_button" urlfont="fa-trash-o"/>
   <t:dgFunOpt funname="pushTest(id,code)" title="common.pushTest" urlclass="ace_button" urlfont="fa-upload"></t:dgFunOpt>
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
