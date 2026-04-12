
<template>
  <div class="vue-component">
    <input id="id" name="id" type="hidden" value="${departAuthGroup.id}">
	<input id="groupName" name="groupName" type="hidden" value="${departAuthGroup.groupName}">
	<div id="dd" class="easyui-tabs" data-options="tools:'#tab-tools'" style="width:auto;">
		<div title="管理员组授权">
			<!-- 管理员组授权 -->
			<div tools="#tt" class="easyui-panel" title='{{ $t("permission.set") }}' style="padding: 10px;" fit="true" border="false" id="function-panel"></div>
			<div id="tt"></div>
		</div>
		<div title="设置管理员" data-options="tools:'#tab-tools'" style="padding:10px;overflow:auto;">
			<iframe scrolling="yes" frameborder="0"  src="departAuthGroupController.do?departGroupUserList&id=${departAuthGroup.id}" style="width:100%;height:100%;"></iframe>
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
