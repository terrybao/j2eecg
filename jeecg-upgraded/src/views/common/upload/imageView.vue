
<template>
  <div class="vue-component">
    <div style="position: absolute; left: 5px; top: 5px;"><img src="${realpath }" style="max-width:100%"/></div>
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
