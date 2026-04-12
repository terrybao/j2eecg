
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jformOrderMain2List" checkbox="true" filterBtn="true" onDblClick="datagridDbclick"  fit="true" fitColumns="true" title="" sortName="orderDate" actionUrl="jformOrderMain2Controller.do?datagrid" idField="id" 
  			  queryMode="group" extendParams="checkOnSelect:false,onSelect:function(index,row){datagridSelect(index,row);}">
   <el-table-column prop="id" label="主键"></el-table-column>
   <el-table-column prop="orderCode" label="订单号"></el-table-column>
   <el-table-column prop="orderDate" label="订单日期"></el-table-column>
   <el-table-column prop="orderMoney" label="订单金额"></el-table-column>
   <el-table-column prop="content" label="备注"></el-table-column>
   <el-table-column prop="opt" label="操作"></el-table-column>
   <t:dgDelOpt title="删除" url="jformOrderMain2Controller.do?doDel&id={id}"  urlclass="ace_button" urlfont="fa-trash-o"/>
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
