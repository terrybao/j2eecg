
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
<div region="center" style="padding:0px;border:0px">
<t:datagrid fitColumns="true" checkbox="true" name="cgreportConfigHeadList" title="dynamic.table.head" 
            actionUrl="cgreportConfigHeadController.do?datagrid" idField="id" fit="true" queryMode="group" sortName="createDate" sortOrder="desc" superQuery="true">
	<el-table-column prop="id" label=""></el-table-column>
	<el-table-column prop="name" label="报表名称"></el-table-column>
	<el-table-column prop="code" label="common.code"></el-table-column>
	<el-table-column prop="cgrSql" label="query.sql"></el-table-column>
    <el-table-column prop="dbSource" label="common.dynamic.dbsource"></el-table-column>
	<el-table-column prop="createBy" label="common.createby"></el-table-column>
	<el-table-column prop="createDate" label="common.createtime"></el-table-column>
	<el-table-column prop="updateBy" label="common.updateby"></el-table-column>
	<el-table-column prop="updateDate" label="common.updatetime"></el-table-column>
	<el-table-column prop="content" label="common.description"></el-table-column>
	<el-table-column prop="opt" label="common.operation"></el-table-column>
	<t:dgDelOpt title="common.delete" url="cgreportConfigHeadController.do?doDel&id={id}"  urlclass="ace_button"  urlfont="fa-trash-o"/>
	<t:dgFunOpt funname="popMenuLink(code,name)" title="配置地址"  urlclass="ace_button"  urlfont="fa-cog"></t:dgFunOpt>
	<t:dgFunOpt  funname="addlisttab(code,name)" title="功能测试" urlclass="ace_button"  urlfont="fa-cog"></t:dgFunOpt>
	<div class="toolbar"></div>
	<div class="toolbar"></div>
	<div class="toolbar"></div>
	<div class="toolbar"></div>
</el-table></div>
</div>


 
<div id="menu" class="easyui-menu" style="width: 30px; display: none;">  
	<div id="btn_More" data-options="iconCls:'icon-remove'" onclick="MoreInfo()">更多</div>        
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
