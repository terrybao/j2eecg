
<template>
  <div class="vue-component">
    <form id="formobj"  action="jeecgListDemoController.do?doUpdate" name="formobj" method="post">
	<input type="hidden" id="btn_sub" class="btn_sub"/>
	<input type="hidden" id="id" name="id" value = "${jeecgDemoPage.id}"/>
	<div class="tab-wrapper">
		<!-- tab -->
	    <ul class="nav nav-tabs">
	      <li role="presentation" class="active"><a href="javascript:void(0);">ace新增demo</a></li>
	    </ul>
	    <!-- tab内容 -->
		<div class="con-wrapper" id="con-wrapper1" style="display: block;">
			<div class="row form-wrapper">
			
				<div class="row show-grid">
			        <div class="col-xs-3 text-center">
				        <b>名称：</b>
				    </div>
				    <div class="col-xs-6">
						<input id="name" name="name" type="text" class="form-control"   datatype="s2-50" value = "${jeecgDemoPage.name}" />
						<span class="Validform_checktip" style="float:left;height:0px;"></span>
						<label class="Validform_label" style="display: none">名称</label>
			        </div>
				</div>
				
				<div class="row show-grid">
			        <div class="col-xs-3 text-center">
				        <b>年龄：</b>
				    </div>
				    <div class="col-xs-6">
						<input id="age" name="age" type="text" class="form-control"  ignore="ignore"  datatype="n"  value = "${jeecgDemoPage.age}"/>
						<span class="Validform_checktip" style="float:left;height:0px;"></span>
						<label class="Validform_label" style="display: none">年龄</label>
			        </div>
				</div>
				
				<div class="row show-grid">
			        <div class="col-xs-3 text-center">
				        <b>性别：</b>
				    </div>
				    <div class="col-xs-6">
						<select name="sex" class="form-control"  style="width:164px" datatype="*" >
							<option value="">  </option> 
							<option value="0" <c:if test="${jeecgDemoPage.sex==0}">selected</c:if>>男 </option>
							<option value="1" <c:if test="${jeecgDemoPage.sex==1}">selected</c:if>>女 </option> 
						</select>
						<span class="Validform_checktip" style="float:left;height:0px;"></span>
						<label class="Validform_label" style="display: none">性别</label>
			        </div>
				</div>
				
				<div class="row show-grid">
			        <div class="col-xs-3 text-center">
				        <b>工资：</b>
				    </div>
				    <div class="col-xs-6">
						<input id="salary" name="salary" type="text" class="form-control"  ignore="ignore"  value = "${jeecgDemoPage.salary}"/>
						<span class="Validform_checktip" style="float:left;height:0px;"></span>
						<label class="Validform_label" style="display: none">工资</label>
			        </div>
				</div>
				
				<div class="row show-grid">
			        <div class="col-xs-3 text-center">
				        <b>生日：</b>
				    </div>
				    <div class="col-xs-6">
						<input id="birthday" name="birthday" type="text" ignore="ignore" style="background: url('plug-in/ace/images/datetime.png') no-repeat scroll right center transparent;"  class="form-control" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" value='<fmt:formatDate value='${jeecgDemoPage.birthday}' type="date" pattern="yyyy-MM-dd"/>' />
						<span class="Validform_checktip" style="float:left;height:0px;"></span>
						<label class="Validform_label" style="display: none">生日</label>
			        </div>
				</div>
			</div>
		</div>
	
	
	
	</div>
</form>
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
