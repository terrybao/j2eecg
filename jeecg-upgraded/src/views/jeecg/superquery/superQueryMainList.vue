
<template>
  <div class="vue-component">
    </t:base>

<link rel="stylesheet" href="plug-in/ztree/css/zTreeStyle.css" type="text/css"/>

<style>
/* 隐藏滚动条 */
#w {
	overflow-x: hidden;
	overflow-y: hidden;
}
/*隐藏滚动条  */
/* 页面样式 */

ul {
	list-style-type: none;
	list-style-image: none;
}

.conditionType {
	display: block;
	margin-bottom: 6px;
	padding: 6px 0 8px;
	width: 100%;
}

select {
	padding-right: 2px !important;
}

select {
	padding: 5px 7px;
}

textarea, input[type=text], input[type=password], select {
	font-family: "Verdana", "微软雅黑", "宋体", "Lucida Grande";
	padding: 3px;
	border: 1px solid #ddd;
	outline: 0;
	box-sizing: border-box;
}

#dsUL .conditionSelect {
	width: 200px;
}
/* 
.datagrid .panel-body {
	position: relative;
	overflow: auto;
}*/
/*页面样式  */
</style>
<div class="easyui-layout" fit="true">
	<div region="center" style="padding: 0px; border: 0px">
		<t:datagrid name="superQueryMainList" checkbox="true" complexSuperQuery="cgform" fitColumns="true" title="高级查询" actionUrl="superQueryMainController.do?datagrid" idField="id" fit="true" queryMode="group">
			<el-table-column prop="id" label="主键"></el-table-column>
			<el-table-column prop="queryName" label="查询规则名称"></el-table-column>
			<el-table-column prop="queryCode" label="查询规则编码"></el-table-column>
			<el-table-column prop="queryType" label="查询类型"></el-table-column>
			<el-table-column prop="content" label="说明"></el-table-column>
			<el-table-column prop="opt" label="操作"></el-table-column>
			<t:dgDelOpt title="删除" url="superQueryMainController.do?doDel&id={id}" urlclass="ace_button" urlfont="fa-trash-o" />
			<div class="toolbar"></div>
			<div class="toolbar"></div>
			<div class="toolbar"></div>
			<div class="toolbar"></div>
			<t:dgFunOpt funname="superQueryMainListSuperQuery(queryCode)" title="功能测试" urlfont="fa-search" urlclass="ace_button"></t:dgFunOpt>
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
