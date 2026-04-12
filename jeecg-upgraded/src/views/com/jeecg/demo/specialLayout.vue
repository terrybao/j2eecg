
<template>
  <div class="vue-component">
    <!DOCTYPE html>


</t:base>
<div>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
	  <t:datagrid name="jeecgrowList" pagination="true" fitColumns="true" title="数据列表" actionUrl="jeecgListDemoController.do?datagrid" pageSize="5" idField="id" queryMode="group">
		<el-table-column prop="id" label="id"></el-table-column>
	    <el-table-column prop="name" label="名称"></el-table-column>
	    <!--update-begin-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，年龄改为区间查询-->
	    <el-table-column prop="age" label="年龄"></el-table-column>
	    <!--update-end-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，年龄改为区间查询-->
	    <el-table-column prop="birthday" label="生日"></el-table-column>
	    <el-table-column prop="sex" label="性别"></el-table-column>
	    <el-table-column prop="salary" label="工资"></el-table-column>
	    <el-table-column prop="status" label="入职状态"></el-table-column>
	    <el-table-column prop="content" label="个人介绍"></el-table-column>
	  
   		<el-table-column prop="opt" label="操作"></el-table-column>
		<t:dgFunOpt funname="deleteDialog(id)" title="common.delete" urlclass="ace_button"  urlfont="fa-trash-o"></t:dgFunOpt>
		
			
	  </el-table>
  </div>
</div>
 
 <!--新提示方法改进   美化布局-------------------  -->  
 <style type="text/css">
 	.value{
 		padding: 10px auto 10px 10px;
 	}
 </style>
 	</div>
    <div title="新增数据" style="height:350px;background-color:#fff;overflow-y:auto;"  name="editPanel" id="editPanel"> 
    	<div class="datagrid-toolbar" style="float:left;width: 100%;">
		    <a href="#" class="easyui-linkbutton l-btn l-btn-plain" plain="true" icon="icon-add" onclick="clearData()">
			  	 清空表单
		    </a>
		    <a href="#" class="easyui-linkbutton l-btn l-btn-plain" plain="true" icon="icon-undo" onclick="cancelEdit()">
				重置表单
		    </a>
		    <a href="#" class="easyui-linkbutton l-btn l-btn-plain" plain="true" icon="icon-save" id="btn_sub" onclick="saveData()"><!-- onclick="saveData()" -->
		    	提交数据
		    </a>
    	</div>
		<el-form :model="form" ref="form" label-width="80px">
			<input name="demos[0].id" id="id" type="hidden" value="" /> 
			<table style="width: 600px;margin-bottom:75px" cellpadding="0" cellspacing="1" class="formtable">
					<tbody><tr>
						<td align="right">
							<label class="Validform_label">
								名称:
							</label>
						</td>
						<td class="value">
						     <input id="name" name="demos[0].name" type="text" style="width: 150px;" class="inputxt" datatype="*" value="">
						</td>
						<td align="right">
							<label class="Validform_label">
								年龄:
							</label>
						</td>
						<td class="value">
						     <input id="age" name="demos[0].age" type="text" style="width: 150px;" class="inputxt" datatype="d" value="">
						</td>
						<td align="right">
							<label class="Validform_label">
								生日:
							</label>
						</td>
						<td class="value">
							<input class="easyui-datebox" type="text" name="demos[0].birthday" id="birthday"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								性别:
							</label>
						</td>
						<td class="value">
							<el-select v-model="form.demos[0].status" placeholder="请选择"></el-select>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								个人介绍:
							</label>
						</td>
						<td class="value" colspan="5">
							<textarea name="demos[0].content" id="content" style="width: 600px;height:120px"></textarea>
						</td>
					</tr>
			</tbody>
			</table>
		
		</el-form>
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
