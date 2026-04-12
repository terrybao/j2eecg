
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${cgformEnhanceJavaPage.id }">
	<input id="formId" name="formId" type="hidden" value="${cgformEnhanceJavaPage.formId }">
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="center" width="150px"><label class="Validform_label"> {{ $t("operate.code") }}: </label></td>
			<td class="value"><select id="buttonCode" name="buttonCode" datatype="*" style="width: 200px;" >
				<option value="add" <c:if test="${cgformEnhanceJavaPage.buttonCode=='add'}">selected="selected"</c:if>>add</option>
				<option value="update" <c:if test="${cgformEnhanceJavaPage.buttonCode=='update'}">selected="selected"</c:if>>update</option>
				<option value="delete" <c:if test="${cgformEnhanceJavaPage.buttonCode=='delete'}">selected="selected"</c:if>>delete</option>
				<c:forEach items="${buttonList}" var="button">
					<option value="${button.buttonCode }" <c:if test="${button.buttonCode==cgformEnhanceJavaPage.buttonCode}">selected="selected"</c:if>>${button.buttonCode}</option>
				</c:forEach>
			</select> <span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td align="center" width="150px"><label class="Validform_label"> {{ $t("common.event") }}: </label></td>
			<td class="value">
				<input type="radio" name="event" value="start" ${empty cgformEnhanceJavaPage.event or cgformEnhanceJavaPage.event eq 'start' ? 'checked' : '' } />{{ $t("common.begin") }}
				<input type="radio" name="event" value="end" ${empty cgformEnhanceJavaPage.event or cgformEnhanceJavaPage.event eq 'end' ? 'checked' : '' } />{{ $t("common.end") }}
				<span class="Validform_checktip"></span>
			</td>
		</tr>
		<tr>
			<td align="center" width="150px"><label class="Validform_label"> {{ $t("common.type") }}: </label></td>
			<td class="value"><t:dictSelect field="cgJavaType" type="radio" typeGroupCode="enhanceType" hasLabel="false" defaultVal="${cgformEnhanceJavaPage.cgJavaType==null?'spring':(cgformEnhanceJavaPage.cgJavaType)}"></el-select><span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td align="center" width="150px"><label class="Validform_label"> {{ $t("common.value") }}: </label></td>
			<!--update-end--Author:luobaoli  Date:20150701 for：取消非空校验-->
			<td class="value"><input id="cgJavaValue" name="cgJavaValue" type="text" style="width: 300px;height: 26px" value="${cgformEnhanceJavaPage.cgJavaValue}"/><span class="Validform_checktip"></span></td>
			<!--update-end--Author:luobaoli  Date:20150701 for：取消非空校验-->
		</tr>
		<tr>
			<td align="center" width="150px"><label class="Validform_label"> {{ $t("common.iseffect") }}: </label></td>
			<td class="value">
				<input type="radio" name="activeStatus" value="0" ${cgformEnhanceJavaPage.activeStatus eq 0 ? 'checked' : '' } />{{ $t("common.disable") }}
				<input type="radio" name="activeStatus" value="1" ${empty cgformEnhanceJavaPage.activeStatus or cgformEnhanceJavaPage.activeStatus eq '1' ? 'checked' : '' } />{{ $t("common.enable") }}
				<span class="Validform_checktip"></span>
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
