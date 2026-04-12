
<template>
  <div class="vue-component">
    <form id="formobj" action="jformOrderMain2Controller.do?${empty mainId?'doAdd':'doUpdate'}" name="formobj" method="post">
  			<input type="hidden" id="btn_sub" class="btn_sub"/>
			<input name="id" type="hidden" value="${mainId}">
			
			<div id="jform_tab" class="tab-wrapper">
	
				<!-- tab -->
				<ul class="nav nav-tabs">
					<li role="presentation" tab-ajax-url="jformOrderMain2Controller.do?mainPage&id=${mainId}&load=${load}">
						<a href="#con-wrapper0">订单主信息</a>
					</li>
						<li role="presentation" tab-ajax-url="jformOrderMain2Controller.do?jformOrderTicket2List&id=${mainId}">
							<a href="#con-wrapper1">订单机票信息</a>
						</li>
						<li role="presentation" tab-ajax-url="jformOrderMain2Controller.do?jformOrderCustomer2List&id=${mainId}">
							<a href="#con-wrapper2">订单客户信息</a>
						</li>
					
					
				</ul>
				
				 <div class="con-wrapper" id="con-wrapper0" style="display: none;"></div>
					<div class="con-wrapper" id="con-wrapper1" style="display: none;"></div>
					<div class="con-wrapper" id="con-wrapper2" style="display: none;"></div>
			</div>	
			

		<div align="center"  id = "sub_tr" style="display: none;" > <input type="button" value="提交" onclick="neibuClick();" class="ui_state_highlight"></div>
		
		
		
		</form>
		<!-- 添加 产品明细 模版 -->
		<table style="display:none">
			<tbody id="add_jformOrderTicket2_table_template">
				<tr>
					 <td><input style="width:20px;" type="checkbox" name="ck"/></td>
					 <td scope="row"><div name="xh"></div></td>
						  <td align="left">
											<input name="jformOrderTicket2List[#index#].ticketCode" maxlength="100"  datatype="*"  ignore="checked"  type="text" class="form-control"  style="width:120px;" />
						  </td>
						  <td align="left">
											<input name="jformOrderTicket2List[#index#].tickectDate" maxlength="10" type="text"  class="form-control" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="background: url('plug-in/ace/images/datetime.png') no-repeat scroll right center transparent;width:120px;" datatype="*"  ignore="checked" />
						  </td>
					</tr>
				 </tbody>
			<tbody id="add_jformOrderCustomer2_table_template">
				<tr>
					 <td><input style="width:20px;" type="checkbox" name="ck"/></td>
					 <td scope="row"><div name="xh"></div></td>
						  <td align="left">
											<input name="jformOrderCustomer2List[#index#].name" maxlength="32"  ignore="ignore"  type="text" class="form-control"  style="width:120px;" />
						  </td>
						  <td align="left">
											<input name="jformOrderCustomer2List[#index#].money" maxlength="10"  datatype="/^(-?\d+)(\.\d+)?$/"  ignore="ignore"  type="text" class="form-control"  style="width:120px;" />
						  </td>
						  <td align="left">
											<t:dictSelect field="jformOrderCustomer2List[#index#].sex" type="list" extendJson="{class:'form-control',style:'width:150px'}"   typeGroupCode="sex"  defaultVal="" hasLabel="false"  title="性别"></el-select>     
						  </td>
						  <td align="left">
											<input name="jformOrderCustomer2List[#index#].telphone" maxlength="32"  ignore="ignore"  type="text" class="form-control"  style="width:120px;" />
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
