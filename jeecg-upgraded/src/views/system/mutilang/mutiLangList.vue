
<template>
  <div class="vue-component">
    <t:datagrid name="mutiLangList" title="lang.maintain" actionUrl="mutiLangController.do?datagrid" idField="id" fit="true" queryMode="group" sortName="id" sortOrder="desc">
   <el-table-column prop="id" label="common.code"></el-table-column>
   <el-table-column prop="langKey" label="common.languagekey"></el-table-column>
   <el-table-column prop="langContext" label="common.content"></el-table-column>
   <el-table-column prop="langCode" label="common.language"></el-table-column>
   <el-table-column prop="createBy" label="common.createby"></el-table-column>
	<el-table-column prop="createDate" label="common.createtime"></el-table-column>
	<el-table-column prop="updateBy" label="common.updateby"></el-table-column>
	<el-table-column prop="updateDate" label="common.updatetime"></el-table-column>
   <el-table-column prop="opt" label="common.operation"></el-table-column>
   <t:dgDelOpt title="common.delete" url="mutiLangController.do?del&id={id}"  urlclass="ace_button"  urlfont="fa-trash-o"/>
   <div class="toolbar"></div>
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
