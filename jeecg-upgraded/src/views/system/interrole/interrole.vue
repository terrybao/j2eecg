
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input name="id" type="hidden" value="${role.id}">
	<fieldset class="step">
	<div class="form"><label class="Validform_label">{{ $t("common.role.name") }}:</label> 
	<input name="roleName" class="inputxt" value="${role.roleName }" datatype="s2-8"> 
	<span class="Validform_checktip">
	{{ $t("rolescope.rang2to8.notnull") }}
	</span>
	</div>
	<div class="form">
	<label class="Validform_label"> 
		{{ $t("common.role.code") }}: 
	</label> 
	<input name="roleCode" id="roleCode" ajaxurl="interroleController.do?checkRole&code=${role.roleCode }" class="inputxt"
		value="${role.roleCode }" datatype="s2-15"> 
	<span class="Validform_checktip">
	{{ $t("rolecode.rang2to15.notnull") }}
	</span>
	</div>
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
