
<template>
  <div class="vue-component">
    <H2>错误异常: </H2>
<hr />
<P>错误描述：</P>

<P>错误信息：</P>
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
