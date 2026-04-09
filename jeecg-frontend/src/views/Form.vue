<template>
  <div class="form-container">
    <h2>表单管理</h2>
    <el-card>
      <div class="card-header">
        <el-button type="primary">
          <el-icon><plus /></el-icon> 新建表单
        </el-button>
      </div>
      <el-table :data="formList" style="width: 100%">
        <el-table-column prop="id" label="ID" width="80" />
        <el-table-column prop="name" label="表单名称" />
        <el-table-column prop="createTime" label="创建时间" />
        <el-table-column label="操作" width="150">
          <template #default="scope">
            <el-button type="primary" size="small">
              <el-icon><edit /></el-icon> 编辑
            </el-button>
            <el-button type="danger" size="small">
              <el-icon><delete /></el-icon> 删除
            </el-button>
          </template>
        </el-table-column>
      </el-table>
    </el-card>
  </div>
</template>

<script setup lang="ts">
import { ref, onMounted } from 'vue'

const formList = ref([
  { id: 1, name: '用户信息表', createTime: '2024-04-01' },
  { id: 2, name: '订单申请表', createTime: '2024-04-02' },
  { id: 3, name: '请假申请表', createTime: '2024-04-03' }
])

onMounted(() => {
  // 可以在这里加载表单列表数据
})
</script>

<style scoped>
.form-container {
  padding: 20px;
}

.form-container h2 {
  margin-bottom: 20px;
  color: #303133;
}

.card-header {
  margin-bottom: 20px;
  display: flex;
  justify-content: flex-end;
}
</style>