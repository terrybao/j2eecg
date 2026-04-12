
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">

 <fieldset>
	 <legend>select</legend>
	  <table>
		<tr>
			<td style="width:90px;text-align: right;">省份：</td>
			<td>
				<div class="selectBox">
		        	<div class="inputCase">
						<input id="imitationSelect" class="imitationSelect" type="text" oulName="" oulId="" value=""/>
						<i class="fa fa-caret-down"></i>
					</div>
					<ul id="selectUl" class="selectUl"></ul>
		        </div>
			</td>
		</tr>
	 </table>
 </fieldset>

 <fieldset>
	<legend>文件上传</legend>
	<table>
		<tr>
			<td style="width:90px;text-align: right;">文件：</td>
			<td>
				<div id="uploader" class="wu-example">
				    <div class="btns">
				        <div class="file">
				            <div>
				                <span class="textbox easyui-fluid filebox" style="width: 400px; height: 28px;">
					                <a href="javascript:;" class="textbox-button textbox-button-right l-btn l-btn-small" style="height: 30px;position: absolute;top: -2px;">
						                <span class="l-btn-left l-btn-icon-left">
						                <span class="l-btn-text" style="float:right;font: 12px/normal 'microsoft yahei','Times New Roman',Times,serif;">选择</span>
						                <span class="l-btn-icon fa fa-folder">&nbsp;</span></span>
						                <label class="filebox-label" for="filebox_file_id_1"></label>
					                </a>
					                <input id="_easyui_textbox_input1" type="text" class="textbox-text validatebox-text textbox-prompt" autocomplete="off" readonly="readonly" style="margin: 0px 55px 0px 0px; padding-top: 0px; padding-bottom: 0px; height: 28px; line-height: 28px; width: 945px;">
					                <input type="file" class="textbox-value" id="filebox_file_id_1" name="filebox1">
				                </span>
				            </div>
				        </div>
				    </div>
				</div>
			</td>
		</tr>
	 </table>
	
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
