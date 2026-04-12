
<template>
  <div class="vue-component">
    <t:tabs id="typeGroupTabs" iframe="false" tabPosition="bottom">
	<c:forEach items="${typegroupList}" var="typegroup">
		<t:tab iframe="systemController.do?typeList&typegroupid=${typegroup.id}" icon="icon-add" title="${typegroup.typegroupname}" id="${typegroup.typegroupcode}"></t:tab>
	</c:forEach>
</t:tabs>
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
