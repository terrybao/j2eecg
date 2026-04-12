
<template>
  <div class="vue-component">
    <SCRIPT type=text/javascript src="plug-in/clipboard/ZeroClipboard.js"></SCRIPT>
</t:base>
<style>
<!--
body{
	overflow: hidden;
}
-->
</style>
<div>
<div><input type='radio' name='synMethod' value='normal' checked>{{ $t("normal.sync") }}</div>
<div><input type='radio' name='synMethod' value='force'>{{ $t("force.sync") }}</div>
</div>
<SCRIPT type="text/javascript">
 function getSynChoice(){
	var synchoice;
	$("[name='synMethod']").each(function(){
		if($(this).attr("checked")){
			synchoice = $(this).val();
		}
	});
	return synchoice;
 }
 </SCRIPT>
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
