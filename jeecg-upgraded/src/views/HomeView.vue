<template>
  <div class="home">
    <h1>JEECG 升级项目</h1>
    <p>Vue3 + Vite + Element Plus 前端升级</p>
    <el-button type="primary" @click="goToDemo">查看 Demo 列表</el-button>
    <el-button @click="goToLogin">登录</el-button>
  </div>
</template>

<script setup>
import { useRouter } from 'vue-router'

const router = useRouter()

const goToDemo = () => {
  router.push('/demo')
}

const goToLogin = () => {
  router.push('/login')
}
</script>

<style scoped>
.home {
  text-align: center;
  margin-top: 100px;
}

h1 {
  margin-bottom: 20px;
  color: #409EFF;
}

p {
  margin-bottom: 30px;
  color: #606266;
}

.el-button {
  margin: 0 10px;
}
</style>