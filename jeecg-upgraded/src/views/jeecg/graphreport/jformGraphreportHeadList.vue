
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jformGraphreportHeadList" checkbox="true" fitColumns="true" title="图表配置" actionUrl="jformGraphreportHeadController.do?datagrid" idField="id" fit="true" queryMode="group">
   <el-table-column prop="id" label="id"></el-table-column>
   <el-table-column prop="name" label="图表名称"></el-table-column>
   <el-table-column prop="code" label="编码"></el-table-column>
   <el-table-column prop="cgrSql" label="查询数据SQL"></el-table-column>
   <el-table-column prop="content" label="描述"></el-table-column>
   <el-table-column prop="ytext" label="y轴文字"></el-table-column>
   <el-table-column prop="categories" label="x轴数据"></el-table-column>
   <el-table-column prop="isShowList" label="是否显示明细"></el-table-column>
   <el-table-column prop="xpageJs" label="扩展JS"></el-table-column>
   <el-table-column prop="opt" label="操作"></el-table-column>
   <t:dgDelOpt title="删除" url="jformGraphreportHeadController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgFunOpt  funname="addlisttab(code,content)" title="function.test" urlclass="ace_button"  urlfont="fa-gavel"></t:dgFunOpt>
   <t:dgFunOpt  funname="popMenuLinkGraph(code,content)" title="config.place" urlclass="ace_button"  urlfont="fa-cog"></t:dgFunOpt>
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
