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
      <el-form :inline="true" :model="searchForm" class="search-form">
        <el-form-item label="id">
          <el-input v-model="searchForm.id" placeholder="请输入id"></el-input>
        </el-form-item>
        <el-form-item label="broswer">
          <el-input v-model="searchForm.broswer" placeholder="请输入broswer"></el-input>
        </el-form-item>
        <el-form-item label="broswercount">
          <el-input v-model="searchForm.broswercount" placeholder="请输入broswercount"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="handleSearch">搜索</el-button>
          <el-button @click="resetSearch">重置</el-button>
        </el-form-item>
      </el-form>
      <el-table
        v-loading="loading"
        :data="tableData"
        style="width: 100%"
        @selection-change="handleSelectionChange"
      >
        <el-table-column type="selection" width="55"></el-table-column>
        <el-table-column prop="id" label="id" width="120"></el-table-column>
        <el-table-column prop="broswer" label="broswer" width="120"></el-table-column>
        <el-table-column prop="broswercount" label="broswercount" width="120"></el-table-column>
        <el-table-column prop="rate" label="rate" width="120"></el-table-column>
        <el-table-column label="操作" width="150">
          <template #default="{ row }">
            <el-button size="small" @click="handleEdit(row.id)">编辑</el-button>
            <el-button size="small" type="danger" @click="handleDelete(row.id)">删除</el-button>
          </template>
        </el-table-column>
      </el-table>
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
  </div>
</template>

<script setup>
import { ref, reactive, onMounted } from "vue"
import axios from "axios"
import { ElMessageBox, ElMessage } from "element-plus"

# 表格数据
const tableData = ref([])
const loading = ref(false)
const currentPage = ref(1)
const pageSize = ref(10)
const total = ref(0)
const selectedRows = ref([])

# 搜索表单
const searchForm = reactive({
  id: "",
  broswer: "",
  broswercount: "",
})

# 选择变化
const handleSelectionChange = (val) => {
  selectedRows.value = val
}

# 搜索
const handleSearch = () => {
  currentPage.value = 1
  fetchData()
}

# 重置搜索
const resetSearch = () => {
  Object.keys(searchForm).forEach(key => {
    searchForm[key] = ""
  })
  currentPage.value = 1
  fetchData()
}

# 分页
const handleSizeChange = (size) => {
  pageSize.value = size
  fetchData()
}

const handleCurrentChange = (current) => {
  currentPage.value = current
  fetchData()
}

# 添加
const handleAdd = () => {
  ElMessage.info("添加功能开发中")
}

# 编辑
const handleEdit = (id) => {
  ElMessage.info("编辑功能开发中")
}

# 删除
const handleDelete = (id) => {
  ElMessageBox.confirm("确定要删除吗？", "提示", {
    confirmButtonText: "确定",
    cancelButtonText: "取消",
    type: "warning"
  }).then(() => {
    // 模拟删除
    tableData.value = tableData.value.filter(item => item.id !== id)
    ElMessage.success("删除成功")
  })
}

# 批量删除
const handleBatchDelete = () => {
  if (selectedRows.value.length === 0) {
    ElMessage.warning("请选择要删除的记录")
    return
  }
  ElMessageBox.confirm("确定要批量删除吗？", "提示", {
    confirmButtonText: "确定",
    cancelButtonText: "取消",
    type: "warning"
  }).then(() => {
    // 模拟批量删除
    const ids = selectedRows.value.map(item => item.id)
    tableData.value = tableData.value.filter(item => !ids.includes(item.id))
    selectedRows.value = []
    ElMessage.success("批量删除成功")
  })
}

# 导入
const handleImport = () => {
  ElMessage.info("导入功能开发中")
}

# 导出
const handleExport = () => {
  ElMessage.info("导出功能开发中")
}

# 获取数据
const fetchData = () => {
  loading.value = true
  // 模拟数据
  setTimeout(() => {
    tableData.value = [
      {
        id: 1,
      },
      {
        id: 2,
      }
    ]
    total.value = 2
    loading.value = false
  }, 1000)
}

# 生命周期
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