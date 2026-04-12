
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" type="hidden" name="id" value="${user.id }">
	<table style="width: 550px" cellpadding="0" cellspacing="1" class="formtable">
		<tbody>
			
			<tr>
				<td align="right"><label class="Validform_label"> {{ $t("common.password") }}: </label></td>
				<td class="value"><input type="password" class="inputxt" value="" name="password" plugin="passwordStrength" datatype="*6-18" errormsg="" /> <span class="passwordStrength"
					style="display: none;"><span>{{ $t("common.weak") }}</span><span>{{ $t("common.middle") }}</span><span class="last">{{ $t("common.strong") }}</span> </span> <span class="Validform_checktip">{{ $t("password.rang6to18") }}</span></td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> {{ $t("common.repeat.password") }}: </label></td>
				<td class="value"><input id="repassword" class="inputxt" type="password"  recheck="password" datatype="*6-18" errormsg="两次输入的密码不一致！"> <span
					class="Validform_checktip">{{ $t("common.repeat.password") }}</span></td>
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
