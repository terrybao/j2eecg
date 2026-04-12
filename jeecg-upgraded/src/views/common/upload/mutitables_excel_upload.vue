
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<fieldset class="step">
		<div class="form">
			<t:upload name="fiels" buttonText="选择要导入的文件" 
				uploader="${controller_name}.do?${empty method_name?'importExcel':method_name }&mainId=${mainId}" 
				extend="*.xls;*.xlsx" id="file_upload" formData="documentTitle"></t:upload>
		</div>
		<!-- '+getdbname2()+' -->
		<div class="form" id="filediv" style="height: 50px"></div>
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
