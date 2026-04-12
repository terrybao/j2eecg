
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
		<input id="id" name="id" type="hidden" value="${dbSourcePage.id }">
			<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							{{ $t("common.dbtype") }}:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="dbKey" name="dbKey"
							   value="${dbSourcePage.dbKey}" datatype="*">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							{{ $t("common.description") }}:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="description" name="description"
							   value="${dbSourcePage.description}" datatype="*">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							{{ $t("common.dbtype") }}:
						</label>
					</td>
					<td class="value">
						<el-select v-model="form.dbType" placeholder="请选择"></el-select>
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							{{ $t("common.driverclass") }}:
						</label>
					</td>
					<td class="value">
						<textarea id="driverClass" name="driverClass" rows="2" cols="50" datatype="*" readonly="readonly">${dbSourcePage.driverClass}</textarea>
						<span class="Validform_checktip"></span>
					</td>
				</tr>

				<tr>
					<td align="right">
						<label class="Validform_label">
							{{ $t("common.datasrouce.url") }}:
						</label>
					</td>
					<td class="value">
						<textarea id="url" name="url" rows="3" cols="50" datatype="*">${dbSourcePage.url}</textarea>
						<span class="Validform_checktip"></span>
					</td>
				</tr>

				<tr>
					<td align="right">
						<label class="Validform_label">
							{{ $t("common.dbname") }}:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="dbName" name="dbName"
							   value="${dbSourcePage.dbName}" datatype="*">
						<span class="Validform_checktip"></span>
					</td>
				</tr>

				<tr>
					<td align="right">
						<label class="Validform_label">
							{{ $t("common.dbuser") }}:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="dbUser" name="dbUser"
							   value="${dbSourcePage.dbUser}" datatype="*">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							{{ $t("common.dbpassword") }}:
						</label>
					</td>
					<td class="value">
						<input type="password" class="inputxt" id="dbPassword" name="dbPassword" ignore="ignore"
							   value="${showDbPassword}">
						<span class="Validform_checktip"></span>
						<a href="#"  id="dbtest" >
						<label class="Validform_label">[ 测试  ]</label>
						</a>
						<span class="Validform_checktip"  id="dbmsg"></span>
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
