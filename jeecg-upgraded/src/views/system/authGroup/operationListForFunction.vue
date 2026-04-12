
<template>
  <div class="vue-component">
    <c:forEach items="${operationList}" var="operation">
	<c:if test="${fn:contains(operationcodes, operation.id)}">
		<span class="icon ${operation.TSIcon.iconClas}">&nbsp;</span>
		<input style="width: 20px;" type="checkbox" name="operationCheckbox" value="${operation.id}" checked="checked" />${operation.operationname}
	 </c:if>
	<c:if test="${!fn:contains(operationcodes, operation.id)}">
		<span class="icon group_add">&nbsp;</span>
		<input style="width: 20px;" type="checkbox" name="operationCheckbox" value="${operation.id}" />${operation.operationname}
	 </c:if>
	<br>
</c:forEach>
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
