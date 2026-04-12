
<template>
  <div class="vue-component">
    <h3>第一种：带悬浮框的</h3>
<div class="demo clearfix" style="padding-bottom:200px">
   <div class="emot_photo_video" style="position: relative;">
       <div id="btn" class="uploadify-button" style="position: relative;cursor:pointer;height: 18px; line-height: 18px; width: 80px;">
       		<span class="uploadify-button-text">选择图片</span>
       	</div>
       
   		<div id="container" class="moxie-shim moxie-shim-html5" style="position: absolute; top: 0px; left: 0px; width: 48px; height: 18px; overflow: hidden; z-index: 0;">
   			<input id="html5fileupload" type="file" style="font-size: 999px; opacity: 0; position: absolute; top: 0px; left: 0px; width: 100%; height: 100%;" multiple="" accept="image/jpeg,image/png,image/gif">
   		</div>
   </div>
</div>
       
<div class="photo_upload_box_outside blur_area" id="photo_upload_box_outside" tabindex="2000"> 
    <div class="photo_upload_box"> 
        <a class="photo_upload_close"href="javascript:void(0);"onclick="photo_upload_close()"></a> 
        <h1>本地上传</h1>
        <p class="upload_num">共<span id="uploaded_length">0</span>张，还能上传<span id="upload_other">9</span>张</p> 
        <ul id="ul_pics" class="ul_pics clearfix"> 
            <li id="local_upload"><img src="plug-in/plupload/jquery.ui.plupload/img/local_upload.png" id="btn2"/></li> 
        </ul> 
        <div class="arrow_layer"> 
            <span class="arrow_top_area"><i class="arrow_top_bg"></i><em class="arrow_top"></em></span> 
        </div> 
    </div> 
</div>



<h3>第二种：直接选取</h3>
<div style="cursor:pointer">
 <ul id="picsUl" class="ul_pics clearfix"> 
     <li id="local_upload1">
     	<img src="plug-in/plupload/jquery.ui.plupload/img/local_upload.png" id="picsPicker"/>
     </li> 
 </ul> 
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
