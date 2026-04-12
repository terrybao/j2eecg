
<template>
  <div class="vue-component">
    <div class="easyui-layout" fit="true" scroll="no">
		<div  data-options="region:'west',title:'组织机构管理',split:true" style="width:200px;overflow: auto;">
		    <div style="width:85px;float: left;margin-left: 8px;margin-top: 2px;">
			<a  icon="icon-add" class="easyui-linkbutton l-btn l-btn-plain"  onclick="addOneNode()">
				<span class="bigger-110 no-text-shadow">添加公司</span>
			</a>
			</div>
			<!-- <div style="width:10px;float: left;margin-top: 2px;">
			<a  icon="icon-add" class="easyui-linkbutton l-btn l-btn-plain" onclick="addSupplierNode()">
				<span class="bigger-110 no-text-shadow">添加供应商</span>
			</a>
			</div> -->
			 <div class="clear"></div> 
	        <div id="orgTree" class="ztree"></div>
	        <input type="hidden" id="userName" name="userName" value="${userName}"/>
		</div>
		<div data-options="region:'center'" title="">
    <!-- <iframe width="100%" height="100%" id="center"  src="" style="border:1px #fff solid; background:#fff;"></iframe> -->
		<div id="tt" tabPosition="top" border=flase style="width:100%;height:100%;margin:0px;padding:0px;overflow-x:hidden;width:auto;" class="easyui-tabs" fit="true"></div>
        </div>

		<div class="hidden">
			<div id="orgMenu" class="easyui-menu" data-options="onClick:menuHandler" style="width: 120px;">
				<div data-options="name:'addSubCompany'">添加下级公司</div>
				<div data-options="name:'addSubOrg'">添加下级部门</div>
				<div data-options="name:'addSubJob'">添加下级岗位</div>
				<div data-options="name:'edit'">编辑</div> 
				<div data-options="name:'remove'">删除 </div> 
				<div data-options="name:'fresh'">刷新</div>
			</div>
			<div id="gysMenu" class="easyui-menu" data-options="onClick:menuHandler" style="width: 120px;">
				<div data-options="name:'editSupplier'">编辑</div> 
				<div data-options="name:'removeSupplier'">删除 </div> 
				<div data-options="name:'fresh'">刷新</div>
			</div>
			<div id="gysRootMenu" class="easyui-menu" data-options="onClick:menuHandler" style="width: 120px;">
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
