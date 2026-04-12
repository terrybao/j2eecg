
<template>
  <div class="vue-component">
    <div id="alertMessage"></div>
    <div id="successLogin"></div>
    <div class="text_success"><img src="plug-in/login/images/loader_green.gif" alt="Please wait" /> <span>{{ $t("common.login.success.wait") }}</span></div>
    <div id="login">
        <div class="ribbon" style="background-image: url(plug-in/login/images/typelogin.png);"></div>
        <div class="inner">
            <div class="logo"><img src="plug-in/login/images/head.png" /><img src="plug-in/login/images/foot.png" /></div>
            <div class="formLogin">
                <form name="formLogin" id="formLogin" action="loginController.do?login" check="loginController.do?checkuser" method="post">
                    <input name="userKey" type="hidden" id="userKey" value="D1B5CC2FE46C4CC983C073BCA897935608D926CD32992B5900" />
                    <div class="tip">
                        <input class="userName" name="userName" type="text" id="userName" title="" iscookie="true" value="admin" nullmsg="" />
                    </div>
                    <div class="tip">
                        <input class="password" name="password" type="password" id="password" title="" value="123456" nullmsg="" />
                    </div>
                    <div>
                        <div style="float: right; margin-left:-150px; margin-right: 20px;">
                            <img id="randCodeImage" src="randCodeImage" />
                        </div>
                        <input class="randCode" name="randCode" type="text" id="randCode" title="" value="" nullmsg="" />
                    </div>
                   
                    <div class="loginButton">
                        <div style="float: left; margin-left: -9px;">
                            <input type="checkbox" id="on_off" name="remember" checked="ture" class="on_off_checkbox" value="0" />
                            <span class="f_help">{{ $t("common.remember.user") }}</span>
                        </div>                        
                        <div style="float: right; padding: 3px 0; margin-right: -12px;">
                            <div>
                                <ul class="uibutton-group">
                                    <li><a class="uibutton normal" href="#" id="but_login">{{ $t("common.login") }}</a></li>
                                    <li><a class="uibutton normal" href="#" id="forgetpass">{{ $t("common.reset") }}</a></li>
                                </ul>
                            </div>
                            
                            <br>                            
                            <el-select v-model="form.langCode" placeholder="请选择"></el-select>
                        </div>
                        <div class="clear"></div>
                    </div>
                    <div>
                        <div style="float: right; margin-left:-30px; margin-right: 40px;">
                           	 技术支持： <font color="red">JEECG开源社区</font>   &nbsp;&nbsp;&nbsp;  QQ群: <font color="red">106838471</font> &nbsp;&nbsp;&nbsp;  官网: <font color="red"><a href="http://www.jeecg.com"  target="_blank" >www.jeecg.com</a></font> 
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <div class="shadow"></div>
    </div>
    <!--Login div-->
    <div class="clear"></div>
    <div id="versionBar">
        <div class="copyright">&copy; {{ $t("common.copyright") }} <span class="tip"><a href="http://www.jeecg.com"  target="_blank" title={{ $t("common.platform") }}>jeecg</a> {{ $t("common.browser.recommend") }}<a href="http://www.jeecg.com" target="_blank" title={{ $t("common.platform") }}> Jeecg社区</a></span></div>
    </div>
    <!-- Link JScript-->
    
    
    
    
    
    
 <!--     -->
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
