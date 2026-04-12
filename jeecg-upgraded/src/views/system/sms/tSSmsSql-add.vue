
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
					<input id="id" name="id" type="hidden" value="${tSSmsSqlPage.id }">
					<input id="createName" name="createName" type="hidden" value="${tSSmsSqlPage.createName }">
					<input id="createBy" name="createBy" type="hidden" value="${tSSmsSqlPage.createBy }">
					<input id="createDate" name="createDate" type="hidden" value="${tSSmsSqlPage.createDate }">
					<input id="updateName" name="updateName" type="hidden" value="${tSSmsSqlPage.updateName }">
					<input id="updateBy" name="updateBy" type="hidden" value="${tSSmsSqlPage.updateBy }">
					<input id="updateDate" name="updateDate" type="hidden" value="${tSSmsSqlPage.updateDate }">
		<table style="width: 100%" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							SQL名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="sqlName" name="sqlName" type="text" style="width: 150px" class="inputxt"  datatype="*" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">SQL名称</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							SQL内容:
						</label>
					</td>
					<td class="value">
						  	 <textarea style="width:570px;height:100px" class="inputxt" rows="6" id="sqlContent" name="sqlContent"></textarea>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">SQL内容</label>
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
