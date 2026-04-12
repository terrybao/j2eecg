
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${cgreportConfigHeadPage.id }">
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right"><label class="Validform_label">{{ $t("common.code") }}:</label></td>
			<td class="value"><input id="code" name="code" type="text" style="width: 150px" class="inputxt" datatype="w1"> <span class="Validform_checktip"></span></td>
			<td align="right"><label class="Validform_label">{{ $t("common.name") }} :</label></td>
			<td class="value"><input id="name" name="name" type="text" style="width: 150px" class="inputxt" datatype="*"> <span class="Validform_checktip"></span></td>
            <td align="right"><label class="Validform_label">{{ $t("common.dynamic.dbsource") }} :</label></td>
            <td class="value"><el-select v-model="form.popRetype" placeholder="请选择"><span class="Validform_checktip"></span></td>
        </tr>
        <!--update-end--Author:huangzq  Date:20151129 for：[753]【在线报表】扩展增加俩字段，非必填-->   
	</table>	
	<div style="width: auto; ">	
	<div style="width: 800px; height: 1px;"></div>
	
	<t:tabs id="ttp" iframe="false" tabPosition="top" fit="false"><t:tab href="cgreportConfigHeadController.do?cgreportConfigParamList&id=${cgreportConfigHeadPage.id}" icon="icon-search" title="报表参数" id="cgreportConfigParam"></t:tab></t:tabs>				
	<t:tabs id="tt" iframe="false" tabPosition="top" fit="false"><t:tab href="cgreportConfigHeadController.do?cgreportConfigItemList&id=${cgreportConfigHeadPage.id}" icon="icon-search" title="dynamic.report.config.detail" id="cgreportConfigItem"></t:tab></t:tabs></div>
</el-form>
<!-- 添加 附表明细 模版 -->
<table style="display: none">
	<tbody id="add_cgreportConfigItem_table_template">
		<tr>
			<td align="center"><input style="width: 20px;" type="checkbox" name="ck" /></td>
			<td align="left"><input name="cgreportConfigItemList[#index#].fieldName" maxlength="36" type="text" class="inputxt" style="width: 120px;"></td>
			<td align="left"><input name="cgreportConfigItemList[#index#].orderNum" maxlength="10" type="text" class="inputxt" style="width: 30px;"></td>
			<td align="left"><input name="cgreportConfigItemList[#index#].fieldTxt" maxlength="1000" type="text" class="inputxt" style="width: 120px;"></td>
			<td align="left"><el-select v-model="form.cgreportConfigItemList[#index#].SMode" placeholder="请选择"></el-select></td>
			<td align="left"><input name="cgreportConfigItemList[#index#].replaceVa" maxlength="36" type="text" class="inputxt" style="width: 120px;"></td>
			<td align="left"><input name="cgreportConfigItemList[#index#].dictCode" maxlength="36" type="text" class="inputxt" style="width: 120px;"></td>
			<td align="left"><t:dictSelect field="cgreportConfigItemList[#index#].SFlag"  extendJson="{style:'width:90px'}" type="list" typeGroupCode="yesorno" defaultVal="" hasLabel="false" title="common.isquery"></el-select></td>
		</tr>
	</tbody>
</table>
<table style="display: none">
	<tbody id="add_cgreportConfigParam_table_template">
		<tr>
		 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
		 <td align="left"><input name="cgreportConfigParamList[#index#].paramName" maxlength="32" type="text" class="inputxt"  style="width:120px;" datatype="*" ></td>
		 <td align="left"><input name="cgreportConfigParamList[#index#].paramDesc" maxlength="32" type="text" class="inputxt"  style="width:120px;" ></td>
	     <td align="left"><input name="cgreportConfigParamList[#index#].paramValue" maxlength="32" type="text" class="inputxt"  style="width:120px;" ></td>
		 <td align="left"><input name="cgreportConfigParamList[#index#].seq" maxlength="32" type="text" class="inputxt"  style="width:120px;"></td>
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
