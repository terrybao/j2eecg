
<template>
  <div class="vue-component">
    </t:base>
<style>
.btn{
	display: inline-block;
    padding: 6px 12px;
    margin-bottom: 0;
    font-size: 14px;
    font-weight: 400;
    line-height: 1.42857143;
    text-align: center;
    white-space: nowrap;
    vertical-align: middle;
    -ms-touch-action: manipulation;
    touch-action: manipulation;
    cursor: pointer;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
    background-image: none;
    border: 1px solid transparent;
    border-radius: 4p
}
.btn.focus, .btn:focus, .btn:hover {
    text-decoration: none;
}
.btn-default {
   color: #07a695;
    background-color: #fff;
    border-color: #07a695;
}
.datagrid-cell.menu-active .opts-menu-parent{
	display: block;
}
div[class$='-opt'] {
    height: 31px !important;
    width: 100px;
    z-index: 2;
    overflow: visible !important;
}
.datagrid-view td[field='opt'],.datagrid-btable td[field='opt'] {
    overflow: visible !important;
}
div[class$='menu-active'] {
    height: 31px !important;
    width: 100px;
    z-index: 2;
    overflow: visible !important;
}
.opts-menu-container{
	float: left;
    font-size: 12px;
    left: 35%;
    position: relative;
    top: 1px;
}

.opts-menu-container.location-left{
    left: 40px;
    top: -1px;
}
.opts-menu-parent{
	display: none;
}
.opts-menu-box{
	position: absolute;
    top:2px;
    z-index: 1000;
    background-color: #FFFFFF;
  /*   background-color: #f5f5f5; */
    border: 1px solid #dddddd;
    border-radius: 4px;
    box-shadow: 2px 2px 5px #969696;
    padding: 2px 4px;
}


.opts-menu-triangle{
    display: inline-block;
    height: 16px;
    position: absolute;
    left: 30px;
    top: 9px;
    width: 16px;
    z-index: 10000;
}
.ops-more {
    font-size: 12px;
    padding: 1px 6px 1px 8px;
    margin: 0px 3px;
    border-radius: 3px;
    text-decoration: none;
}

.ops-more:hover {
    background-color: #07A695;
    border-color: #068577;
    color: #fff;
    font-weight: 100;
}
.icon-triangle{
	 background: url('${webRoot}/plug-in/easyui/themes/icons/hotenticon.png') repeat scroll -80px 0 transparent;
	
}
.datagrid-cell.menu-active .icon-triangle{
	background: url('${webRoot}/plug-in/easyui/themes/icons/hotenticon.png') repeat scroll -80px -35px transparent;
	padding: 0 !important;
}

</style>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jeecgDemoCollapseList" onLoadSuccess="optsMenuToggle" checkbox="true" pagination="true" fitColumns="true" title="操作列折叠demo" actionUrl="jeecgListDemoController.do?datagrid" idField="id" fit="true" queryMode="group">
 	<el-table-column prop="id" label="id"></el-table-column>
    <el-table-column prop="name" label="名称"></el-table-column>
    <!--update-begin-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题,年龄区间查询-->
    <el-table-column prop="age" label="年龄"></el-table-column>
    <!--update-end-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，年龄区间查询-->
    <el-table-column prop="birthday" label="生日"></el-table-column>
    <el-table-column prop="depId" label="部门"></el-table-column>
    <el-table-column prop="sex" label="性别"></el-table-column>
    <el-table-column prop="phone" label="电话"></el-table-column>
    <el-table-column prop="salary" label="工资"></el-table-column>
    <el-table-column prop="createDate" label="创建日期"></el-table-column>
    <el-table-column prop="status" label="入职状态"></el-table-column>
    <el-table-column prop="opt" label="操作"></el-table-column>
  </el-table>
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
