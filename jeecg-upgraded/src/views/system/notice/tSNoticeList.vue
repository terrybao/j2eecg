
<template>
  <div class="vue-component">
    </t:base>
<div id="main_depart_list" class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="tSNoticeList" checkbox="true" fitColumns="true" title="common.notice" actionUrl="noticeController.do?datagrid2" idField="id" fit="true" queryMode="group">
   <el-table-column prop="id" label="ID"></el-table-column>
   <el-table-column prop="noticeTitle" label="通知标题"></el-table-column>
   
   <el-table-column prop="noticeType" label="common.type.name"></el-table-column>
   <el-table-column prop="noticeLevel" label="授权级别"></el-table-column>
   <el-table-column prop="noticeTerm" label="阅读期限"></el-table-column>
   <el-table-column prop="opt" label="common.operation"></el-table-column>
   <t:dgDelOpt title="common.delete" url="noticeController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
  
  </el-table>
  </div>
 </div>
 <div data-options="region:'east',
	title:'通知公告授权管理',
	collapsed:true,
	split:true,
	border:false,
	onExpand : function(){
		li_east = 1;
	},
	onCollapse : function() {
	    li_east = 0;
	}"
	style="width: 500px; overflow: hidden;">
<div class="easyui-panel" style="padding: 1px;" fit="true" border="false" id="subListpanel"></div>
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
