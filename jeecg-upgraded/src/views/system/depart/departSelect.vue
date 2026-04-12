
<template>
  <div class="vue-component">
    <input id="orgIds" name="orgIds" type="hidden" value="${orgIds}">
<ul id="departSelect" class="ztree" style="margin-top: 30px;"></ul>
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
