
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jformOrderTicket2List" filterBtn="true" onDblClick="datagridDbclick" checkbox="true" pagination="true" fitColumns="true" title="" actionUrl="jformOrderTicket2Controller.do?datagrid" idField="id" fit="true" queryMode="group">
   <el-table-column prop="id" label="主键"></el-table-column>
   <el-table-column prop="ticketCode" label="航班号"></el-table-column>
   <el-table-column prop="tickectDate" label="航班时间"></el-table-column>
   <el-table-column prop="fckId" label="外键"></el-table-column>
   <el-table-column prop="opt" label="操作"></el-table-column>
   <t:dgDelOpt title="删除" url="jformOrderTicket2Controller.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
  </el-table>
  </div>
   <input type="hidden" id = "jformOrderTicket2ListMainId"/>
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
