
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">

 <fieldset>
 <legend>文件上传</legend>
	<div id="uploader" class="wu-example">
	    <!--用来存放文件信息-->
	    <div id="thelist" class="uploader-list"></div>
	    <div class="btns">
	        <div id="picker">选择文件</div>
	    </div>
	</div>
 </fieldset>

<fieldset>
 <legend>组合输入框</legend>
	<div class="form" style="display:table;">
	    <label class="Validform_label" style="width:90px;text-align: right;"> 金额: </label> 
	    <input type="text" class="groupinput" name="nodeTimeout" value="100" datatype="n1-11" ignore="ignore"/>
	    <span class="groupspan">元</span>
	</div>
 </fieldset>
 
 <fieldset>
 <legend>select2</legend>
  <table>
	<tr>
		<td style="width:90px;text-align: right;">省份选择:</td>
		<td>
			<input type="text" id="province-select" name="province-select" class="ac_input">
		</td>
	</tr>
 </table>
 </fieldset>
 
 <fieldset>
 <legend>autocomplete</legend>
  <table>
	<tr>
		<td style="width:90px;text-align: right;">用户名自动补全:</td>
		<td>
			<input type="text" id="userNameAuto" name="userName" class="ac_input">
		</td>
	</tr>
 </table>
 </fieldset>
  
 <fieldset>
 <legend>联动下拉省市区</legend>
 	<div style="width:80%;margin:5px 0 0 10px;">
	  <input type="text" id="province" style="width:32%;" value=""/> 
	  <input type="text" id="city" style="width:32%;" value=""/> 
	  <input type="text" id="area" style="width:32%;" value=""/> 
 	</div>
 </fieldset>
 
 <fieldset>
 <legend>ztree</legend>
 	<div style="clear:both"></div>
 	<div class="zTreeDemoBackground left">
		<ul id="treeDemo" class="ztree"></ul>
	</div>
 </fieldset>
 
 <fieldset>
 <legend>ueditor</legend>
 	 	<table>
	<tr>
		<!-- <td align="right"><label class="Validform_label">demo:</label> -->
		<td>
			
			
	    	<textarea name="ueditorContent" id="ueditorContent" style="width: 650px;"></textarea>
		    
		    <span class="Validform_checktip"></span>
		</td>
	</tr>
 	</table>
 </fieldset>
<fieldset>
	<legend>省市区三级联动</legend>
	<div class="container">
		<h2 class="page-header"></h2>
		<div class="docs-methods">
			<form class="form-inline">
				<div id="distpicker">
					<div class="form-group">
						<div style="position: relative;">
							<input id="city-picker3" class="form-control" readonly type="text" value="江苏省/常州市/溧阳市" data-toggle="city-picker">
						</div>
					</div>
					<div>
						<button id="reset" type="button" style="hight: 50px; wight: 30px; font-size: 15px; ">重置</button>
						<button id="destroy" type="button" style="hight: 50px; wight: 30px; font-size: 15px; position:relative;right:100px;bottom:33px;">确定</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</fieldset>
 
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
