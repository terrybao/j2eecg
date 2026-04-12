
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
					<input id="id" name="id" type="hidden" value="${tSSmsTemplatePage.id }">
					<input id="createName" name="createName" type="hidden" value="${tSSmsTemplatePage.createName }">
					<input id="createBy" name="createBy" type="hidden" value="${tSSmsTemplatePage.createBy }">
					<input id="createDate" name="createDate" type="hidden" value="${tSSmsTemplatePage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${tSSmsTemplatePage.updateName }">
					<input id="updateBy" name="updateBy" type="hidden" value="${tSSmsTemplatePage.updateBy }">
					<input id="updateDate" name="updateDate" type="hidden" value="${tSSmsTemplatePage.updateDate }">
		<table style="width: 100%;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							模板类型:
						</label>
					</td>
					<td class="value">
							<t:dictSelect field="templateType" type="list" typeGroupCode="msgTplType" defaultVal="${tSSmsTemplatePage.templateType}" 
							   hasLabel="false"  title="模板类型" extendJson="{\"datatype\":\"*\"}" ></el-select>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">模板类型</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							模板CODE:
						</label>
					</td>
					<td class="value">
					     	 <input id="templateCode" name="templateCode" type="text" style="width: 150px" class="inputxt"  datatype="*" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">模板Code</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							模板名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="templateName" name="templateName" type="text" style="width: 150px" class="inputxt"  datatype="*" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">模板名称</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							模板内容:
						</label>
					</td>
					<td class="value">
						  	 <textarea style="width:600px;height:100px" class="inputxt" rows="6" id="templateContent" name="templateContent"></textarea>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">模板内容</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							模板测试JSON:
						</label>
					</td>
					<td class="value">
						  	 <textarea style="width:600px;height:100px" class="inputxt" rows="6" id="templateTestJson" name="templateTestJson"></textarea>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">模板测试JSON</label>
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
