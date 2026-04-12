
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="tSDictTableConfigList" checkbox="false" pagination="true" fitColumns="true" title="字典表授权配置" sortName="createDate" actionUrl="tSDictTableConfigController.do?datagrid" idField="id" fit="true" queryMode="group">
   <el-table-column prop="id" label="主键"></el-table-column>
   <el-table-column prop="tableName" label="表名"></el-table-column>
   <el-table-column prop="valueCol" label="值字段名"></el-table-column>
   <el-table-column prop="textCol" label="文本字段名"></el-table-column>
   
   <el-table-column prop="isvalid" label="是否启用"></el-table-column>
   <el-table-column prop="createName" label="创建人名称"></el-table-column>
   <el-table-column prop="createBy" label="创建人登录名称"></el-table-column>
   <el-table-column prop="createDate" label="创建日期"></el-table-column>
   <el-table-column prop="updateName" label="更新人名称"></el-table-column>
   <el-table-column prop="updateBy" label="更新人登录名称"></el-table-column>
   <el-table-column prop="updateDate" label="更新日期"></el-table-column>
   <el-table-column prop="sysOrgCode" label="所属部门"></el-table-column>
   <el-table-column prop="sysCompanyCode" label="所属公司"></el-table-column>
   <el-table-column prop="opt" label="操作"></el-table-column>
   <t:dgDelOpt title="删除" url="tSDictTableConfigController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
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
