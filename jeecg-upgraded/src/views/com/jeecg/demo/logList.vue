
<template>
  <div class="vue-component">
    </t:base>
<t:datagrid title="日志" name="logList" actionUrl="jeecgListDemoController.do?logDatagrid" 
		idField="id" sortName="operatetime" sortOrder="desc" queryMode="group" pageSize="500" extendParams="view:scrollview,">
	<el-table-column prop="id" label="common.id"></el-table-column>
	<el-table-column prop="operatetype" label="日志类型"></el-table-column>
	<el-table-column prop="logcontent" label="log.content"></el-table-column>
	<el-table-column prop="note" label="operate.ip"></el-table-column>
	<el-table-column prop="TSUser.userName" label="操作人ID"></el-table-column>
	<el-table-column prop="TSUser.realName" label="操作人名"></el-table-column>
	<el-table-column prop="broswer" label="浏览器"></el-table-column>
	<el-table-column prop="operatetime" label="operate.time"></el-table-column>
	
	 <div class="toolbar"></div>
	 <div class="toolbar"></div>
   	 
</el-table>
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
