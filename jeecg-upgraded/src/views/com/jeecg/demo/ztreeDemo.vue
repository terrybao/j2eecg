
<template>
  <div class="vue-component">
    <div class="easyui-layout" fit="true" scroll="no">
		<div  data-options="region:'west',title:'组织管理',split:true" style="width:200px;overflow: auto;">
	        <div id="orgTree" class="ztree"></div>
		</div>
		<div data-options="region:'center',border:false" style="text-align: center;">
			 	<iframe id="listFrame" src="" frameborder="no" width="100%" height="100%"></iframe>
		</div>
		<div class="hidden">
			<div id="orgMenu" class="easyui-menu" data-options="onClick:menuHandler" style="width: 120px;">
				<div data-options="name:'add'">添加子级组织</div>
				 <div data-options="name:'edit'">编辑当前组织</div> 
				 <div data-options="name:'remove'">删除当前组织</div> 
				 <div data-options="name:'fresh'">刷新</div>
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
