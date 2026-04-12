
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${cgDynamGraphConfigHeadPage.id }">
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right"><label class="Validform_label">{{ $t("common.code") }}:</label></td>
			<td class="value"><input id="code" name="code" type="text" style="width: 150px" class="inputxt" datatype="*" value='${cgDynamGraphConfigHeadPage.code}'> <span class="Validform_checktip"></span></td>
			<td align="right"><label class="Validform_label">{{ $t("common.name") }} :</label></td>
			<td class="value"><input id="name" name="name" type="text" style="width: 150px" class="inputxt" datatype="*" value='${cgDynamGraphConfigHeadPage.name}'> <span class="Validform_checktip"></span></td>
            <td align="right"><label class="Validform_label">{{ $t("common.dynamic.dbsource") }} :</label></td>
            <td class="value"><el-select v-model="form.graphType" placeholder="请选择"><span class="Validform_checktip"></span></td>
			<td align="right"><label class="Validform_label">数据结构类型:</label></td>
			<td class="value" colspan="3"><el-select v-model="form.cgDynamGraphConfigItemList[#index#].fieldType" placeholder="请选择"></el-select></td>
			<td align="left"><select id="isShow" name="cgDynamGraphConfigItemList[#index#].isShow"  style="width: 60px;">
				<option value="Y">{{ $t("common.show") }}</option>
				<option value="N">{{ $t("common.hide") }}</option>
			</select></td>
			<td align="left"><input name="cgDynamGraphConfigItemList[#index#].fieldHref" maxlength="1000" type="text" class="inputxt" style="width: 120px;">
			<td align="left"><t:dictSelect field="cgDynamGraphConfigItemList[#index#].SMode" type="list" extendJson="{style:'width:90px'}" typeGroupCode="searchmode" defaultVal="" hasLabel="false" title="common.query.module"></el-select></td>
			<td align="left"><input name="cgDynamGraphConfigItemList[#index#].replaceVa" maxlength="36" type="text" class="inputxt" style="width: 120px;"></td>
			<td align="left"><input name="cgDynamGraphConfigItemList[#index#].dictCode" maxlength="36" type="text" class="inputxt" style="width: 120px;"></td>
			<td align="left"><t:dictSelect field="cgDynamGraphConfigItemList[#index#].SFlag" type="list" extendJson="{style:'width:90px'}" typeGroupCode="yesorno" defaultVal="" hasLabel="false" title="common.isquery"></el-select></td>
		</tr>
	</tbody>
</table>
<table style="display: none">
	<tbody id="add_cgDynamGraphConfigParam_table_template">
		<tr>
		 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
		 <td align="left"><input name="cgDynamGraphConfigParamList[#index#].paramName" maxlength="32" type="text" class="inputxt"  style="width:120px;" datatype="*" ></td>
		 <td align="left"><input name="cgDynamGraphConfigParamList[#index#].paramDesc" maxlength="32" type="text" class="inputxt"  style="width:120px;" ></td>
	     <td align="left"><input name="cgDynamGraphConfigParamList[#index#].paramValue" maxlength="32" type="text" class="inputxt"  style="width:120px;" ></td>
		 <td align="left"><input name="cgDynamGraphConfigParamList[#index#].seq" maxlength="32" type="text" class="inputxt"  style="width:120px;"></td>
		</tr>
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
