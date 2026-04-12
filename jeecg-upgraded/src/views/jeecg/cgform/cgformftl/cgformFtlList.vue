
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
<div region="center" style="padding:0px;border:0px"><t:datagrid name="cgformFtlList" title="表单模板列表" actionUrl="cgformFtlController.do?datagrid&cgformId=${formid}" idField="id" fit="true">
	<el-table-column prop="id" label="编号"></el-table-column>
	<el-table-column prop="cgformId" label="表单ID"></el-table-column>
	<el-table-column prop="cgformName" label="模板名称"></el-table-column>
	<el-table-column prop="ftlVersion" label="版本号"></el-table-column>
	<el-table-column prop="ftlStatus" label="激活状态"></el-table-column>
	<el-table-column prop="ftlWordUrl" label="word路径"></el-table-column>
	<el-table-column prop="opt" label="操作"></el-table-column>
	<t:dgDelOpt title="删除" url="cgformFtlController.do?del&id={id}&formId=${formid}" urlclass="ace_button"  urlfont="fa-trash-o" exp="ftlStatus#eq#0" />
	<t:dgConfOpt title="激活" url="cgformFtlController.do?active&id={id}&formId=${formid}" urlclass="ace_button"  urlfont="fa-toggle-on" exp="ftlStatus#eq#0" message="确认激活模板"/>
	<t:dgConfOpt title="取消激活" url="cgformFtlController.do?cancleActive&id={id}&formId=${formid}"  urlclass="ace_button"  urlfont="fa-toggle-off"  exp="ftlStatus#eq#1" message="确认取消激活"/>
	<t:dgFunOpt funname="ftleditor(id,cgformName)" title="模板编辑" urlclass="ace_button"  urlfont="fa-edit"></t:dgFunOpt>
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
