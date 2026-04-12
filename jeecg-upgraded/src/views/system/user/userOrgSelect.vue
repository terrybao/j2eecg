
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${user.id }">
	<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right" width="15%" nowrap><label class="Validform_label">  {{ $t("common.username") }}: </label></td>
			<td class="value" width="85%">
                <c:if test="${user.id!=null }"> ${user.userName } </c:if>
                <c:if test="${user.id==null }">
                    <input id="userName" class="inputxt" name="userName" validType="t_s_base_user,userName,id" value="${user.userName }" datatype="s2-10" />
                    <span class="Validform_checktip"> {{ $t("username.rang2to10") }}</span>
                </c:if>
            </td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> {{ $t("common.department") }}: </label></td>
			<td class="value">
                <select id="orgId" name="orgId" datatype="*">
                    <c:forEach items="${orgList}" var="org">
                        <option value="${org.id }">${org.departname}</option>
                    </c:forEach>
                </select>
            <span class="Validform_checktip">{{ $t("please.select.department") }}</span></td>
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
