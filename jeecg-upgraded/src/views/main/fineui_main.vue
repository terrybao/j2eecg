
<template>
  <div class="vue-component">
    <div class="layout-admin">
		<!-- top -->
		<header class="layout-header">
			<span class="header-logo"><img alt="image" width="190" height="68" src="plug-in/login/images/jeecg-aceplus.png" /></span>
			
			<div class="titlerow" >
				<div class="titlecell">
					<input id="searchbox" name="functionName" placeholder="请输入搜索关键字" class="searchbox" style="padding-right: 23px;border:0">
					<div class="iconssdiv" onclick="checkput()">
						<i class="iconfont icon-close ui-iconss" style="font-weight:700;font-size:14px;display:none"></i>
						<i class="iconfont icon-sousuo ui-iconss"></i>
					</div>
				</div>
			</div>
			<ul class="header-bar">
			
			<li class="header-bar-nav personInfo hiddenty-xs" style="cursor:pointer;"> 
				<i class="icon-font">&#xe751;</i>&nbsp;
				<span>控制面板</span>
				<i class="icon-font adminIcon" style="margin-right:5px;">&#xe607;</i>
				<ul class="header-dropdown-menu" style="padding-right:4px">
					<li>
	                         <a href="javascript:createdetailwindow('{{ $t("common.ssms.getSysInfos") }}','tSSmsController.do?goMySmsList',800,400)" title="系统消息">系统消息</a>
					</li>
					<li >
	                         <a href="javascript:window.open('http://www.jeecg.com')" title="JEECG官网">JEECG官网</a>
					</li>
					<li><a href="javascript:clearLocalstorage()">{{ $t("common.clear.localstorage") }}</a></li>
					<li><a href="javascript:toSwagger()">SwaggerUI</a></li>
				</ul>
			</li> 
			
			
			<li class="header-bar-nav hiddenty-xs"> 
				<a href="javascript:add('首页风格','userController.do?changestyle','',550,270)" title="换肤">
					<i class="icon-font">&#xe615;</i>&nbsp;风格切换
				</a>
			</li> 
				
				
			<li class="header-bar-nav personInfo">
				<a href="javascript:;" id="personInfo">
					<span>
						<img src="plug-in/themes/fineui/common/image/head.jpg" style="width:24px;display:inline-block;border-radius:20px">
						<span>${userName}</span>
						<i class="icon-font adminIcon" style="margin-right:5px;">&#xe607;</i>
					</span>
				</a>
				
				<ul class="header-dropdown-menu" style="padding-right:4px">
					<li>
						<a href="javascript:openwindow('个人信息','userController.do?userinfo')">
							个人信息
						</a>
					</li>
					<li>
                        <a href="javascript:add('{{ $t("common.change.password") }}','userController.do?changepassword','',550,200)">
                            {{ $t("common.change.password") }}
                        </a>
                    </li>
					<li>
						<a href="javascript:logout()">
							<i class="icon-off"></i>
							 {{ $t("common.logout") }}
						</a>
					</li>
				</ul>
				
			</li>
		</ul>
	</header>
		
		<!-- 左侧菜单 -->
		<aside class="layout-side">
			<ul class="side-menu">
				<t:menu style="fineui" menuFun="${menuMap}"></t:menu>
			</ul>
		</aside>
		
		<!-- 切换左侧菜单栏 -->
		<div id="toggleLeftMenu" class="layout-side-arrow" style="display:none">
			<div class="layout-side-arrow-icon">
				<i class="icon-font">&#xe60e;</i>
			</div>
		</div>
		
		<!-- 右侧home -->
		<section class="layout-main">
			<div class="layout-main-tab">
				<button onclick="toggleLeftMenu(this);" class="tab-btn btn-left" title="折叠菜单"><i class="icon-font">&#xe60e;</i></button>
				<!-- <button class="tab-btn btn-left" style="left:18px"><i class="icon-font">&#xe628;</i></button> -->
                <nav class="tab-nav">
                    <div class="tab-nav-content" id="tab-contents-div">
                    	<div id="tytabbottomsepar" class="f-tabstrip-header-inkbar"></div>
                        <a href="javascript:void(0);" id="myhomeAtag" class="content-tab active" data-id="home.html">
                        <span class="fa fa-home colorgray"></span>首页</a>
                    </div>
                </nav>
                 
                <button id="activeTabToolRefresh" class="tab-btn mytabbtn" style="right:30px;" title="刷新本页"><i class="icon-font" style="font-size:16px;">&#xe60b;</i></button>
                <button class="tab-btn btn-right"><i class="icon-font">&#xe629;</i></button>
			</div>
			<div class="layout-main-body" style="margin:0;overflow-y: hidden;">
				<iframe class="body-iframe" name="iframe0" width="100%" height="100%" 
						src="loginController.do?fineuiHome" frameborder="0" data-id="home.html" seamless></iframe>
			</div>
		</section>
		
	</div>
</div>
	
	
	
	
	
	
	<!-- 自动补全 -->
	<link rel="stylesheet" href="plug-in/jquery/jquery-autocomplete/jquery.autocomplete.css" type="text/css"></link>
	
	
	
	<!-- 在线聊天 -->
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
