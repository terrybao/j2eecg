<template>
  <div class="user-container">
    <h2>用户管理</h2>
    <el-card>
      <div class="card-header">
        <el-button type="primary" @click="handleAddUser">
          <el-icon><plus /></el-icon> 新增用户
        </el-button>
      </div>
      <el-table :data="userList" style="width: 100%">
        <el-table-column prop="id" label="ID" width="80" />
        <el-table-column prop="username" label="用户名" />
        <el-table-column prop="name" label="姓名" />
        <el-table-column prop="email" label="邮箱" />
        <el-table-column label="操作" width="150">
          <template #default="scope">
            <el-button type="primary" size="small" @click="handleEditUser(scope.row)">
              <el-icon><edit /></el-icon> 编辑
            </el-button>
            <el-button type="danger" size="small" @click="handleDeleteUser(scope.row.id)">
              <el-icon><delete /></el-icon> 删除
            </el-button>
          </template>
        </el-table-column>
      </el-table>
    </el-card>

    <!-- 新增/编辑用户对话框 -->
    <el-dialog
      v-model="dialogVisible"
      :title="dialogTitle"
      width="500px"
    >
      <el-form :model="form" :rules="rules" ref="formRef" label-width="80px">
        <el-form-item label="用户名" prop="username">
          <el-input v-model="form.username" placeholder="请输入用户名" />
        </el-form-item>
        <el-form-item label="姓名" prop="name">
          <el-input v-model="form.name" placeholder="请输入姓名" />
        </el-form-item>
        <el-form-item label="邮箱" prop="email">
          <el-input v-model="form.email" placeholder="请输入邮箱" />
        </el-form-item>
        <el-form-item label="密码" v-if="!form.id">
          <el-input v-model="form.password" type="password" placeholder="请输入密码" show-password />
        </el-form-item>
      </el-form>
      <template #footer>
        <span class="dialog-footer">
          <el-button @click="dialogVisible = false">取消</el-button>
          <el-button type="primary" @click="handleSubmit">确定</el-button>
        </span>
      </template>
    </el-dialog>
  </div>
</template>

<script setup lang="ts">
import { ref, onMounted } from 'vue'
import axios from '../utils/axios'

const userList = ref<any[]>([])
const dialogVisible = ref(false)
const dialogTitle = ref('新增用户')
const formRef = ref()

const form = ref({
  id: '',
  username: '',
  name: '',
  email: '',
  password: ''
})

const rules = {
  username: [
    { required: true, message: '请输入用户名', trigger: 'blur' }
  ],
  name: [
    { required: true, message: '请输入姓名', trigger: 'blur' }
  ],
  email: [
    { required: true, message: '请输入邮箱', trigger: 'blur' },
    { type: 'email', message: '请输入正确的邮箱格式', trigger: 'blur' }
  ],
  password: [
    { required: true, message: '请输入密码', trigger: 'blur' }
  ]
}

// 加载用户列表
const loadUserList = async () => {
  try {
    const response = await axios.get('/user')
    if (response.code === 200) {
      userList.value = response.data
    }
  } catch (error) {
    console.error('加载用户列表失败:', error)
  }
}

// 新增用户
const handleAddUser = () => {
  dialogTitle.value = '新增用户'
  form.value = {
    id: '',
    username: '',
    name: '',
    email: '',
    password: ''
  }
  dialogVisible.value = true
}

// 编辑用户
const handleEditUser = (row: any) => {
  dialogTitle.value = '编辑用户'
  form.value = { ...row }
  dialogVisible.value = true
}

// 删除用户
const handleDeleteUser = async (id: string) => {
  try {
    const response = await axios.delete(`/user/${id}`)
    if (response.code === 200) {
      loadUserList()
    }
  } catch (error) {
    console.error('删除用户失败:', error)
  }
}

// 提交表单
const handleSubmit = async () => {
  if (!formRef.value) return
  
  await formRef.value.validate(async (valid: boolean) => {
    if (valid) {
      try {
        let response
        if (form.value.id) {
          response = await axios.put(`/user/${form.value.id}`, form.value)
        } else {
          response = await axios.post('/user', form.value)
        }
        if (response.code === 200) {
          dialogVisible.value = false
          loadUserList()
        }
      } catch (error) {
        console.error('提交失败:', error)
      }
    }
  })
}

onMounted(() => {
  loadUserList()
})
</script>

<style scoped>
.user-container {
  padding: 20px;
}

.user-container h2 {
  margin-bottom: 20px;
  color: #303133;
}

.card-header {
  margin-bottom: 20px;
  display: flex;
  justify-content: flex-end;
}
</style>