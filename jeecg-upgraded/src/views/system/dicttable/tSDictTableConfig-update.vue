
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
					<input id="id" name="id" type="hidden" value="${tSDictTableConfigPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								表名:
							</label>
						</td>
						<td class="value">
						    <input id="tableName" name="tableName" type="text" maxlength="100" style="width: 150px" class="inputxt"  datatype="*" ignore="checked"  value='${tSDictTableConfigPage.tableName}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">表名</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								值字段名:
							</label>
						</td>
						<td class="value">
						    <input id="valueCol" name="valueCol" type="text" maxlength="50" style="width: 150px" class="inputxt"  datatype="*" ignore="checked"  value='${tSDictTableConfigPage.valueCol}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">值字段名</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								文本字段名:
							</label>
						</td>
						<td class="value">
						    <input id="textCol" name="textCol" type="text" maxlength="50" style="width: 150px" class="inputxt"  datatype="*" ignore="checked"  value='${tSDictTableConfigPage.textCol}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">文本字段名</label>
						</td>
					</tr>
					<tr>
					
					<tr>
						<td align="right">
							<label class="Validform_label">
								是否启用:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="isvalid" type="radio"  datatype="*" typeGroupCode="sf_yn"   defaultVal="${tSDictTableConfigPage.isvalid}" hasLabel="false"  title="是否启用" ></el-select>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">是否启用</label>
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
