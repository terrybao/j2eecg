
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true" id="lywidth_demo">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jformOrderMainList" checkbox="false" fitColumns="true" title="订单主信息" actionUrl="jformOrderMainController.do?datagrid" 
  		idField="id" fit="true" collapsible="true" queryMode="group" filter="true">
   <el-table-column prop="id" label="主键"></el-table-column>
   <el-table-column prop="orderCode" label="订单号"></el-table-column>
   <el-table-column prop="orderDate" label="订单日期"></el-table-column>
   <el-table-column prop="orderMoney" label="订单金额"></el-table-column>
   <el-table-column prop="content" label="备注"></el-table-column>
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
