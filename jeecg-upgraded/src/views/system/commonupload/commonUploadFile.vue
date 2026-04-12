
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<fieldset class="step">
	<div class="form">
		<label class="Validform_label"> 文件标题: </label> 
		<input name="documentTitle" id="documentTitle" datatype="s3-50" value="${doc.documentTitle}" type="text"> 
		<span class="Validform_checktip">标题名称在3~50位字符,且不为空</span>
	</div>
	<div class="form">
		<input type="hidden" id="file-name" name="filename" />
		<input type="hidden" id="file-name-swfpath" name="swfpath">
		<a  target="_blank" id="file-name-href">未上传</a>
		<br>
	   <input class="btn btn-success btn-sm" type="button" value="上传附件" onclick="commonUpload(commonUploadDefaultCallBack,'file-name')"/> 
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
