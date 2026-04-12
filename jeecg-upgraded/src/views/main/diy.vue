
<template>
  <div class="vue-component">
    <!-- #section:basics/navbar.layout -->
<div id="navbar" class="navbar navbar-default">
    

    <div class="navbar-container" id="navbar-container">
        
        <!-- #section:basics/sidebar.mobile.toggle -->
        <button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler" data-target="#sidebar">
            <span class="sr-only">Toggle sidebar</span>

            <span class="icon-bar"></span>

            <span class="icon-bar"></span>

            <span class="icon-bar"></span>
        </button>

        <!-- /section:basics/sidebar.mobile.toggle -->
        <div class="navbar-header pull-left" style="margin-top: 10px;">
            <!-- #section:basics/navbar.layout.brand -->
            <a href="#" class="navbar-brand">
                <small>
                    <!-- <i class="fa fa-leaf"></i> -->
                    {{ $t("jeect.platform") }}
                </small>
            </a>
            <!-- /section:basics/navbar.layout.brand -->

            <!-- #section:basics/navbar.toggle -->

            <!-- /section:basics/navbar.toggle -->
        </div>

        <!-- #section:basics/navbar.dropdown -->
        <div class="navbar-buttons navbar-header pull-right" role="navigation">
            <ul class="nav ace-nav">
                <!-- #section:basics/navbar.user_menu -->
                <li class="light-blue" style="margin-top: 16px;">
                    <a data-toggle="dropdown" href="#" class="dropdown-toggle">
                        
								<span class="user-info">
									<small style="color:#D50001;">欢迎,${userName }</small>
									<span style="color: #CC33FF">
                    <span style="color: #000000">{{ $t("common.role") }}:</span>
                    <span style="color: #000000">${roleName }</span>
								</span>

								<i class="ace-icon fa fa-caret-down"></i>
                    </a>

                    <ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                        <li>
                            <a href="javascript:add('{{ $t("common.change.password") }}','userController.do?changepassword','',550,200)">
                                <i class="ace-icon fa fa-cog"></i>
                                {{ $t("common.change.password") }}
                            </a>
                        </li>

                        <li>
                            <a href="javascript:openwindow('{{ $t("common.profile") }}','userController.do?userinfo')">
                                <i class="ace-icon fa fa-user"></i>
                                {{ $t("common.profile") }}
                            </a>
                        </li>
                        <li>
                            <a href="javascript:openwindow('{{ $t("common.ssms.getSysInfos") }}','tSSmsController.do?getSysInfos')">
                                <i class="ace-icon fa fa-user"></i>
                                {{ $t("common.ssms.getSysInfos") }}
                            </a>
                        </li>
                        <li>
                            <a href="javascript:add('{{ $t("common.change.style") }}','userController.do?changestyle','',550,200)">
                                <i class="ace-icon fa fa-user"></i>
                                {{ $t("common.my.style") }}
                            </a>
                        </li>

                        <li>
                            <a href="javascript:clearLocalstorage()">
                                <i class="ace-icon fa fa-warning"></i>
                                {{ $t("common.clear.localstorage") }}
                            </a>
                        </li>

                        <li class="divider"></li>

                        <li>
                            <a href="javascript:logout()">
                                <i class="ace-icon fa fa-power-off"></i>
                                {{ $t("common.logout") }}
                            </a>
                        </li>
                    </ul>
                </li>

                <!-- /section:basics/navbar.user_menu -->
            </ul>
        </div>
        <div>
            <tr style="height: 80px;">
                <td colspan="2">
                    <ul class="shortcut">
                        <!-- 动态生成并赋值过来 -->
                    </ul>
                </td>
            </tr>
        </div>
        <!-- /section:basics/navbar.dropdown -->
    </div><!-- /.navbar-container -->
</div>

<!-- /section:basics/navbar.layout -->
<div class="main-container" id="main-container">
    

    <!-- #section:basics/sidebar -->
    <div id="sidebar" class="sidebar                  responsive">
        

        <!-- /.sidebar-shortcuts -->

        <ul class="nav nav-list">
            <li class="">
                <a  href="javascript:loadModule('首页','loginController.do?home')">
                    <i class="menu-icon fa fa-home"></i>
                    <span class="menu-text"> 首页 </span>
                </a>

                <b class="arrow"></b>
            </li>
            <t:menu style="diy" menuFun="${menuMap}"></t:menu>
        </ul><!-- /.nav-list -->

        <!-- #section:basics/sidebar.layout.minimize -->
        <div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
            <i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
        </div>

        <!-- /section:basics/sidebar.layout.minimize -->
        
    </div>
    <div class="main-content" >
        <!-- /section:basics/sidebar -->
        <!-- #section:basics/content.breadcrumbs -->
        <div class="breadcrumbs" id="breadcrumbs" style="display:none">
            

            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="#">首页</a>
                </li>
            </ul><!-- /.breadcrumb -->

            <!-- #section:basics/content.searchbox -->
            <div class="nav-search" id="nav-search">
                <form class="form-search">
							<span class="input-icon">
								<input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
								<i class="ace-icon fa fa-search nav-search-icon"></i>
							</span>
                </form>
            </div><!-- /.nav-search -->

            <!-- /section:basics/content.searchbox -->
        </div>

        <!-- /section:basics/content.breadcrumbs -->
        <div class="page-content" style="padding:0px" >
            <!-- #section:settings.box -->
            <!-- /.ace-settings-container -->

            <!-- /section:settings.box -->
            <div class="page-content-area" data-ajax-content="false"  >
                <div id="tabs">
                    <!-- Nav tabs -->
                    <ul class="nav nav-tabs" role="tablist" style="height: 35px;">
                        <li role="presentation" class="active"><a href="#tabs-1" aria-controls="tabs-1" role="tab" data-toggle="tab">首页<i class="fa fa-times"></i></a></li>
                    </ul>

                    <!-- Tab panes -->
                    <div class="tab-content">
                        <div id="tabs-1" style="padding:0px" role="tabpanel" class="tab-pane active">
                            <iframe style="width:100%;height:700px;margin:0px;padding:0px" scrolling="auto" frameborder="0" id="center"  src="loginController.do?home" ></iframe>
                        </div>
                    </div>
                </div>
            </div>
            
        </div>
    </div>


    <div class="footer">
        <div class="footer-inner">
            <!-- #section:basics/footer -->
            <div class="footer-content">
						<span class="bigger-120">
							<span class="blue bolder">JEECG</span>
							 Application &copy; {{ $t("system.version.number") }}
						</span>

                &nbsp; &nbsp;
						<span class="action-buttons">
							<a href="#">
                                <i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
                            </a>

							<a href="#">
                                <i class="ace-icon fa fa-facebook-square text-primary bigger-150"></i>
                            </a>

							<a href="#">
                                <i class="ace-icon fa fa-rss-square orange bigger-150"></i>
                            </a>
						</span>
            </div>

            <!-- /section:basics/footer -->
        </div>
    </div>

    <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
        <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
    </a>
</div><!-- /.main-container -->
<!-- basic scripts -->

<!--[if !IE]> -->


<!-- <![endif]-->
<div id="changestylePanel" style="display:none" ><form id="formobj"  action="userController.do?savestyle" name="formobj" method="post">
    <table style="width: 550px" cellpadding="0" cellspacing="1" class="formtable">
        <tr><td >风格</td></tr>
        <tr>
            <td class="value"><input type="radio" value="default" name="indexStyle" /> <span>经典风格</span></td>
        </tr>
        <!--
        <tr>
            <td class="value"><input type="radio" value="bootstrap" name="indexStyle" /> <span>BootStrap风格</span></td>
        </tr>
        -->
        <tr>
            <td class="value"><input type="radio" value="shortcut" name="indexStyle" /> <span>ShortCut风格</span></td>
        </tr>
        <tr>
            <td class="value"><input type="radio" value="sliding" name="indexStyle"  /><span>Sliding云桌面</span></td>
        </tr>
        <tr>
            <td class="value"><input type="radio" value="ace" name="indexStyle"  /><span>ACE平面风格</span></td>
        </tr>
    </table></form>
</div>
<div id="changepassword" style="display:none">

    <input id="id" type="hidden" value="${user.id }">
    <table style="width: 550px" cellpadding="0" cellspacing="1" class="formtable">
        <tbody>
        <tr>
            <td align="right" width="20%"><span class="filedzt">原密码:</span></td>
            <td class="value"><input id="password" type="password" value="" name="password" class="inputxt" datatype="*" errormsg="请输入原密码" /> <span class="Validform_checktip"> 请输入原密码 </span></td>
        </tr>
        <tr>
            <td align="right"><span class="filedzt">新密码:</span></td>
            <td class="value"><input  type="password" value="" name="newpassword" class="inputxt" plugin="passwordStrength" datatype="*6-18" errormsg="密码至少6个字符,最多18个字符！" /> <span
                    class="Validform_checktip"> 密码至少6个字符,最多18个字符！ </span> <span class="passwordStrength" style="display: none;"> <b>密码强度：</b> <span>弱</span><span>中</span><span class="last">强</span> </span></td>
        </tr>
        <tr>
            <td align="right"><span class="filedzt">重复密码:</span></td>
            <td class="value"><input id="newpassword" type="password" recheck="newpassword" datatype="*6-18" errormsg="两次输入的密码不一致！"> <span class="Validform_checktip"></span></td>
        </tr>
        </tbody>
    </table>
</div>
<!--[if IE]>

<![endif]-->









<!-- ace scripts -->






















</t:base>
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
