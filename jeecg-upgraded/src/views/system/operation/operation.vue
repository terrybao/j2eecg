
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input name="id" type="hidden" value="${operation.id}">
	<fieldset class="step">
        <div class="form">
            <label class="Validform_label"> {{ $t("operate.name") }}: </label>
            <input name="operationname" class="inputxt" value="${operation.operationname}" datatype="s2-20">
            <span class="Validform_checktip"> {{ $t("operatename.rang2to20") }}</span>
        </div>
        <div class="form">
            <label class="Validform_label"> {{ $t("operate.code") }}: </label>
            <input name="operationcode" class="inputxt" value="${operation.operationcode}">
        </div>
        <!-- 图标字段现在不用暂时隐藏-->
        <div class="form" style="display: none;">
            <label class="Validform_label"> {{ $t("common.icon.name") }}: </label>
            <select name="TSIcon.id">
                <c:forEach items="${iconlist}" var="icon">
                    <option value="${icon.id}" <c:if test="${icon.id==function.TSIcon.id }">selected="selected"</c:if>>${icon.iconName}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form">
            <label class="Validform_label"> {{ $t("operation.type") }}: </label>
            <select name="operationType">
                <option value="0" <c:if test="${operation.operationType eq 0}">selected="selected"</c:if>>
                {{ $t("common.hide") }}
	            </option>
	            <option value="1" <c:if test="${operation.operationType>0}"> selected="selected"</c:if>>
	                {{ $t("operationType.disabled") }}
	            </option>
            </select>
            <span class="Validform_checktip"> 说明：配置后即受限制，授权后不受限制</span>
        </div>
        <div class="form">
			<label style="color:red;">
				用法说明：<br>    
				&nbsp;&nbsp;&nbsp;&nbsp;1. 配置隐藏或禁用后，默认所有用户都看不见/禁用;<br>
				&nbsp;&nbsp;&nbsp;&nbsp;2. 用户授权后，方可见/可编辑;<br>
				&nbsp;&nbsp;&nbsp;&nbsp;[ admin 用户有超级权限，不受限制]
        </div>
        <input name="TSFunction.id" value="${functionId}" type="hidden">
        <input name="status" type="hidden" value="0">
        
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
