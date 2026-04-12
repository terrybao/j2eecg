
<template>
  <div class="vue-component">
    <textarea id="original" style="display:none">${contents}</textarea>
<div id='preview'/>
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
