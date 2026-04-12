
<template>
  <div class="vue-component">
    </head>
<body style="width: 100%;height: 100%;overflow:hidden;margin: 0;padding: 0;">
	<h2 style="padding-left:10px">Pluplaod插件的上传演示</h2>
	<hr/>
	&nbsp;&nbsp;&nbsp;<button class="ace_button" style="width: 10%;height:30px;font-size: 12px" id = "layerUploader" >文件上传</button>
	<hr/>
	<div style="padding-left:10px">
	<div id="info"></div>
	<div id="res"></div>
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
