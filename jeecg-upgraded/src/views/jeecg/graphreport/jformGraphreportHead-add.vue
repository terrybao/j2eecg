
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
					<input id="id" name="id" type="hidden" value="${jformGraphreportHeadPage.id }">
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right">
				<label class="Validform_label">名称:</label>
			</td>
			<td class="value">
		     	 <input id="name" name="name" type="text" style="width: 150px" class="inputxt"datatype="*">
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">名称</label>
			</td>
			<td align="right">
				<label class="Validform_label">编码:</label>
			</td>
			<td class="value">
		     	 <input id="code" name="code" type="text" style="width: 150px" class="inputxt"datatype="*">
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">编码</label>
			</td>
		</tr>

		<tr>
			<td align="right">
				<label class="Validform_label">描述:</label>
			</td>
			<td class="value">
				<input id="content" name="content" type="text" style="width: 150px" class="inputxt" />
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">描述</label>
			</td>
			<td align="right">
				<label class="Validform_label">y轴文字:</label>
			</td>
			<td class="value">
				<input id="ytext" name="ytext" type="text" style="width: 150px" class="inputxt" datatype="*">
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">y轴文字</label>
			</td>

		</tr>
		<tr>

			<td align="right">
				<label class="Validform_label">x轴数据:</label>
			</td>
			<td class="value">
		     	 <input id="categories" name="categories" type="text" style="width: 150px" class="inputxt" datatype="*">
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">x轴数据</label>
			</td>
			<td align="right">
				<label class="Validform_label">是否显示明细:</label>
			</td>
			<td class="value">
				<el-select v-model="form.jformGraphreportItemList[#index#].fieldType" placeholder="请选择"></el-select>     
					  <label class="Validform_label" style="display: none;">字段类型</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="jformGraphreportItemList[#index#].isShow" type="list" extendJson="{style:'width:100px'}"
										typeGroupCode="sf_yn" defaultVal="" hasLabel="false"  title="是否显示"></el-select>     
					  <label class="Validform_label" style="display: none;">是否显示</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="jformGraphreportItemList[#index#].searchFlag" type="list" extendJson="{style:'width:100px'}"
										typeGroupCode="sf_yn" defaultVal="" hasLabel="false"  title="是否查询"></el-select>     
					  <label class="Validform_label" style="display: none;">是否查询</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="jformGraphreportItemList[#index#].searchMode" type="list" extendJson="{style:'width:100px'}"
										typeGroupCode="searchmode" defaultVal="" hasLabel="false"  title="查询模式"></el-select>     
					  <label class="Validform_label" style="display: none;">查询模式</label>
				  </td>
				  <td align="left">
					  	<input name="jformGraphreportItemList[#index#].dictCode" maxlength="500" 
					  		type="text" class="inputxt"  style="width:120px;"/>
					  <label class="Validform_label" style="display: none;">字典Code</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="jformGraphreportItemList[#index#].isGraph" type="list" extendJson="{style:'width:100px'}"
										typeGroupCode="sf_yn" defaultVal="" hasLabel="false"  title="显示图表"></el-select>     
					  <label class="Validform_label" style="display: none;">显示图表</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="jformGraphreportItemList[#index#].graphType" type="list" extendJson="{style:'width:100px'}"
										typeGroupCode="tblx" defaultVal="" hasLabel="false"  title="图表类型"></el-select>     
					  <label class="Validform_label" style="display: none;">图表类型</label>
				  </td>
				  <td align="left">
					  	<input name="jformGraphreportItemList[#index#].graphName" maxlength="100" 
					  		type="text" class="inputxt"  style="width:120px;"/>
					  <label class="Validform_label" style="display: none;">图表名称</label>
				  </td>
				  <td align="left">
					  	<input name="jformGraphreportItemList[#index#].tabName" maxlength="50" 
					  		type="text" class="inputxt"  style="width:120px;"/>
					  <label class="Validform_label" style="display: none;">标签名称</label>
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
