
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jformOrderCustomerList" checkbox="true" fitColumns="true" title="" actionUrl="jformOrderMainController.do?customerDatagrid" 
  	idField="id" fit="true" queryMode="group" collapsible="true">
   <el-table-column prop="id" label="主键"></el-table-column>
   <el-table-column prop="fkId" label="外键"></el-table-column>
   <el-table-column prop="name" label="名称"></el-table-column>
   <el-table-column prop="money" label="单价"></el-table-column>
   <el-table-column prop="sex" label="性别"></el-table-column>
   <el-table-column prop="telphone" label="电话"></el-table-column>
   <el-table-column prop="sfPic" label="身份证扫描件"></el-table-column>
   
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
