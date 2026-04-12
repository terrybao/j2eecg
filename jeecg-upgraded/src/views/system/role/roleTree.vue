
<template>
  <div class="vue-component">
    <div class="easyui-layout" fit="true">
    <div region="center" style="padding:0px;border:0px">
        <div class="easyui-panel" style="padding:0px;border:0px" fit="true" border="false" id="functionListPanel">
            <input type="hidden" name="orgId" value="${orgId}" id="orgId">
            &nbsp;&nbsp;&nbsp;
            <a id="selecrAllBtn" onclick="selecrAll();">{{ $t("select.all") }}</a>
            <a id="resetBtn" onclick="reset();">{{ $t("common.reset") }}</a>
            <ul id="orgRoleTree"></ul>
        </div>
    </div>
</div>
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
