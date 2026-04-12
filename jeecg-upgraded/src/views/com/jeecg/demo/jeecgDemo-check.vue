
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
					<input id="id" name="id" type="hidden" value="${jeecgDemoPage.id }">
		<table style="width:320px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								入职状态:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="status" type="radio" typeGroupCode="sf_yn" defaultVal="Y" hasLabel="false"  title="入职状态" ></el-select>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">入职状态</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								审核意见:
							</label>
						</td>
						<td class="value">
									<textarea name="content" rows="6" cols="36"></textarea>
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
