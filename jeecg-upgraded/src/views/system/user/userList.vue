
<template>
  <div class="vue-component">
    <el-table :data="tableData" style="width: 100%">
      <el-table-column prop="id" label="ID"></el-table-column>
      <el-table-column prop="userName" label="用户名"></el-table-column>
      <el-table-column prop="realName" label="真实姓名"></el-table-column>
      <el-table-column prop="userType" label="用户类型"></el-table-column>
      <el-table-column prop="department" label="部门"></el-table-column>
      <el-table-column prop="role" label="角色"></el-table-column>
      <el-table-column prop="createBy" label="创建人"></el-table-column>
      <el-table-column prop="createDate" label="创建时间"></el-table-column>
      <el-table-column prop="updateBy" label="更新人"></el-table-column>
      <el-table-column prop="updateDate" label="更新时间"></el-table-column>
      <el-table-column prop="status" label="状态"></el-table-column>
      <el-table-column label="操作">
        <template #default="scope">
          <el-button type="primary" size="small" @click="handleEdit(scope.row)">编辑</el-button>
          <el-button type="danger" size="small" @click="handleDelete(scope.row.id)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import { ElMessage, ElNotification } from 'element-plus'

const tableData = ref([])

const handleEdit = (row) => {
  console.log('编辑', row)
}

const handleDelete = (id) => {
  console.log('删除', id)
}

onMounted(() => {
  // 模拟数据
  tableData.value = [
    {
      id: 1,
      userName: 'admin',
      realName: '管理员',
      userType: 'admin',
      department: '技术部',
      role: '超级管理员',
      createBy: 'system',
      createDate: '2023-01-01',
      updateBy: 'system',
      updateDate: '2023-01-01',
      status: '正常'
    }
  ]
})
</script>

<style scoped>
/* Component styles here */
</style>
