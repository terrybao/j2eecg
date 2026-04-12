
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input name="id" type="hidden" value="${typegroup.id }">
	<fieldset class="step">
	<div class="form">
	<label class="Validform_label"> {{ $t("common.code") }}: </label> 
	<input name="typegroupcode" class="inputxt" validType="t_s_typegroup,typegroupcode,id" value="${typegroup.typegroupcode }" datatype="s2-10"> <span class="Validform_checktip">{{ $t("common.code.range" langArg="common.code,common.range2to8") }}</span></div>
	<div class="form">
	<label class="Validform_label"> {{ $t("common.name") }}: </label> 
	<input name="typegroupname" class="inputxt" value="${typegroup.typegroupname }" datatype="s2-10"> <span class="Validform_checktip">{{ $t("common.name.range" langArg="common.name,common.range2to10") }}</span></div>
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
