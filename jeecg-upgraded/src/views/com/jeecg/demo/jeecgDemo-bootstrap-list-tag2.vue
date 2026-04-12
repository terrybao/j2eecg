
<template>
  <div class="vue-component">
    <!-- 自定义查询条件 -->
<!-- <div class="panel-body" style="padding-bottom:0px;">
		<div class="accordion-group">
			<div id="collapse_search" class="accordion-body collapse">
				<div class="accordion-inner">
					<div class="panel panel-default" style="margin-bottom: 0px;">
            				<div class="panel-body" >
			                <form id="searchForm" class="form form-horizontal" action="" method="post">
								<div class="col-xs-12 col-sm-6 col-md-4">
					    			<label for="name">名称：</label>
					    			<div class="input-group" style="width:100%">
					    				<input type="text" class="form-control input-sm" id="name" name="name">
					    			</div>
					    		</div>
			                    <div class="col-xs-12 col-sm-6 col-md-4">
			                         <div  class="input-group col-md-12" style="margin-top:20px">
			                         <a type="button" onclick="searchList();" class="btn btn-primary btn-rounded  btn-bordered btn-sm"><span class="glyphicon glyphicon-search" aria-hidden="true"></span> 查询</a>
			                         <a type="button" onclick="searchRest();" class="btn btn-primary btn-rounded  btn-bordered btn-sm"><span class="glyphicon glyphicon-repeat" aria-hidden="true"></span> 重置</a>
			                         </div>
			                    </div>
			                </form>
			                </div>
			             </div>
			       </div>
			</div>
		</div>
</div> -->
<t:datagrid name="jeecgDemoList" checkbox="true" query="true" component="bootstrap-table" sortName="birthday,name" pagination="true" fitColumns="false" title="jeecg_demo" 
  	  superQuery="true" actionUrl="jeecgListDemoController.do?datagrid" idField="id" fit="true" queryMode="group" filter="true">
    <el-table-column prop="id" label="id"></el-table-column>
    <el-table-column prop="name" label="名称"></el-table-column>
    <!--update-begin-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，年龄区间查询-->
    <el-table-column prop="age" label="年龄"></el-table-column>
    <!--update-end-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，年龄区间查询-->
    <el-table-column prop="birthday" label="生日"></el-table-column>
    <el-table-column prop="sex" label="性别"></el-table-column>
    <el-table-column prop="phone" label="电话"></el-table-column>
    <el-table-column prop="salary" label="工资"></el-table-column>
    <el-table-column prop="createDate" label="创建日期"></el-table-column>
    <el-table-column prop="email" label="邮箱"></el-table-column>
    <el-table-column prop="status" label="入职状态"></el-table-column>
    <el-table-column prop="content" label="个人介绍"></el-table-column>
   <el-table-column prop="opt" label="操作"></el-table-column>
   <t:dgDelOpt title="删除" url="jeecgListDemoController.do?doDel&id={id}" urlclass="btn btn-danger btn-xs"  urlfont="fa-trash-o"/>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
  </el-table>
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
