
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jeecgMinidaoList" checkbox="true" pagination="true" fitColumns="false" title="用户Demo列表，采用minidao查询数据" actionUrl="jeecgListDemoController.do?minidaoDatagrid" idField="id" fit="true" queryMode="group">
    <el-table-column prop="id" label="id"></el-table-column>
    <el-table-column prop="name" label="名称"></el-table-column>
    <el-table-column prop="age" label="年龄"></el-table-column>
    <el-table-column prop="birthday" label="生日"></el-table-column>
    <el-table-column prop="depId" label="部门"></el-table-column>
    <el-table-column prop="sex" label="性别"></el-table-column>
    <el-table-column prop="phone" label="电话"></el-table-column>
    <el-table-column prop="salary" label="工资"></el-table-column>
    <el-table-column prop="createDate" label="创建日期"></el-table-column>
    <el-table-column prop="createBy" label="创建人"></el-table-column>
    <el-table-column prop="email" label="邮箱"></el-table-column>
    <el-table-column prop="status" label="入职状态"></el-table-column>
    <el-table-column prop="content" label="个人介绍"></el-table-column>
    <!-- springjdbc demo 存储过程例子 -->
    <div class="toolbar"></div>
    <div class="toolbar"></div>

       
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
