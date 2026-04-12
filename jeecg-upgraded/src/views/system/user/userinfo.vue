
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<fieldset class="step">
		<div class="form"><label class="form"> {{ $t("common.username") }}: </label> ${user.userName }</div>
		<div class="form"><label class="form"> {{ $t("common.surname") }}: </label> ${user.realName}</div>
		<div class="form"><label class="form"> {{ $t("common.phone") }}: </label> ${user.mobilePhone}</div>
		<div class="form"><label class="form"> {{ $t("common.office.tel") }}: </label> ${user.officePhone}</div>
		<div class="form"><label class="form"> {{ $t("common.mail") }}: </label> ${user.email}</div>
	</fieldset>
	</form>
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
