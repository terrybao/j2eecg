
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${user.id }" />
	<input id="deleteType" name="deleteType" type="hidden" value="deleteTrue" />
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tbody>
			<th>删除策略</th>
			<tr>
				<td class="value"><input type="radio" value="delete" name="deleteRadio"  /><span>逻辑删除</span></td>
			</tr>
			<tr>
				<td class="value"><input type="radio" value="deleteTrue" name="deleteRadio" checked="checked"/> <span>物理删除</span></td>
			</tr>
		</tbody>
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
