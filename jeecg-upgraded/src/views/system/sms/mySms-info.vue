
<template>
  <div class="vue-component">
    <div style="width:95%;">
	    <legend>${tSSms.esTitle}</legend>
			<div class="form">
				<label class="form"><fmt:formatDate value='${tSSms.createDate}' type='both'/></label>
			</div>
	    <hr style="BORDER-RIGHT: #00686b 1px dotted; BORDER-TOP: #00686b 1px dotted; BORDER-LEFT: #00686b 1px dotted; BORDER-BOTTOM: #00686b 1px dotted" noShade SIZE=1/>
			<div class="form">
				${tSSms.esContent}
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
