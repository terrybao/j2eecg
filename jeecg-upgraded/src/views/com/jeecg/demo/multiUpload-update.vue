
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
					<input id="cgFormId" name="id" type="hidden" value="${multiUploadPage.id }"/>
					<input id="cgFormName" name="cgFormName" type="hidden" value="jeecg_multi_upload">
					<input id="cgFormField_testFile1" type="hidden" value="TEST_FILE_1">
					<input id="cgFormField_testFile2" type="hidden" value="TEST_FILE_2">
					<input id="cgFormField_testFile3" type="hidden" value="TEST_FILE_3">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								测试文件1:
							</label>
						</td>
						<td class="value">
							<div class="form jeecgDetail">
								<t:upload name="testFile1" id="testFile1" queueID="filediv_testFile1" uploader="cgUploadController.do?saveFiles" extend="" formData="cgFormId,cgFormName,cgFormField_testFile1" outhtml="false"></t:upload> 
							</div> 
							<div class="form" id="filediv_testFile1"></div>
							<table id="test_file_1_fileTable"></table>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">测试文件1</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								测试文件2:
							</label>
						</td>
						<td class="value">
							<div class="form jeecgDetail">
								<t:upload name="testFile2" id="testFile2" queueID="filediv_testFile2" uploader="cgUploadController.do?saveFiles" extend="" formData="cgFormId,cgFormName,cgFormField_testFile2" outhtml="false"></t:upload> 
							</div> 
							<div class="form" id="filediv_testFile2"></div>
							<table id="test_file_2_fileTable"></table>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">测试文件2</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								测试文件3:
							</label>
						</td>
						<td class="value">
							<div class="form jeecgDetail">
								<t:upload name="testFile3" id="testFile3" queueID="filediv_testFile3" uploader="cgUploadController.do?saveFiles" extend="" formData="cgFormId,cgFormName,cgFormField_testFile3" outhtml="true"></t:upload> 
							</div> 
							<div class="form" id="filediv_testFile3"></div>
							<table id="test_file_3_fileTable"></table>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">测试文件3</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							使用说明:
						</label>
					</td>
					<td class="value">
						页面当中使用多个"&lt;t:upload"的时候，需要设置参数outhtml的值，
						<span style="color:red;">最后一个标签当中的outhtml的值设置为true，其余标签当中的outhtml设置为false;</span>
						页面当中有且仅有一个"&lt;t:upload"的时候，可以省略outhtml="true"
					</td>
				</tr>
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
