
<template>
  <div class="vue-component">
    <!DOCTYPE html>


</t:base>
 <style type="text/css">
 	th{
 		text-align: center;
 		line-height: 25px;
 	}
 	.value{
 		padding: 10px auto 10px 10px;
 	}
 	.inputxt{
 		width: 150px;
 	}
 </style>
    <div title="Popup Demo" style="height:350px;" name="editPanel" id="editPanel" fit="true" class="easyui-panel">  	
		<el-form :model="form" ref="form" label-width="80px">
			<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<thead>
					<tr><th>姓名</th><th>账号</th><th>生日</th><th>性别</th><th>工资</th><th>入职状态</th></tr>
				</thead>
				<tbody>
					<tr>
						<td class="value">							
							 <input name="demos[0].id" type="hidden" value="" /> 
						     <input onclick="popupClick(this,'account,realname','account,name','user_msg');" placeholder="点击选择用户" name="demos[0].name" type="text" style="cursor: pointer;" class="inputxt" value="">
						</td>
						<td class="value">
						     <input placeholder="←" name="demos[0].account" type="text" class="inputxt" value="">
						</td>
						<td class="value">
							<input class="easyui-datebox" type="text" name="demos[0].birthday" id="birthday"/>
						</td>
						<td class="value">
							<el-select v-model="form.demos[0].status" placeholder="请选择"></el-select>
						</td>
					</tr>
					<tr>
						<td class="value">							
							 <input name="demos[1].id" type="hidden" value="" /> 
						     <input onclick="popupClick(this,'account,realname','account,name','user_msg');" placeholder="点击选择用户" name="demos[1].name" type="text" style="cursor: pointer;" class="inputxt" value="">
						</td>
						<td class="value">
						     <input placeholder="←" name="demos[1].account" type="text" class="inputxt" value="">
						</td>
						<td class="value">
							<input class="easyui-datebox" type="text" name="demos[1].birthday"/>
						</td>
						<td class="value">
							<el-select v-model="form.demos[1].status" placeholder="请选择"></el-select>
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
