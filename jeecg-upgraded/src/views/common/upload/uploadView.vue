
<template>
  <div class="vue-component">
    <table cellpadding="0" cellspacing="1" class="formtable">
  <input id="documentTitle" type="hidden" name="documentTitle" value="blank"/>
  <input id="fileUrl" type="hidden"/>
  <input id="fileName" type="hidden"/>
  <input id="swfpath" type="hidden">
   <tbody>
    <tr>
     <td align="right">
       <label class="Validform_label"></label>
     </td>
     <td class="value">
      <t:upload onUploadStart="myUploadStart" name="instruction" dialog="false" multi="false" extend="" queueID="instructionfile" view="false" auto="true" uploader="cgUploadController.do?ajaxSaveFile" onUploadSuccess="uploadSuccess"  id="instruction" formData="documentTitle"></t:upload>
     </td>
    </tr>
    <tr>
     <td colspan="2" id="instructionfile" class="value">
     </td>
    </tr>
   </tbody>
  </table>
   <div id="fileShow" >
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
