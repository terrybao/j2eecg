
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
    <input id="id" name="id" type="hidden" value="${cgformTemplatePage.id }">
    <div style="float: left;height: 99%;width: 30%;margin-top: 20px;">
        <img id="prePic" src="" style="background-color: rgba(68, 111, 128, 0.67)"  width="98%" height="200px" />
<!--         <a class="easyui-linkbutton" href="javascript:void(0)" onclick="uploadPic()">上传</a> -->
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
                    <input id="templateCode" name="templateCode" type="text" style="width: 300px" class="inputxt" datatype="/\w{1,20}/i" errormsg="编码只能为字母！" />
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
                    <input id="templateName" name="templateName" type="text" style="width: 300px" class="inputxt" datatype="*" errormsg="名称不能为空！" nullmsg="名称不能为空!"/>
                    <span class="Validform_checktip"></span>
                    <label class="Validform_label" style="display: none;">表单风格名</label>
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
                    <input type="radio" name="status" value="0" >无效
                    <input type="radio" name="status" value="1" checked="checked">有效
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
                    <input type="hidden" id="templatePic" name="templatePic" />
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
                    <label class="Validform_label" style="display: none;">风格模板</label>
                    <input type="hidden" id="templateZipName" name="templateZipName" />
                </td>

            </tr>
            <tr>
                <td align="right">
                    <label class="Validform_label">
                        	风格描述:
                    </label>
                </td>
                <td class="value">
                    <textarea style="width:400px;height: 60px" class="inputxt" rows="6" id="templateComment" name="templateComment"></textarea>
                    <span class="Validform_checktip"></span>
                    <label class="Validform_label" style="display: none;">风格描述</label>
                </td>
            </tr>
           <!--  <tr>
                <td align="right">
                    <label class="Validform_label" style="width: 100px">
                        	自定义OL模板 - 列表页面:
                    </label>
                </td>
                <td class="value">
                    <input id="templateListName" name="templateListName" type="text" style="width: 400px" class="inputxt"
                           datatype="*" errormsg="自定义OL模板 - 列表页面不能为空！" nullmsg="自定义OL模板 - 列表页面不能为空!" value="autolist.ftl"
                            >
                    <span class="Validform_checktip"></span>
                    <label class="Validform_label" style="display: none;">自定义OL模板 - 列表页面</label>
                </td>
            </tr>
            <tr>
                <td align="right">
                    <label class="Validform_label" style="width: 100px">
                       	自定义OL模板 -  录入页面:
                    </label>
                </td>
                <td class="value">
                    <input id="templateAddName" name="templateAddName" type="text" style="width: 400px" class="inputxt"
                           datatype="*" errormsg="自定义OL模板 - 录入页面不能为空！" nullmsg="自定义OL模板 - 录入页面不能为空!" value="jform.ftl"
                            >
                    <span class="Validform_checktip"></span>
                    <label class="Validform_label" style="display: none;">自定义OL模板 - 录入页面</label>
                </td>
            </tr>
            <tr>
                <td align="right">
                    <label class="Validform_label" style="width: 100px">
                       	 自定义OL模板 - 编辑页面:
                    </label>
                </td>
                <td class="value">
                    <input id="templateUpdateName" name="templateUpdateName" type="text" style="width: 400px" class="inputxt"
                           datatype="*" errormsg="自定义OL模板 - 编辑页面不能为空！" nullmsg="自定义OL模板 - 编辑页面不能为空!"  value="jform.ftl"
                            >
                    <span class="Validform_checktip"></span>
                    <label class="Validform_label" style="display: none;">自定义OL模板 - 编辑页面</label>
                </td>
            </tr>
            <tr>
                <td align="right">
                    <label class="Validform_label" style="width: 100px">
                        	自定义OL模板 - 查看页面:
                    </label>
                </td>
                <td class="value">
                    <input id="templateDetailName" name="templateDetailName" type="text" style="width: 400px" class="inputxt"
                           datatype="*" errormsg="自定义OL模板 - 查看页面不能为空！" nullmsg="自定义OL模板 - 查看页面不能为空!"  value="jform.ftl"
                            >
                    <span class="Validform_checktip"></span>
                    <label class="Validform_label" style="display: none;">自定义OL模板 - 查看页面</label>
                </td>
            </tr> -->
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
