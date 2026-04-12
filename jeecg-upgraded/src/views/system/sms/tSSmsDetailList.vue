
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable table table-hover">
		<thead>
			<tr>
				<th>内容</th>
				<th>发送时间</th>
			</tr>
		</thead>
		<tbody>
		   <c:if test="${smsList != null || fn:length(smsList) != 0}">
		   		<c:forEach var="item" items="${smsList}">
					<tr>
						<td class="value"><span>${item.esContent}</span></td>
						<td class="value"><span>${item.esSendtime}</span></td>
					</tr>
				</c:forEach>
			</c:if>
			<c:if test="${smsList == null || fn:length(smsList) == 0}">
				<tr>
					<td class="value"><span>暂无系统信息！</span></td>
					<td class="value"><span>暂无系统信息！</span></td>
				</tr>
			</c:if>
		</tbody>
	</table>
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
