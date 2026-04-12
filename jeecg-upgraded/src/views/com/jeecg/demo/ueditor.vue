
<template>
  <div class="vue-component">
    <div id="app">

	<div v-for="(todo,index) in todos" v-show="index==currentEdit">
		<textarea v-bind="{id:'ueditorContent_'+index}" name="ueditorContent" type="text/plain" >{{todo.text}}</textarea>
	</div>

	<div class="pagetab">
		<ul id="pageList">
			<li v-bind:class="{current:index==currentEdit}" v-for="(todo,index) in todos" @click="changeEdit(index)" >
				<b>
					<span >{{todo.text }}</span>
				</b>
			</li>
		</ul>
		<span class="add">
			  <img id="addPage" @click="addTab()" src="plug-in/tab/picture/icon_plus.gif" class="imgPlus" title="在当前页后插入">
			  <img id="delPage" @click="delTab()" src="plug-in/tab/picture/icon_minus.gif" class="imgDelete" title="删除当前页">
		</span>
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
