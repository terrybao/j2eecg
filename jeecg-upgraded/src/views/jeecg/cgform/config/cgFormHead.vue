
<template>
  <div class="vue-component">
    <!-- 增加beforeSubmit页面逻辑删除-->
<el-form :model="form" ref="form" label-width="80px">
	<!-- tiptype="1" -->
	<input id="id" name="id" type="hidden" value="${cgFormHeadPage.id}">
	<input id="langurl" name="langurl" type="hidden" value="">
	<!-- add-start--Author:gengjiajia  Date:20160804 for：添加表类型隐藏域-->
	<input id="tableType" name="tableType" type="hidden" value="${cgFormHeadPage.tableType}">
	<!-- add-start--Author:gengjiajia  Date:20160804 for：添加表类型隐藏域-->
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("table.name") }}: </label></td>
			<td class="value">
			  <input class="inputxt" id="tableName" name="tableName" value="${cgFormHeadPage.tableName}"
				prefixName="" <c:if test="${not empty cgFormHeadPage.tableName}">readonly="readonly"</c:if> datatype="*" validType="cgform_head,table_Name,id" nullmsg={{ $t("please.input.table.name") }}> 
				<span class="Validform_checktip"></span>
			</td>
			<td align="right"><label class="Validform_label"> {{ $t("table.description") }}: </label></td>
			<td class="value"><input class="inputxt" id="content" name="content" value="${cgFormHeadPage.content}" datatype="s2-100" nullmsg="<t:mutiLang langKey='please.input.table.content'/>" /> <span class="Validform_checktip"></span></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("pk.strategies") }}:</label></td>
			<td class="value" id="jformPkTypeTd" <c:if test="${cgFormHeadPage.jformPkType ne 'SEQUENCE'}">colspan="3"</c:if>>
				<select id="jformPkType" name="jformPkType" onchange="jformPkTypeChange();">
					<option value="UUID" <c:if test="${cgFormHeadPage.jformPkType eq 'UUID'}"> selected='selected'</c:if>>{{ $t("common.uuid36bit") }}</option>
					<option value="NATIVE" <c:if test="${cgFormHeadPage.jformPkType eq 'NATIVE'}"> selected='selected'</c:if>>{{ $t("common.native.auto.increment") }}</option>
					<option value="SEQUENCE" <c:if test="${cgFormHeadPage.jformPkType eq 'SEQUENCE'}"> selected='selected'</c:if>>{{ $t("common.sequence") }}</option>
				</select>
			</td>
			<td align="right" id="jformPkSequenceN" <c:if test="${cgFormHeadPage.jformPkType ne 'SEQUENCE'}">style="display: none;"</c:if>><label class="Validform_label"> {{ $t("sequence.name") }}:</label></td>
			<td class="value" id="jformPkSequenceV" <c:if test="${cgFormHeadPage.jformPkType ne 'SEQUENCE'}">style="display: none;"</c:if>><input id="jformPkSequence" name="jformPkSequence" type="text"
																																				  class="inputxt" value="${cgFormHeadPage.jformPkSequence}" /> <span class="Validform_checktip"></span> <label class="Validform_label" style="display: none;"> {{ $t("sequence.name") }}:</label></td>
		</tr>
			<tr>
			<!--add-start--Author:luobaoli  Date:20150607 for：增加表单分类下拉列表-->
			<td align="right"><label class="Validform_label"> {{ $t("form.category") }}:</label></td>
			<td class="value"><select id="jformCategory" name="jformCategory">
				<c:forEach items="${typeList}" var="type">
					<option value="${type.typecode}" <c:if test="${type.typecode==cgFormHeadPage.jformCategory}">selected="selected"</c:if>>${type.typename}</option>
				</c:forEach>
			</select></td>
			<!--add-end--Author:luobaoli  Date:20150607 for：增加表单分类下拉列表-->

				<td align="right"><label class="Validform_label"> {{ $t("table.type") }}: </label></td>
				<td class="value"><select id="jformType" name="jformType" onchange="formTypeChange();">
					<option value="1" <c:if test="${cgFormHeadPage.jformType eq '1'}"> selected='selected'</c:if>>{{ $t("single.table") }}</option>
					<option value="2" <c:if test="${cgFormHeadPage.jformType eq '2'}"> selected="selected"</c:if>>{{ $t("master.table") }}</option>
					<option value="3" <c:if test="${cgFormHeadPage.jformType eq '3'}"> selected="selected"</c:if>>{{ $t("slave.table") }}</option>
				</select>
					<div id="relation_type_div" style="display: none;">
						<input type="radio" name="relationType"
							   <c:if test="${cgFormHeadPage.relationType eq '0' || cgFormHeadPage.relationType ==null }">
								   checked="checked"
							   </c:if> value="0">
							{{ $t("common.one.to.many") }}
						</input>
						<input type="radio" name="relationType"
							<c:if test="${cgFormHeadPage.relationType eq '1' }">
								checked="checked"
							</c:if> value="1">
							{{ $t("comon.one.to.one") }}
						</input> &nbsp;
						{{ $t("sequence.name") }}:<input class="inputxt" style="width: 30px" id="tabOrder" name="tabOrder" value="${cgFormHeadPage.tabOrder}" datatype="n" ignore="ignore"></div>
				</td>
		</tr>
		<tr>
			<!--add-start--Author:张忠亮  Date:20150618 for：增加表单模板选择-->
			<td align="right"><label class="Validform_label"> <t:mutiLang langKey="form.template.style_pc" />:</label></td>
			<td class="value"><select id="formTemplate" name="formTemplate" temVal="${cgFormHeadPage.formTemplate}"></select></td>
			<!--add-end--Author:张忠亮  Date:20150618 for：增加表单模板选择-->
			
			<!--add-start--Author:scott Date:20160301 for：online表单移动样式单独配置-->
			<td align="right"><label class="Validform_label"> <t:mutiLang langKey="form.template.style_mobile" />:</label></td>
			<td class="value"><select id="formTemplateMobile" name="formTemplateMobile" temVal="${cgFormHeadPage.formTemplateMobile}"></select></td>
			<!--add-start--Author:scott  Date:20160301 for：online表单移动样式单独配置-->
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("show.checkbox") }}: </label></td>
			<td class="value"><select id="isCheckbox" name="isCheckbox">
				<option value="N" <c:if test="${cgFormHeadPage.isCheckbox eq 'N'}"> selected="selected"</c:if>>{{ $t("common.no") }}</option>
				<option value="Y" <c:if test="${cgFormHeadPage.isCheckbox eq 'Y'}"> selected="selected"</c:if>>{{ $t("common.yes") }}</option>
			</select></td>
			<td align="right"><label class="Validform_label"> {{ $t("is.page") }}:</label></td>
			<td class="value"><select id="isPagination" name="isPagination">
				<option value="Y" <c:if test="${cgFormHeadPage.isPagination eq 'Y'}"> selected='selected'</c:if>>{{ $t("common.yes") }}</option>
				<option value="N" <c:if test="${cgFormHeadPage.isPagination eq 'N'}"> selected="selected"</c:if>>{{ $t("common.no") }}</option>
			</select></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("is.tree") }}: </label></td>
			<td class="value"><select id="isTree" name="isTree">
				<option value="N" <c:if test="${cgFormHeadPage.isTree eq 'N'}"> selected='selected'</c:if>>{{ $t("common.no") }}</option>
				<option value="Y" <c:if test="${cgFormHeadPage.isTree eq 'Y'}"> selected='selected'</c:if>>{{ $t("common.yes") }}</option>
			</select></td>
			<td align="right"><label class="Validform_label"> {{ $t("common.query.module") }}: </label></td>
			<td class="value"><select id="querymode" name="querymode">
				<option value="single" <c:if test="${cgFormHeadPage.querymode eq 'single'}"> selected="selected"</c:if>>{{ $t("single.query") }}</option>
				<option value="group" <c:if test="${cgFormHeadPage.querymode eq 'group'}"> selected="selected"</c:if>>{{ $t("combine.query") }}</option>
			</select></td>
		</tr>
		<c:if test="${cgFormHeadPage.jformType eq '2'}">
			<tr id="fb_tb">
				<td align="right"><label class="Validform_label">{{ $t("slave.table") }}</label></td>
				<td class="value" colspan="3"><input class="inputxt" style="width: 440px" disabled="disabled" value="${cgFormHeadPage.subTableStr}"></td>
			</tr>
		</c:if>
		<tr class="tree">
			<td align="right"><label class="Validform_label"> 树形表单父id: </label></td>
			<td class="value"><input class="inputxt" id="treeParentIdFieldName" name="treeParentIdFieldName" value="${cgFormHeadPage.treeParentIdFieldName}" datatype="s2-100"> <span class="Validform_checktip"></span></td>
			<td align="right"><label class="Validform_label"> 树开表单列: </label></td>
			<td class="value"><input class="inputxt" id="treeFieldname" name="treeFieldname" value="${cgFormHeadPage.treeFieldname}" datatype="s2-100"> <span class="Validform_checktip"></span></td>
		</tr>
		<tr style="display:none;">
			<td align="right"><label class="Validform_label"> idField: </label></td>
			<td class="value"><input class="inputxt" id="treeIdFieldname" name="treeIdFieldname" value="id" datatype="s2-100"> <span class="Validform_checktip"></span></td>
		
		</tr>
	</table>
  <div id="tabs" class="easyui-tabs" tabPosition="top" fit="false" style="margin: 0px; padding: 0px; overflow: hidden; width: auto;">
    <div title= '{{ $t("database.property") }}' width="auto" style="width: auto; margin: 0px; padding: 0px; overflow: hidden;">
      <!-- add-start--Author:gengjiajia  Date:20160804 for：如果表类型是“配置表”，则online表单配置不可修改，禁止添加，删除，按钮-->
      <c:if test="${cgFormHeadPage.tableType != '1'}">
	      <div style="height: 25px;" class="datagrid-toolbar"><a id="addColumnBtn" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="addColumnBtnClick();" href="#">{{ $t("common.add.to") }}</a> <a
			id="delColumnBtn" class="easyui-linkbutton" data-options="iconCls:'icon-remove'" onclick="delColumnBtnClick();" href="#">{{ $t("common.delete") }}</a></div>
      </c:if>
      <!-- add-end--Author:gengjiajia  Date:20160804 for：如果表类型是“配置表”，则online表单配置不可修改，禁止添加，删除，按钮-->
      <table id="tab_div_database_title" class="table-list" style="height: 25px;">
      </table>
      <div class="t_table" id="t_table_database">
        <table id="tab_div_database" class="table-list">
        </table>
        <br><br><br>
		  <div  style="height: 43px"></div>
      </div>
    </div>
    <div title='{{ $t("page.property") }}' style="overflow: hidden;">
      <table id="tab_div_page_title" class="table-list" style="height: 25px;">
      </table>
      <div class="t_table" id="t_table_page">
        <table id="tab_div_page" class="table-list">
        </table>
        <br><br><br>
      </div>
    </div>
    <div title='{{ $t("validate.dict") }}' style="overflow: hidden;">
      <table id="tab_div_check_title" class="table-list" style="height: 25px;">
      </table>
      <div class="t_table" id="t_table_check">
        <table id="tab_div_check" class="table-list">
        </table>
        <br><br><br>
      </div>
    </div>
    <div title='{{ $t("common.fk") }}' style="overflow: hidden;">
      <table id="tab_div_key_title" class="table-list" style="height: 25px;">
      </table>
      <div class="t_table" id="t_table_key">
        <table id="tab_div_key" class="table-list">
        </table>
        <br><br><br>
      </div>
    </div>
    <!--  add-start author： wangkun  date:20160611 for: TASK #1090 【online】online表单缺少索引配置 代码修改痕迹-->
	<div title='{{ $t("common.index") }}' style="overflow: hidden;">
	  <div style="height: 25px;" class="datagrid-toolbar">
	  	<a id="addColumnBtn1" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="addIndexBtnClick();" href="#">{{ $t("common.add.to") }}</a> 
	  	<a id="delColumnBtn1" class="easyui-linkbutton" data-options="iconCls:'icon-remove'" onclick="delIndexBtnClick();" href="#">{{ $t("common.delete") }}</a>
	  </div>
	  <table id="tab_div_index_title" class="table-list" style="height: 25px;">
	  </table>
	  <div class="t_table" id="t_table_index">
		  <table id="tab_div_index" class="table-list">

		  </table>
		  <br><br><br>
	  </div>
	</div>
	<!--  add-end author： wangkun  date:20160611 for: TASK #1090 【online】online表单缺少索引配置 代码修改痕迹-->
  </div>
</el-form>

<iframe id="iframe_check" name="iframe_check" src="plug-in/cgform/fields/cgformOfCheck.html" style="display: none"></iframe>
<iframe id="iframe_database" src="plug-in/cgform/fields/cgformOfDatabase.html" style="display: none"></iframe>
<iframe id="iframe_key" src="plug-in/cgform/fields/cgformOfForeignKey.html" style="display: none"></iframe>
<iframe id="iframe_page" src="plug-in/cgform/fields/cgformOfPage.html" style="display: none"></iframe>
<!--  add-start author： wangkun  date:20160611 for: TASK #1090 【online】online表单缺少索引配置 代码修改痕迹-->
<iframe id="iframe_index" src="plug-in/cgform/fields/cgformOfIndex.html" style="display: none"></iframe>
<!--  add-end author： wangkun  date:20160611 for: TASK #1090 【online】online表单缺少索引配置 代码修改痕迹-->
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
