
<template>
  <div class="vue-component">
    <div class="easyui-layout" fit="true">
	<div region="center" style="padding:0px;border:0px">
		<table id="aceEasyuiList"></table>  
	</div>
	<div id = "aceEasyuiListToolbar">
		<a href="#" class="easyui-linkbutton l-btn l-btn-plain" plain="true" icon="icon-add" onclick="add('录入','jeecgListDemoController.do?goNatureAceTableAdd','aceEasyuiList',700,500)">
			录入
		</a>
		<a href="#" class="easyui-linkbutton l-btn l-btn-plain" plain="true" icon="icon-edit" onclick="update('编辑','jeecgListDemoController.do?goNatureAceTableUpdate','aceEasyuiList',700,500)">
			编辑
		</a>
		<a href="#" class="easyui-linkbutton l-btn l-btn-plain" plain="true" icon="icon-remove" onclick="deleteALLSelect('批量删除','jeecgListDemoController.do?doBatchDel','aceEasyuiList',null,null)">
			批量删除
		</a>
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
