
<template>
  <div class="vue-component">
    <input id="id" name="id" type="hidden" value="${role.id}">
	<input id="roleName" name="roleName" type="hidden" value="${role.roleName}">
	<input id="departAgId" name="departAgId" type="hidden" value="${role.departAgId}">
	<div id="dd" class="easyui-tabs" data-options="tools:'#tab-tools'" style="width:auto;">
		<div title="角色授权">
			<div tools="#tt" class="easyui-panel" title='{{ $t("permission.set") }}' style="padding: 10px;" fit="true" border="false" id="function-panel"></div>
			<div id="tt"></div>
		</div>
	</div>
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
