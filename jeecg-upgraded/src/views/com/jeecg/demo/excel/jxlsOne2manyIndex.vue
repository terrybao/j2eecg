
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
   <div region="center" style="padding:0px;border:0px;overflow-x:hidden;">
   <iframe id="mainList" src="${webRoot}/jeecgDemoExcelController.do?mainlist" 
   		frameborder="0" height="49%" width="100%"></iframe>
   <div id="accDiv" class="easyui-accordion" style="padding-right:15px;overflow-x:hidden;box-sizing: border-box;">
		<div title="订单客户信息" data-options="iconCls:'icon-ok'" style="overflow:auto;box-sizing: border-box;">
			<iframe id="customerList" height="400" src="${webRoot}/jeecgDemoExcelController.do?sublist" frameborder="0" width="100%" ></iframe>
		</div>
		<div title="title" data-options="iconCls:'icon-ok'" style="overflow:auto;">
			放置子表的框框
		</div>
  </div>
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
