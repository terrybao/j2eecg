
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<fieldset class="step">
	
	<div class="form"><label class="form"> 操作ID:${tsLog.username } </label>
	 </div>
	 <div class="form"><label class="form"> 操作人:${tsLog.realname } </label>
	 </div>
	<div class="form"><label class="form"> 日志类型: </label>
	   <!-- 以后再统一由数据字典维护  fangwenrong-->
	   <c:if test="${tsLog.operatetype==1}">{{ $t("common.login") }}</c:if>
	   <c:if test="${tsLog.operatetype==2}">{{ $t("common.logout") }}</c:if>
	   <c:if test="${tsLog.operatetype==3}">{{ $t("common.insert") }}</c:if>
	   <c:if test="${tsLog.operatetype==4}">{{ $t("common.delete") }}</c:if>
	   <c:if test="${tsLog.operatetype==5}">{{ $t("common.update") }}</c:if>
	   <c:if test="${tsLog.operatetype==6}">{{ $t("common.upload") }}</c:if>
	   <c:if test="${tsLog.operatetype==7}">{{ $t("common.other") }}</c:if>
	</div>
		<div class="form"><label class="form"> {{ $t("log.content") }}: </label><textarea style="width: 100% ;background-color:#f4f4f4" rows="6" >${tsLog.logcontent }</textarea> </div>
		<div class="form"><label class="form"> 日志等级: </label>
	   <!-- 以后再统一由数据字典维护  fangwenrong-->
	   <c:if test="${tsLog.loglevel==1}">INFO</c:if>
	   <c:if test="${tsLog.loglevel==2}">WARRING</c:if>
	   <c:if test="${tsLog.loglevel==3}">ERROR</c:if>
	</div>

	<div class="form"><label class="form"> {{ $t("operate.ip") }}: </label> ${tsLog.note}</div>
	<div class="form"><label class="form"> {{ $t("operate.time") }}: </label>
	  <fmt:formatDate value="${tsLog.operatetime}" pattern="yyyy-MM-dd HH:mm:ss"/> 
	 </div>
	<div class="form"><label class="form"> {{ $t("common.browser") }}: </label> ${tsLog.broswer}</div>
	

	</fieldset>
	</form>
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
