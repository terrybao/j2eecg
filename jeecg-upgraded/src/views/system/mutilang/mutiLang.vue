
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
			<input id="id" name="id" type="hidden" value="${mutiLangPage.id }">
			<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							{{ $t("common.languagekey") }}:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="langKey" name="langKey" value="${mutiLangPage.langKey}" datatype="*">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							{{ $t("common.content") }}:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="langContext" name="langContext" value="${mutiLangPage.langContext}" datatype="*">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							{{ $t("common.language") }}:
						</label>
					</td>
					<td class="value">
						<t:dictSelect field="langCode" typeGroupCode="lang" hasLabel="false" defaultVal="${mutiLangPage.langCode}"></el-select>
						<span class="Validform_checktip"></span>
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
