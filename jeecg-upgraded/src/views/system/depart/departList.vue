
<template>
  <div class="vue-component">
    </t:base>
<div id="main_depart_list" class="easyui-layout" fit="true">
    <div region="center" style="padding:0px;border:0px">
        <t:datagrid name="departList" title="common.department.list" fitColumns="true" actionUrl="departController.do?departgrid" treegrid="true" idField="departid" pagination="false">
            <el-table-column prop="id" label="common.id"></el-table-column>
            <el-table-column prop="parentId" label="common.id"></el-table-column>
            <el-table-column prop="departname" label="common.department.name"></el-table-column>
            <el-table-column prop="description" label="position.desc"></el-table-column>
            <el-table-column prop="orgCode" label="common.org.code"></el-table-column>
            <el-table-column prop="orgType" label="common.org.type"></el-table-column>
            <el-table-column prop="mobile" label="common.mobile"></el-table-column>
            <el-table-column prop="fax" label="common.fax"></el-table-column>
            <el-table-column prop="address" label="common.address"></el-table-column>
            <el-table-column prop="opt" label="common.operation"></el-table-column>
            
            <t:dgFunOpt funname="delDepart(id)" title="common.delete" urlclass="ace_button" urlStyle="background-color:#ec4758;" urlfont="fa-trash-o"></t:dgFunOpt>
        	<t:dgFunOpt funname="queryUsersByDepart(id)" title="view.member" urlclass="ace_button"  urlfont="fa-user"></t:dgFunOpt>
            <t:dgFunOpt funname="setRoleByDepart(id,text)" title="role.set" urlclass="ace_button"  urlfont="fa-cog" urlStyle="background-color:#1a7bb9;"></t:dgFunOpt>
        </el-table>
        <div id="departListtb" style="padding: 3px; height: 25px">
            <div style="float: left;">
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="addOrg()">{{ $t("common.add.param" langArg="common.department") }}</a>
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="update('{{ $t("common.edit.param" langArg="common.department") }}','departController.do?update','departList','680px','450px')">{{ $t("common.edit.param" langArg="common.department") }}</a>
                <!-- //update--end--author:zhangjiaqiang Date:20170112 for:增加排序功能 
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-put" onclick="ImportXls()">{{ $t("excelImport" langArg="common.department") }}</a>
                -->
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-putout" onclick="ExportXls()">{{ $t("excelOutput" langArg="common.department") }}</a>
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-putout" onclick="ExportXlsByT()">{{ $t("templateDownload" langArg="common.department") }}</a>
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-put" onclick="ImportDepartXls()">{{ $t("excelDepartImport" langArg="common.department") }}</a>
            </div>
        </div>
    </div>
</div>
<div data-options="region:'east',
	title:'{{ $t("member.list") }}',
	collapsed:true,
	split:true,
	border:false,
	onExpand : function(){
		li_east = 1;
	},
	onCollapse : function() {
	    li_east = 0;
	}"
	style="width: 400px; overflow: hidden;" id="eastPanel">
    <div class="easyui-panel" style="padding:0px;border:0px" fit="true" border="false" id="userListpanel"></div>
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
