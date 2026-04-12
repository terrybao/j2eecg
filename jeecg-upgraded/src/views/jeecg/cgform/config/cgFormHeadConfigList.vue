
<template>
  <div class="vue-component">
    </t:base>
<!--add-start--Author:luobaoli  Date:20150607 for：增加表单树型列表-->
 
<div class="easyui-layout" fit="true">
<div region="center" style="padding:0px;border:0px">
<t:datagrid sortName="createDate" sortOrder="desc" name="tablePropertyList" title="smart.form.config"
            fitColumns="false" actionUrl="cgFormHeadController.do?configDatagrid&id=${physiceId}" idField="id" fit="true" 
            queryMode="group" checkbox="true" >
	<el-table-column prop="id" label="common.id"></el-table-column>
	<el-table-column prop="jformType" label="table.type"></el-table-column>
	<el-table-column prop="tableName" label="table.name">
	<el-table-column prop="jformCategory" label="form.category"></el-table-column>
	<el-table-column prop="content" label="table.description"></el-table-column>
	<el-table-column prop="tableVersion" label="版本1"></el-table-column>
	<el-table-column prop="isTree" label="is.tree"></el-table-column>
	<el-table-column prop="isPagination" label="is.page"></el-table-column>
	<el-table-column prop="isCheckbox" label="show.checkbox"></el-table-column>
	<el-table-column prop="querymode" label="common.query.module"></el-table-column>
	<el-table-column prop="createBy" label="common.createby"></el-table-column>
	<el-table-column prop="createDate" label="common.createtime"></el-table-column>
	<el-table-column prop="updateBy" label="common.updateby"></el-table-column>
	<el-table-column prop="updateDate" label="common.updatetime"></el-table-column>
	<el-table-column prop="physiceId" label="配置表版本"></el-table-column>
	<el-table-column prop="opt" label="common.operation"></el-table-column>
	<t:dgFunOpt funname="remCgForm(id)" title="common.remove"  urlclass="ace_button"  urlfont="fa-remove"></t:dgFunOpt>
	<t:dgFunOpt funname="importFields(id,content)" title="导入字段"  urlclass="ace_button"  urlfont="fa-download"></t:dgFunOpt>
	<t:dgFunOpt funname="addbytab(id,content)" title="form.template"  urlclass="ace_button"  urlfont="fa-plus"></t:dgFunOpt>
	<t:dgFunOpt funname="addlisttab(tableName,content,id)" title="function.test"  urlclass="ace_button"  urlfont="fa-gavel"></t:dgFunOpt>
	<t:dgFunOpt funname="popMenuLink(tableName,content)" title="config.place"  urlclass="ace_button"  urlfont="fa-cog"></t:dgFunOpt>
	<div class="toolbar"></div>
	<div class="toolbar"></div>
	<div class="toolbar"></div>
	<div class="toolbar"></div>
	<div class="toolbar"></div>
	<div class="toolbar"></div>
	<div class="toolbar"></div>
	<!--update-begin--Author:gj_shaojc  Date:20180410 for：TASK #2618 【体验问题】复制表单代码生成器功能禁用提醒-->
	
	
	<!--update-end--Author:gj_shaojc  Date:20180410 for：TASK #2618 【体验问题】复制表单代码生成器功能禁用提醒-->
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
