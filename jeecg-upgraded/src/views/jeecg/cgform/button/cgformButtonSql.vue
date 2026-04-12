
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${cgformButtonSqlPage.id }">
	<input id="formId" name="formId" type="hidden" value="${cgformButtonSqlPage.formId }">
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("operate.code") }}: </label></td>
			<td class="value"><select id="buttonCode" name="buttonCode" datatype="*">
				<option value="add" <c:if test="${cgformButtonSqlPage.buttonCode=='add'}">selected="selected"</c:if>>add</option>
				<option value="update" <c:if test="${cgformButtonSqlPage.buttonCode=='update'}">selected="selected"</c:if>>update</option>
				<option value="delete" <c:if test="${cgformButtonSqlPage.buttonCode=='delete'}">selected="selected"</c:if>>delete</option>
				<c:forEach items="${buttonList}" var="button">
					<option value="${button.buttonCode }" <c:if test="${button.buttonCode==cgformButtonSqlPage.buttonCode}">selected="selected"</c:if>>${button.buttonCode}</option>
				</c:forEach>
			</select> <span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("common.description") }}: </label></td>
			<td class="value"><textarea id="content" name="content" cols="100" rows="3">${cgformButtonSqlPage.content}</textarea> <span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("enhance.sql") }}: </label></td>
			<td class="value"><textarea id="cgbSqlStr" name="cgbSqlStr" rows="25" cols="130">${cgformButtonSqlPage.cgbSqlStr }</textarea> <span class="Validform_checktip"></span></td>
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
