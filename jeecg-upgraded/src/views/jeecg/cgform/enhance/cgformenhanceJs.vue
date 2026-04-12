
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${cgformenhanceJsPage.id }">
	<input id="formId" name="formId" type="hidden" value="${cgformenhanceJsPage.formId }">
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("enhance.type") }}: </label></td>
			<td class="value"><select name="cgJsType" id="cgJsType">
				<option value="form" <c:if test="${cgformenhanceJsPage.cgJsType=='form'}">selected="selected"</c:if>>form</option>
				<option value="list" <c:if test="${cgformenhanceJsPage.cgJsType=='list'}">selected="selected"</c:if>>list</option>
			</select> <span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("enhance.js") }}: </label></td>
			<td class="value"><textarea id="cgJsStr" name="cgJsStr" cols="130" rows="30">${cgformenhanceJsPage.cgJsStr}</textarea> <span class="Validform_checktip"></span></td>
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
