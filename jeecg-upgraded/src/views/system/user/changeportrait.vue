
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" type="hidden" value="${user.id }">
			<div class="container">
				<t:webUploader auto="true" buttonText="选择头像" name="fileName" buttonStyle="btn-blue btn-S" type="image" fileNumLimit="3" displayTxt="flase"></t:webUploader>
				</div>

</el-form>
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
