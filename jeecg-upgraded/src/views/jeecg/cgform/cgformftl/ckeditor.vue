
<template>
  <div class="vue-component">
    <!DOCTYPE html>
<html>
<head>
</t:base>


</head>
<form action="cgformFtlControllerr.do?saveCkeditor" method="post" id="myCkeditorForm"><input type="hidden" value="${cgformFtlEntity.id}" name="id" /> <textarea cols="80" id="editor1"
	name="contents" rows="100">
			${contents}
		</textarea> </form>
</html>
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
