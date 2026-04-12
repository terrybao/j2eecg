
<template>
  <div class="vue-component">
    <div class="easyui-layout" fit="true">
    <div region="center" style="padding:0px;border:0px">
        <t:datagrid name="typeValueList" title="common.type.list"
                    actionUrl="systemController.do?typeGrid&typegroupid=${typegroupid}" idField="id"
                    queryMode="group">
            <el-table-column prop="id" label="common.code"></el-table-column>
            <el-table-column prop="typename" label="common.type.name"></el-table-column>
            <el-table-column prop="typecode" label="common.type.code"></el-table-column>
            <el-table-column prop="orderNum" label="dict.order"></el-table-column>
            <el-table-column prop="opt" label="common.operation"></el-table-column>
            <t:dgDelOpt url="systemController.do?delType&id={id}" title="common.delete" urlclass="ace_button"  urlfont="fa-trash-o"></t:dgDelOpt>
            <div class="toolbar"></div>
            <div class="toolbar"></div>
        </el-table>
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
