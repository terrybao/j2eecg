
<template>
  <div class="vue-component">
    <div class="printdiv">
 <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${jgDemo.id }">
	<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right" width="15%" nowrap><label class="Validform_label"> 用户名: </label></td>
			<td class="value" width="85%">
				<c:if test="${jgDemo.id!=null }">
					     ${jgDemo.name }
			    </c:if> 
			    <c:if test="${jgDemo.id==null }">
					<input id="name" class="inputxt" name="name" value="${jgDemo.name }" datatype="*">
					<span class="Validform_checktip">用户名范围在2~10位字符</span>
				</c:if>
			</td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 性别: </label></td>
			<td class="value">${sex}</td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 生日: </label></td>
			<td class="value">
				<fmt:formatDate value='${jgDemo.birthday }' type="date" pattern="yyyy-MM-dd"/>
			</td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 年龄: </label></td>
			<td class="value">${jgDemo.age}</td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 电话: </label></td>
			<td class="value">${jgDemo.phone}</td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 常用邮箱: </label></td>
			<td class="value">${jgDemo.email}</td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 部门: </label></td>
			<td class="value"><c:forEach items="${departList}" var="depart">
				<c:if test="${depart.id==jgDemo.depId}">
			         ${depart.departname}</c:if>
			</c:forEach></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 工资: </label></td>
			<td class="value">${jgDemo.salary}</td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 创建日期: </label></td>
			<td class="value">
				<fmt:formatDate value='${jgDemo.createDate}' type="date" pattern="yyyy-MM-dd HH:m:ss"/>
			</td>
		</tr>
		
	</table>
</el-form></div>
<a class="easyui-linkbutton" style="margin-top:3px" icon="icon-print" href="javascript:printall()">打印</a>
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
