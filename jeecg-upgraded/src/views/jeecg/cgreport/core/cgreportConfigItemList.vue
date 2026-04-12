
<template>
  <div class="vue-component">
    <div style="padding: 3px; height: 25px; width: auto;" class="datagrid-toolbar"><a id="addCgreportConfigItemBtn" href="javascript:void(0);">添加</a> <a id="delCgreportConfigItemBtn" href="javascript:void(0);">删除</a></div>
<div style="width: auto; height: 300px; overflow-y: auto; overflow-x: scroll;">
<table border="0" cellpadding="2" cellspacing="0" id="cgreportConfigItem_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE"><label class="Validform_label">{{ $t("common.code") }}</label></td>
		<td align="left" bgcolor="#EEEEEE"><label class="Validform_label"> {{ $t("common.name") }} </label></td>
		<td align="left" bgcolor="#EEEEEE"><label class="Validform_label"> {{ $t("common.order") }} </label></td>
		<td align="left" bgcolor="#EEEEEE"><label class="Validform_label"> {{ $t("common.text") }} </label></td>
		<td align="left" bgcolor="#EEEEEE"><label class="Validform_label"> {{ $t("common.type") }} </label></td>
		<td align="left" bgcolor="#EEEEEE"><label class="Validform_label"> {{ $t("common.isshow") }}  </label></td>
		<td align="left" bgcolor="#EEEEEE"><label class="Validform_label">  {{ $t("common.href") }}  </label></td>
		<td align="left" bgcolor="#EEEEEE"><label class="Validform_label">  {{ $t("common.query.module") }}  </label></td>
		<td align="left" bgcolor="#EEEEEE"><label class="Validform_label"> 取值表达式 </label></td>
		<td align="left" bgcolor="#EEEEEE"><label class="Validform_label">  {{ $t("dict.code") }}  </label></td>
		<td align="left" bgcolor="#EEEEEE"><label class="Validform_label">  {{ $t("common.isquery") }}  </label></td>
	</tr>
	<tbody id="add_cgreportConfigItem_table">
		<c:if test="${fn:length(cgreportConfigItemList)  <= 0 }">
			<tr>
				<td align="center"><input style="width: 20px;" type="checkbox" name="ck" />
				<input name="cgreportConfigItemList[0].id" type="hidden" />
				<input name="cgreportConfigItemList[0].cgrheadId" type="hidden" />
				</td>
				<td align="left"><input name="cgreportConfigItemList[0].fieldName" maxlength="36" type="text" class="inputxt" style="width: 120px;"></td>
				<td align="left"><input name="cgreportConfigItemList[0].orderNum" maxlength="3" type="text" class="inputxt" style="width: 30px;"></td>
				<td align="left"><input name="cgreportConfigItemList[0].fieldTxt" maxlength="1000" type="text" class="inputxt" style="width: 120px;"></td>
				<td align="left"><el-select v-model="form.cgreportConfigItemList[${stuts.index }].SMode" placeholder="请选择"></el-select></td>
					<td align="left"><input name="cgreportConfigItemList[${stuts.index }].replaceVa" maxlength="36" type="text" class="inputxt" style="width: 120px;" value="${poVal.replaceVa }"></td>
					<td align="left"><input name="cgreportConfigItemList[${stuts.index }].dictCode" maxlength="36" type="text" class="inputxt" style="width: 120px;" value="${poVal.dictCode }"></td>
					<td align="left"><t:dictSelect field="cgreportConfigItemList[${stuts.index }].SFlag" extendJson="{style:'width:90px'}" type="list" typeGroupCode="yesorno" defaultVal="${poVal.SFlag}" hasLabel="false" title="common.isquery"></el-select></td>
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
