
<template>
  <div class="vue-component">
    <div>
    	<textarea rows="5" cols="50" id="dataContent" readonly="readonly"></textarea>
    </div>
    <div class="ui_buttons" style="padding-left: 240px;">
        <input type="button" id="copyBtn" value="复制" class="ui_state_highlight">
        <input type="button" id="closeBtn" value="关闭" onclick='close();'>
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
