
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">  
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jfromOrderList" checkbox="true" fitColumns="true"  title="订单列表" extendParams="view: detailview,detailFormatter:detailFormatterFun,onExpandRow: onExpandRowFun"
  actionUrl="jfromOrderController.do?datagrid" idField="id" fit="true" queryMode="group">
   <el-table-column prop="id" label="主键"></el-table-column>
   <el-table-column prop="createName" label="创建人名称"></el-table-column>
   <el-table-column prop="createBy" label="创建人登录名称"></el-table-column>
   <el-table-column prop="createDate" label="创建日期"></el-table-column>
   <el-table-column prop="updateName" label="更新人名称"></el-table-column>
   <el-table-column prop="updateBy" label="更新人登录名称"></el-table-column>
   <el-table-column prop="updateDate" label="更新日期"></el-table-column>
   <el-table-column prop="sysOrgCode" label="所属部门"></el-table-column>
   <el-table-column prop="sysCompanyCode" label="所属公司"></el-table-column>
   <el-table-column prop="bpmStatus" label="流程状态"></el-table-column>
   <el-table-column prop="receiverName" label="收货人"></el-table-column>
   <el-table-column prop="receiverMobile" label="联系电话"></el-table-column>
   <el-table-column prop="receiverState" label="收货省"></el-table-column>
   <el-table-column prop="receiverCity" label="收货市"></el-table-column>
   <el-table-column prop="receiverDistrict" label="收货区"></el-table-column>
   <el-table-column prop="receiverAddress" label="收货地址"></el-table-column>
   <el-table-column prop="opt" label="操作"></el-table-column>
   <t:dgDelOpt title="删除" url="jfromOrderController.do?doDel&id={id}"  urlclass="ace_button" urlfont="fa-trash-o"/>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
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
