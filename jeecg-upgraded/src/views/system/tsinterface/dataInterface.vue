
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input name="id" type="hidden" value="${function.id}">
	<input name="functionType" id="functionType" type="hidden"  value="1">
	<fieldset class="step">
	<div class="form">
        <label class="Validform_label"> {{ $t("menu.name") }}: </label>
        <input name="functionName" class="inputxt" value="${function.functionName}" datatype="*2-50">
        <span class="Validform_checktip"> {{ $t("menuname.rang4to15") }} </span>
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
		<c:if test="${function.TSFunction.functionLevel > 0}"> value="${function.TSFunction.functionName}"</c:if>>
        <input id="functionId" name="TSFunction.id" style="display: none;" value="${function.TSFunction.id}">
    </div>
	<div class="form" id="funurl">
        <label class="Validform_label">
            {{ $t("menu.url") }}:
        </label>
        <input name="functionUrl" class="inputxt" value="${function.functionUrl}">
    </div>
   
	<div class="form" id="funorder">
	<label class="Validform_label"> 
	{{ $t("menu.order") }}: </label> <input name="functionOrder" class="inputxt" value="${function.functionOrder}" datatype="n1-3"></div>
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
