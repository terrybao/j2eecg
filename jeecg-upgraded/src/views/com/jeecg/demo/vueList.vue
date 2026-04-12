
<template>
  <div class="vue-component">
    <div id="test">
		<!--工具条-->
		<!--update-begin-Author:zhangweijian  Date: 20180710 for：TASK #2935 【样式】vue 列表样式尝试优化改进,常用示例-->
		<el-col :span="24" class="toolbar" style="padding-bottom: 0px;background: #f2f2f2;">
			<el-form :inline="true" :model="filters">
				<el-form-item style="margin-bottom: 8px;margin-top: 8px;">
					<el-input v-model="filters.name" placeholder="姓名" size="small"></el-input>
				</el-form-item>
				<el-form-item style="margin-top: 8px;">
			    	<el-button type="primary" v-on:click="getUsers" size="small">查询</el-button>
			    </el-form-item>
			    <el-form-item style="margin-top: 8px;">
		<!--update-end-Author:zhangweijian  Date: 20180710 for：TASK #2935 【样式】vue 列表样式尝试优化改进，常用示例-->
			    	<el-button type="primary" @click="handleAdd" size="small">新增</el-button>
			    </el-form-item>
			</el-form>
		</el-col>

		<!--列表-->
		<el-table :data="users" border stripe size="mini" highlight-current-row v-loading="listLoading" @selection-change="selsChange" style="width: 100%;">
			<el-table-column type="selection" width="55"></el-table-column>
			<el-table-column type="index" width="60"></el-table-column>
			<el-table-column prop="name" label="姓名" width="120" sortable show-overflow-tooltip></el-table-column>
			<el-table-column prop="sex" label="性别" width="100" :formatter="formatSex" sortable show-overflow-tooltip></el-table-column>
			<el-table-column prop="age" label="年龄" width="100" sortable show-overflow-tooltip></el-table-column>
			<el-table-column prop="birthday" label="生日" width="120" :formatter="formatBirthday" sortable show-overflow-tooltip></el-table-column>
			<el-table-column prop="phone" label="电话" min-width="120" sortable show-overflow-tooltip></el-table-column>
			<el-table-column label="操作" width="150">
				<template scope="scope">
					<el-button size="small" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
					<el-button size="small" type="danger" @click="handleDel(scope.$index, scope.row)">删除</el-button>
				</template>
			</el-table-column>
		</el-table>

		<!--工具条-->
		<el-col :span="24" class="toolbar">
			<el-button size="small" type="danger" @click="batchRemove" :disabled="this.sels.length===0">批量删除</el-button>
			 <el-pagination @current-change="handleCurrentChange" :page-sizes="[10, 20, 50, 100]"
      			:page-size="10" :total="total" layout="sizes, prev, pager, next"  style="float:right;"></el-pagination>
		</el-col>

		<!--编辑界面-->
		<el-dialog title="编辑" v-model="editFormVisible" :close-on-click-modal="false">
			<el-form :model="editForm" label-width="80px" :rules="editFormRules" ref="editForm">
				<el-form-item label="姓名" prop="name">
					<el-input v-model="editForm.name" auto-complete="off" placeholder="请输入用戶名"></el-input>
				</el-form-item>
				<el-form-item label="性别">
					<el-radio v-model="editForm.sex" :label="1">男</el-radio>
					<el-radio v-model="editForm.sex" :label="0">女</el-radio>
				</el-form-item>
				<el-form-item label="年龄">
					<el-input v-model="editForm.age" :min="0" :max="200"></el-input>
				</el-form-item>
				<el-form-item label="生日">
					<el-date-picker type="date" placeholder="选择日期" v-model="editForm.birthday"></el-date-picker>
				</el-form-item>
				<!--update-begin-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题,手机号校验-->
				<el-form-item label="电话" prop="phone">
				<!--update-end-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，手机号校验-->
					<el-input v-model="editForm.phone"  placeholder="请输入手机号"></el-input>
				</el-form-item>
			</el-form>
			<div slot="footer" class="dialog-footer">
				<el-button @click.native="editFormVisible = false">取消</el-button>
				<el-button type="primary" @click.native="editSubmit" :loading="editLoading">提交</el-button>
			</div>
		</el-dialog>

		<!--新增界面-->
		<el-dialog title="新增" v-model="addFormVisible" :close-on-click-modal="false">
			<el-form :model="addForm" label-width="80px" :rules="addFormRules" ref="addForm">
				<el-form-item label="姓名" prop="name">
					<el-input v-model="addForm.name" auto-complete="off" placeholder="请输入用戶名"></el-input>
				</el-form-item>
				<el-form-item label="性别">
					<el-radio v-model="addForm.sex" :label="1">男</el-radio>
					<el-radio v-model="addForm.sex" :label="0">女</el-radio>
				</el-form-item>
				<el-form-item label="年龄">
				<!--update-begin-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，手机号校验-->
					<el-input v-model="addForm.age" :min="0" :max="200" auto-complete="off"></el-input>
				<!--update-end-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，手机号校验-->
				</el-form-item>
				<el-form-item label="生日">
					<el-date-picker type="date" placeholder="选择日期" v-model="addForm.birthday"></el-date-picker>
				</el-form-item>
				<!--update-begin-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，手机号校验-->
				<el-form-item label="电话" prop="phone">
				<!--update-end-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，手机号校验-->
					<el-input v-model="addForm.phone" placeholder="请输入手机号"></el-input>
				</el-form-item>
			</el-form>
			<div slot="footer" class="dialog-footer">
				<el-button @click.native="addFormVisible = false">取消</el-button>
				<el-button type="primary" @click.native="addSubmit" :loading="addLoading">提交</el-button>
			</div>
		</el-dialog>
	</section>
	</div>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import { ElMessage, ElNotification } from 'element-plus'

// Component logic here
onMounted(() => {
  // Initialization code here
})
</script>

<style scoped>
/* Component styles here */
</style>
