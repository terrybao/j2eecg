
<template>
  <div class="vue-component">
    <t:menu style="june_bootstrap" menuFun="${menuMap}"></t:menu>
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
