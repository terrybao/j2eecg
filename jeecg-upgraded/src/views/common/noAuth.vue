
<template>
  <div class="vue-component">
    <div class="demo">
    <p><span>No </span><span> Auth</span></p>
    <p> 用户权限不足，请联系管理员(´･ω･`)</p>
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
