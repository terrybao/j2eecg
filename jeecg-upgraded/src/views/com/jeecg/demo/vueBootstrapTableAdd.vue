
<template>
  <div class="vue-component">
    <div id="dpLTE" class="container-fluid" v-cloak>
		<table class="form" id="form">
			<tr>
	            <td class="formTitle">姓名<font face="宋体">*</font></td>
	            <td class="formValue">
					<input type="text" class="form-control" placeholder="姓名" v-model="user.name" datatype="*">
	            </td>
	            <td class="formTitle">年龄<font face="宋体">*</font></td>
	            <td class="formValue">
					<input type="text" class="form-control" placeholder="年龄" v-model="user.age" datatype="num">
	            </td>
        	</tr>
        	<tr>
				<td class="formTitle">性别</td>
				<td class="formValue" colspan="3">
					<label class="radio-inline">
						<input type="radio" name="sex" value="1" v-model="user.sex"/> 男
					</label>
					<label class="radio-inline">
						<input type="radio" name="sex" value="0" v-model="user.sex"/> 女
					</label>
				</td>
			</tr>
        	<tr>
	            <td class="formTitle">生日</td>
	            <td class="formValue">
					<input type="text" id="birthday" class="form-control" placeholder="请选择生日">
	            </td>
        		<td class="formTitle">手机号</td>
	            <td class="formValue">
	            <!--update-begin-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，手机号校验-->
					<input type="text" class="form-control" placeholder="请输入手机号" v-model="user.phone" datatype="m">
	            <!--update-end-Author:zhangweijian Date: 20180710 for：TASK #2941 【bug】常用示例，小问题，手机号校验-->
	            </td>
        	</tr>
		</table>
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
