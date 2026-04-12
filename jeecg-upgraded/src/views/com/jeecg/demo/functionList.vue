
<template>
  <div class="vue-component">
    </t:base>
<div id="system_function_functionList" class="easyui-layout" fit="true">
<div region="center" style="padding:0px;border:0px">
	<t:datagrid name="functionDemoList" title="menu.manage" actionUrl="jeecgFormDemoController.do?functionGrid" idField="id" treegrid="true" pagination="true" pageSize="5">
        <el-table-column prop="id" label="common.id"></el-table-column>
        <el-table-column prop="functionName" label="menu.name"></el-table-column>
        <el-table-column prop="TSIcon_iconPath" label="common.icon"></el-table-column>
        <el-table-column prop="functionType" label="funcType"></el-table-column>
        <el-table-column prop="functionUrl" label="menu.url"></el-table-column>
        <el-table-column prop="functionOrder" label="menu.order"></el-table-column>
        <el-table-column prop="functionIconStyle" label="menu.funiconstyle"></el-table-column>
    </el-table>
</div>
</div>
<div data-options="region:'east',
	title:'{{ $t("operate.button.list") }}',
	collapsed:true,
	split:true,
	border:false,
	onExpand : function(){
		li_east = 1;
	},
	onCollapse : function() {
	    li_east = 0;
	}"
	style="width: 400px; overflow: hidden;">
<div class="easyui-panel" style="padding:0px;border:0px" fit="true" border="false" id="operationDetailpanel"></div>
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
