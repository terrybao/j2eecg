
<template>
  <div class="vue-component">
    <div class="easyui-layout" fit="true">
	<!--查询历史  -->
	<div data-options="region:'east',split:false" style="width: 128px;">
		<div class="easyui-accordion" style="width: 126px;border-bottom: 0;">
			<div title="查询历史" data-options="iconCls:'icon-search'" style="padding: 0px;border-bottom: 0;">
				<ul id="tt"></ul>
				
			</div>
		</div>
	</div>
	
	<!--查询条件 -->
	<div region="center" style="padding: 1px;">
		<div style="float: left;">
			<div style="float: left; top: 1px">
				<ul id="dsUL">
					<input type="hidden" name="cons[0].mainId" value=""/>
					<li id="anyAll" class="conditionType">
						<span class="anyAll">
							过滤条件匹配：
						 	<select id="anyallSelect" name="mchtyp" style="width: 200px" class="select">
								<option value="and" selected="selected">And(所有条件都要求匹配)</option>
								<option value="or">Or(条件中的任何一个匹配)</option>
							</select>
						</span>
					</li>
					<li id="dsLI" name="dsLI" class="conditions oop" data-index="0">
						<span>
							<input id="citySel" name="cons[0].tree" onclick="treeClick(this)" type="text"   style="width:120px;" class=" queryTree" readonly="readonly"  /> &nbsp;
							<input id="tableVal" name="cons[0].hidd" type="hidden" value=""/>
							<input name="cons[0].tableCode" type="hidden" value=""/>
						</span> 
						<span >
							<select id="field" name="cons[0].fld" onchange="changeField(this)">
							</select>
						</span> 
						<span> 
						<select id="condition" name="cons[0].ctyp" class="compareType" style="width: 150px">
									<option>&nbsp;</option>
									<option value="=">等于</option>
									<option value="!=">不等于</option>
									<option value=">">大于</option>
									<option value=">=">大于等于</option>
									<option value="lt">小于</option>
									<option value="lte">小于等于</option>
									<option value="likeBegin">以...开始</option>
									<option value="likeEnd">以...结束</option>
									<option value="like">包含</option>
									<option value="not like">不包含</option>
									<option value="in">在...中</option>
									<option value="not in">不在...中</option>
							</select>
						</span> <span class="spanVal" style="position: relative; z-index: 2000;"> 
						<input id="conValue" name="cons[0].val" type="text" style="width:165px;" class="text conditionValue" title="">
						</span> 
						<span> 
						<a id="add" href="javascript:addULChild()" class="fa fa-plus-square" title="添加一个新的过滤条件" style="margin-left: 3px;"></a>
					    <a id="delete" href="javascript:void(0)" onclick="deleteULChild(this)" class="fa fa-minus-square" title="删除此过滤条件" style="margin-left: 23px;"></a>
						</span>
					</li>
				</ul>
			</div>
		</div>	
	</div>
	
	<div data-options="region:'south',border:false" style="text-align: right; padding: 5px 0 0;">
		<a class="easyui-linkbutton" data-options="iconCls:'icon-search'" href="javascript:void(0)" onclick="javascript:mySearch()">查询</a> 
		<a class="easyui-linkbutton"  data-options="iconCls:'icon-reload'" href="javascript:void(0)" onclick="searchReset()">重置</a> 
		<a class="easyui-linkbutton" data-options="iconCls:'icon-save'" href="javascript:void(0)" onclick="saveBySelect()">另存为查询方案</a> 
	</div>
					
	<div id="mmTree" class="easyui-menu" style="width: 100px;">
	<div onclick="editTree()" data-options="iconCls:'icon-edit'">编辑</div>
	<div onclick="deleteTree()" data-options="iconCls:'icon-remove'">删除</div>
</div>



	<div id="menuContent" class="menuContent" style="display:none; position: absolute;background:#FFF;overflow:hidden;height:120px;border:0px">
		<ul id="orgTree" class="ztree" style="margin-top:-7px; width:auto;height:100px;"></ul>
	</div>
	<input type="hidden" name="treeValue" value="" id="treeValue" /> 
	<input type="hidden" name="selectValue" value="" id="selectValue" />
	<input type="hidden" name="queryCode" value="${queryCode}" id="queryCode"/>
	
	
		<!--隐藏-->
	<ul  id="dsUL_template" style="display:none">
		<li class="conditions oop" data-index="#index#">
		<span>
			<input name="cons[#index#].tree" onclick="treeClick(this)"  type="text"   style="width:120px;" class="tree queryTree" readonly="readonly"  /> &nbsp;
			<input name="cons[#index#].hidd" type="hidden" value=""/>
			<input name="cons[#index#].tableCode" type="hidden" value=""/>
		</span> 
		<span>
			<select class="field" id="field" name="cons[#index#].fld" onchange="changeField(this)">
				 
			</select> 
		</span> 
		<span> 
			<select id="condition" name="cons[#index#].ctyp" class="compareType" style="width: 150px">
				<option >&nbsp;</option>
				<option value="=">等于</option>
				<option value="!=">不等于</option>
				<option value=">">大于</option>
				<option value=">=">大于等于</option>
				<option value="lt;">小于</option>
				<option value="lte;">小于等于</option>
				<option value="likeBegin">以...开始</option>
				<option value="likeEnd">以...结束</option>
				<option value="like">包含</option>
				<option value="not like">不包含</option>
				<option value="in">在...中</option>
				<option value="not in">不在...中</option>
			</select> 
		</span> 
		<span class="spanVal" style="position: relative; z-index: 2000;"> 
			<input id="conValue1" name="cons[#index#].val" style="width:165px;" type="text" class="text conditionValue" title=""> 
		</span> 
		<span> 
			<a id="add" href="javascript:addULChild()" class="fa fa-plus-square"	title="添加一个新的过滤条件" style="margin-left: 3px;"></a> 
			<a id="delete" href="javascript:void(0)" onclick="deleteULChild(this)" class="fa fa-minus-square" title="删除此过滤条件"  style="margin-left: 23px;"></a> 
		</span>
		</li>
	</ul>
</div>


<!-- 弹出框页面js -->
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
