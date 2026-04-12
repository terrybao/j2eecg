
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="headId" name="headId" type="hidden" value="${headId }"/>
	<fieldset class="step">
	<div class="form"><t:upload name="fiels" buttonText="选择要导入的文件" uploader="cgFormHeadController.do?importExcel" extend="*.xls;*.xlsx" id="file_upload" formData="headId"></t:upload></div>
	<div class="form" id="filediv" style="height: 50px"></div>
	<div class="form" style="height: 50px;"><a href="export/template/online_import_template.xls"><span style="color:blue">模板下载</span></a></div>
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
