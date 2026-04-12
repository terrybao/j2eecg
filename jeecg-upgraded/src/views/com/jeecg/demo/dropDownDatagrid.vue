
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	 <fieldset>
		 <legend>下拉列表控件</legend>
			<div class="container">	
			<h2 class="page-header"></h2>
				<div class="docs-methods" style="height:400px">
					<input id="cc" class="easyui-combogrid" style="width:250px" data-options="
			            panelWidth: 500,
			            idField: 'name',
			            textField: 'name',
			            url: 'jeecgListDemoController.do?datagrid&field=id,name,age,birthday,depId,extField,sex,phone,salary,createDate,email,status,content,touxiang,createBy,createName,updateBy,updateDate,updateName,',
			            columns: [[
			                {field:'name',title:'姓名',width:80},
			                {field:'age',title:'年龄',width:120},
			                {field: 'sex',title: '性别',width: 120,
							formatter: function(value, rec, index) {
								if (value == '0') {
			                        return '男';
			                    }
			                    if (value == '1') {
			                        return '女';
			                    } else {
			                        return value;
			                    }
							}
			            },
						{field:'salary',title: '工资', sortable: true,width:120},
			            ]],
			             fitColumns: true
			        ">
			</div>
		</div>
	</fieldset>
</el-form>
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
