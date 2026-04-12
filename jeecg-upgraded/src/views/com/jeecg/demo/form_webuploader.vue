
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
 <fieldset>
 <legend>文件上传</legend>
	<div id="uploader" class="wu-example">
	    <!--用来存放文件信息-->
	    <div id="uploaderThelist" class="uploader-list">
	    </div>
	    <div class="btns" style="margin-top:20px">
	        <div id="uploaderPicker" class="btn-M btn-blue mb20">选择文件</div>
	        <div id="uploaderCtlBtn" class="upbtn btn-M btn-blue testbtn" >开始上传</div>
	    </div>
	</div>
 </fieldset>
 
<input id = "fileName" type = "text" style="width:100%"/><br>
<input id = "filePath" type = "text" style="width:100%" /><br>
<input type="button" value="编辑页面模拟" onclick="uploaderInitInfo()">
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
