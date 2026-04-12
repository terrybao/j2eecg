
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
<div region="center"  style="padding:0px;border:0px">
<t:datagrid name="${typegroup.typegroupcode}List" title="类型列表" actionUrl="systemController.do?typeGrid&typegroupid=${typegroup.id}" idField="id" queryMode="group" sortOrder="desc" sortName="id">
	<el-table-column prop="id" label="编号"></el-table-column>
	<el-table-column prop="typename" label="类型名称"></el-table-column>
	<el-table-column prop="typecode" label="类型编码"></el-table-column>
	<el-table-column prop="opt" label="操作"></el-table-column>
	<t:dgDelOpt url="systemController.do?delType&id={id}" title="删除" urlclass="ace_button"  urlfont="fa-trash-o"></t:dgDelOpt>
	<div class="toolbar"></div>
	<div class="toolbar"></div>
</el-table></div>
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
