
<template>
  <div class="vue-component">
    <div class="header">
	<span class="logo"></span>
</div>
<div class="box">
	<div class="reset-box">
		<input type="hidden" id="key" value="${key }">
		<div class="form-wrapper">
			<div class="form-item">
				<input type="password" id="password" name="password" placeholder="请输入密码"/>
			</div>
			<div class="form-item">
				<input type="password" id="rePassword" name="rePassword" placeholder="请再次输入密码"/>
			</div>
			<div class="form-item">
				<button id="btn-submit" class="btn btn-success btn-block btn-lg " >重置密码</button>
				<a class="btn btn-link login-link" href="loginController.do?login">登录</a>
			</div>
		</div>
	</div>
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
