
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input type="hidden" id="docId" <c:if test="${not empty doc }">value="${doc.id }"</c:if> >
	<fieldset class="step">
	<div class="form">
		<label class="Validform_label"> 文件标题: </label> 
		<input name="documentTitle" id="documentTitle" datatype="s3-50" value="${doc.documentTitle}" type="text"> 
		<span class="Validform_checktip">标题名称在3~50位字符,且不为空</span>
	</div>
	<div class="form">
		<t:upload name="fiels" buttonText="上传文件" uploader="jeecgFormDemoController.do?saveFiles&documentId=${doc.id}" extend="" id="file_upload" formData="documentTitle"></t:upload>
	</div>
	<div class="form" id="filediv" style="height: 50px">
		<c:if test="${not empty attachment }">
			<div class="row" style="margin-left:20px;">
				${attachment.attachmenttitle }.${attachment.extend }
			</div>
		</c:if>
	</div>
	</fieldset>
</el-form>
<input type="hidden" id = "attachment" <c:if test="${not empty attachment }">value="1"</c:if> />
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
