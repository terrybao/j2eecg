
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
<div region="center" style="padding:0px;border:0px">
    <t:datagrid name="iconList" title="icon.list" actionUrl="iconController.do?datagrid" btnCls="bootstrap btn btn-success btn-xs" fit="true" fitColumns="true" idField="id">
        <el-table-column prop="id" label="common.id"></el-table-column>
        <el-table-column prop="iconName" label="common.icon.name"></el-table-column>
        <el-table-column prop="iconClas" label="common.icon.style"></el-table-column>
        <el-table-column prop="iconType" label="common.icon.type"></el-table-column>
        <el-table-column prop="iconPath" label="common.icon"></el-table-column>
        <el-table-column prop="extend" label="common.icon.type"></el-table-column>
        <el-table-column prop="opt" label="common.operation"></el-table-column>
        <t:dgDelOpt url="iconController.do?del&id={id}" title="common.delete" urlclass="ace_button" urlfont="fa-trash-o"></t:dgDelOpt>
        <div class="toolbar"></div>
        <div class="toolbar"></div>
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
