
<template>
  <div class="vue-component">
    <div region="center" style="padding: 1px;" data-options="fit:true,border:true">
		<table id="orgSelect" class="easyui-treegrid"
		        data-options="url:'organzationController.do?departgrid',idField:'id',treeField:'text',toolbar:'#tb',border:false,fitColumns:true,fit:true">
		    <thead>
		        <tr>
		            <th data-options="field:'text',width:200,formatter:formatName">{{ $t("common.department.name") }}</th>
		            <th data-options="field:'fieldMap.orgCode',width:80"> {{ $t("common.org.code") }}</th>
		            <th data-options="field:'fieldMap.orgType',width:80,formatter:formatType">{{ $t("common.org.type") }}</th>
		            <th data-options="field:'fieldMap.mobile',width:90">{{ $t("common.mobile") }}</th>
		            <th data-options="field:'fieldMap.address',width:200">{{ $t("common.address") }}</th>
		        </tr>
		    </thead>
		</table>
		<div id="tb"><div class="panel-title">{{ $t("please.select.department") }}</div></div>
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
