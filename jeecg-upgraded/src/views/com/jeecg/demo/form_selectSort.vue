
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<fieldset>
	<legend>可排序多选 | input</legend>
	<table>
		<tr>
			<td align="center" width="100px"><label class="Validform_label">用户名称 :</label></td>
			<td class="value">
				
				<input id="id" name="id" type="hidden" value="" /> 
				<input name="realName" class="inputxt" value="" id="realName" readonly="readonly" datatype="*" /> 
				
				<a href="#" class="easyui-linkbutton l-btn l-btn-plain" plain="true" id="departSearch" onclick="openSelectSort()">
					<span class="l-btn-text icon-search l-btn-icon-left">选择</span>
				</a>
				<a href="#" class="easyui-linkbutton l-btn l-btn-plain" plain="true" id="departRedo" onclick="callbackClean()">
					<span class="l-btn-text icon-redo l-btn-icon-left">清空</span>
				</a>
			 	<!-- <span class="Validform_checktip"></span> -->
			 </td>
		</tr>
	</table>
	</fieldset>
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
