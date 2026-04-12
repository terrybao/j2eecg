
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jeecgDemoExcelList" checkbox="true" pagination="true" fitColumns="true" title="excel导入导出测试表" actionUrl="jeecgDemoExcelController.do?datagrid" idField="id" fit="true" queryMode="group">
   <el-table-column prop="id" label="主键"></el-table-column>
   <el-table-column prop="name" label="姓名"></el-table-column>
   <el-table-column prop="sex" label="性别"></el-table-column>
   <el-table-column prop="birthday" label="生日"></el-table-column>
   <el-table-column prop="depart" label="关联部门"></el-table-column>
   <el-table-column prop="fdReplace" label="测试替换"></el-table-column>
   <el-table-column prop="fdConvert" label="测试转换"></el-table-column>
   <el-table-column prop="opt" label="操作"></el-table-column>
   <t:dgDelOpt title="删除" url="jeecgDemoExcelController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
   <div class="toolbar"></div>
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
