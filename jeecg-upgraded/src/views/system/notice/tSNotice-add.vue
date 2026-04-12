
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
					<input id="id" name="id" type="hidden" value="${tSNoticePage.id}">
		<table style="width:100%" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							标题:
						</label>
					</td>
					<td class="value">
					     	 <input id="noticeTitle" name="noticeTitle" type="text" style="width:95%" class="inputxt"  >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">通知标题</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							内容:
						</label>
					</td>
					<td class="value">
						  	 <input id="noticeContent" name="noticeContent" type="hidden">
						  	 
						  	 
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">通知公告内容</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							类型:
						</label>
					</td>
					<td class="value">
					     	 <!-- <input type="radio" name="noticeType" value="1" datatype="*"  />通知 -->
         				    <input type="radio" name="noticeType" value="2" checked="checked" />公告
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">通知公告类型</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label" style="white-space:nowrap;">
							授权级别:
						</label>
					</td>
					<td class="value">
					     	  <input type="radio" name="noticeLevel" value="1" datatype="*" checked="checked" onclick="dataytpeSelect()"/>全员
         				&nbsp;&nbsp;<br/><input type="radio" name="noticeLevel" value="2" onclick="dataytpeSelect('roleName')"  />角色授权
						<span id="roleName_span" style="display: none">
						<input name="roleid" name="roleid" type="hidden" value="" id="roleid">
						<input name="roleName" class="inputxt" value="" id="roleName" readonly="readonly"  />
						<t:choose hiddenName="roleid" hiddenid="id" url="userController.do?roles" name="roleList"
								  icon="icon-search" title="common.role.list" textname="roleName" isclear="true" isInit="true"></t:choose>

						</span>
						&nbsp;&nbsp;<br/><input type="radio" name="noticeLevel" value="3" onclick="dataytpeSelect('userName')"/>用户授权
						<span id="userName_span" style="display: none">
						<input name="userid" name="userid" type="hidden" value="" id="userid">
						<input name="userName" class="inputxt" value="" id="userName" readonly="readonly" />
						<t:choose hiddenName="userid" hiddenid="id" url="noticeAuthorityUserController.do?selectUser" name="userList"
								  icon="icon-search" title="common.user.list" textname="userName" isclear="true" isInit="true"></t:choose>
						<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">授权级别</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label" style="white-space:nowrap;">
							阅读期限:
						</label>
					</td>
					<td class="value">
							<input id="noticeTerm" name="noticeTerm" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()" >    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">阅读期限</label>
						</td>
				</tr>
			</table>
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
