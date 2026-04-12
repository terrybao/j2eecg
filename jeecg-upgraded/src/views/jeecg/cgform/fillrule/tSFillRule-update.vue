
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
			<input type="hidden" id="btn_sub" class="btn_sub"/>
			<input type="hidden" name="id" value='${tSFillRulePage.id}' >
			
			
			<div class="tab-wrapper">
			    <!-- tab -->
			    <ul class="nav nav-tabs">
			      <li role="presentation" class="active"><a href="javascript:void(0);">填值规则表</a></li>
			    </ul>
			    <!-- tab内容 -->
			    <div class="con-wrapper" id="con-wrapper1" style="display: block;">
			      <div class="row form-wrapper">
							<div class="row show-grid">
			          <div class="col-xs-3 text-center">
			          	<b>规则code：</b>
			          </div>
			          <div class="col-xs-3">
								<input id="ruleCode" name="ruleCode" type="text" class="form-control" datatype="*"  value='${tSFillRulePage.ruleCode}' />
						<span class="Validform_checktip" style="float:left;height:0px;"></span>
						<label class="Validform_label" style="display: none">规则code</label>
			          </div>
						</div>
			          
			        
							<div class="row show-grid">
			          <div class="col-xs-3 text-center">
			          	<b>规则名称：</b>
			          </div>
			          <div class="col-xs-3">
								<input id="ruleName" name="ruleName" type="text" class="form-control" ignore="ignore"  value='${tSFillRulePage.ruleName}' />
						<span class="Validform_checktip" style="float:left;height:0px;"></span>
						<label class="Validform_label" style="display: none">规则名称</label>
			          </div>
						</div>
			          
			        
							<div class="row show-grid">
			          <div class="col-xs-3 text-center">
			          	<b>规则实现类：</b>
			          </div>
			          <div class="col-xs-3">
								<input id="ruleClass" name="ruleClass" style="width: 380px" type="text" class="form-control" ignore="ignore"  value='${tSFillRulePage.ruleClass}' />
						<span class="Validform_checktip" style="float:left;height:0px;"></span>
						<label class="Validform_label" style="display: none">规则实现类</label>
			          </div>
						</div>
			          
			        
							<div class="row show-grid">
			          <div class="col-xs-3 text-center">
			          	<b>规则参数：</b>
			          </div>
			          <div class="col-xs-3">
			          	<textarea rows="7" cols="60" style="margin: 3px 0 4px 0;" id="ruleParam" name="ruleParam" class="form-control" ignore="ignore">${tSFillRulePage.ruleParam}</textarea>
						<span class="Validform_checktip" style="float:left;height:0px;"></span>
						<label class="Validform_label" style="display: none">规则参数</label>
			          </div>
						</div>
			          
			        
			          <div class="row" id = "sub_tr" style="display: none;">
				        <div class="col-xs-12 layout-header">
				          <div class="col-xs-6"></div>
				          <div class="col-xs-6"><button type="button" onclick="neibuClick();" class="btn btn-default">提交</button></div>
				        </div>
				      </div>
			     </div>
			   </div>
			   
			   <div class="con-wrapper" id="con-wrapper2" style="display: block;"></div>
			 </div>
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
