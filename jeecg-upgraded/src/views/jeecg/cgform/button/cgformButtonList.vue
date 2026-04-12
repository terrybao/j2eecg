
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
<div region="center" style="padding:0px;border:0px">
<t:datagrid name="cgformButtonList" title="custom.button" actionUrl="cgformButtonController.do?datagrid&formId=${formId}" idField="id" fit="true">
	<el-table-column prop="id" label="common.id"></el-table-column>
	<el-table-column prop="buttonCode" label="button.code"></el-table-column>
	<el-table-column prop="buttonName" label="button.name"></el-table-column>
	<el-table-column prop="buttonStyle" label="button.style"></el-table-column>
	<el-table-column prop="optType" label="action.type"></el-table-column>
	<el-table-column prop="orderNum" label="common.show.sequence"></el-table-column>
	<el-table-column prop="buttonIcon" label="common.show.icon.style"></el-table-column>
	<el-table-column prop="exp" label="common.show.expression"></el-table-column>
	<el-table-column prop="buttonStatus" label="common.status"></el-table-column>
	<el-table-column prop="opt" label="common.operation"></el-table-column>
	<t:dgDelOpt title="common.delete" url="cgformButtonController.do?del&id={id}&formId=${formId}" urlclass="ace_button"  urlfont="fa-trash-o" />
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
