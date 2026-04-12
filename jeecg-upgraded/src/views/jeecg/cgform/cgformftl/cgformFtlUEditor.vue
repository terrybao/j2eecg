
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${cgformFtlPage.id}">
	<input id="cgformId" name="cgformId" type="hidden" value="${cgformFtlPage.cgformId}">
	<input id="ftlVersion" name="ftlVersion" type="hidden" value="${cgformFtlPage.ftlVersion}">
	<input id="ftlWordUrl" name="ftlWordUrl" type="hidden" value="${cgformFtlPage.ftlWordUrl}">
	<input id="createBy" name="createBy" type="hidden" value="${cgformFtlPage.createBy}">
	<input id="createName" name="createName" type="hidden" value="${cgformFtlPage.createName}">
	<input id="createDate" name="createDate" type="hidden" value="${cgformFtlPage.createDate}">
	<input id="editorType" name="editorType" type="hidden" value="02">
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right"><label class="Validform_label">模板名称:</label></td>
			<td class="value"><input class="inputxt" id="cgformName" name="cgformName" value="${cgformFtlPage.cgformName}" datatype="*"> <span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td class="value" colspan=2>
				<input type="hidden" id="ftl" name="ftlContent" >
				
			</td>
		</tr>
	</table>
</el-form>
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
