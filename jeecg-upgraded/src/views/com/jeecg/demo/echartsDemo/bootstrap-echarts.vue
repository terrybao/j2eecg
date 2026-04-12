
<template>
  <div class="vue-component">
    <div class="container-fluid">
	<div class="row">
		<div class="col-md-8">
			<div id="main1" style="height:400px;"></div>
		</div>
		<div class="col-md-4">
			<div id="main2" style="height:400px;"></div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-6">
			<div id="main3" style="height:400px;"></div>
		</div>
		<div class="col-md-6">
			<div id="main4" style="height:400px;"></div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
			<div id="main5" style="height:400px;"></div>
		</div>
		<div class="col-md-4">
			<div id="main6" style="height:400px;"></div>
		</div>
		<div class="col-md-4">
			<div id="main7" style="height:400px;"></div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-2">
			<div id="main8" style="height:400px;"></div>
		</div>
		<div class="col-md-6">
			<div id="main9" style="height:400px;"></div>
		</div>
		<div class="col-md-4">
			<div id="main10" style="height:400px;"></div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<div id="main11" style="height:400px;"></div>
		</div>
	</div>
	<button style="float:right;" type="button" class="btn btn-default" onclick="clickPrint()">打印</button>
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
