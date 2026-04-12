
<template>
  <div class="vue-component">
    </t:base>



<!-- type="text" -->
<input id="input_txt"  type="hidden" class = "inuptxt" value="${defaultName}" placeholder="请输入关键字搜索"/>
<input id="defaultName"  type="hidden" value="${defaultName}">
<ul id="departSelect" class="ztree"></ul>
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
