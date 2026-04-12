
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input name="id" id="id" type="hidden" value="${icon.id}">
	<fieldset class="step">
	<div class="form">
        <label class="Validform_label"> {{ $t("common.icon.name") }}: </label>
        <input name="iconName" datatype="s2-10" id="iconName" value="${icon.iconName}" class="inputxt">
        <span class="Validform_checktip">{{ $t("iconname.rang2to10") }}</span>
    </div>
	<div class="form">
        <label class="Validform_label"> {{ $t("common.icon.type") }}: </label>
        <select name="iconType" id="iconType">
            <option value="1" <c:if test="${icon.iconType=='1'}">selected="selected"</c:if>>{{ $t("system.icon") }}</option>
            <option value="2" <c:if test="${icon.iconType=='2'}">selected="selected"</c:if>>{{ $t("menu.icon") }}</option>
            <option value="3" <c:if test="${icon.iconType=='3'}">selected="selected"</c:if>>{{ $t("desktop.icon") }}</option>
        </select>
    </div>
    <c:if test="${not empty icon.id}">
    <div class="form" >
        <label class="Validform_label">图标预览:</label>
        <a target="_blank" href="${icon.iconPath }"><img src="${icon.iconPath }" style="width:25px"></a>
        <input type="hidden" id = "existIcon" value = "1"/>
    </div>
    </c:if>
	<div class="form">
	<div id="filediv"></div>
	<t:upload name="file_upload" uploader="iconController.do?saveOrUpdateIcon" extend="*.png;" id="file_upload" formId="formobj"></t:upload></div>
	</fieldset>
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
