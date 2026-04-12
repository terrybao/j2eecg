
<template>
  <div class="vue-component">
    <div style="padding: 3px; height: 25px; width: auto;" class="datagrid-toolbar"><a id="addCgreportConfigParamBtn" href="javascript:void(0);">添加</a> <a id="delCgreportConfigParamBtn" href="javascript:void(0);">删除</a></div>
<div style="width: auto; height: 150px; overflow-y: auto; overflow-x: scroll;">
<table border="0" cellpadding="2" cellspacing="0" id="cgreportConfigParam_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE"><label class="Validform_label">{{ $t("common.code") }}</label></td>
		<td align="left" bgcolor="#EEEEEE" style="width: 120px;"><label class="Validform_label"> {{ $t("form.param.name") }} </label></td>
		<td align="left" bgcolor="#EEEEEE" style="width: 120px;"><label class="Validform_label"> {{ $t("form.param.desc") }} </label></td>
		<td align="left" bgcolor="#EEEEEE" style="width: 120px;"><label class="Validform_label"> {{ $t("form.param.value") }} </label></td>
		<td align="left" bgcolor="#EEEEEE" style="width: 120px;"><label class="Validform_label"> {{ $t("common.order") }} </label></td>
	</tr>
	<tbody id="add_cgreportConfigParam_table">
		
		<c:if test="${fn:length(cgDynamGraphConfigParamList)  > 0 }">
			<c:forEach items="${cgDynamGraphConfigParamList}" var="poVal" varStatus="stuts">
				<tr>
					<td align="center"><input style="width: 20px;" type="checkbox" name="ck" /></td>
					<input name="cgDynamGraphConfigParamList[${stuts.index }].id" type="hidden" value="${poVal.id }"/>
					<input name="cgDynamGraphConfigParamList[${stuts.index }].cgrheadId" type="hidden" value="${poVal.cgrheadId }"/>
					<td align="left"><input name="cgDynamGraphConfigParamList[${stuts.index }].paramName" value="${poVal.paramName }" maxlength="32" type="text" class="inputxt" style="width: 120px;"></td>
					<td align="left"><input name="cgDynamGraphConfigParamList[${stuts.index }].paramDesc" value="${poVal.paramDesc }" maxlength="32" type="text" class="inputxt" style="width: 120px;"></td>
					<td align="left"><input name="cgDynamGraphConfigParamList[${stuts.index }].paramValue" value="${poVal.paramValue }" maxlength="32" type="text" class="inputxt" style="width: 120px;"></td>
					<td align="left"><input name="cgDynamGraphConfigParamList[${stuts.index }].seq" value="${poVal.seq }" maxlength="32" type="text" class="inputxt"  style="width:120px;"></td>
				</tr>
			</c:forEach>
		</c:if>
	</tbody>
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
