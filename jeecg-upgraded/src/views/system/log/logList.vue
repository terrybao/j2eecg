
<template>
  <div class="vue-component">
    </t:base>
<t:datagrid title="log.manage" name="logList" actionUrl="logController.do?datagrid" idField="id" sortName="operatetime" sortOrder="desc" pageSize="500" extendParams="view:scrollview">
	<el-table-column prop="id" label="common.id"></el-table-column>
	<el-table-column prop="operatetype" label="日志类型"></el-table-column>
	<el-table-column prop="logcontent" label="log.content"></el-table-column>
	<el-table-column prop="note" label="operate.ip"></el-table-column>
	<el-table-column prop="username" label="操作人ID"></el-table-column>
	<el-table-column prop="realname" label="操作人名"></el-table-column>
	<el-table-column prop="broswer" label="(推荐使用IE8+,<br>谷歌浏览器可以获得更快,<br>更安全的页面响应速度) "></el-table-column>
	<el-table-column prop="operatetime" label="operate.time"></el-table-column>
</el-table>
<div id="logListtb" style="padding: 3px; height: 25px">
	<span style="float:left;">
		<a href="#" class="easyui-linkbutton l-btn l-btn-plain" plain="true" icon="icon-search" onclick="detail('{{ $t("common.view") }}','logController.do?logDetail','logList',680,450)" id="">
		{{ $t("common.view") }}
		</a>
	</span>
    <div style="float: right; padding-right: 15px;">
      	  日志类型: 
        <select name="operatetype" id="operatetype" onchange="logListsearch();">
            <option value="0">请选择</option>
            <option value="1">{{ $t("common.login") }}</option>
            <option value="2">{{ $t("common.logout") }}</option>
            <option value="3">{{ $t("common.insert") }}</option>
            <option value="4">{{ $t("common.delete") }}</option>
            <option value="5">{{ $t("common.update") }}</option>
            <option value="6">{{ $t("common.upload") }}</option>
            <option value="7">{{ $t("common.other") }}</option>
        </select>
        <span>
            <span style="vertical-align:middle;display:-moz-inline-box;display:inline-block;width: 80px;text-align:right;" title="操作时间">
            {{ $t("operate.time") }}: </span>
            <input type="text" name="operatetime_begin" id="operatetime_begin" style="width: 140px; " class="Wdate" onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'operatetime_end\')}',dateFmt:'yyyy-MM-dd HH:mm:ss'})">~
            <input type="text" name="operatetime_end" id="operatetime_end" style="width: 140px; margin-right: 20px;" class="Wdate"  onFocus="WdatePicker({minDate:'#F{$dp.$D(\'operatetime_begin\')}',dateFmt:'yyyy-MM-dd HH:mm:ss'})" />
        </span>
        <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="logListsearch();">{{ $t("common.query") }}</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="clearSearch();">{{ $t("common.clear") }}</a>
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
