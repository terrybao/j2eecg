
<template>
  <div class="vue-component">
    <div class="easyui-layout" fit="true" scroll="no">
		<div  data-options="region:'west',title:'部门角色管理',split:true" style="width:254px;overflow: auto;">
			<input style="width:120px;" type="text" id="supplier" name="supplier" placeholder="供应商检索"/>
			<a icon="icon-search" class="easyui-linkbutton l-btn l-btn-plain" onclick="selectSupplier()">
				<span class="bigger-110 no-text-shadow">检索</span>
			</a>
	        <div id="orgTree" class="ztree"></div>
		</div>
		<div id="iframeDiv" data-options="region:'center',border:false" style="text-align: center;overflow:hidden;">
			<iframe id="listFrame" src="" frameborder="no" width="100%" height="100%"></iframe>
		</div>
		<div class="hidden">
			<div id="orgMenu" class="easyui-menu" data-options="onClick:menuHandler" style="width: 120px;">
				<div data-options="name:'add'">添加角色</div>
				<div data-options="name:'edit'" >编辑角色</div> 
				<div data-options="name:'remove'">删除角色 </div> 
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
