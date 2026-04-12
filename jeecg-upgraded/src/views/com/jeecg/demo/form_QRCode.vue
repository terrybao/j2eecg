
<template>
  <div class="vue-component">
    <div>
  <div id="qrfun-left">
       
		<div >
			<label class="Validform_label" style="font-size: 1.1rem;"> 二维码内容： </label>
			<input type="text" name="content" class="form-control form-control-lg"  style="width:80%;font-size: 1.1rem;" id="content" value="http://www.jeecg.com" />
      		 <a id="downloadLink"></a>
        </div>
         <div>
      
            <label class="m-b" style="font-size: 1.1rem;"> 二维码大小： </label>
            <input type="text" class="form-control form-control-lg" style="font-size: 1.1rem;" name="codesize" id="codesize" value="220" onkeyup="value=value.replace(/[^\d]/g,'')">
       		<span style="font-size: 1.1rem;">px</span>
       		<a class="btn green"  href="javascript:make2DCode();" style="position: absolute;left: 26%;top: 173px;"> 生成二维码 </a>
          
            
         
        </div>
    </div>
	<div  id="qrfun-box">
		<div class="qrcode">
       		<table class="qrimage-wrap white b-a text-center" id="click-create">
        	<tbody>
         	<tr>
          		<td style="width:220px; height:220px;">
          			<div style="margin:auto;">
            			<div id="qrcode" align="center"></div>
					</div>
				</td>
         	</tr>
        	</tbody>
       		</table>
       		<div id="text-he" class="text-center" style="padding-top:10px;">
      		<a class="btn green btn-block" href="javascript:downloadqrcode();" style="width:220px;"> 下载二维码 </a>
        </div>
      	</div>
      	
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
