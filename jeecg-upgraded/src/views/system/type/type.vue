
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
    <input name="id" type="hidden" value="${type.id }">
    <input name="TSTypegroup.id" type="hidden" value="${typegroupid}">
    <fieldset class="step">
        <div class="form">
            <label class="Validform_label"> {{ $t("lang.dictionary.type") }}: </label>
            <input readonly="true" class="inputxt" value="${typegroupname }">
        </div>
        
        <div class="form">
            <label class="Validform_label"> {{ $t("dict.name") }}: </label>
            <input name="typename" class="inputxt" value="${type.typename }" datatype="/^[A-Za-z0-9\u4E00-\u9FA5\uf900-\ufa2d\.\s]{1,50}$/">
            <span class="Validform_checktip"><t:mutiLang langKey="common.range1to50" /></span>
        </div>
        <div class="form">
            <label class="Validform_label"> {{ $t("dict.code") }}: </label>
            <input name="typecode" class="inputxt" value="${type.typecode }" datatype="/^[A-Za-z0-9\u4E00-\u9FA5\uf900-\ufa2d\.\s]{1,50}$/"
                   ajaxurl="systemController.do?checkType&code=${type.typecode }&typeGroupCode=${typegroup.typegroupcode}">
            <span class="Validform_checktip"><t:mutiLang langKey="common.range1to10" /></span>
        </div>
        <div class="form">
            <label class="Validform_label">{{ $t("dict.order") }}: </label>
            <input name="orderNum" class="inputxt" value="${type.orderNum}" datatype="/\b\d{1,3}\b/g" errormsg="请输入一至三位整数">
            <span class="Validform_checktip">请输入一至三位整数</span>
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
