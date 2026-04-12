
<template>
  <div class="vue-component">
    </t:base>

<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="dbSourceList" title="common.datasource.manage" actionUrl="dynamicDataSourceController.do?datagrid" idField="id" fit="true" sortName="id" sortOrder="desc">
	<el-table-column prop="id" label="common.id"></el-table-column>
	<el-table-column prop="dbName" label="common.dbname"></el-table-column>
	<el-table-column prop="dbKey" label="common.datasrouce.key"></el-table-column>
	<el-table-column prop="description" label="common.description"></el-table-column>
	<el-table-column prop="driverClass" label="common.driverclass"></el-table-column>
	<el-table-column prop="url" label="common.datasrouce.url"></el-table-column>
	<el-table-column prop="dbUser" label="common.dbuser"></el-table-column>
	<el-table-column prop="dbPassword" label="common.dbpassword"></el-table-column>
	<el-table-column prop="dbType" label="common.dbtype"></el-table-column>
	<el-table-column prop="opt" label="common.operation"></el-table-column>
<!-- update-begin--Author:zhangjq  Date:20160904 for：[1342]【系统图标统一调整】讲{消息中间件}{系统监控}的链接按钮，改成ace风格的-->
	<t:dgDelOpt title="common.delete" url="dynamicDataSourceController.do?del&id={id}"  urlclass="ace_button"  urlfont="fa-trash-o"/>
<!-- update-end--Author:zhangjq  Date:20160904 for：[1342]【系统图标统一调整】讲{消息中间件}{系统监控}的链接按钮，改成ace风格的-->
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
