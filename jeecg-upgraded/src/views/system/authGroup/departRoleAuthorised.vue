
<template>
  <div class="vue-component">
    <div class="easyui-layout" fit="true">
	<div region="center" style="padding: 1px;">
		<div class="easyui-panel" style="padding: 1px;" fit="true" border="false" id="functionListPanel">
			<input type="hidden" name="groupId" value="${gid}" id="groupId">
			<input type="hidden" name="pId" value="${pid}" id="pId">
			<input type="hidden" id="typeMode" value="1"/>
			<a id="selecrAllBtn" onclick="selecrAll();"><t:mutiLang langKey="select.all" /></a>
			<a id="deleteAllBtn" onclick="deleteAll();"><t:mutiLang langKey="common.clear" /></a> 
			<a id="resetBtn" onclick="reset();"><t:mutiLang langKey="common.reset" /></a>
			<a id="changeBtn" onclick="changeMode();"><t:mutiLang langKey="common.typemode" /></a>
			<ul id="functionid" class="ztree"></ul>
		</div>
	</div>
	<div region="east" style="width: 300px; overflow: hidden;" split="true">
		<div class="easyui-layout" fit="true">
			<div region="center" style="padding: 1px; border: 0px;">
				<div class="easyui-panel" style="padding: 1px;" fit="true" border="false" id="operationListpanel"></div>
			</div>
			<div region="east" style="width: 150px; overflow: hidden;" split="true">
				<div class="easyui-panel" style="padding: 1px;" fit="true" border="false" id="dataRuleListpanel"></div>
			</div>
		</div>
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
