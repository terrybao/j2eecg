
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input name="id" type="hidden" value="${operation.id}">
	<fieldset class="step">
        <div class="form">
            <label class="Validform_label"> 接口权限规则名称: </label>
            <input name="ruleName" class="inputxt" value="${operation.ruleName}" datatype="s2-20" style="width: 280px;"/>
            <span class="Validform_checktip"> {{ $t("operatename.rang2to20") }}</span>
        </div>
      <div class="form" <c:if test="${operation.ruleConditions=='USE_SQL_RULES'}">style="display:none;" </c:if>>
            <label class="Validform_label"> 接口权限规则字段: </label>
            <input name="ruleColumn" class="inputxt" value="${operation.ruleColumn}" style="width: 280px;" />
        </div>
        <div class="form">
            <label class="Validform_label"> 接口权限条件规则: </label>
            <el-select v-model="form.ruleConditions" placeholder="请选择"></el-select>
        </div>
           <input name="tSInterface.id" value="${interfaceId}" type="hidden"  >
         <div class="form">
            <label class="Validform_label"> 接口权限规则值: </label>
            <input name="ruleValue" class="inputxt" value="${operation.ruleValue}" style="width: 390px;" datatype="*"/>
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
