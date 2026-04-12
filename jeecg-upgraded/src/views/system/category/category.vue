
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
		<input id="id" name="id" type="hidden" value="${categoryPage.id }">
		<table style="width: 500px;" cellpadding="0" cellspacing="1"
			class="formtable">
			<tr>
				<td align="right"><label class="Validform_label"> 类型名称:</label></td>
				<td class="value"><input class="inputxt" id="name" name="name" ignore="ignore" value="${categoryPage.name}"> <span class="Validform_checktip"></span></td>
			</tr>
			
			<tr>
				<td align="right"><label class="Validform_label"> 所属上级:</label></td>
				<td class="value">
					<input id="pId" name="parent.id"type="hidden" value="${categoryPage.parent.id}">
					<input id="categoryTree" value="${categoryPage.parent.name}"> <input id="parentId" name="parent.code" style="display: none;" value="${categoryPage.parent.code}"> 
					<span class="Validform_checktip"></span></td>
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
