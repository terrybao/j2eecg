
<template>
  <div class="vue-component">
    <div style="padding: 3px; height: 25px;width:auto;" class="datagrid-toolbar">
	<a id="addSuperQueryTableBtn" href="#">添加</a> <a id="delSuperQueryTableBtn" href="#">删除</a> 
</div>
<table border="0" cellpadding="2" cellspacing="0" id="superQueryTable_table">
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
						说明
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						是否是主表
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						外键字段
				  </td>
	</tr>
	<tbody id="add_superQueryTable_table">
	<c:if test="${fn:length(superQueryTableList)  <= 0 }">
			<tr data-index="0">
				<td align="center"><div style="width: 25px;" name="xh">1</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
					<input name="superQueryTableList[0].id" type="hidden"/>
					<input name="superQueryTableList[0].createName" type="hidden"/>
					<input name="superQueryTableList[0].createBy" type="hidden"/>
					<input name="superQueryTableList[0].createDate" type="hidden"/>
					<input name="superQueryTableList[0].updateName" type="hidden"/>
					<input name="superQueryTableList[0].updateBy" type="hidden"/>
					<input name="superQueryTableList[0].updateDate" type="hidden"/>
					<input name="superQueryTableList[0].sysOrgCode" type="hidden"/>
					<input name="superQueryTableList[0].sysCompanyCode" type="hidden"/>
					<input name="superQueryTableList[0].mainId" type="hidden"/>
				  <td align="left">
					  	<input name="superQueryTableList[0].seq" maxlength="32" type="text" class="inputxt" datatype="*" style="width:60px;" >
					  <label class="Validform_label" style="display: none;">序号</label>
					</td>
				  <td align="left">
					  	<input onchange="myFunction()" name="superQueryTableList[0].tableName" maxlength="32" type="text" class="inputxt tableList"  style="width:180px;" datatype="*">
					  <label class="Validform_label" style="display: none;">表名</label>
					</td>
				  <td align="left">
					  	<input   name="superQueryTableList[0].instruction" maxlength="32" type="text" class="inputxt"  style="width:120px;" datatype="*">
					  <label class="Validform_label" style="display: none;">说明</label>
					</td>
				  <td align="left">
							    
							是 <input  class="ismain" name="superQueryTableList[0].isMain" type="radio" value="Y" datatype="*" checked="checked" readonly="readonly" />&nbsp;
							否<input  class="ismain" name="superQueryTableList[0].isMain" type="radio" value="N" disabled="disabled"  /> 
					  <label class="Validform_label" style="display: none;">是否是主表</label>
					</td>
				  <td align="left">
					  	<input name="superQueryTableList[0].fkField" maxlength="32" type="text" class="inputxt"  style="width:120px;"  >
					  <label class="Validform_label" style="display: none;">外键字段</label>
					</td>
   			</tr>
	</c:if>
	<c:if test="${fn:length(superQueryTableList)  > 0 }">
		<c:forEach items="${superQueryTableList}" var="poVal" varStatus="stuts">
			<tr data-index="${stuts.index }">
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
						<input name="superQueryTableList[${stuts.index }].id" type="hidden" value="${poVal.id }"/>
						<input name="superQueryTableList[${stuts.index }].createName" type="hidden" value="${poVal.createName }"/>
						<input name="superQueryTableList[${stuts.index }].createBy" type="hidden" value="${poVal.createBy }"/>
						<input name="superQueryTableList[${stuts.index }].createDate" type="hidden" value="${poVal.createDate }"/>
						<input name="superQueryTableList[${stuts.index }].updateName" type="hidden" value="${poVal.updateName }"/>
						<input name="superQueryTableList[${stuts.index }].updateBy" type="hidden" value="${poVal.updateBy }"/>
						<input name="superQueryTableList[${stuts.index }].updateDate" type="hidden" value="${poVal.updateDate }"/>
						<input name="superQueryTableList[${stuts.index }].sysOrgCode" type="hidden" value="${poVal.sysOrgCode }"/>
						<input name="superQueryTableList[${stuts.index }].sysCompanyCode" type="hidden" value="${poVal.sysCompanyCode }"/>
						<input name="superQueryTableList[${stuts.index }].mainId" type="hidden" value="${poVal.mainId }"/>
				   <td align="left">
					  	<input name="superQueryTableList[${stuts.index }].seq" maxlength="32" type="text" class="inputxt"  style="width:60px;"  ignore="ignore"  value="${poVal.seq }"/>
					  <label class="Validform_label" style="display: none;">序号</label>
				   </td>
				   <td align="left">
					  	<input onchange="myUpdateFunction()"  name="superQueryTableList[${stuts.index }].tableName" maxlength="32" type="text" class="inputxt tableList"  style="width:180px;"  ignore="ignore"  value="${poVal.tableName }"/>
					  <label class="Validform_label" style="display: none;">表名</label>
				   </td>
				   <td align="left">
					  	<input   name="superQueryTableList[${stuts.index }].instruction" maxlength="32" type="text" class="inputxt "  style="width:120px;"    value="${poVal.instruction }"/>
					  <label class="Validform_label" style="display: none;">说明</label>
				   </td>
				   <td align="left">
							     
							<c:set var ="ismain" value="${poVal.isMain}"></c:set>
							<c:choose>
								<c:when test="${ismain=='Y' }">
									
							是 <input class="ismain" name="superQueryTableList[${stuts.index}].isMain" type="radio" value="Y" checked="checked" readonly="readonly"  />&nbsp;
							否<input class="ismain" name="superQueryTableList[${stuts.index}].isMain" type="radio" value="N" disabled="disabled"  />
							
								</c:when>
								<c:otherwise>
							是 <input class="ismain" name="superQueryTableList[${stuts.index}].isMain" type="radio" value="Y" disabled="disabled" />&nbsp;
							否<input class="ismain" name="superQueryTableList[${stuts.index}].isMain" type="radio" value="N" checked="checked" readonly="readonly" />
								</c:otherwise>
							</c:choose>
							
					  <label class="Validform_label" style="display: none;">是否是主表</label>
				   </td>
				   <td align="left">
					  	<input   name="superQueryTableList[${stuts.index }].fkField" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.fkField }"/>
					  <label class="Validform_label" style="display: none;">外键字段</label>
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
