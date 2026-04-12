
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
					<input id="id" name="id" type="hidden" value="${superQueryMainPage.id }"/>
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right">
				<label class="Validform_label">查询规则名称:</label>
			</td>
			<td class="value">
		     	 <input id="queryName" name="queryName" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${superQueryMainPage.queryName}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">查询规则名称</label>
			</td>
			<td align="right">
				<label class="Validform_label">查询规则编码:</label>
			</td>
			<td class="value">
		     	 <input id="queryCode" name="queryCode" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${superQueryMainPage.queryCode}' validType="super_query_main,query_code,id"/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">查询规则编码</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">查询类型:</label>
			</td>
			<td class="value">
					 <el-select v-model="form.superQueryFieldList[#index#].ctype" placeholder="请选择"></el-select>     
					  <label class="Validform_label" style="display: none;">字段类型</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="superQueryFieldList[#index#].stype" type="list"   typeGroupCode="s_type"  defaultVal="" hasLabel="false"  title="控件类型" datatype="*"></el-select>     
					  <label class="Validform_label" style="display: none;">控件类型</label>
				  </td>
				  <td align="left">
					  		<input name="superQueryFieldList[#index#].dictTable" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">字典Table</label>
				  </td>
				  <td align="left">
					  		<input name="superQueryFieldList[#index#].dictCode" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">字典Code</label>
				  </td>
				  <td align="left">
					  		<input name="superQueryFieldList[#index#].dictText" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">字典Text</label>
				  </td>
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
