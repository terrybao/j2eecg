
<template>
  <div class="vue-component">
    <t:datagrid name="jeecgDemoList1" checkbox="true" component="bootstrap-table" sortName="createDate,name" pagination="true" fitColumns="false" title="jeecg_demo" 
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
    <!-- update-begin-Author:LiShaoQing Date:20180802 for:TASK #3017 【Tag-bootstrap】查询区域字段，popup未实现 -->
    <el-table-column prop="email" label="邮箱"></el-table-column>
    <!-- update-end-Author:LiShaoQing Date:20180802 for:TASK #3017 【Tag-bootstrap】查询区域字段，popup未实现 -->
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
