
<template>
  <div class="vue-component">
    <div style="padding: 3px; height: 25px;width:auto;" class="datagrid-toolbar">
	<a id="addJformOrderCustomerBtn" href="#">添加</a> <a id="delJformOrderCustomerBtn" href="#">删除</a> 
</div>
<table border="0" cellpadding="2" cellspacing="0" id="jformOrderCustomer_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">序号</td>
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">操作</td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						客户名
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						单价
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						性别
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						电话
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						身份证扫描件
				  </td>
	</tr>
	<tbody id="add_jformOrderCustomer_table">
	<c:if test="${fn:length(jformOrderCustomerList)  <= 0 }">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">1</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
					<input name="jformOrderCustomerList[0].id" type="hidden"/>
					<input name="jformOrderCustomerList[0].fkId" type="hidden"/>
				  <td align="left">
					       	<input name="jformOrderCustomerList[0].name" maxlength="100" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  >
					  <label class="Validform_label" style="display: none;">客户名</label>
					</td>
				  <td align="left">
					  	<input name="jformOrderCustomerList[0].money" maxlength="10" type="text" class="inputxt"  style="width:120px;"  datatype="d"  ignore="ignore" >
					  <label class="Validform_label" style="display: none;">单价</label>
					</td>
				  <td align="left">
							<el-select v-model="form.jformOrderCustomerList[${stuts.index }].sex" placeholder="请选择"></el-select>     
					  <label class="Validform_label" style="display: none;">性别</label>
				   </td>
				   <td align="left">
					  	<input name="jformOrderCustomerList[${stuts.index }].telphone" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore"  value="${poVal.telphone }"/>
					  <label class="Validform_label" style="display: none;">电话</label>
				   </td>
				   <td align="left">
					        <input type="hidden" id="jformOrderCustomerList[${stuts.index }].sfPic" name="jformOrderCustomerList[${stuts.index }].sfPic"  value="${poVal.sfPic }"/>
									   <input class="ui-button" type="button" value="上传附件"
													onclick="commonUpload(commonUploadDefaultCallBack,'jformOrderCustomerList\\[${stuts.index }\\]\\.sfPic')"/> 
										<c:if test="${!empty poVal.sfPic}">
											<a  href="${poVal.sfPic}"  target="_blank" id="jformOrderCustomerList[${stuts.index }].sfPic_href">下载</a>
										</c:if>
					  <label class="Validform_label" style="display: none;">身份证扫描件</label>
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
