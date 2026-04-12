
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jformOrderCustomer2List" filterBtn="true" onDblClick="datagridDbclick" checkbox="true" pagination="true" fitColumns="true" title="" actionUrl="jformOrderCustomer2Controller.do?datagrid" idField="id" fit="true" queryMode="group">
   <el-table-column prop="id" label="主键"></el-table-column>
   <el-table-column prop="name" label="客户名"></el-table-column>
   <el-table-column prop="money" label="单价"></el-table-column>
   <el-table-column prop="sex" label="性别"></el-table-column>
   <el-table-column prop="telphone" label="电话"></el-table-column>
   <el-table-column prop="fkId" label="外键"></el-table-column>
   <el-table-column prop="opt" label="操作"></el-table-column>
   <t:dgDelOpt title="删除" url="jformOrderCustomer2Controller.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgFunOpt funname="curd.addRow" title="新增一行"  urlclass="ace_button"  urlfont="fa-plus"></t:dgFunOpt>
  </el-table>
  </div>
   <input type="hidden" id = "jformOrderCustomer2ListMainId"/>
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
