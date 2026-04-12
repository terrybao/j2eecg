
<template>
  <div class="vue-component">
    <t:webUploader auto="true" name="onetomany" outJs="false" fileNumLimit="1"></t:webUploader>
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
