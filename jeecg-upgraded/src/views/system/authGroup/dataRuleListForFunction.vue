
<template>
  <div class="vue-component">
    <c:forEach items="${dataRuleList}" var="dataRule">
<span class="icon group_add">&nbsp;</span>
	<c:if test="${fn:contains(dataRulecodes, dataRule.id)}">
		<input style="width: 20px;" type="checkbox" name="operationCheckbox1" value="${dataRule.id}" checked="checked" />${dataRule.ruleName}
	 </c:if>
	<c:if test="${!fn:contains(dataRulecodes, dataRule.id)}">
		<input style="width: 20px;" type="checkbox" name="operationCheckbox1" value="${dataRule.id}" />${dataRule.ruleName}
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
