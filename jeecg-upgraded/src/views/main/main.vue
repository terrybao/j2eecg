
<template>
  <div class="vue-component">
    <!-- 顶部-->
<div region="north" border="false" title=" JEECG Framework  {{ $t("system.version.number") }}" style="BACKGROUND: #E6E6FA; height: 85px; padding: 1px; overflow: hidden;">
<table width="100%" border="0" cellpadding="0" cellspacing="0">
<tr>
    <td align="left" style="vertical-align: text-bottom;"><img src="plug-in/login/images/head.png;"> <img src="plug-in/login/images/foot.png"></td>
    <td align="right" nowrap>
        <table>
            <tr>
                <td valign="top" height="50">
                    <span style="color: #CC33FF">{{ $t("common.user") }}:</span>
                    <span style="color: #666633">${userName }</span>
                    <span style="color: #CC33FF">{{ $t("current.org") }}:</span>
                    <span style="color: #666633">${currentOrgName }</span>
                    <span style="color: #CC33FF">{{ $t("common.role") }}:</span>
                    <span style="color: #666633">${roleName }</span>
                </td>
            </tr>
            <tr>
                <div style="position: absolute; right: 0px; bottom: 0px;">
                    <a href="javascript:void(0);" class="easyui-menubutton" menu="#layout_north_kzmbMenu" iconCls="icon-help">
                        {{ $t("common.control.panel") }}
                    </a>
                    <a href="javascript:void(0);" class="easyui-menubutton" menu="#layout_north_zxMenu" iconCls="icon-back">
                        {{ $t("common.logout") }}
                    </a>
                </div>
                <div id="layout_north_kzmbMenu" style="width: 100px; display: none;">
                    <div onclick="openwindow('{{ $t("common.profile") }}','userController.do?userinfo')">
                        {{ $t("common.profile") }}
                    </div>
                    <div class="menu-sep"></div>
                    <div onclick="add('{{ $t("common.change.password") }}','userController.do?changepassword','', 550, 200)">
                        {{ $t("common.change.password") }}
                    </div>
					<div class="menu-sep"></div>
                    <div onclick="createdetailwindow('{{ $t("common.ssms.getSysInfos") }}','tSSmsController.do?goMySmsList',800,400)">
                        {{ $t("common.ssms.getSysInfos") }}
                    </div>
                    <div class="menu-sep"></div>
                    <div onclick="add('{{ $t("common.change.style") }}','userController.do?changestyle','',550,250)">
                        {{ $t("common.my.style") }}
                    </div>
                    
                    <div class="menu-sep" ></div>
                    <div onclick="window.open('http://www.jeecg.com')">
                         	JEECG官网
                    </div>
                    
                    <div onclick="clearLocalstorage()">
                        {{ $t("common.clear.localstorage") }}
                    </div>
                </div>
                <div id="layout_north_zxMenu" style="width: 100px; display: none;">
                    <div class="menu-sep"></div>
                    <div onclick="exit('loginController.do?logout','{{ $t("common.exit.confirm") }}',1);">{{ $t("common.exit") }}</div>
                </div>
            </tr>
        </table>
    </td>
    <td align="right">&nbsp;&nbsp;&nbsp;</td>
</tr>
</table>
</div>
<!-- 左侧-->
<div region="west" split="true" href="loginController.do?left" title="{{ $t("common.navegation") }}" style="width: 200px; padding: 1px;"></div>
<!-- 中间-->
<div id="mainPanle" region="center" style="overflow: hidden;">
	<style type="text/css">  
	<!--  
	.proccess{display:none;background-color:#f2f2f2;border:0px solid;border-color:#009900;height:100%;line-height:600px;width:100%;text-align:center;margin:100;position:absolute;top:0;left:0;}  
	.proccess b{vertical-align:middle;background:url(plug-in/layer/skin/default/loading-2.gif) no-repeat 0 center;padding-left:55px;display:inline-block;}  
	-->  
	</style> 
	<div class="proccess" id="panelloadingDiv"><b>&nbsp;</b></div>
    <div id="maintabs" class="easyui-tabs" fit="true" border="false">
    <div class="easyui-tab" title="{{ $t("common.dash_board") }}" href="loginController.do?home" style="padding: 2px; overflow: hidden;"></div>
        <c:if test="${map=='1'}">
            <div class="easyui-tab" title="{{ $t("common.map") }}" style="padding: 1px; overflow: hidden;">
                <iframe name="myMap" id="myMap" scrolling="no" frameborder="0" src="mapController.do?map" style="width: 100%; height: 99.5%;"></iframe>
            </div>
        </c:if>
    </div>
</div>
<!-- 右侧 -->
<div collapsed="true" region="east" iconCls="icon-reload" title="{{ $t("common.assist.tools") }}" split="true" style="width: 190px;"
	data-options="onCollapse:function(){easyPanelCollapase()},onExpand:function(){easyPanelExpand()}">
    <!--<div id="tabs" class="easyui-tabs" border="false" style="height: 240px">
        <div title="{{ $t("common.calendar") }}" style="padding: 0px; overflow: hidden; color: red;">
            <div id="layout_east_calendar"></div>
        </div>
    </div>
    <div id="layout_jeecg_onlinePanel" data-options="fit:true,border:false" title={{ $t("common.online.user") }}>
        <table id="layout_jeecg_onlineDatagrid"></table>
    </div>
    -->
    
    <div class="easyui-layout" fit="true" border="false">
		<div region="north" border="false" style="height:180px;overflow: hidden;">
			<div id="tabs" class="easyui-tabs" border="false" style="height: 240px">
				<div title='{{ $t("common.calendar") }}' style="padding: 0px; overflow: hidden; color: red;">
					<div id="layout_east_calendar"></div>
				</div>
			</div>
		</div>
		<div region="center" border="false" style="overflow: hidden;">
			<div id="layout_jeecg_onlinePanel" fit="true" border="false" title='{{ $t("common.online.user") }}'>
				<table id="layout_jeecg_onlineDatagrid"></table>
			</div>
		</div>
	</div>
</div>
<!-- 底部 -->
<div region="south" border="false" style="height: 25px; overflow: hidden;">
    <div align="center" style="color: #CC99FF; padding-top: 2px">&copy;
        {{ $t("common.copyright") }}
        <span class="tip">
            <a href="http://www.jeecg.com" title=" JEECG Framework  {{ $t("system.version.number") }}"> JEECG Framework  {{ $t("system.version.number") }}</a>
            {{ $t("common.copyright") }}:
            <a href="#" title=" JEECG Framework  {{ $t("system.version.number") }}">JEECG Framework  {{ $t("system.version.number") }}</a>
        </span>
    </div>
</div>
<div id="mm" class="easyui-menu" style="width: 150px;">
    <div id="mm-tabupdate">{{ $t("common.refresh") }}</div>
    <div id="mm-tabclose">{{ $t("common.close") }}</div>
    <div id="mm-tabcloseall">{{ $t("common.close.all") }}</div>
    <div id="mm-tabcloseother">{{ $t("common.close.all.but.this") }}</div>
    <div class="menu-sep"></div>
    <div id="mm-tabcloseright">{{ $t("common.close.all.right") }}</div>
    <div id="mm-tabcloseleft">{{ $t("common.close.all.left") }}</div>
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
