
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jeecgMysearchList" pageSize="500" checkbox="true" pagination="true" fitColumns="false" title="自定义列表查询条件" actionUrl="jeecgListDemoController.do?datagrid" idField="id" fit="true">
    <el-table-column prop="id" label="id"></el-table-column>
    <el-table-column prop="name" label="名称"></el-table-column>
    <el-table-column prop="age" label="年龄"></el-table-column>
    <el-table-column prop="birthday" label="生日"></el-table-column>
    <el-table-column prop="depId" label="部门"></el-table-column>
    <el-table-column prop="sex" label="性别"></el-table-column>
    <el-table-column prop="phone" label="电话"></el-table-column>
    <el-table-column prop="salary" label="工资"></el-table-column>
  </el-table>
  
	  <div id="jeecgMysearchListtb" style="padding: 3px; height: 25px">
		  	 <div style="float: left;">
				  <a href="#" id="add" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="add('录入','jeecgListDemoController.do?goAdd','jeecgMysearchList')">用户录入</a> 
				  <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="update('编辑','jeecgListDemoController.do?goUpdate','jeecgMysearchList')">用户编辑</a>
			  </div>
	  		  <div align="right" class="searchColums">
	  			  <label for="name" class="col-sm-2 control-label">名字: </label><input class="form-control" type="text" name="name" placeholder="请输入名字"/>
	  			  <label for="age" class="col-sm-2 control-label">年龄： </label><input class="form-control"  type="text" name="age" placeholder="请输入年龄"/>
	  			  <label for="sex" class="col-sm-2 control-label">性别： </label>
	  			  	  <select name="sex" class="form-control">
	  			  	  	  <option value="">请选择</option>
					      <option value="0">男</option>
					      <option value="1">女</option>
				      </select>
	  			 <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="jeecgMysearchListsearch();">查询</a>
				 <a href="#" class="easyui-linkbutton" iconCls="icon-reload" onclick="searchReset('jeecgMysearchList')">重置</a>
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
