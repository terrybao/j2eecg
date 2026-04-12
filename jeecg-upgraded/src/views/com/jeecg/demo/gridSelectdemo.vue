
<template>
  <div class="vue-component">
    </t:base>
<style>
table.table-list {
 	width: 99.6%;
 	font-size: 12px;
 	margin:5px auto;
 	border-collapse:collapse;
}
table.table-list th {
	background: #FDFDFF;
	height: 32px;
	text-align: center;
}
table.table-list td {
	font-weight: normal;
	padding: 5px 5px;
}

</style>
<div class="easyui-layout" style="width:700px;height:400px;">
<div data-options="region:'east',split:true" title="用户选择" style="width:200px;">
        	<table class="table-list" border="1" bordercolor="#e5e5e5" id="table1">
				<thead>
					<tr>
						<th>姓名</th>
						<th>操作 <a href="javascript:javaScript:void(0)" ng-click="clear()" class="btn btn-sm fa fa-close" onclick="deleteAll()"></a></th>
					</tr>
				</thead>
				<tbody>
				
				</tbody>
			</table>
    </div>
    <div data-options="region:'center'">
        <t:datagrid checkbox="false" name="userList1" title="common.user.select" actionUrl="jeecgFormDemoController.do?easyUIGrid"
                    fit="true" fitColumns="true" idField="id" queryMode="group" sortName="createDate" sortOrder="desc" onClick="checkSelect">
            <el-table-column prop="id" label="common.id"></el-table-column>
            <el-table-column prop="userName" label="common.username"></el-table-column>
            <el-table-column prop="realName" label="common.real.name"></el-table-column>
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
