
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<input id="id" name="id" type="hidden" value="${depart.id }">
	<fieldset class="step">
        <div class="form">
            <label class="Validform_label"> {{ $t("common.department.name") }}: </label>
            <input name="departname" class="inputxt" type="text" value="${depart.departname }"  datatype="s1-20">
            <span class="Validform_checktip">{{ $t("departmentname.rang1to20") }}</span>
        </div>
        <div class="form">
            <label class="Validform_label"> {{ $t("position.desc") }}: </label>
            <input name="description" class="inputxt" value="${depart.description }">
        </div>
        <div class="form">
            <label class="Validform_label"> {{ $t("parent.depart") }}: </label>
            <input id="cc" name="TSPDepart.id" value="${depart.TSPDepart.id}">
        </div>
        <div class="form">
            <input type="hidden" name="orgCode" value="${depart.orgCode }">
            <label class="Validform_label"> {{ $t("common.org.type") }}: </label>
           <select name="orgType" id="orgType"> 
                 <option value="1" <c:if test="${orgType=='1'}">selected="selected"</c:if>>{{ $t("common.company") }}</option> 
                 <option value="2" <c:if test="${orgType=='2'}">selected="selected"</c:if>>{{ $t("common.department") }}</option> 
                 <option value="3" <c:if test="${orgType=='3'}">selected="selected"</c:if>>{{ $t("common.position") }}</option>
         </select> 
        </div>
        <div class="form">
            <label class="Validform_label"> {{ $t("common.mobile") }}: </label>
            <input name="mobile" class="inputxt" value="${depart.mobile }">
        </div>
        <div class="form">
            <label class="Validform_label"> {{ $t("common.fax") }}: </label>
            <input name="fax" class="inputxt" value="${depart.fax }">
        </div>
        <div class="form">
            <label class="Validform_label"> {{ $t("common.address") }}: </label>
            <input name="address" class="inputxt" value="${depart.address }">
            <span class="Validform_checktip"></span>
        </div>
        <!-- update--begin--author:zhangjiaqiang Date:20170223 for:TASk 1708-->
<!--          <div class="form"> -->
<!--             <label class="Validform_label"> 排序: </label> -->

<!--             <span class="Validform_checktip">请输入排序号</span> -->
<!--         </div> -->
        <!-- update--end--author:zhangjiaqiang Date:20170112 for:TASK 1708-->
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
