
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="tSCompanyPositionList" checkbox="true" pagination="true" fitColumns="true" title="职务管理" actionUrl="tSCompanyPositionController.do?datagrid&companyId=${companyId }" idField="id" fit="true" queryMode="group">
   <el-table-column prop="id" label="序号"></el-table-column>
   <el-table-column prop="companyId" label="公司ID"></el-table-column>
   <el-table-column prop="positionCode" label="职务编码"></el-table-column>
   <el-table-column prop="positionName" label="职务名称"></el-table-column>
   <el-table-column prop="positionNameEn" label="职务英文名"></el-table-column>
   <el-table-column prop="positionNameAbbr" label="职务缩写"></el-table-column>
   <el-table-column prop="positionLevel" label="职务级别"></el-table-column>
   <el-table-column prop="memo" label="备注"></el-table-column>
   <el-table-column prop="delFlag" label="逻辑删除状态"></el-table-column>
   <el-table-column prop="createName" label="创建人名称"></el-table-column>
   <el-table-column prop="createBy" label="创建人账号"></el-table-column>
   <el-table-column prop="createDate" label="创建日期"></el-table-column>
   <el-table-column prop="updateName" label="更新人名称"></el-table-column>
   <el-table-column prop="updateBy" label="更新人账号"></el-table-column>
   <el-table-column prop="updateDate" label="更新日期"></el-table-column>
   <el-table-column prop="sysCompanyCode" label="数据所属公司"></el-table-column>
   <el-table-column prop="sysOrgCode" label="数据所属部门"></el-table-column>
   <el-table-column prop="opt" label="操作"></el-table-column>
   <t:dgDelOpt title="删除" url="tSCompanyPositionController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
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
