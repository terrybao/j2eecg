
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	  <input id="id" name="id" type="hidden" value="${cgformTemplatePage.id }">
	  <div style="float: left;height: 99%;width: 30%;margin-top: 20px">
		  <img id="prePic" src="" alt="预览图" width="99%" height="200px" />
<!-- 		  <a class="easyui-linkbutton" href="javascript:void(0)" onclick="uploadPic()">上传</a> -->
	  </div>
	  <div style="float: right;height: 99%;width:70%">
		  <table style="width: 100%;height: 100%" cellpadding="0" cellspacing="1" class="formtable">

			  <tr>
				  <td align="right">
					  <label class="Validform_label">
						  表单风格编码:
					  </label>
				  </td>
				  <td class="value">
					  <input disabled id="templateCode" name="templateCode" type="text" style="width: 300px" class="inputxt" datatype="/\w{1,20}/i" errormsg="编码只能为字母！" value='${cgformTemplatePage.templateCode}'>
					  <span class="Validform_checktip"></span>
					  <label class="Validform_label" style="display: none;">表单风格编码</label>
				  </td>
			  </tr>
			  <tr>
				  <td align="right">
					  <label class="Validform_label" style="width: 100px">
						  表单风格名称:
					  </label>
				  </td>
				  <td class="value">
					  <input id="templateName" name="templateName" type="text" style="width: 300px" class="inputxt" datatype="*" value='${cgformTemplatePage.templateName}' />
					  <span class="Validform_checktip"></span>
					  <label class="Validform_label" style="display: none;">表单风格名称</label>
				  </td>
			  </tr>
			  <tr>
				  <td align="right" >
					  <label class="Validform_label">
						  类型:
					  </label>
				  </td>
				  <td class="value"  >
					  <select id="templateType" name="templateType" >
						  <option value="1" <c:if test="${cgformTemplatePage.templateType eq '1'}"> selected='selected'</c:if>>单表</option>
						  <option value="2" <c:if test="${cgformTemplatePage.templateType eq '2'}"> selected="selected"</c:if>>主子表</option>
						  <option value="3" <c:if test="${cgformTemplatePage.templateType eq '3'}"> selected="selected"</c:if>>通用模板</option>
					  </select>
					  <span class="Validform_checktip"></span>
					  <label class="Validform_label" style="display: none;">类型</label>
				  </td>
			  </tr>
			  <tr>
                <td align="right">
                    <label class="Validform_label" style="width: 100px">
                        	是否激活:
                    </label>
                </td>
                <td class="value">
               		<c:if test="${cgformTemplatePage.status == 0}">
	                    <input type="radio" name="status" value="0" checked="checked">无效
	                    <input type="radio" name="status" value="1" >有效
               		</c:if>
               		<c:if test="${cgformTemplatePage.status == 1}">
	                    <input type="radio" name="status" value="0" >无效
	                    <input type="radio" name="status" value="1" checked="checked">有效
               		</c:if>
                    <span class="Validform_checktip"></span>
                    <label class="Validform_label" style="display: none;">是否激活</label>
                </td>
            </tr>
			 
			  <tr>
				  <td align="right">
					  <label class="Validform_label">
						  预览图：
					  </label>
				  </td>
				  <td class="value" style="padding-top:1em">
					<input type="hidden" id="templatePic" name="templatePic" value="${cgformTemplatePage.templatePic}" />
					<t:upload queueID="hiddenArea" auto="true" dialog="false" outhtml="false" onUploadSuccess="viewPicUploadSuccess" id="templatePic_u" uploader="cgformTemplateController.do?uploadPic&sessionId=${pageContext.session.id}" extend="pic" name="templatePic_u"></t:upload>
                    <div id = "hiddenArea" style="display:none"></div>
				  </td>
			  </tr>

			  <tr>
				  <td align="right">
					  <label class="Validform_label">
						  上传风格模板:
					  </label>
				  </td>
				  <td class="value" >
				  	  <t:upload id="templateZip" onFilesRemoved="zipFilesRemoved" onFileAdded="zipFileAdded" queueID= "filediv" dialog="false" outhtml="false"  onUploadSuccess="zipUploadSuccess" buttonText="浏览文件" multi="false" name="templateZip" uploader="cgformTemplateController.do?uploadZip&sessionId=${pageContext.session.id}" extend="*.zip;*.rar"></t:upload>
					  <div class="form" id="filediv" ></div>
					  <span class="Validform_checktip"></span>
					  <label class="Validform_label" style="display: none;">表单风格模板</label>
					  <input type="hidden" id="templateZipName" name="templateZipName" value="${cgformTemplatePage.templateZipName}"/>
				  </td>

			  </tr>
			  <tr>
				  <td align="right">
					  <label class="Validform_label">
						  风格描述:
					  </label>
				  </td>
				  <td class="value">
                    <textarea style="width:400px;height: 60px" class="inputxt" rows="6" id="templateComment"
							  name="templateComment">${cgformTemplatePage.templateComment}</textarea>
					  <span class="Validform_checktip"></span>
					  <label class="Validform_label" style="display: none;">表单风格描述</label>
				  </td>
			  </tr>
			  
		  </table>
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
