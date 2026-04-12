
<template>
  <div class="vue-component">
    <div class="wrapper">

  <header class="main-header">
    <!-- Logo -->
    <a href="#" class="logo">
      <span class="logo-mini"><b>A</b>LT</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><img alt="image" width="190" height="68" style="margin: -9px 0px 0px -16px;" src="plug-in/login/images/jeecg-aceplus.png" /></span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
	   <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      
      <!-- update-begin-author:taoyan date:20181106 for:TASK #3147 【论坛问题】主题 AdminLTE的一些问题需要修复 -->
	  <div class="collapse navbar-collapse pull-left menulistDIV" id="navbar-collapse" style="height:50px !important;overflow:hidden !important">
      <!-- update-end-author:taoyan date:20181106 for:TASK #3147 【论坛问题】主题 AdminLTE的一些问题需要修复  -->
          <ul class="nav navbar-nav" id="menuAdmin">
          	<t:menu style="adminlte" menuFun="${menuMap}"></t:menu>
          </ul>
          
        </div>
	   
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
        	<!-- update-begin-author:taoyan date:20181106 for:更多菜单  -->
        	<li class="dropdown notifications-menu" id="deligateMenuContainer">
	            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
	              <i class="fa fa-caret-down"></i>
	            </a>
	            <ul class="dropdown-menu" >
	              <li>
	                <ul id="deligate-menu" style="height:auto !important">
	                </ul>
	              </li>
	            </ul>
            </li>
            <!-- update-end-author:taoyan date:20181106 for:更多菜单  -->
        	<!-- 系统公共选项 -->
        	<li class="dropdown notifications-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-cog fa-fw"></i>
              <span class="label label-warning">5</span>
            </a>
            <ul class="dropdown-menu">
              <li>
                <!-- inner menu: contains the actual data -->
                <ul class="menu">
                  <li>
                    <a href="javascript:createdetailwindow('{{ $t("common.ssms.getSysInfos") }}','tSSmsController.do?goMySmsList',800,400)" title="系统消息">
                      <i class="fa fa-users text-aqua"></i> 系统消息
                    </a>
                  </li>
                  <li>
                    <a href="javascript:window.open('http://www.jeecg.com')" title="JEECG官网">
                      <i class="fa fa-warning text-yellow"></i> JEECG官网
                    </a>
                  </li>
                  <li>
                    <a href="javascript:clearLocalstorage()">
                      <i class="fa fa-users text-red"></i> {{ $t("common.clear.localstorage") }}
                    </a>
                  </li>
                  <li><a href="javascript:toSwagger()"><i class="fa fa-users text-red"></i> SwaggerUI</a></li>
                  <li> 
					<a href="javascript:add('首页风格','userController.do?changestyle','',550,270)" title="换肤">
						<i class="fa fa-shopping-cart text-green"></i>风格切换
					</a>
				  </li> 
                </ul>
              </li>
            </ul>
          </li>
          <!-- Messages: style can be found in dropdown.less-->
          <li class="dropdown messages-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-envelope-o"></i>
              <span class="label label-success" id="messageCount">0</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header"  id="messageTip">0条消息</li>
              <li>
                <!-- inner menu: contains the actual data -->
                <ul class="menu" id="messageContent">
                </ul>
              </li>
              <li class="footer">
              	<a href="javascript:goAllMessage();" id="messageFooter">
              		查看所有消息
              		<i class="icon-arrow-right"></i>
              	</a>
              </li>
            </ul>
          </li>
          
          <!-- Notifications: style can be found in dropdown.less -->
          <li class="dropdown notifications-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-bell-o"></i>
              <span class="label label-warning" id="noticeCount">0</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header"  id="noticeTip">0条公告</li>
              <li>
                <!-- inner menu: contains the actual data -->
                <ul class="menu" id="noticeContent">
                  <li>
                    <a href="#" id="noticeContentLink">
                    </a>
                  </li>
                  
                </ul>
              </li>
              <li class="footer">
              	<a  href="javascript:goAllNotice();" id="noticeFooter">
              		查看全部
              		<i class="icon-arrow-right"></i>
              	</a>
              </li>
            </ul>
          </li>
          <!-- Tasks: style can be found in dropdown.less -->
          <!-- <li class="dropdown tasks-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-flag-o"></i>
              <span class="label label-danger">9</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">You have 9 tasks</li>
              <li>
                inner menu: contains the actual data
                <ul class="menu">
                  <li>Task item
                    <a href="#">
                      <h3>
                        Design some buttons
                        <small class="pull-right">20%</small>
                      </h3>
                      <div class="progress xs">
                        <div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar"
                             aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                          <span class="sr-only">20% Complete</span>
                        </div>
                      </div>
                    </a>
                  </li>
                  end task item
                  <li>Task item
                    <a href="#">
                      <h3>
                        Create a nice theme
                        <small class="pull-right">40%</small>
                      </h3>
                      <div class="progress xs">
                        <div class="progress-bar progress-bar-green" style="width: 40%" role="progressbar"
                             aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                          <span class="sr-only">40% Complete</span>
                        </div>
                      </div>
                    </a>
                  </li>
                  end task item
                  <li>Task item
                    <a href="#">
                      <h3>
                        Some task I need to do
                        <small class="pull-right">60%</small>
                      </h3>
                      <div class="progress xs">
                        <div class="progress-bar progress-bar-red" style="width: 60%" role="progressbar"
                             aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                          <span class="sr-only">60% Complete</span>
                        </div>
                      </div>
                    </a>
                  </li>
                  end task item
                  <li>Task item
                    <a href="#">
                      <h3>
                        Make beautiful transitions
                        <small class="pull-right">80%</small>
                      </h3>
                      <div class="progress xs">
                        <div class="progress-bar progress-bar-yellow" style="width: 80%" role="progressbar"
                             aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                          <span class="sr-only">80% Complete</span>
                        </div>
                      </div>
                    </a>
                  </li>
                  end task item
                </ul>
              </li>
              <li class="footer">
                <a href="#">View all tasks</a>
              </li>
            </ul>
          </li> -->

          <!-- User Account: style can be found in dropdown.less -->
          <li class="dropdown user user-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <img src="plug-in/themes/fineui/common/image/head.jpg" class="user-image" alt="User Image">
              <span class="hidden-xs">${userName}</span>
            </a>
            <ul class="dropdown-menu">
              <!-- User image -->
              <li class="user-header" style="height:175px;">
                <img src="plug-in/themes/fineui/common/image/head.jpg" class="img-circle" alt="User Image">
               	<p style="color: #ffffff;font-size:14px">
                <span>{{ $t("common.user") }}:</span>
                <span>${userName }</span><br />
                <span>{{ $t("current.org") }}:</span>
                <span>${currentOrgName }</span><br />
                <span>{{ $t("common.role") }}:</span>
                <span>${roleName }</span>
                </p>
              </li>
              <!-- Menu Body -->
              <li class="user-body">
                <div class="row">
                  <div class="col-xs-4 text-center">
                    <a href="javascript:openwindow('个人信息','userController.do?userinfo')">个人信息</a>
                  </div>
                  <div class="col-xs-4 text-center">
                    <a href="javascript:add('{{ $t("common.change.password") }}','userController.do?changepassword','',550,200)">修改密码</a>
                  </div>
                  <div class="col-xs-4 text-center">
                  	<a href="javascript:logout()" >退出</a>
                  </div>
                </div>
                <!-- /.row -->
              </li>
              <!-- Menu Footer-->
              <!-- <li class="user-footer">
                <div class="pull-right">
                  <a href="javascript:logout()" class="btn btn-default btn-flat">退出</a>
                </div>
              </li> -->
            </ul>
          </li>
          <!-- Control Sidebar Toggle Button -->
          <!-- <li>
            <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
          </li> -->
        </ul>
      </div>
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar user panel -->
      <!-- search form -->
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu">
        
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper" id="content-wrapper" style="min-height: 600px;">
        <!--bootstrap tab风格 多标签页-->
        <div class="content-tabs">
            <button class="roll-nav roll-left tabLeft" onclick="scrollTabLeft()">
                <i class="fa fa-backward"></i>
            </button>
            <nav class="page-tabs menuTabs tab-ui-menu" id="tab-menu">
                <div class="page-tabs-content" style="margin-left: 0px;">

                </div>
            </nav>
            <button class="roll-nav roll-right tabRight" onclick="scrollTabRight()">
                <i class="fa fa-forward" style="margin-left: 3px;"></i>
            </button>
            <div class="btn-group roll-nav roll-right">
                <button class="dropdown tabClose" data-toggle="dropdown">
                    页签操作<i class="fa fa-caret-down" style="padding-left: 3px;"></i>
                </button>
                <ul class="dropdown-menu dropdown-menu-right" style="min-width: 128px;">
                    <li><a class="tabReload" href="javascript:refreshTab();">刷新当前</a></li>
                    <li><a class="tabCloseCurrent" href="javascript:closeCurrentTab();">关闭当前</a></li>
                    <li><a class="tabCloseAll" href="javascript:closeOtherTabs(true);">全部关闭</a></li>
                    <li><a class="tabCloseOther" href="javascript:closeOtherTabs();">除此之外全部关闭</a></li>
                </ul>
            </div>
            <button class="roll-nav roll-right fullscreen" onclick="App.handleFullScreen()"><i
                    class="fa fa-arrows-alt"></i></button>
        </div>
        <div class="content-iframe " style="background-color: #ffffff; ">
            <div class="tab-content " id="tab-content">

            </div>
        </div>
    </div>
    <!-- /.content-wrapper -->
  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> {{ $t("system.version.number") }}
    </div>
    {{ $t("common.copyright") }}
    <a href="http://www.jeecg.com" title="JEECG Framework  {{ $t("system.version.number") }}">JEECG Framework  {{ $t("system.version.number") }}</a>
           (推荐谷歌浏览器，获得更快响应速度) 技术支持:
           <a href="#" title="JEECG Framework  {{ $t("system.version.number") }}">JEECG Framework  {{ $t("system.version.number") }}</a>
  </footer>

  <!-- Control Sidebar -->
  <aside id="control-sidebar" class="control-sidebar control-sidebar-dark">
    
  </aside>
  <!-- /.control-sidebar -->
  <!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->
<!-- jQuery 3 -->



<!-- jQuery UI 1.11.4 -->

<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->

<!-- Bootstrap 3.3.7 -->

<!-- Slimscroll -->

<!-- FastClick -->

<!-- AdminLTE App -->

<!-- AdminLTE for demo purposes -->

<!-- AdminLTE App -->


<!--tabs-->
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
