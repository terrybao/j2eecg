
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input name="id" type="hidden" value="${tsInterface.id}">
	<fieldset class="step">
	<div class="form">
        <label class="Validform_label"> 接口权限编码: </label>
        <input name="interfaceCode" class="inputxt" value="${tsInterface.interfaceCode}" datatype="*">
        <span class="Validform_checktip"></span>
    </div>
	<div class="form">
        <label class="Validform_label"> {{ $t("接口权限名称") }}: </label>
        <input name="interfaceName" class="inputxt" value="${tsInterface.interfaceName}" datatype="*2-50">
        <span class="Validform_checktip"> {{ $t("menuname.rang2to15") }} </span>
    </div>
	<div class="form">
        <label class="Validform_label"> {{ $t("接口权限等级") }}: </label>
        <select name="interfaceLevel" id="interfaceLevel" datatype="*">
            <option value="0" <c:if test="${tsInterface.interfaceLevel eq 0}">selected="selected"</c:if>>
                {{ $t("main.function") }}
            </option>
            <option value="1" <c:if test="${tsInterface.interfaceLevel>0}"> selected="selected"</c:if>>
                {{ $t("sub.function") }}
            </option>
        </select>
        <span class="Validform_checktip"></span>
    </div>
	<div class="form" id="pfun">
        <label class="Validform_label"> {{ $t("父级接口") }}: </label>
        <input id="cc" <c:if test="${tsInterface.tSInterface.interfaceLevel eq 0}"> value="${tsInterface.tSInterface.id}"</c:if>
		<c:if test="${tsInterface.tSInterface.interfaceLevel > 0}"> value="${tsInterface.tSInterface.interfaceName}"</c:if>>
        <input id="interfaceId" name="tSInterface.id" style="display: none;" value="${tsInterface.tSInterface.id}">
    </div>
	<div class="form" id="inturl">
        <label class="Validform_label">
            {{ $t("接口权限地址") }}:
        </label>
        <input name="interfaceUrl" class="inputxt" value="${tsInterface.interfaceUrl}" style="width:70%">
    </div>
    <div class="form">
        <label class="Validform_label"> 请求方式: </label>
        <input name="interfaceMethod" class="inputxt" value="${tsInterface.interfaceMethod}" datatype="*">
        <span class="Validform_checktip">示例：GET|POST|PUT|DELETE</span>
    </div>
	<div class="form" id="intorder"><label class="Validform_label"> 
	{{ $t("接口权限排序") }}: </label> 
	<input name="interfaceOrder" class="inputxt" value="${tsInterface.interfaceOrder}" datatype="n1-3">
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
