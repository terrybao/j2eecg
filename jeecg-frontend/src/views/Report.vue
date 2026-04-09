<template>
  <div class="report-container">
    <h2>报表管理</h2>
    <el-card>
      <div class="card-header">
        <el-button type="primary">
          <el-icon><plus /></el-icon> 新建报表
        </el-button>
      </div>
      <el-table :data="reportList" style="width: 100%">
        <el-table-column prop="id" label="ID" width="80" />
        <el-table-column prop="name" label="报表名称" />
        <el-table-column prop="type" label="报表类型" />
        <el-table-column prop="createTime" label="创建时间" />
        <el-table-column label="操作" width="150">
          <template #default="scope">
            <el-button type="primary" size="small">
              <el-icon><view /></el-icon> 查看
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

const reportList = ref([
  { id: 1, name: '用户统计报表', type: '柱状图', createTime: '2024-04-01' },
  { id: 2, name: '订单分析报表', type: '折线图', createTime: '2024-04-02' },
  { id: 3, name: '销售数据报表', type: '饼图', createTime: '2024-04-03' }
])

onMounted(() => {
  // 可以在这里加载报表列表数据
})
</script>

<style scoped>
.report-container {
  padding: 20px;
}

.report-container h2 {
  margin-bottom: 20px;
  color: #303133;
}

.card-header {
  margin-bottom: 20px;
  display: flex;
  justify-content: flex-end;
}
</style>