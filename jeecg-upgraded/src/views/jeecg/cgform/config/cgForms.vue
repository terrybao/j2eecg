
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center"  style="padding:0px;border:0px">
	<t:datagrid sortName="createDate" sortOrder="desc" name="tableSelectPropertyList" title="smart.form.config" fitColumns="false" actionUrl="cgFormHeadController.do?datagrid" idField="id" fit="true">
		<el-table-column prop="id" label="common.id"></el-table-column>
		<el-table-column prop="jformType" label="table.type"></el-table-column>
		<el-table-column prop="tableName" label="table.name">
		<el-table-column prop="content" label="table.description"></el-table-column>
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
