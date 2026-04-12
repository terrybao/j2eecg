
<template>
  <div class="vue-component">
    <!-- 头部菜单导航-->
<div id="header">
<div class="navbar">
<div class="navbar-inner">
<div class="container-fluid"><a class="brand" href="http://www.jeecg.com" target="_blank">{{ $t("common.platform") }} &nbsp;&nbsp;<span class="slogan"></span></a>
<div class="nav-no-collapse bootstrap-menu">

<ul class="nav pull-right usernav">
	<li style="line-height: 43px;"><span style="color: #CC33FF">{{ $t("common.user") }}:</span><span style="color: #666633">(${userName })</span> <span style="color: #CC33FF">{{ $t("common.role") }}</span>:<span style="color: #666633">${roleName
	}</span></li>
	<li class="dropdown"><a href="#" class="dropdown-toggle avatar" data-toggle="dropdown"> <i class="icon-wrench"></i> <span class="txt">{{ $t("common.control.panel") }}</span> <b class="caret"></b> </a>
	<ul class="dropdown-menu">
		<li onclick="openwindow('{{ $t("common.profile") }}','userController.do?userinfo')"><a href="javascript:;"><i class="icon-user"></i> {{ $t("common.profile") }}</a></li>
		<li onclick="add('{{ $t("common.change.password") }}','userController.do?changepassword')"><a href="javascript:;"><i class="icon-pencil"></i> {{ $t("common.change.password") }}</a></li>
		<li onclick="openwindow('{{ $t("common.ssms.getSysInfos") }}','tSSmsController.do?getSysInfos')"><a href="javascript:;"><i class="icon-pencil"></i> {{ $t("common.ssms.getSysInfos") }}</a></li>
		<li onclick="add('{{ $t("common.change.style") }}','userController.do?changestyle')"><a href="javascript:;"><i class="icon-retweet"></i> {{ $t("common.change.style") }}</a></li>
	</ul>
	</li>
	<li class="dropdown"><a href="#" class="dropdown-toggle avatar" data-toggle="dropdown"> <i class="icon-arrow-left"></i> <span class="txt">{{ $t("common.logout") }}</span> <b class="caret"></b> </a>
	<ul class="dropdown-menu">
		<li onclick="exit('loginController.do?logout','{{ $t("common.exit.confirm") }}',1);"><a href="javascript:;"><i class="icon-off"></i>{{ $t("common.exit") }}</a></li>
	</ul>
	</li>
</ul>
</div>
<!-- /.nav-collapse --></div>
</div>
<!-- /navbar-inner --></div>
<!-- /navbar --></div>
<!-- End #header -->

<!-- 中间 -->
<div id="wrapper" class="bootstrap-center"></div>

<!-- 底部 -->
<footer class="footer">
<div class="container">
<ul class="footer-links">
	<li style="display: inline;">&copy; {{ $t("common.copyright") }}<a href="http://www.jeecg.com" title="JEECG Framework  {{ $t("system.version.number") }}">JEECG Framework  {{ $t("system.version.number") }}</a></li>
	<li style="display: inline;">&nbsp;{{ $t("common.copyright") }}{{ $t("common.browser") }}:<a title="JEECG Framework  {{ $t("system.version.number") }}" href="http://www.jeecg.com">JEECG Framework  {{ $t("system.version.number") }}</a></li>
</ul>
</div>
</footer>
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
