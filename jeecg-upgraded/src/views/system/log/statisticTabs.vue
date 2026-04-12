
<template>
  <div class="vue-component">
    <!-- context path -->
</t:base>


<t:tabs id="tt" iframe="false">
	<t:tab href="logController.do?userBroswer&reportType=line" icon="fa fa-line-chart" title="user.analysis.line" id="pnode"></t:tab>
	<t:tab href="logController.do?userBroswer&reportType=pie" icon="fa fa-pie-chart" title="user.analysis.pie" id="pnode"></t:tab>
	<t:tab href="logController.do?userBroswer&reportType=column" icon="fa fa-bar-chart" title="user.analysis.histogram" id="pnode"></t:tab>
</t:tabs>

<!-- update-end--Author:xuelin  Date:20170329 for：[#1823]【bug】报表点击打印后，页面乱的问题解决---------------------- -->
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
