
<template>
  <div class="vue-component">
    </t:base>
<div class="easyui-layout" fit="true">
	<div region="center" style="padding: 1px;">
		<t:datagrid name="jeecgDemoListquery" title="高级查询示例"
			actionUrl="jeecgListDemoController.do?datagrid" idField="id"
			queryMode="group" checkbox="true" superQuery="true"
			extendParams="headerContextMenu: [
                { text: '保存列定义', iconCls: 'icon-save', disabled: false, handler: function () { saveHeader(); } },
                { text: '自定义菜单', iconCls: 'icon-reload', disabled: false, handler: function (e, field) { alert($.string.format('您点击了{0}', field)); } }
            ],">
			<el-table-column prop="id" label="编号"></el-table-column>
			<el-table-column prop="name" label="用户名"></el-table-column>
			<el-table-column prop="content" label="个人介绍"></el-table-column>
			<el-table-column prop="phone" label="办公电话"></el-table-column>
			<el-table-column prop="createDate" label="创建日期"></el-table-column>
			<el-table-column prop="email" label="邮箱"></el-table-column>
			<el-table-column prop="age" label="年龄"></el-table-column>
			<el-table-column prop="salary" label="工资"></el-table-column>
			<el-table-column prop="birthday" label="生日"></el-table-column>
			
		</el-table>
	</div>
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
