
<template>
  <div class="vue-component">
    <!DOCTYPE html>


</t:base>
<div>
	<t:tabs id="tabsOne" iframe="false" tabPosition="top" fit="false">
		<t:tab href="jeecgFormDemoController.do?tabDemo" icon="icon-search" title="选项卡1" id="tab1"></t:tab>
		<t:tab href="jeecgFormDemoController.do?tabDemo" icon="icon-save" title="选项卡2" id="tab2"></t:tab>
		<t:tab href="jeecgFormDemoController.do?tabDemo" icon="icon-cut" title="选项卡3" id="tab3"></t:tab>
	</t:tabs>
	<t:tabs id="tabsTwo" iframe="false" tabPosition="top" fit="false">
		<t:tab href="jeecgFormDemoController.do?tabDemo" icon="icon-search" title="dynamic.report.config.detail" id="tab4"></t:tab>
	</t:tabs>
	<t:tabs id="tabsThree" iframe="false" tabPosition="top" fit="false">
		<t:tab iframe="http://www.baidu.com" icon="icon-search" heigth="600px" title="百度(iframe与非iframe共存)" id="tab5"></t:tab>
		<t:tab href="jeecgFormDemoController.do?tabDemo" icon="icon-cut" title="选项卡" id="tab8"></t:tab>
	</t:tabs>
	<t:tabs id="tabsFour" iframe="true" heigth="800px" tabPosition="top" fit="false">
		<t:tab href="http://www.guojusoft.com" icon="icon-search" title="北京国炬(全部iframe)" id="tab6"></t:tab>
		<t:tab href="http://www.jeecg.com" icon="icon-search" title="Jeecg官网" id="tab7"></t:tab>
	</t:tabs>
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
