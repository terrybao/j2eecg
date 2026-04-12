
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${cgformButtonPage.id }">
	<input id="formId" name="formId" type="hidden" value="${cgformButtonPage.formId }">
	<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("common.button.code") }} : </label></td>
			<td class="value"><input class="inputxt" id="buttonCode" name="buttonCode" ignore="ignore" value="${cgformButtonPage.buttonCode}"> <span class="Validform_checktip">{{ $t("lang.code.cannot.add.update.delete") }}</span></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("common.button.name") }}: </label></td>
			<td class="value"><input class="inputxt" id="buttonName" name="buttonName" ignore="ignore" value="${cgformButtonPage.buttonName}"> <span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("common.button.style") }} </label></td>
			<td class="value"><select name="buttonStyle" id="buttonStyle">
				<option value="link" <c:if test="${cgformButtonPage.buttonStyle=='link'}">selected="selected"</c:if>>link</option>
				<option value="button" <c:if test="${cgformButtonPage.buttonStyle=='button'}">selected="selected"</c:if>>button</option>
			</select> <span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("common.action.type") }}: </label></td>
			<td class="value"><select name="optType" id="optType">
				<option value="js" <c:if test="${cgformButtonPage.optType=='js'}">selected="selected"</c:if>>js</option>
				<option value="action" <c:if test="${cgformButtonPage.optType=='action'}">selected="selected"</c:if>>action</option>
			</select> <span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("common.show.sequence") }}: </label></td>
			<td class="value"><input class="inputxt" id="orderNum" name="orderNum" datatype="n" value="${cgformButtonPage.orderNum}"> <span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("common.show.icon.style") }}: </label></td>
			<td class="value"><input class="inputxt" id="buttonIcon" name="buttonIcon" datatype="*"
				value="<c:if test="${cgformButtonPage.buttonIcon!=null&&cgformButtonPage.buttonIcon!=''}">${cgformButtonPage.buttonIcon}</c:if><c:if test="${cgformButtonPage.buttonIcon==null||cgformButtonPage.buttonIcon==''}">icon-edit</c:if>">
			<span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("common.show.expression") }}: </label></td>
			<td class="value"><input class="inputxt" id="exp" name="exp" ignore="ignore" value="${cgformButtonPage.exp}"> <span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("common.status") }}:  </label></td>
			<td class="value"><select name="buttonStatus" id="buttonStatus">
				<option value="0" <c:if test="${cgformButtonPage.buttonStatus=='0'}">selected="selected"</c:if>>{{ $t("common.inactive") }}</option>
				<option value="1" <c:if test="${cgformButtonPage.buttonStatus=='1'}">selected="selected"</c:if>>{{ $t("common.active") }}</option>
			</select> <span class="Validform_checktip"></span></td>
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
