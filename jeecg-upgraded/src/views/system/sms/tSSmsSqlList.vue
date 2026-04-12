
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="tSSmsSqlList" checkbox="true" fitColumns="false" title="common.businessSqlTable" actionUrl="tSSmsSqlController.do?datagrid" idField="id" fit="true" queryMode="group">
   <el-table-column prop="id" label="common.esId"></el-table-column>
   <el-table-column prop="sqlName" label="common.sqlName"></el-table-column>
   <el-table-column prop="sqlContent" label="common.sqlContent"></el-table-column>
   <el-table-column prop="opt" label="common.operate"></el-table-column>
   <t:dgDelOpt title="common.delete_2" url="tSSmsSqlController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o" />
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
