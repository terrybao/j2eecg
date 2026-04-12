
<template>
  <div class="vue-component">
    <div id="dpLTE" class="container-fluid" v-cloak>
	<div class="row">
		<div class="col-md-4 form-inline pull-left">
			<div class="form-group">
		    	<input v-model="keyword" @keyup.enter="load" class="form-control" placeholder="请输入查询关键字" style="width: 220px;" />
			</div>
			<div class="form-group">
			    <a class="btn btn-primary" @click="load"><i class="fa fa-search"></i>&nbsp;查询</a>
			</div>
		</div>
		<div class="col-md-8">
			<div class="btn-toolbar pull-right">
				<div class="btn-group">
		            <a class="btn btn-default" onclick="reload();"><i class="fa fa-refresh"></i>&nbsp;刷新</a>
		            <a class="btn btn-default" @click="save"><i class="fa fa-plus"></i>&nbsp;新增</a>
		            <a class="btn btn-default" @click="edit"><i class="fa fa-pencil-square-o"></i>&nbsp;编辑</a>
		            <a class="btn btn-default" @click="remove"><i class="fa fa-trash-o"></i>&nbsp;删除</a>
		        </div>
	        </div>
		</div>
	</div>
	<div class="row">
		<table id="dataGrid"></table>
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
