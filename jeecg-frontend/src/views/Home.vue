<template>
  <div class="home-container">
    <el-container>
      <el-header>
        <div class="header-left">
          <h1>JEECG 管理系统</h1>
        </div>
        <div class="header-right">
          <el-dropdown>
            <span class="user-info">
              <el-avatar :size="32" icon="User" />
              <span>{{ username }}</span>
              <el-icon class="el-icon--right"><arrow-down /></el-icon>
            </span>
            <template #dropdown>
              <el-dropdown-menu>
                <el-dropdown-item @click="handleLogout">退出登录</el-dropdown-item>
              </el-dropdown-menu>
            </template>
          </el-dropdown>
        </div>
      </el-header>
      <el-container>
        <el-aside width="200px">
          <el-menu
            :default-active="activeMenu"
            class="el-menu-vertical-demo"
            router
          >
            <el-menu-item index="/home">
              <el-icon><home /></el-icon>
              <span>首页</span>
            </el-menu-item>
            <el-menu-item index="/form">
              <el-icon><document /></el-icon>
              <span>表单管理</span>
            </el-menu-item>
            <el-menu-item index="/report">
              <el-icon><data-analysis /></el-icon>
              <span>报表管理</span>
            </el-menu-item>
            <el-menu-item index="/workflow">
              <el-icon><operation /></el-icon>
              <span>工作流</span>
            </el-menu-item>
            <el-menu-item index="/user">
              <el-icon><users /></el-icon>
              <span>用户管理</span>
            </el-menu-item>
          </el-menu>
        </el-aside>
        <el-main>
          <div class="dashboard">
            <h2>仪表盘</h2>
            <el-row :gutter="20">
              <el-col :span="6">
                <el-card shadow="hover">
                  <div class="card-item">
                    <el-icon class="card-icon"><user /></el-icon>
                    <div class="card-content">
                      <div class="card-title">总用户数</div>
                      <div class="card-value">1,234</div>
                    </div>
                  </div>
                </el-card>
              </el-col>
              <el-col :span="6">
                <el-card shadow="hover">
                  <div class="card-item">
                    <el-icon class="card-icon"><document /></el-icon>
                    <div class="card-content">
                      <div class="card-title">表单数量</div>
                      <div class="card-value">56</div>
                    </div>
                  </div>
                </el-card>
              </el-col>
              <el-col :span="6">
                <el-card shadow="hover">
                  <div class="card-item">
                    <el-icon class="card-icon"><data-analysis /></el-icon>
                    <div class="card-content">
                      <div class="card-title">报表数量</div>
                      <div class="card-value">23</div>
                    </div>
                  </div>
                </el-card>
              </el-col>
              <el-col :span="6">
                <el-card shadow="hover">
                  <div class="card-item">
                    <el-icon class="card-icon"><operation /></el-icon>
                    <div class="card-content">
                      <div class="card-title">待办任务</div>
                      <div class="card-value">8</div>
                    </div>
                  </div>
                </el-card>
              </el-col>
            </el-row>
            
            <div class="todo-section">
              <h3>待办事项</h3>
              <el-table :data="todoList" style="width: 100%">
                <el-table-column prop="id" label="ID" width="80" />
                <el-table-column prop="title" label="任务名称" />
                <el-table-column prop="deadline" label="截止日期" />
                <el-table-column prop="status" label="状态">
                  <template #default="scope">
                    <el-tag :type="scope.row.status === '未完成' ? 'warning' : 'success'">{{ scope.row.status }}</el-tag>
                  </template>
                </el-table-column>
              </el-table>
            </div>
          </div>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script setup lang="ts">
import { ref, onMounted } from 'vue'
import { useRouter } from 'vue-router'
import axios from '../utils/axios'

const router = useRouter()
const username = ref('admin')
const activeMenu = ref('/home')

const todoList = ref([
  { id: 1, title: '完成表单设计', deadline: '2024-04-15', status: '未完成' },
  { id: 2, title: '审核用户申请', deadline: '2024-04-12', status: '未完成' },
  { id: 3, title: '生成月度报表', deadline: '2024-04-10', status: '已完成' }
])

const handleLogout = async () => {
  try {
    await axios.post('/auth/logout')
    localStorage.removeItem('token')
    router.push('/')
  } catch (error) {
    console.error('退出登录失败:', error)
  }
}

onMounted(() => {
  // 可以在这里加载用户信息和仪表盘数据
})
</script>

<style scoped>
.home-container {
  height: 100vh;
  display: flex;
  flex-direction: column;
}

.el-header {
  background-color: #1890ff;
  color: white;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0 20px;
}

.header-left h1 {
  margin: 0;
  font-size: 20px;
}

.header-right {
  display: flex;
  align-items: center;
}

.user-info {
  display: flex;
  align-items: center;
  cursor: pointer;
}

.user-info span {
  margin: 0 10px;
}

.el-aside {
  background-color: #f0f2f5;
}

.el-main {
  padding: 20px;
  background-color: #f5f7fa;
}

.dashboard h2 {
  margin-bottom: 20px;
  color: #303133;
}

.card-item {
  display: flex;
  align-items: center;
}

.card-icon {
  font-size: 32px;
  color: #1890ff;
  margin-right: 16px;
}

.card-title {
  font-size: 14px;
  color: #606266;
}

.card-value {
  font-size: 24px;
  font-weight: bold;
  color: #303133;
  margin-top: 8px;
}

.todo-section {
  margin-top: 30px;
}

.todo-section h3 {
  margin-bottom: 16px;
  color: #303133;
}
</style>