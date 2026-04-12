
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jeecgMinidaoList"  pageSize="500" pagination="false" fitColumns="false" title="用户操作统计报表" actionUrl="jeecgListDemoController.do?logrpDatagrid" idField="id" fit="true" queryMode="group">
    <el-table-column prop="id" label="id"></el-table-column>
    <el-table-column prop="name" label="用户"></el-table-column>
    <el-table-column prop="loginct" label="登陆次数"></el-table-column>
    <el-table-column prop="outct" label="退出次数"></el-table-column>
    <el-table-column prop="xgct" label="修改次数"></el-table-column>
    <el-table-column prop="ct" label="操作次数"></el-table-column>
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
