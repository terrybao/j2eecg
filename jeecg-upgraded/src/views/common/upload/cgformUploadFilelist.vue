
<template>
  <div class="vue-component">
    <!DOCTYPE t:base PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


</t:base>
<div class="easyui-layout" fit="true">
<div region="center" style="padding:0px;border:0px">
<t:datagrid name="cgUploadFileList" idField="id" fit="true" fitColumns="true" title="" actionUrl="" autoLoadData="false" pagination="false">
	<el-table-column prop="id" label="主键"></el-table-column>
	<el-table-column prop="attachmenttitle" label="文件名称"></el-table-column>
	<el-table-column prop="realpath" label="realpath"></el-table-column>
	<el-table-column prop="swfpath" label="swfpath"></el-table-column>
	<el-table-column prop="extend" label="extend"></el-table-column>
	<el-table-column prop="createdate" label="createdate"></el-table-column>
	<el-table-column prop="opt" label="操作"></el-table-column>
    <t:dgFunOpt title="预览" funname="iview(id)" urlclass="ace_button"  urlfont="fa-desktop" />
    <t:dgFunOpt title="下载" funname="idown(id)" urlclass="ace_button"  urlfont="fa-download" />
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
