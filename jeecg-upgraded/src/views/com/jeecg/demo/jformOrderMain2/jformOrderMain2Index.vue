
<template>
  <div class="vue-component">
    <div class="easyui-layout" fit="true">
<div region="center" style="padding:0px;border:1px;overflow-x:hidden;">
	<div class="tab-opts-menu" id="tab-menus-main" style="font-size:14px">
		<div class="opts-menu-box">
			<div class="menus active table-menu-1" style="top:30px">
				<!-- 主表菜单 -->
				<t:menuButtons codes="addSingle,editSingle,batchDel,save,reject" name="jformOrderMain2" mm="true"></t:menuButtons>
			</div>
			<div class="menus table-menu-0" style="top:-1px">
				<a title="重置" onclick="mainPageQueryReset()" href="####" class="btn-menu fa fa-refresh menu-more" ></a>
				<a title="查询" onclick="associatedQuery('jformOrderMain2','jformOrderMain2List')" href="####" class="btn-menu fa fa-search menu-more"></a>
			</div>
		</div>
	</div> 

  	<!-- 上方 -->
	<div  id="accDiv" class="easyui-accordion" data-options="multiple:true" style="padding-right:0px;overflow-x:hidden;box-sizing: border-box;">
		<div title="订单信息查询" data-options="iconCls:'icon-ok'" style="height:100px;padding:10px 0px;overflow:hidden;box-sizing: border-box;">
		  <!-- 查询DIV 主表必须配置有高级查询才可用 -->
		  <div id="associated_query" style="">
			  <form class = "page-query">
			  	<span style="max-width: 83%;display: inline-block;display:-moz-inline-box;">
					<span style="display:-moz-inline-box;display:inline-block;margin-bottom:2px;text-align:justify;">
						<span style="vertical-align:middle;display:-moz-inline-box;display:inline-block;width: 90px;text-align:right;text-overflow:ellipsis;-o-text-overflow:ellipsis; overflow: hidden;white-space:nowrap;" >
							订单号：
						</span>
						<input type="text" name="jform_order_main.order_code" style="width: 120px" class="inuptxt">
					</span>
				</span>
			  </form>
		  </div>
		</div>
		
		<!-- 主表 --> 
		<div title="订单信息" data-options="iconCls:'icon-ok',selected:true"  >
			<div id="easyui_mainList" class="resize-y-iframe" style="height:286px;padding-bottom:6px;">
				<iframe id="mainList" height="99%" width="100%" frameborder="0" 
					src="${webRoot}/jformOrderMain2Controller.do?list"></iframe>
			</div>
		</div>
	</div>
	<!-- 上方end -->
		
	<!-- 从表菜单 -->
	<div class="tab-opts-menu" id="tab-menus-attached" style="font-size:14px">
		<div class="opts-menu-box">
			<div class="menus testContractItem-ul active">
				<t:menuButtons codes="addSingle,editSingle,batchDel,save,reject,template,importe,export,filter" name="jformOrderCustomer2"></t:menuButtons>
			</div>
			
			<div class="menus testContractPart-ul">
				<t:menuButtons codes="addSingle,editSingle,batchDel,save,reject,template,importe,export,filter" name="jformOrderTicket2"></t:menuButtons>
			</div>
		</div>
	 </div>
	 
	 <!-- 从表 -->
	 <div id="tabsok" style="height:500px">
	     <div title="订单客户" data-options="closable:false" style="overflow:hidden;box-sizing: border-box;">
			<iframe id="jformOrderCustomer2Iframe" scrolling="yes" frameborder="0" height="100%" width="100%"
				src="${webRoot}/jformOrderCustomer2Controller.do?list">
			</iframe>
		 </div>
		 <div title="订单机票" data-options="closable:false" style="overflow:hidden;box-sizing: border-box;">
			<iframe id="jformOrderTicket2Iframe" scrolling="yes" frameborder="0" height="100%" width="100%"
				src="${webRoot}/jformOrderTicket2Controller.do?list">
			</iframe>
		 </div>
	  </div>
	  <!-- 从表end -->

   </div>
   <!-- center end -->
</div>

<div style="display:none">
	<!-- 激活选项卡再刷新页面需要该隐藏域 -->
	<input type="hidden" id="mainPageHiddenId">
	<select id="mainPageFrameActived" style="display:none">
		<option value="jformOrderCustomer2" selected="selected"></option>
		<option value="jformOrderTicket2"></option>
	</select>
</div>

<!-- 需要改变的是每个iframe的src;子表iframe的id ;mainPageFrameActived中的option的value -->
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
