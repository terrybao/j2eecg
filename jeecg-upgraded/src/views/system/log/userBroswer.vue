
<template>
  <div class="vue-component">
    <c:set var="ctxPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html >

<div id="containerCol" style="width: 80%; height: 80%"></div>
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
