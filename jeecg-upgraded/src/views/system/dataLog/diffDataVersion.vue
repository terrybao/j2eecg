
<template>
  <div class="vue-component">
    <table width="90%" class="table" style="table-layout:fixed;word-break:break-all">
	    <tbody>
		    <tr>
		        <th style="width:80px; white-space:nowrap">字段名</th>
		        <th style="white-space:nowrap">版本号[${versionNumber1}]</th>
		        <th class="tdClass" style="white-space:nowrap"></th>
		        <th style="white-space:nowrap">版本号[${versionNumber2}]</th>
		    </tr>
		    <c:forEach items="${dataLogDiffs }" varStatus="itemStatus" var="item">
		    	<tr <c:if test="${itemStatus.index%2==0}">class="alter"</c:if> <c:if test="${item.diff=='Y'}">style="background-color: rgba(255, 192, 203, 0.31);color:red;"</c:if>>
					<td>${item.name }</td>
					<td>${item.value1 }</td>
					<td><c:if test="${item.diff=='Y'}"><span class="icon-goright" style="display:inline-block;height:15px;width:15px"></span></c:if></td>
					<td>${item.value2 }</td>
				</tr>
	        </c:forEach>
	        
		</tbody>
	</table>
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
