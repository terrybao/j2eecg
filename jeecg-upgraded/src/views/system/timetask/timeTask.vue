
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${timeTaskPage.id }">
	<input id="isEffect" name="isEffect" type="hidden" value="${(empty timeTaskPage.isEffect)?0:timeTaskPage.isEffect}">
	<input id="isStart" name="isStart" type="hidden" value="${(empty timeTaskPage.isStart)?0:timeTaskPage.isStart }">
	<fieldset class="step">
	<div class="form">
		<label class="Validform_label">{{ $t("common.taskid") }}:</label> 
		<input class="inputxt" id="taskId" name="taskId" value="${timeTaskPage.taskId}" datatype="*" style="width:50%"/> 
		<span class="Validform_checktip"></span>
	</div>
	<div class="form">
		<label class="Validform_label">{{ $t("common.task.desc") }}:</label> 
		<input class="inputxt" id="taskDescribe" name="taskDescribe" value="${timeTaskPage.taskDescribe}" datatype="*" style="width:50%"/> 
		<span class="Validform_checktip"></span>
	</div>
	<div class="form">
		<label class="Validform_label">{{ $t("cron.expression") }}:</label> 
		<input class="inputxt" id="cronExpression" name="cronExpression" value="${timeTaskPage.cronExpression}" datatype="*" style="width:50%"/>
			<a href="http://cron.qqe2.com" target="_blank">
				[生成Cron表达式]
			</a>
		<span class="Validform_checktip"></span>
		
	</div>
	<div class="form">
		<label class="Validform_label">{{ $t("common.task.className") }}:</label> 
		<input class="inputxt" id="className" name="className" value="${timeTaskPage.className}" datatype="*" style="width:50%" /> 
		<span class="Validform_checktip"></span>
	</div>
	<div class="form">
		<label class="Validform_label">{{ $t("common.task.runServerIp") }}:</label> 
		<input class="inputxt" id="runServerIp" name="runServerIp" value="${empty timeTaskPage.runServerIp ? '本地' : timeTaskPage.runServerIp}" datatype="*" style="width:50%"/> 
		<span class="Validform_checktip"></span>
	</div>
	<div class="form">
		<label class="Validform_label">{{ $t("common.task.runServer") }}:</label> 
		<input class="inputxt" id="runServer" name="runServer" value="${empty timeTaskPage.runServer ? '本地' : timeTaskPage.runServer}" datatype="*" style="width:50%"/> 
		<span class="Validform_checktip"></span>
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
