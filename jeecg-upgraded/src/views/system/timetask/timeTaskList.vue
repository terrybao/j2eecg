
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
<div region="center" style="padding:0px;border:0px">
	<t:datagrid name="timeTaskList" title="schedule.task.manage" actionUrl="timeTaskController.do?datagrid" 
	    idField="id" fit="true" sortName="createDate" sortOrder="desc">
	<el-table-column prop="id" label="common.id"></el-table-column>
	<el-table-column prop="taskId" label="common.taskid"></el-table-column>
	<el-table-column prop="taskDescribe" label="common.task.desc"></el-table-column>
	<el-table-column prop="cronExpression" label="cron.expression"></el-table-column>
	<el-table-column prop="className" label="common.task.className"></el-table-column>
	<el-table-column prop="runServerIp" label="common.task.runServerIp"></el-table-column>
	<el-table-column prop="runServer" label="common.task.runServer"></el-table-column>
	<el-table-column prop="isEffect" label="common.iseffect"></el-table-column>
	<el-table-column prop="isStart" label="running.state"></el-table-column>
	<el-table-column prop="createBy" label="common.createby"></el-table-column>
	<el-table-column prop="createDate" label="common.createtime"></el-table-column>
	<el-table-column prop="updateBy" label="common.updateby"></el-table-column>
	<el-table-column prop="updateDate" label="common.updatetime"></el-table-column>
	<el-table-column prop="opt" label="common.operation"></el-table-column>
	<!-- update-begin--Author:zhangjq  Date:20160904 for：[1342]【系统图标统一调整】讲{消息中间件}{系统监控}的链接按钮，改成ace风格的-->
	<t:dgConfOpt title="common.start" url="timeTaskController.do?startOrStopTask&id={id}&isStart=1" urlclass="ace_button"  urlfont="fa-play-circle" message="确认运行任务" exp="isStart#eq#0"/>
	<t:dgConfOpt title="common.stop" url="timeTaskController.do?startOrStopTask&id={id}&isStart=0" urlclass="ace_button"  urlfont="fa-stop" message="确认停止" exp="isStart#eq#1"/>
	<t:dgConfOpt title="effective.immediately" url="timeTaskController.do?updateTime&id={id}" urlclass="ace_button"  urlfont="fa-clock-o" message="确认更新任务时间"  exp="isEffect#eq#0"/>
	<t:dgDelOpt  url="timeTaskController.do?del&id={id}" title="common.delete" urlclass="ace_button"  urlfont="fa-trash-o"></t:dgDelOpt>
	<!-- update-end--Author:zhangjq  Date:20160904 for：[1342]【系统图标统一调整】讲{消息中间件}{系统监控}的链接按钮，改成ace风格的-->
	<div class="toolbar"></div>
	<div class="toolbar"></div>
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
