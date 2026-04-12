
<template>
  <div class="vue-component">
    </t:base>


<div class="easyui-layout" fit="true">
	<div region="center" style="padding:0px;border:0px">
		<t:datagrid name="datalogList" checkbox="true" fitColumns="true" title="数据日志" actionUrl="systemController.do?datagridDataLog" idField="id" fit="true" queryMode="group">
			<el-table-column prop="id" label="主键"></el-table-column>
			<el-table-column prop="tableName" label="表名"></el-table-column>
			<el-table-column prop="dataId" label="数据ID"></el-table-column>
			<el-table-column prop="versionNumber" label="版本号"></el-table-column>
			<el-table-column prop="dataContent" label="数据内容"></el-table-column>
			<el-table-column prop="createName" label="创建人"></el-table-column>
			<el-table-column prop="createBy" label="创建人"></el-table-column>
			<el-table-column prop="createDate" label="创建日期"></el-table-column>
			<el-table-column prop="updateName" label="更新人名称"></el-table-column>
			<el-table-column prop="updateBy" label="更新人登录名称"></el-table-column>
			<el-table-column prop="updateDate" label="更新日期"></el-table-column>
			<el-table-column prop="sysOrgCode" label="所属部门"></el-table-column>
			<el-table-column prop="sysCompanyCode" label="所属公司"></el-table-column>
			<el-table-column prop="opt" label="操作"></el-table-column>
			<!-- update-begin--Author:zhangjq  Date:20160904 for：[1342]【系统图标统一调整】讲{消息中间件}{系统监控}的链接按钮，改成ace风格的-->
			<t:dgFunOpt funname="popDataContent(id)" title="复制数据" urlclass="ace_button"  urlfont="fa-copy"></t:dgFunOpt>
			<!-- update-end--Author:zhangjq  Date:20160904 for：[1342]【系统图标统一调整】讲{消息中间件}{系统监控}的链接按钮，改成ace风格的-->
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
