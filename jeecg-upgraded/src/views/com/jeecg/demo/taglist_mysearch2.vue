
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jeecgMysearchList" pageSize="500" checkbox="true" pagination="true" fitColumns="false" title="自定义列表查询条件二" actionUrl="jeecgListDemoController.do?datagrid" idField="id" fit="true">
    <el-table-column prop="id" label="id"></el-table-column>
    <el-table-column prop="name" label="名称"></el-table-column>
    <el-table-column prop="age" label="年龄"></el-table-column>
    <el-table-column prop="birthday" label="生日"></el-table-column>
    <el-table-column prop="depId" label="部门"></el-table-column>
    <el-table-column prop="sex" label="性别"></el-table-column>
    <el-table-column prop="phone" label="电话"></el-table-column>
    <el-table-column prop="salary" label="工资"></el-table-column>
  </el-table>
  <div id="jeecgMysearchListtb" style="padding: 3px; height: 27px;border-bottom:1px solid #D7D7D7">
		  	 <div style="float: left;" class="searchColums" >
		  	      名称：<input class="inuptxt ac_input" type="text" name="name">
	  			  年龄：<input class="easyui-validatebox"  type="text" name="age">
			  </div>
	  		  <div align="right">
	  			 <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="jeecgMysearchListsearch();">查询</a>
				 <a href="#" class="easyui-linkbutton" iconCls="icon-reload" onclick="searchReset('jeecgMysearchList')">重置</a>
	  		 </div>
  	  </div>
  	  <div id="jeecgMysearchListtb2" style="padding: 3px; height: 25px">
		  	 <div style="float: left;">
				  <a href="#" id="add" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="add('录入','jeecgListDemoController.do?goAdd','jeecgMysearchList')">用户录入</a> 
				  <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="update('编辑','jeecgListDemoController.do?goUpdate','jeecgMysearchList')">用户编辑</a>
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
