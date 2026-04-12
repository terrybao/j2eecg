
<template>
  <div class="vue-component">
    <span id="containerline" style="float: left; width: 30%; height:60%;"></span>
<span id="containerCol" style="float: left; width: 38%;height:60%;"></span>
<span id="containerPie" style="float: left; width: 30%; height:60%;"></span>
<!--update-begin--Author:xuelin  Date:20170804 for：TASK #2246 【IE兼容问题】两个报表，不兼容IE8，代码优化     固定高度,否则部分浏览器下(chrome,IE8),数据表不显示------------------- -->
<div style="width: 100%; height: 333px;">
<!--update-end--Author:xuelin  Date:20170804 for：TASK #2246 【IE兼容问题】两个报表，不兼容IE8，代码优化     固定高度,否则部分浏览器下(chrome,IE8),数据表不显示------------------- -->
	<t:datagrid name="broswerStatisticList" title="broswer.count.statistics" actionUrl="jeecgListDemoController.do?listAllStatisticByJdbc" idField="id" fit="true">
		<el-table-column prop="id" label="common.code"></el-table-column>
		<el-table-column prop="broswer" label="lang.broswer"></el-table-column>
		<el-table-column prop="broswercount" label="number.broswer"></el-table-column>
		<el-table-column prop="rate" label="common.proportion"></el-table-column>
	</el-table>
</div>

<!-- add-update--Author:jg_renjie  Date:20150613 for：页面自适应页面，不会出现左右滚动条 -->
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
