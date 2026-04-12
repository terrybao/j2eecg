
<template>
  <div class="vue-component">
    </t:base>
<div id="main_depart_list" class="easyui-layout" fit="true">
    <div region="center" style="padding:0px;border:0px">
        <el-table :data="tableData" style="width: 100%"></t:dgDelOpt>
            <t:dgFunOpt funname="queryUsersByDepart(id)" title="view.member" urlclass="ace_button"  urlfont="fa-user"></t:dgFunOpt>
            <t:dgFunOpt funname="setRoleByDepart(id,text)" title="role.set" urlclass="ace_button"  urlfont="fa-cog" urlStyle="background-color:#1a7bb9;"></t:dgFunOpt>
        </el-table>
        <div id="departListtb" style="padding: 3px; height: 25px">
            <div style="float: left;">
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="addOrg()">{{ $t("common.add.param" langArg="common.department") }}</a>
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="update('{{ $t("common.edit.param" langArg="common.department") }}','organzationController.do?update','departList','680px','450px')">{{ $t("common.edit.param" langArg="common.department") }}</a>
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-put" onclick="ImportXls()">{{ $t("excelImport" langArg="common.department") }}</a>
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-putout" onclick="ExportXls()">{{ $t("excelOutput" langArg="common.department") }}</a>
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-putout" onclick="ExportXlsByT()">{{ $t("templateDownload" langArg="common.department") }}</a>
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
