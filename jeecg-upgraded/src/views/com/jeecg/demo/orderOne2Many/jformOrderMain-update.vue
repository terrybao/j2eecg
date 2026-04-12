
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
					<input id="id" name="id" type="hidden" value="${jformOrderMainPage.id }"/>
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right">
				<label class="Validform_label">订单号:</label>
			</td>
			<td class="value">
		     	 <input id="orderCode" name="orderCode" type="text" style="width: 150px" class="inputxt"  datatype="*"  ignore="checked"  value='${jformOrderMainPage.orderCode}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">订单号</label>
			</td>
			<td align="right">
				<label class="Validform_label">订单日期:</label>
			</td>
			<td class="value">
					  <input id="orderDate" name="orderDate" type="text" style="width: 150px"   ignore="ignore"  value='<fmt:formatDate value='${jformOrderMainPage.orderDate}' type="date" pattern="yyyy-MM-dd"/>'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">订单日期</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">订单金额:</label>
			</td>
			<td class="value">
		     	 <input id="orderMoney" name="orderMoney" type="text" style="width: 150px" class="inputxt"  datatype="d"  ignore="ignore"  value='${jformOrderMainPage.orderMoney}'/>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">订单金额</label>
			</td>
			<td align="right">
				<label class="Validform_label">备注:</label>
			</td>
			<td class="value">
					<table id="content_fileTable"></table>
						<table></table>
						
						<span id="file_uploadspan"><input type="file" name="content" id="content" /></span> 
						<div class="form" id="filediv_content"></div>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">备注</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">订单扫描件:</label>
			</td>
			<td class="value" colspan="3">
					<table id="ctype_fileTable"></table>
						<table></table>
						
						<span id="file_uploadspan"><input type="file" name="ctype" id="ctype" /></span> 
						<div class="form" id="filediv_ctype"></div>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">订单扫描件</label>
			</td>
		</tr>
	
			</table>
			<div style="width: auto;height: 200px;">
				
				<div style="width:800px;height:1px;"></div>
				<t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
				 <t:tab href="jformOrderMainController.do?jformOrderCustomerList&id=${jformOrderMainPage.id}" icon="icon-add" title="订单客户" id="jformOrderCustomer"></t:tab>
				 <t:tab href="jformOrderMainController.do?jformOrderTicketList&id=${jformOrderMainPage.id}" icon="icon-edit" title="订单机票" id="jformOrderTicket"></t:tab>
				</t:tabs>
			</div>
			</el-form>
			<!-- 添加 附表明细 模版 -->
		<table style="display:none">
		<tbody id="add_jformOrderCustomer_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
					       	<input name="jformOrderCustomerList[#index#].name" maxlength="100" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">客户名</label>
				  </td>
				  <td align="left">
					  		<input name="jformOrderCustomerList[#index#].money" maxlength="10" type="text" class="inputxt"  style="width:120px;"  datatype="d"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">单价</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="jformOrderCustomerList[#index#].sex" type="radio"  datatype="*"   typeGroupCode="sex"  defaultVal="" hasLabel="false"  title="性别"></el-select>     
					  <label class="Validform_label" style="display: none;">性别</label>
				  </td>
				  <td align="left">
					  		<input name="jformOrderCustomerList[#index#].telphone" maxlength="32" type="text" class="inputxt"  style="width:120px;"  ignore="ignore" />
					  <label class="Validform_label" style="display: none;">电话</label>
				  </td>
				  <td align="left">
										<input type="hidden" id="jformOrderCustomerList[#index#].sfPic" name="jformOrderCustomerList[#index#].sfPic" />
									   <input class="ui-button" type="button" value="上传附件"
													onclick="commonUpload(commonUploadDefaultCallBack,'jformOrderCustomerList\\[#index#\\]\\.sfPic')"/>
					  <label class="Validform_label" style="display: none;">身份证扫描件</label>
				  </td>
			</tr>
		 </tbody>
		<tbody id="add_jformOrderTicket_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
					  		<input name="jformOrderTicketList[#index#].ticketCode" maxlength="100" type="text" class="inputxt"  style="width:120px;"  datatype="*"  ignore="checked" />
					  <label class="Validform_label" style="display: none;">航班号</label>
				  </td>
				  <td align="left">
					      	<input name="jformOrderTicketList[#index#].tickectDate" maxlength="10"  ignore="ignore"  type="text"  class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width:140px;" />
					  <label class="Validform_label" style="display: none;">航班时间</label>
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
