
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
		<input id="id" name="id" type="hidden" value="${tsBlackListPage.id }"/>
		<input id="createName" name="createName" type="hidden" value="${tsBlackListPage.createName }"/>
		<input id="createBy" name="createBy" type="hidden" value="${tsBlackListPage.createBy }"/>
		<input id="createDate" name="createDate" type="hidden" value="${tsBlackListPage.createDate }"/>
		<input id="updateName" name="updateName" type="hidden" value="${tsBlackListPage.updateName }"/>
		<input id="updateBy" name="updateBy" type="hidden" value="${tsBlackListPage.updateBy }"/>
		<input id="updateDate" name="updateDate" type="hidden" value="${tsBlackListPage.updateDate }"/>
		<input id="sysOrgCode" name="sysOrgCode" type="hidden" value="${tsBlackListPage.sysOrgCode }"/>
		<input id="sysCompanyCode" name="sysCompanyCode" type="hidden" value="${tsBlackListPage.sysCompanyCode }"/>
		<input id="bpmStatus" name="bpmStatus" type="hidden" value="${tsBlackListPage.bpmStatus }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							ip地址:
						</label>
					</td>
					<td class="value">
					     	 <input id="ip" name="ip" type="text" style="width: 150px" class="inputxt" datatype="*"/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">ip地址</label>
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
