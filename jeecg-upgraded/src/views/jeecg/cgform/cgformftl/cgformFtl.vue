
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${cgformFtlPage.id }">
	<input id="cgformId" name="cgformId" type="hidden" value="${cgformFtlPage.cgformId }">
		<input id="editorType" name="editorType" type="hidden" value="01">
	<fieldset class="step">
	<div class="form">
	     <label class="Validform_label">表单模板名称:</label> 
	     <input class="inputxt" id="cgformName" name="cgformName" value="${cgformFtlPage.cgformName}" datatype="*"> 
	     <span class="Validform_checktip"></span></div>
	<div class="form">
	     <t:upload name="fiels" buttonText="选择Word模板文件" width="120" uploader="cgformFtlController.do?saveWordFiles" extend="*.doc" id="file_upload" formData="id,cgformId,cgformName,ftlVersion,ftlStatus"></t:upload>
	</div>
	<div class="form" id="filediv" style="height: 50px"><font color='red'>说明：此功能需要安装控件Jacob COM组件，目前只支持windows（32/64位）系统，因此该功能只适用于windows系统。不支持情况下，可以采用创建新模板，复制Word模板内容到编辑器中。</font></div>

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
