
<template>
  <div class="vue-component">
    <div style="width:100%;height:300px;">
	<div id="containerline" style="float:left; width: 30%;height:100%;"></div>
	<div id="containerCol" style="float: left; width: 38%;height:100%;"></div>
	<div id="containerPie" style="float: left; width: 30%; height:100%;"></div>
</div>
<div style="width: 100%; height: 333px;">
	<t:datagrid name="broswerStatisticList" title="broswer.count.statistics" actionUrl="jeecgListDemoController.do?listAllStatisticByJdbc" idField="id" fit="true">
		<el-table-column prop="id" label="common.code"></el-table-column>
		<el-table-column prop="broswer" label="lang.broswer"></el-table-column>
		<el-table-column prop="broswercount" label="number.broswer"></el-table-column>
		<el-table-column prop="rate" label="common.proportion"></el-table-column>
	</el-table>
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
