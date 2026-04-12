
<template>
  <div class="vue-component">
    <!DOCTYPE html>
<html>
<meta http-equiv="X-UA-Compatible" content="chrome=1, IE=edge">
<head>
	</t:base>
    
</head>
<body style="overflow-y: hidden" scroll="no">
<el-form :model="form" ref="form" label-width="80px">
	<table cellpadding="0" width="100%" cellspacing="1" class="formtable">
		<tr>
			<td align="right" height="40" width="15%"><span class="filedzt">数据库表名:</span></td>
			<td class="value" width="30%">
				<input type="text" class="inuptxt" name="tableName" id="tableName" datatype="*">
				<span class="Validform_checktip"></span>
			</td>

			<td align="right" height="40" width="15%"><span class="filedzt">数据ID:</span></td>
			<td class="value" width="30%">
				<input type="text" class="inuptxt" name="dataId" id="dataId" datatype="*">
				<span class="Validform_checktip"></span>
			</td>
		</tr>
		<tr>
			<td align="right" height="40" width="15%"><span class="filedzt">版本号1:</span></td>
			<td class="value" width="30%">
				<input type="text" class="inuptxt" id="versionNumber1" readonly="readonly"/>
				<span class="Validform_checktip"></span>
			</td>

			<td align="right" height="40" width="15%"><span class="filedzt">版本号2:</span></td>
			<td class="value" width="30%">
				<input type="text" class="inuptxt" id="versionNumber2" readonly="readonly"/>
				<span class="Validform_checktip"></span>
			</td>
		</tr>
		<tr height="40">
			<td class="upload" colspan="4">
				<a href="#" class="easyui-linkbutton" id="btn" iconCls="icon-search" style="float: right; margin-right: 10px;"> 数据比较 &nbsp;&nbsp; </a>
			</td>
		</tr>
	</table>
</el-form>
</html>
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
