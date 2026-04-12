
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
		<input id="id" name="id" type="hidden" value="${tSSmsPage.id }">
		<input id="createName" name="createName" type="hidden" value="${tSSmsPage.createName }">
		<input id="createBy" name="createBy" type="hidden" value="${tSSmsPage.createBy }">
		<input id="createDate" name="createDate" type="hidden" value="${tSSmsPage.createDate }">
		<input id="updateName" name="updateName" type="hidden" value="${tSSmsPage.updateName }">
		<input id="updateBy" name="updateBy" type="hidden" value="${tSSmsPage.updateBy }">
		<input id="updateDate" name="updateDate" type="hidden" value="${tSSmsPage.updateDate }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								消息标题:
							</label>
						</td>
						<td class="value">
						     	 <input id="esTitle" name="esTitle" type="text" style="width: 150px" class="inputxt"  value='${tSSmsPage.esTitle}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">消息标题</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								消息类型:
							</label>
						</td>
						<td class="value">
						        <el-select v-model="form.esStatus" placeholder="请选择"></el-select>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">发送状态</label>
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
