
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="formId" name="formId" type="hidden" value="${formId}">
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right"><label class="Validform_label"> 表名: </label></td>
			<td class="value"><input class="inputxt" id="tableName" name="tableName" value="${tableName}" datatype="*"> <span class="Validform_checktip"></span></td>
		</tr>
	</table>
</el-form>
<div id="tableList" style="height: 400px;"></div>
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
