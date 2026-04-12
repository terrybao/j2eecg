
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
<div region="center"  style="padding:0px;border:0px">
<t:datagrid name="fList" title="文件下载" actionUrl="jeecgFormDemoController.do?documentList&typecode=files" idField="id" fit="true" sortName="createdate" sortOrder="desc">
	<el-table-column prop="id" label="编号"></el-table-column>
	<el-table-column prop="documentTitle" label="标题"></el-table-column>
	<el-table-column prop="createdate" label="创建时间"></el-table-column>
	<el-table-column prop="subclassname" label="类名"></el-table-column>
	<el-table-column prop="opt" label="操作"></el-table-column>
	<t:dgDefOpt url="commonController.do?viewFile&fileid={id}&subclassname={subclassname}" urlclass="ace_button"  urlfont="fa-trash-o" title="下载"></t:dgDefOpt>
	<t:dgOpenOpt width="700" height="600" url="commonController.do?openViewFile&fileid={id}&subclassname={subclassname}" urlclass="ace_button"  urlfont="fa-trash-o" title="预览"></t:dgOpenOpt>
	<t:dgDelOpt url="jeecgFormDemoController.do?delDocument&id={id}" title="删除" urlclass="ace_button"  urlfont="fa-trash-o"></t:dgDelOpt>
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
