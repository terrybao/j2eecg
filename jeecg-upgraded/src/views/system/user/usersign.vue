
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" type="hidden" value="${id }">
	<table style="width: 500px" cellpadding="0" cellspacing="1" class="formtable">
		<tbody>
			<tr>
				<td class="value" id="test" colspan="2"></td>
			</tr>
			<tr>
				<td align="right"><span class="filedzt">签名文件:</span></td>
				<td class="value"><t:upload name="jfcl" buttonText="选择签名" queueID="test" multi="false" uploader="userController.do?savesign" extend="pic" id="file_upload" formData="formobj"></t:upload></td>
			</tr>
		</tbody>
	</table>
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
