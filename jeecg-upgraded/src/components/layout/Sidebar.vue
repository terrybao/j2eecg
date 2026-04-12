<template>
  <div class="sidebar">
    <div class="sidebar-header">
      <h3>导航菜单</h3>
    </div>
    <el-menu
      default-active="1"
      class="sidebar-menu"
      :collapse="isCollapse"
      @select="handleMenuSelect"
    >
      <el-sub-menu index="1">
        <template #title>
          <el-icon><setting /></el-icon>
          <span>系统管理</span>
        </template>
        <el-menu-item index="1-1">用户管理</el-menu-item>
        <el-menu-item index="1-2">角色管理</el-menu-item>
        <el-menu-item index="1-3">部门管理</el-menu-item>
        <el-menu-item index="1-4">权限管理</el-menu-item>
      </el-sub-menu>
      <el-sub-menu index="2">
        <template #title>
          <el-icon><document /></el-icon>
          <span>表单管理</span>
        </template>
        <el-menu-item index="2-1">在线表单</el-menu-item>
        <el-menu-item index="2-2">表单设计器</el-menu-item>
        <el-menu-item index="2-3">表单模板</el-menu-item>
      </el-sub-menu>
      <el-sub-menu index="3">
        <template #title>
          <el-icon><pie-chart /></el-icon>
          <span>报表管理</span>
        </template>
        <el-menu-item index="3-1">在线报表</el-menu-item>
        <el-menu-item index="3-2">图表报表</el-menu-item>
        <el-menu-item index="3-3">报表设计器</el-menu-item>
      </el-sub-menu>
      <el-sub-menu index="4">
        <template #title>
          <el-icon><message /></el-icon>
          <span>工作流</span>
        </template>
        <el-menu-item index="4-1">流程设计</el-menu-item>
        <el-menu-item index="4-2">流程实例</el-menu-item>
        <el-menu-item index="4-3">任务管理</el-menu-item>
      </el-sub-menu>
      <el-sub-menu index="5">
        <template #title>
          <el-icon><star /></el-icon>
          <span>示例演示</span>
        </template>
        <el-menu-item index="5-1">Demo 列表</el-menu-item>
        <el-menu-item index="5-2">表单示例</el-menu-item>
        <el-menu-item index="5-3">图表示例</el-menu-item>
      </el-sub-menu>
    </el-menu>
    <div class="sidebar-footer">
      <el-button type="text" @click="toggleCollapse">
        <el-icon v-if="!isCollapse"><arrow-left /></el-icon>
        <el-icon v-else><arrow-right /></el-icon>
      </el-button>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { Setting, Document, PieChart, Message, Star, ArrowLeft, ArrowRight } from '@element-plus/icons-vue'
import { useRouter } from 'vue-router'

const router = useRouter()
const isCollapse = ref(false)

const toggleCollapse = () => {
  isCollapse.value = !isCollapse.value
}

const handleMenuSelect = (key) => {
  console.log('Selected menu:', key)
  // 这里可以根据菜单 key 进行路由跳转
  if (key === '5-1') {
    router.push('/demo')
  }
}
</script>

<style scoped>
.sidebar {
  width: 200px;
  height: 100%;
  background-color: #ffffff;
  border-right: 1px solid #e4e7ed;
  display: flex;
  flex-direction: column;
}

.sidebar-header {
  padding: 20px;
  border-bottom: 1px solid #e4e7ed;
}

.sidebar-header h3 {
  margin: 0;
  font-size: 16px;
  color: #303133;
}

.sidebar-menu {
  flex: 1;
  overflow-y: auto;
}

.sidebar-footer {
  padding: 10px;
  border-top: 1px solid #e4e7ed;
  text-align: center;
}

:deep(.el-menu) {
  border-right: none;
}

:deep(.el-menu-item.is-active) {
  background-color: #eaf2ff !important;
  color: #409EFF !important;
}

:deep(.el-sub-menu__title:hover) {
  background-color: #f5f7fa !important;
}
</style>