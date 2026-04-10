<template>
  <div class="demo-list">
    <el-card>
      <template #header>
        <div class="card-header">
          <h2>JEECG Demo 列表</h2>
          <div class="header-buttons">
            <el-button type="primary" @click="handleAdd">录入</el-button>
            <el-button @click="handleBatchDelete">批量删除</el-button>
            <el-button @click="handleImport">导入</el-button>
            <el-button @click="handleExport">导出</el-button>
          </div>
        </div>
      </template>
      
      <!-- 搜索区域 -->
      <el-form :inline="true" :model="searchForm" class="search-form">
        <el-form-item label="名称">
          <el-input v-model="searchForm.name" placeholder="请输入名称"></el-input>
        </el-form-item>
        <el-form-item label="年龄">
          <el-input v-model="searchForm.age" type="number" placeholder="请输入年龄"></el-input>
        </el-form-item>
        <el-form-item label="部门">
          <el-select v-model="searchForm.depId" placeholder="请选择部门">
            <el-option label="部门1" value="1"></el-option>
            <el-option label="部门2" value="2"></el-option>
            <el-option label="部门3" value="3"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="handleSearch">搜索</el-button>
          <el-button @click="resetSearch">重置</el-button>
        </el-form-item>
      </el-form>
      
      <!-- 数据表格 -->
      <el-table
        v-loading="loading"
        :data="tableData"
        style="width: 100%"
        @selection-change="handleSelectionChange"
      >
        <el-table-column type="selection" width="55"></el-table-column>
        <el-table-column prop="id" label="ID" width="120"></el-table-column>
        <el-table-column prop="name" label="名称" width="120"></el-table-column>
        <el-table-column prop="age" label="年龄" width="120">
          <template #default="{ row }">
            <span>{{ formatAge(row.age) }}</span>
          </template>
        </el-table-column>
        <el-table-column prop="birthday" label="生日" width="120">
          <template #default="{ row }">
            <span>{{ formatDate(row.birthday) }}</span>
          </template>
        </el-table-column>
        <el-table-column prop="depId" label="部门" width="120"></el-table-column>
        <el-table-column prop="extField" label="部门编码(拓展字段)" width="120"></el-table-column>
        <el-table-column prop="sex" label="性别" width="120">
          <template #default="{ row }">
            <span :style="getSexStyle(row.sex)">{{ row.sex === '1' ? '男' : '女' }}</span>
          </template>
        </el-table-column>
        <el-table-column prop="phone" label="电话" width="120"></el-table-column>
        <el-table-column prop="salary" label="工资" width="120"></el-table-column>
        <el-table-column prop="createDate" label="创建日期" width="120">
          <template #default="{ row }">
            <span>{{ formatDate(row.createDate) }}</span>
          </template>
        </el-table-column>
        <el-table-column prop="email" label="邮箱" width="120"></el-table-column>
        <el-table-column prop="status" label="入职状态" width="120">
          <template #default="{ row }">
            <span>{{ row.status === 'Y' ? '已入职' : '未入职' }}</span>
          </template>
        </el-table-column>
        <el-table-column prop="touxiang" label="头像" width="60">
          <template #default="{ row }">
            <span v-if="row.touxiang" style="color:green;font-size: 16px;">✔</span>
            <span v-else style="color:red;font-size: 16px;">x</span>
          </template>
        </el-table-column>
        <el-table-column label="操作" width="150">
          <template #default="{ row }">
            <el-button size="small" @click="handleEdit(row.id)">编辑</el-button>
            <el-button size="small" type="danger" @click="handleDelete(row.id)">删除</el-button>
            <el-button v-if="row.status === 'N'" size="small" type="success" @click="handleCheck(row.id)">审核</el-button>
          </template>
        </el-table-column>
      </el-table>
      
      <!-- 分页 -->
      <div class="pagination">
        <el-pagination
          v-model:current-page="currentPage"
          v-model:page-size="pageSize"
          :page-sizes="[10, 20, 50, 100]"
          layout="total, sizes, prev, pager, next, jumper"
          :total="total"
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
        />
      </div>
    </el-card>
    
    <!-- 对话框 -->
    <el-dialog
      v-model="dialogVisible"
      :title="dialogTitle"
      width="770px"
    >
      <el-form :model="formData" :rules="formRules" ref="formRef" label-width="80px">
        <el-form-item label="名称" prop="name">
          <el-input v-model="formData.name" placeholder="请输入名称"></el-input>
        </el-form-item>
        <el-form-item label="年龄" prop="age">
          <el-input v-model="formData.age" type="number" placeholder="请输入年龄"></el-input>
        </el-form-item>
        <el-form-item label="生日" prop="birthday">
          <el-date-picker v-model="formData.birthday" type="date" placeholder="选择日期"></el-date-picker>
        </el-form-item>
        <el-form-item label="部门" prop="depId">
          <el-select v-model="formData.depId" placeholder="请选择部门">
            <el-option label="部门1" value="1"></el-option>
            <el-option label="部门2" value="2"></el-option>
            <el-option label="部门3" value="3"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="性别" prop="sex">
          <el-radio-group v-model="formData.sex">
            <el-radio label="1">男</el-radio>
            <el-radio label="0">女</el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="电话" prop="phone">
          <el-input v-model="formData.phone" placeholder="请输入电话"></el-input>
        </el-form-item>
        <el-form-item label="工资" prop="salary">
          <el-input v-model="formData.salary" type="number" placeholder="请输入工资"></el-input>
        </el-form-item>
        <el-form-item label="邮箱" prop="email">
          <el-input v-model="formData.email" placeholder="请输入邮箱"></el-input>
        </el-form-item>
        <el-form-item label="入职状态" prop="status">
          <el-select v-model="formData.status" placeholder="请选择状态">
            <el-option label="已入职" value="Y"></el-option>
            <el-option label="未入职" value="N"></el-option>
          </el-select>
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

<script setup>
import { ref, reactive, onMounted, computed } from 'vue'
import axios from 'axios'
import { ElMessageBox, ElMessage } from 'element-plus'

// 表格数据
const tableData = ref([])
const loading = ref(false)
const currentPage = ref(1)
const pageSize = ref(10)
const total = ref(0)
const selectedRows = ref([])

// 搜索表单
const searchForm = reactive({
  name: '',
  age: '',
  depId: ''
})

// 对话框
const dialogVisible = ref(false)
const dialogTitle = ref('')
const formData = reactive({})
const formRef = ref(null)

// 表单验证规则
const formRules = {
  name: [
    { required: true, message: '请输入名称', trigger: 'blur' }
  ],
  age: [
    { required: true, message: '请输入年龄', trigger: 'blur' }
  ]
}

// 格式化年龄
const formatAge = (age) => {
  if (!age) return ''
  return `原：${age}, 现：${Number(age) + 20}`
}

// 格式化日期
const formatDate = (date) => {
  if (!date) return ''
  const d = new Date(date)
  return `${d.getFullYear()}-${String(d.getMonth() + 1).padStart(2, '0')}-${String(d.getDate()).padStart(2, '0')}`
}

// 获取性别样式
const getSexStyle = (sex) => {
  if (sex === '1') {
    return { backgroundColor: '#f89406', color: '#FFF' }
  } else if (sex === '0') {
    return { backgroundColor: '#3a87ad', color: '#FFF' }
  }
  return { backgroundColor: '#21B9BB' }
}

// 选择变化
const handleSelectionChange = (val) => {
  selectedRows.value = val
}

// 搜索
const handleSearch = () => {
  currentPage.value = 1
  fetchData()
}

// 重置搜索
const resetSearch = () => {
  Object.keys(searchForm).forEach(key => {
    searchForm[key] = ''
  })
  currentPage.value = 1
  fetchData()
}

// 分页
const handleSizeChange = (size) => {
  pageSize.value = size
  fetchData()
}

const handleCurrentChange = (current) => {
  currentPage.value = current
  fetchData()
}

// 添加
const handleAdd = () => {
  dialogTitle.value = '添加'
  formData.id = ''
  formData.name = ''
  formData.age = ''
  formData.birthday = ''
  formData.depId = ''
  formData.sex = '1'
  formData.phone = ''
  formData.salary = ''
  formData.email = ''
  formData.status = 'N'
  dialogVisible.value = true
}

// 编辑
const handleEdit = (id) => {
  dialogTitle.value = '编辑'
  // 模拟获取数据
  const row = tableData.value.find(item => item.id === id)
  if (row) {
    Object.assign(formData, row)
    dialogVisible.value = true
  }
}

// 删除
const handleDelete = (id) => {
  ElMessageBox.confirm('确定要删除吗？', '提示', {
    confirmButtonText: '确定',
    cancelButtonText: '取消',
    type: 'warning'
  }).then(() => {
    // 模拟删除
    tableData.value = tableData.value.filter(item => item.id !== id)
    ElMessage.success('删除成功')
  })
}

// 批量删除
const handleBatchDelete = () => {
  if (selectedRows.value.length === 0) {
    ElMessage.warning('请选择要删除的记录')
    return
  }
  ElMessageBox.confirm('确定要批量删除吗？', '提示', {
    confirmButtonText: '确定',
    cancelButtonText: '取消',
    type: 'warning'
  }).then(() => {
    // 模拟批量删除
    const ids = selectedRows.value.map(item => item.id)
    tableData.value = tableData.value.filter(item => !ids.includes(item.id))
    selectedRows.value = []
    ElMessage.success('批量删除成功')
  })
}

// 审核
const handleCheck = (id) => {
  // 模拟审核
  const row = tableData.value.find(item => item.id === id)
  if (row) {
    row.status = 'Y'
    ElMessage.success('审核成功')
  }
}

// 导入
const handleImport = () => {
  ElMessage.info('导入功能开发中')
}

// 导出
const handleExport = () => {
  ElMessage.info('导出功能开发中')
}

// 提交表单
const handleSubmit = () => {
  formRef.value.validate((valid) => {
    if (valid) {
      if (formData.id) {
        // 编辑
        const index = tableData.value.findIndex(item => item.id === formData.id)
        if (index !== -1) {
          tableData.value[index] = { ...formData }
        }
        ElMessage.success('编辑成功')
      } else {
        // 添加
        const newItem = {
          ...formData,
          id: Date.now(),
          createDate: new Date(),
          updateDate: new Date()
        }
        tableData.value.unshift(newItem)
        ElMessage.success('添加成功')
      }
      dialogVisible.value = false
    }
  })
}

// 获取数据
const fetchData = () => {
  loading.value = true
  // 模拟数据
  setTimeout(() => {
    tableData.value = [
      {
        id: 1,
        name: '张三',
        age: 25,
        birthday: '1998-01-01',
        depId: '1',
        extField: 'DEP001',
        sex: '1',
        phone: '13800138001',
        salary: 5000,
        createDate: '2023-01-01',
        email: 'zhangsan@example.com',
        status: 'Y',
        touxiang: '1'
      },
      {
        id: 2,
        name: '李四',
        age: 30,
        birthday: '1993-01-01',
        depId: '2',
        extField: 'DEP002',
        sex: '0',
        phone: '13800138002',
        salary: 6000,
        createDate: '2023-01-02',
        email: 'lisi@example.com',
        status: 'N',
        touxiang: ''
      }
    ]
    total.value = 2
    loading.value = false
  }, 1000)
}

// 生命周期
onMounted(() => {
  fetchData()
})
</script>

<style scoped>
.demo-list {
  padding: 20px;
}

.card-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.header-buttons {
  display: flex;
  gap: 10px;
}

.search-form {
  margin-bottom: 20px;
}

.pagination {
  margin-top: 20px;
  display: flex;
  justify-content: flex-end;
}
</style>