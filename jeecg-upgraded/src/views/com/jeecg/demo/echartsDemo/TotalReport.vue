
<template>
  <div class="vue-component">
    </t:base>



<div id="main" style="width:100%;height:400px;"></div>
    
<div style="width: 100%; height: 333px;">
<t:datagrid name="TotalReportList" title="broswer.count.statistics" actionUrl="jeecgListDemoController.do?listAllStatisticByJdbc"  fitColumns="true" idField="id" fit="true">
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
