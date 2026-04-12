
<template>
  <div class="vue-component">
    <div style="padding: 3px; height: 25px;width:auto;" class="datagrid-toolbar">
	<a id="addSuperQueryFieldBtn" href="#">添加</a> <a id="delSuperQueryFieldBtn" href="#">删除</a> 
</div>
<table border="0" cellpadding="2" cellspacing="0" id="superQueryField_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">序号</td>
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">操作</td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 60px;">
						序号
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 180px;">
						表名
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						字段名
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						字段文本
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						字段类型
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						控件类型
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						字典Table
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						字典Code
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						字典Text
				  </td>
	</tr>
	<tbody id="add_superQueryField_table">
	<c:if test="${fn:length(superQueryFieldList)  <= 0 }">
			<tr data-index="0">
				<td align="center"><div style="width: 25px;" name="xh">1</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
					<input name="superQueryFieldList[0].id" type="hidden"/>
					<input name="superQueryFieldList[0].createName" type="hidden"/>
					<input name="superQueryFieldList[0].createBy" type="hidden"/>
					<input name="superQueryFieldList[0].createDate" type="hidden"/>
					<input name="superQueryFieldList[0].updateName" type="hidden"/>
					<input name="superQueryFieldList[0].updateBy" type="hidden"/>
					<input name="superQueryFieldList[0].updateDate" type="hidden"/>
					<input name="superQueryFieldList[0].sysOrgCode" type="hidden"/>
					<input name="superQueryFieldList[0].sysCompanyCode" type="hidden"/>
					<input name="superQueryFieldList[0].mainId" type="hidden"/>
				  <td align="left">
					  	<input name="superQueryFieldList[0].seq" maxlength="32" type="text" class="inputxt" datatype="*"  style="width:60px;" />
					  <label class="Validform_label" style="display: none;">序号</label>
					</td>
				  <td align="left">
							<select  name="superQueryFieldList[0].tableName" class="fieldTableList4" datatype="*" style="width:180px">  
							<option value=""></option>
                            </select> 
					  <label class="Validform_label" style="display: none;">表名</label>
					</td>
				  <td align="left">
					  	<input name="superQueryFieldList[0].name" maxlength="32" type="text" class="inputxt"  style="width:120px;"   datatype="*">
					  <label class="Validform_label" style="display: none;">字段名</label>
					</td>
				  <td align="left">
					  	<input name="superQueryFieldList[0].txt" maxlength="32" type="text" class="inputxt"  style="width:120px;"   datatype="*"/>
					  <label class="Validform_label" style="display: none;">字段文本</label>
					</td>
				  <td align="left">
							<el-select v-model="form.superQueryFieldList[${stuts.index }].ctype" placeholder="请选择"></el-select>     
					  <label class="Validform_label" style="display: none;">字段类型</label>
				   </td>
				   <td align="left">
							<t:dictSelect field="superQueryFieldList[${stuts.index }].stype" type="list"   typeGroupCode="s_type"  defaultVal="${poVal.stype }" hasLabel="false"  title="控件类型"></el-select>     
					  <label class="Validform_label" style="display: none;">控件类型</label>
				   </td>
				   <td align="left">
					  	<input name="superQueryFieldList[${stuts.index }].dictTable" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.dictTable }"/>
					  <label class="Validform_label" style="display: none;">字典Table</label>
				   </td>
				   <td align="left">
					  	<input name="superQueryFieldList[${stuts.index }].dictCode" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.dictCode }"/>
					  <label class="Validform_label" style="display: none;">字典Code</label>
				   </td>
				   <td align="left">
					  	<input name="superQueryFieldList[${stuts.index }].dictText" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.dictText }"/>
					  <label class="Validform_label" style="display: none;">字典Text</label>
				   </td>
   			</tr>
		</c:forEach>
	</c:if>	
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
