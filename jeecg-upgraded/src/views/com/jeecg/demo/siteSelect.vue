
<template>
  <div class="vue-component">
    </t:base>

<link rel="stylesheet" type="text/css" href="plug-in/ztree/css/zTreeStyle.css">



<div class="easyui-layout" fit="true" style="width:1000px;height:600px;">
    <div region="west" split="true" title="网址列表" style="width:200px;">
        <ul id="siteSelect" class="ztree" ></ul>
    </div>
    <div region="center" title="webSite" style="width:800px;" id="sitePanel" class="easyui-panel">
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
