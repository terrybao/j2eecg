
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${function.id}">
	<fieldset class="step">
	<div class="form">
        <label class="Validform_label"> {{ $t("menu.name") }}: </label>
        <input name="functionName" class="inputxt" value="${function.functionName}" datatype="*2-50" />
        <span class="Validform_checktip"> {{ $t("menuname.rang2to15") }} </span>
    </div>
   <div class="form">
        <label class="Validform_label"> {{ $t("funcType") }}: </label>
        <select name="functionType" id="functionType" datatype="*">
            <option value="0" <c:if test="${function.functionType eq 0}">selected="selected"</c:if>>
                {{ $t("funcType.page") }}
            </option>
            <option value="1" <c:if test="${function.functionType>0}"> selected="selected"</c:if>>
                {{ $t("funcType.from") }}
            </option>
        </select>
        <span class="Validform_checktip"></span>
    </div>
	<div class="form">
        <label class="Validform_label"> {{ $t("menu.level") }}: </label>
        <select name="functionLevel" id="functionLevel" datatype="*">
            <option value="0" <c:if test="${function.functionLevel eq 0}">selected="selected"</c:if>>
                {{ $t("main.function") }}
            </option>
            <option value="1" <c:if test="${function.functionLevel>0}"> selected="selected"</c:if>>
                {{ $t("sub.function") }}
            </option>
        </select>
        <span class="Validform_checktip"></span>
    </div>
	<div class="form" id="pfun">
        <label class="Validform_label"> {{ $t("parent.function") }}: </label>
        <input id="cc" <c:if test="${function.TSFunction.functionLevel eq 0}"> value="${function.TSFunction.id}"</c:if>
		<c:if test="${function.TSFunction.functionLevel > 0}"> value="{{ $t("${function.TSFunction.functionName}") }}"</c:if>>
        <input id="functionId" name="TSFunction.id" style="display: none;" value="${function.TSFunction.id}">
    </div>
	<div class="form" id="funurl">
        <label class="Validform_label">
            {{ $t("menu.url") }}:
        </label>
        <input name="functionUrl" class="inputxt" value="${function.functionUrl}" style="width:70%">
    </div>
    <div class="form" id="icon">
        <label class="Validform_label"> {{ $t("common.icon") }}: </label>
        <select name="TSIcon.id">
            <c:forEach items="${iconlist}" var="icon">
                <option value="${icon.id}" <c:if test="${icon.id==function.TSIcon.id || (function.id eq null && icon.iconClas eq 'default') }">selected="selected"</c:if>>
                    {{ $t("${icon.iconName}") }}
                </option>
            </c:forEach>
        </select>
    </div>
    <div class="form" id="desktopIcon">
        <label class="Validform_label"> {{ $t("desktop.icon") }}: </label>
        <select name="TSIconDesk.id">
            <c:forEach items="${iconDeskList}" var="icon">
                <option value="${icon.id}" <c:if test="${icon.id==function.TSIconDesk.id || (function.id eq null && icon.iconClas eq 'System Folder') }">selected="selected"</c:if>>
                    {{ $t("${icon.iconName}") }}
                </option>
            </c:forEach>
        </select>
    </div>
	<div class="form" id="funorder"><label class="Validform_label"> {{ $t("menu.order") }}: </label> <input name="functionOrder" class="inputxt" value="${function.functionOrder}" datatype="n1-3"></div>
	<div class="form" id="funiconstyle">
        <label class="Validform_label">
            {{ $t("menu.funiconstyle") }}:
        </label>
        <input name="functionIconStyle" class="inputxt" value="${function.functionIconStyle}" />
       /webpage/common/functionIconStyleList.jsp?style=ace"  target="_blank">[ace图标样式]</a>--%>
        <a href="http://fontawesome.dashgame.com" target="_blank"> <i class="fa fa-eye-slash"></i>选择图标库 </a>
    </div>
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
