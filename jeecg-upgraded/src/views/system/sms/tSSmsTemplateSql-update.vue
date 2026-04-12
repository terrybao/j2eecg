
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
					<input id="id" name="id" type="hidden" value="${tSSmsTemplateSqlPage.id }">
					<input id="createName" name="createName" type="hidden" value="${tSSmsTemplateSqlPage.createName }">
					<input id="createBy" name="createBy" type="hidden" value="${tSSmsTemplateSqlPage.createBy }">
					<input id="createDate" name="createDate" type="hidden" value="${tSSmsTemplateSqlPage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${tSSmsTemplateSqlPage.updateName }">
					<input id="updateBy" name="updateBy" type="hidden" value="${tSSmsTemplateSqlPage.updateBy }">
					<input id="updateDate" name="updateDate" type="hidden" value="${tSSmsTemplateSqlPage.updateDate }">
		<table style="width: 100%;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								配置CODE:
							</label>
						</td>
						<td class="value">
						     	 <input id="code" name="code" type="text" style="width: 150px" class="inputxt"  datatype="*"  value='${tSSmsTemplateSqlPage.code}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">配置CODE</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								配置名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="name" name="name" type="text" style="width: 150px" class="inputxt"  datatype="*"  value='${tSSmsTemplateSqlPage.name}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">配置名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								业务SQLID:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="sqlId" type="list" dictTable="t_s_sms_sql" dictField="id" dictText="sql_name" 
										defaultVal="${tSSmsTemplateSqlPage.sqlId}" hasLabel="false"  title="业务SQLID" extendJson="{\"datatype\":\"*\"}"></el-select>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">业务SQLID</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								消息模本ID:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="templateId" type="list" dictTable="t_s_sms_template" dictField="id" dictText="template_name" 
										defaultVal="${tSSmsTemplateSqlPage.templateId}" hasLabel="false"  title="消息模本ID" extendJson="{\"datatype\":\"*\"}"></el-select>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">消息模本ID</label>
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
