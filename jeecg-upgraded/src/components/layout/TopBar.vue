<template>
  <div class="top-bar">
    <div class="top-left">
      <el-icon class="logo"><component :is="Logo" /></el-icon>
      <span class="system-name">JEECG Framework</span>
    </div>
    <div class="top-right">
      <div class="user-info">
        <span class="user-label">用户:</span>
        <span class="user-name">admin</span>
        <span class="org-label">当前组织:</span>
        <span class="org-name">默认组织</span>
        <span class="role-label">角色:</span>
        <span class="role-name">管理员</span>
      </div>
      <div class="top-buttons">
        <el-dropdown>
          <el-button type="primary" plain>
            控制面板 <el-icon><arrow-down /></el-icon>
          </el-button>
          <template #dropdown>
            <el-dropdown-menu>
              <el-dropdown-item>个人资料</el-dropdown-item>
              <el-dropdown-item>修改密码</el-dropdown-item>
              <el-dropdown-item>系统消息</el-dropdown-item>
              <el-dropdown-item>修改风格</el-dropdown-item>
              <el-dropdown-item divided>JEECG官网</el-dropdown-item>
              <el-dropdown-item>清除本地存储</el-dropdown-item>
            </el-dropdown-menu>
          </template>
        </el-dropdown>
        <el-dropdown>
          <el-button type="warning" plain>
            退出 <el-icon><arrow-right /></el-icon>
          </el-button>
          <template #dropdown>
            <el-dropdown-menu>
              <el-dropdown-item>退出系统</el-dropdown-item>
            </el-dropdown-menu>
          </template>
        </el-dropdown>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ArrowDown, ArrowRight, Monitor } from '@element-plus/icons-vue'

const Logo = Monitor
</script>

<style scoped>
.top-bar {
  display: flex;
  justify-content: space-between;
  align-items: center;
  height: 85px;
  padding: 0 20px;
  background-color: #E6E6FA;
  border-bottom: 1px solid #e4e7ed;
}

.top-left {
  display: flex;
  align-items: center;
  gap: 10px;
}

.logo {
  font-size: 40px;
  color: #409EFF;
}

.system-name {
  font-size: 20px;
  font-weight: bold;
  color: #303133;
}

.top-right {
  display: flex;
  align-items: center;
  gap: 20px;
}

.user-info {
  display: flex;
  align-items: center;
  gap: 10px;
  font-size: 14px;
}

.user-label,
.org-label,
.role-label {
  color: #CC33FF;
}

.user-name,
.org-name,
.role-name {
  color: #666633;
}

.top-buttons {
  display: flex;
  gap: 10px;
}
</style>