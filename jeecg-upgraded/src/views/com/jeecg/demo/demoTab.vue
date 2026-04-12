
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<fieldset class="step">
	
	<a href="#" class="easyui-linkbutton" id="btn" iconCls="icon-ok">提交</a> 
	<a href="#" class="easyui-linkbutton" id="btn_reset" iconCls="icon-back">重置</a>
	<a href="javascript:history.go(-1)" class="easyui-linkbutton" id="btn_reset" iconCls="icon-back">返回</a>
	</fieldset>
</el-form>
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
