
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${user.id }"/>
	<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right" width="25%" nowrap>
                <label class="Validform_label">  {{ $t("common.username") }}:  </label>
            </td>
			<td class="value" width="85%">
                <c:if test="${user.id!=null }"> ${user.userName } </c:if>
                <c:if test="${user.id==null }">
                    <input id="userName" class="inputxt" name="userName" validType="t_s_base_user,userName,id" value="${user.userName }" maxlength="50" datatype="s2-50" />
                    <span class="Validform_checktip"> {{ $t("username.rang2to50") }}</span>
                </c:if>
            </td>
		</tr>
		<tr>
			<td align="right" width="10%" nowrap><label class="Validform_label"> {{ $t("common.real.name") }}: </label></td>
			<td class="value" width="10%">
                <input id="realName" class="inputxt" name="realName" value="${user.realName }" maxlength="25" datatype="s2-25"/>
                <span class="Validform_checktip">{{ $t("fill.realname") }}</span>
            </td>
		</tr>
		<c:if test="${user.id==null }">
			<tr>
				<td align="right"><label class="Validform_label"> {{ $t("common.password") }}: </label></td>
				<td class="value">
                    <input type="password" class="inputxt" value="" name="password" plugin="passwordStrength" datatype="*6-18" errormsg="" />
                    <span class="passwordStrength" style="display: none;">
                        <span>{{ $t("common.weak") }}</span>
                        <span>{{ $t("common.middle") }}</span>
                        <span class="last">{{ $t("common.strong") }}</span>
                    </span>
                    <span class="Validform_checktip"> {{ $t("password.rang6to18") }}</span>
                </td>
			</tr>
			<tr>
				<td align="right"><label class="Validform_label"> {{ $t("common.repeat.password") }}: </label></td>
				<td class="value">
                    <input id="repassword" class="inputxt" type="password" value="${user.password}" recheck="password" datatype="*6-18" errormsg="两次输入的密码不一致！"/>
                    <span class="Validform_checktip">{{ $t("common.repeat.password") }}</span>
                </td>
			</tr>
		</c:if>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("common.department") }}: </label></td>
			<td class="value">
                <input id="departname" name="departname" type="text" readonly="readonly" class="inputxt" datatype="*" value="${departname}"/>
                <input id="orgIds" name="orgIds" type="hidden" value="${orgIds}"/>
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-search" id="departSearch" onclick="openDepartmentSelect()">选择</a>
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-redo" id="departRedo" onclick="callbackClean()">清空</a>
                <span class="Validform_checktip">{{ $t("please.muti.department") }}</span>
            </td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("common.role") }}: </label></td>
			<td class="value" nowrap>
                <input id="roleid" name="roleid" type="hidden" value="${id}"/>
                <input name="roleName" id="roleName" class="inputxt" value="${roleName }" readonly="readonly" datatype="*" />
                <t:choose hiddenName="roleid" hiddenid="id" textname="roleName" url="userController.do?roles" name="roleList" icon="icon-search" title="common.role.list" isclear="true" isInit="true"></t:choose>
                <span class="Validform_checktip">{{ $t("role.muti.select") }}</span>
            </td>
		</tr>
		<tr>
			<td align="right" nowrap><label class="Validform_label">  {{ $t("common.phone") }}: </label></td>
			<td class="value">
                <input class="inputxt" name="mobilePhone" value="${user.mobilePhone}" datatype="m" errormsg="手机号码不正确" ignore="ignore"/>
                <span class="Validform_checktip"></span>
            </td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("common.tel") }}: </label></td>
			<td class="value">
                <input class="inputxt" name="officePhone" value="${user.officePhone}" datatype="n" errormsg="办公室电话不正确" ignore="ignore"/>
                <span class="Validform_checktip"></span>
            </td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("common.common.mail") }}: </label></td>
			<td class="value">
                <input class="inputxt" name="email" value="${user.email}"  validType="t_s_user,email,id" datatype="e" errormsg="邮箱格式不正确!" />
                <span class="Validform_checktip"></span>
            </td>
		</tr>
        <tr>
            <td align="right"><label class="Validform_label"> {{ $t("common.common.dev") }}: </label></td>
            <td class="value">

                <el-select v-model="form.devFlag" placeholder="请选择"></el-select>
                <span class="Validform_checktip"></span>
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
