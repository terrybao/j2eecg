
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${cgFormHeadPage.id}">
	<input id="tableName" name="tableName" type="hidden" value="${cgFormHeadPage.tableName}">
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right"><label class="Validform_label">代码生成目录: </label></td>
			<td class="value"><input type="text" class="inputxt" name="projectPath" value="${projectPath }" id="projectPath" datatype="*" /> <a href="#" id="openFoldSelect" class="easyui-linkbutton"
				icon="icon-search" onclick="openFolder('projectPath')">浏览</a></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label">代码分层样式: </label></td>
			<td class="value"><select name="packageStyle">
				<option value="service">业务分层</option>
				<option value="project">代码分层</option>
			</select></td>
		</tr>
		<tr>
			<td align="right" width="20%"><label class="Validform_label">数据模型: </label></td>
			<td class="value"><select id="jformType" disabled="disabled" name="jformType">
				<option value="1" <c:if test="${cgFormHeadPage.jformType eq '1' || cgFormHeadPage.jformType eq '3'}"> selected='selected'</c:if>>单表</option>
				<option value="2" <c:if test="${cgFormHeadPage.jformType eq '2'}"> selected="selected"</c:if>>一对多/一对一</option>
			</select></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 主表名: </label></td>
			<td class="value" colspan="3"><input disabled="disabled" class="inputxt" id="tableName_tmp" name="tableName_tmp" value="${cgFormHeadPage.tableName}" datatype="*"> <span
				class="Validform_checktip"></span>
				<div style="display:inline-block">
					<span>树形列表: </span>
					<input disabled type="radio" name="supportTree" <c:if test="${cgFormHeadPage.isTree eq 'Y'}">checked="checked"</c:if> value="1"/>是
					<input disabled type="radio" name="supportTree" <c:if test="${cgFormHeadPage.isTree eq 'N'}">checked="checked"</c:if> value="0"/>否
				</div>
			</td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 主表实体名(首字母大写): </label></td>
			<td class="value"><input class="inputxt" id="entityName" name="entityName" datatype="*" value="${entityNames[cgFormHeadPage.tableName]}"> <span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 功能说明: </label></td>
			<td class="value" colspan="3"><input class="inputxt" id="ftlDescription" name="ftlDescription" value="${cgFormHeadPage.content}" datatype="*"> <span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label">主包名(小写): </label></td>
			<td class="value"><input class="inputxt" id="entityPackage" name="entityPackage" datatype="*"> <span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 模板类型: </label></td>
			<td class="value" colspan="3">
			<input type = "radio"   name="version" datatype="*" checked="checked" value="ext" >老版本模板(IE8+/不支持移动/标签列表)
			<input type = "radio"   name="version" value="ext-common" >新一代模板(IE10+/移动支持/Bootstrap/Vue/支持原生态列表)
			<span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 是否支持Restful: </label></td>
			<td class="value" colspan="3">
			<input type = "radio" name="supportRestful" value="1"/>是
			<input type = "radio" name="supportRestful" checked="checked" value="0"/>否
			</td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 页面风格: </label></td>
			<td class="value">
			<select id="jspMode" name="jspMode" style="width: 300px" datatype="*">
		     		<c:forEach items="${jspModeList }" var="style">
			     	 <option value="${style.code }" >${style.desc }</option>
			     	</c:forEach>
		     </select>
		     </td>
		</tr>
	</table>
	<table>
		<tr>
			<td><label class="Validform_label">子表信息</label></td>
		</tr>
	</table>
	<table cellpadding="0" cellspacing="1" class="formtable">
		<c:forEach items="${subTableList}" var="column" varStatus="columIndex">
			<tr>
				<td align="right">子表名:</td>
				<td class="value" colspan="3"><input readonly="readonly" class="inputxt" id="subTabParamIn[${columIndex.index}].tableName" name="subTabParamIn[${columIndex.index}].tableName"
					value="${column.tableName}" datatype="*"> <span class="Validform_checktip"></span></td>

				<td align="right">子表实体(首字母大写):</td>
				<td class="value" colspan="3"><input class="inputxt" id="subTabParamIn[${columIndex.index}].entityName" name="subTabParamIn[${columIndex.index}].entityName"
					value="${entityNames[column.tableName]}" datatype="*"> <span class="Validform_checktip"></span></td>

				<td align="right">功能说明:</td>
				<td class="value" colspan="3"><input class="inputxt" id="subTabParamIn[${columIndex.index}].ftlDescription" name="subTabParamIn[${columIndex.index}].ftlDescription" datatype="*"> <span
					class="Validform_checktip"></span></td>

				<td align="right">子包名(小写):</td>
				<td class="value" colspan="3"><input class="inputxt" id="subTabParamIn[${columIndex.index}].entityPackage" name="subTabParamIn[${columIndex.index}].entityPackage" datatype="*"> <span
					class="Validform_checktip"></span></td>

			</tr>
		</c:forEach>
	</table>
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
