
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${user.id }"/>
	<input id="devFlag" name="devFlag" type="hidden" value="0"/>
	<input id="activitiSync" name="activitiSync" type="hidden" value="1"/>
	<input id="userType" name="userType" type="hidden" value="1"/>
	<input id="orgIds" name="orgIds" type="hidden" value="${orgIds}"/>
	<table style="width: 100%;" cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right" width="25%" nowrap>
                <label class="Validform_label">  {{ $t("common.username") }}:  </label>
            </td>
			<td class="value" width="85%">
                <c:if test="${user.id!=null }"> ${user.userName } </c:if>
                <c:if test="${user.id==null }">
                    <input id="userName" class="inputxt" name="userName" validType="t_s_base_user,userName,id" value="${user.userName }" datatype="s2-18" />
                    <span class="Validform_checktip"> {{ $t("username.rang2to18") }}</span>
                </c:if>
            </td>
		</tr>
		<tr>
			<td align="right" width="25%" nowrap>
                <label class="Validform_label"> 所属组织机构:  </label>
            </td>
			<td class="value" width="85%">
                 ${departname}
            </td>
		</tr>
		<tr>
			<td align="right" width="10%" nowrap><label class="Validform_label"> {{ $t("common.real.name") }}: </label></td>
			<td class="value" width="10%">
                <input id="realName" class="inputxt" name="realName" value="${user.realName }" datatype="s2-10"/>
                <span class="Validform_checktip">{{ $t("fill.realname") }}</span>
            </td>
		</tr>
		<tr>
			<td align="right" width="10%" nowrap><label class="Validform_label">英文名: </label></td>
			<td class="value" width="10%">
                <input id="userNameEn" class="inputxt" name="userNameEn" value="${user.userNameEn }"/>
                <span class="Validform_checktip">填写英文名</span>
            </td>
		</tr>
		<tr>
			<td align="right" width="10%" nowrap><label class="Validform_label">工号: </label></td>
			<td class="value" width="10%">
                <input id="empNo" class="inputxt" name="empNo" value="${user.empNo }" />
                <span class="Validform_checktip">填写工号</span>
            </td>
		</tr>
		 
        
        <tr>
            <td align="right"><label class="Validform_label"> 性别: </label></td>
            <td class="value">
                <el-select v-model="form.sex" placeholder="请选择"></el-select>
                <span class="Validform_checktip"></span>
            </td>
        </tr>
        <tr>
			<td align="right" width="10%" nowrap><label class="Validform_label">身份证号: </label></td>
			<td class="value" width="10%">
                <input id="citizenNo" class="inputxt" name="citizenNo" value="${user.citizenNo }" />
                <span class="Validform_checktip">填写身份证号</span>
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
				<!-- validType="t_s_user,email,id" -->
                <input class="inputxt" name="email" value="${user.email}"   datatype="e" errormsg="邮箱格式不正确!" />
                <span class="Validform_checktip"></span>
            </td>
		</tr>
		<tr>
			<td align="right" width="10%" nowrap><label class="Validform_label">传真: </label></td>
			<td class="value" width="10%">
                <input id="fax" class="inputxt" name="fax" value="${user.fax }" />
                <span class="Validform_checktip">填写传真</span>
            </td>
		</tr>
		<tr>
			<td align="right" width="10%" nowrap><label class="Validform_label">联系地址: </label></td>
			<td class="value" width="10%">
                <input id="address" class="inputxt" name="address" value="${user.address}" />
                <span class="Validform_checktip">填写联系地址</span>
            </td>
		</tr>
		<tr>
			<td align="right" width="10%" nowrap><label class="Validform_label">邮编: </label></td>
			<td class="value" width="10%">
                <input id="post" class="inputxt" name="post" value="${user.post}" />
                <span class="Validform_checktip">填写邮编</span>
            </td>
		</tr>
		<tr>
			<td align="right" width="10%" nowrap><label class="Validform_label">备注: </label></td>
			<td class="value" width="10%">
                <textarea id="memo" name="memo" rows="5" cols="80">${user.memo}</textarea>
                <span class="Validform_checktip">填写备注</span>
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
