<template>
  <div class="main-container">
    <!-- 顶部栏 -->
    <TopBar />
    
    <!-- 主体内容 -->
    <div class="main-content">
      <!-- 左侧菜单 -->
      <Sidebar />
      
      <!-- 中间内容区 -->
      <div class="content-area">
        <el-tabs v-model="activeTab" type="card" class="main-tabs">
          <el-tab-pane label="仪表盘" name="dashboard">
            <div class="dashboard-content">
              <h2>欢迎使用 JEECG 系统</h2>
              <p>这是系统仪表盘页面</p>
            </div>
          </el-tab-pane>
        </el-tabs>
      </div>
      
      <!-- 右侧工具栏 -->
      <div class="right-toolbar">
        <el-card class="calendar-card">
          <template #header>
            <div class="card-header">
              <span>日历</span>
            </div>
          </template>
          <el-calendar v-model="currentDate"></el-calendar>
        </el-card>
        <el-card class="online-card">
          <template #header>
            <div class="card-header">
              <span>在线用户</span>
            </div>
          </template>
          <el-table :data="onlineUsers" style="width: 100%">
            <el-table-column prop="userName" label="用户名" width="100"></el-table-column>
            <el-table-column prop="ip" label="IP" width="150"></el-table-column>
          </el-table>
        </el-card>
      </div>
    </div>
    
    <!-- 底部栏 -->
    <Footer />
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import TopBar from '../../components/layout/TopBar.vue'
import Sidebar from '../../components/layout/Sidebar.vue'
import Footer from '../../components/layout/Footer.vue'

const activeTab = ref('dashboard')
const currentDate = ref(new Date())
const onlineUsers = ref([
  { userName: 'admin', ip: '127.0.0.1' },
  { userName: 'user1', ip: '192.168.1.100' }
])

// 模拟获取在线用户数据
const fetchOnlineUsers = () => {
  // 实际项目中这里应该调用 API 获取数据
  setTimeout(() => {
    onlineUsers.value = [
      { userName: 'admin', ip: '127.0.0.1' },
      { userName: 'user1', ip: '192.168.1.100' },
      { userName: 'user2', ip: '192.168.1.101' }
    ]
  }, 1000)
}

onMounted(() => {
  fetchOnlineUsers()
})
</script>

<style scoped>
.main-container {
  display: flex;
  flex-direction: column;
  height: 100vh;
  overflow: hidden;
}

.main-content {
  display: flex;
  flex: 1;
  overflow: hidden;
}

.content-area {
  flex: 1;
  padding: 20px;
  overflow-y: auto;
  background-color: #f5f7fa;
}

.right-toolbar {
  width: 200px;
  padding: 10px;
  background-color: #ffffff;
  border-left: 1px solid #e4e7ed;
  overflow-y: auto;
}

.calendar-card,
.online-card {
  margin-bottom: 20px;
}

.card-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.dashboard-content {
  text-align: center;
  margin-top: 100px;
}

.dashboard-content h2 {
  color: #409EFF;
  margin-bottom: 20px;
}

.dashboard-content p {
  color: #606266;
}

.main-tabs {
  height: 100%;
}

.el-tabs__content {
  height: calc(100% - 40px);
  overflow: auto;
}
</style>