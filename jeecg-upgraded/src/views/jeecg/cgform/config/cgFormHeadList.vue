
<template>
  <div class="vue-component">
    </t:base>


<!--add-begin--Author:luobaoli  Date:20150607 for：增加表单树型列表-->
<div class="easyui-layout" fit="true">
<div region="west" style="width: 150px;" title="表单分类" split="true" collapsed="true">
	<div class="easyui-panel" style="padding:0px;border:0px" fit="true" border="false">
		<ul id="formtree"></ul>
	</div>
</div>
<div region="center" style="padding:0px;border:0px">
<t:datagrid sortName="createDate" sortOrder="desc" name="tablePropertyList" title="smart.form.config" fitColumns="true" actionUrl="cgFormHeadController.do?datagrid" idField="id" fit="true" 
            queryMode="group" checkbox="true" btnCls="bootstrap">
	<el-table-column prop="id" label="common.id"></el-table-column>
	<el-table-column prop="hasPeizhi" label="hasPeizhi"></el-table-column>
	<el-table-column prop="jformType" label="table.type"></el-table-column>
	<el-table-column prop="tableName" label="table.name">
	<el-table-column prop="jformCategory" label="form.category"></el-table-column>
	<el-table-column prop="content" label="table.description"></el-table-column>
	<el-table-column prop="jformVersion" label="common.version"></el-table-column>
	<el-table-column prop="isTree" label="is.tree"></el-table-column>
	<el-table-column prop="isPagination" label="is.page"></el-table-column>
	<el-table-column prop="isDbSynch" label="sync.db"></el-table-column>
	<el-table-column prop="isCheckbox" label="show.checkbox"></el-table-column>
	<el-table-column prop="querymode" label="common.query.module"></el-table-column>
	<el-table-column prop="createBy" label="common.createby"></el-table-column>
	<el-table-column prop="createDate" label="common.createtime"></el-table-column>
	<el-table-column prop="updateBy" label="common.updateby"></el-table-column>
	<el-table-column prop="updateDate" label="common.updatetime"></el-table-column>
	<el-table-column prop="opt" label="common.operation"></el-table-column>
	<t:dgFunOpt funname="delCgForm(id,tableName)" title="common.delete" urlclass="ace_button" urlStyle="background-color:#ec4758;" urlfont="fa-trash-o"></t:dgFunOpt>
	<t:dgFunOpt funname="remCgForm(id)" title="common.remove" urlclass="ace_button" urlStyle="background-color:#FFA500;" urlfont="fa-remove"></t:dgFunOpt>
	
	<t:dgFunOpt exp="isDbSynch#eq#N"  title="sync.db" funname="doDbsynch(id,content)" urlclass="ace_button"  urlfont="fa-database"/>
	<t:dgFunOpt exp="isDbSynch#eq#Y&&jformType#ne#3"   funname="addbytab(id,content)" title="form.template" urlclass="ace_button"  urlfont="fa-cog"></t:dgFunOpt>
	<t:dgFunOpt exp="isDbSynch#eq#Y&&jformType#ne#3" funname="addlisttab(tableName,content)" title="function.test" urlStyle="background-color:#18a689;" urlclass="ace_button"  urlfont="fa-gavel"></t:dgFunOpt>
	<t:dgFunOpt exp="isDbSynch#eq#Y&&jformType#ne#3" funname="popMenuLink(tableName,content)" title="config.place" urlStyle="background-color:#1a7bb9;" urlclass="ace_button"  urlfont="fa-cog" ></t:dgFunOpt>
	<t:dgFunOpt funname="copyOnline(id)" title="复制表单" operationCode="copyOnlineTable"  urlclass="ace_button"  urlfont="fa-copy"></t:dgFunOpt>
	<t:dgFunOpt exp="hasPeizhi#ne#0" funname="propertyTable(id)" title="配置表"  urlclass="ace_button"  urlfont="fa-cog"></t:dgFunOpt>
	<div class="toolbar"></div>
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
