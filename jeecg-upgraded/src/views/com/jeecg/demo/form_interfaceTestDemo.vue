
<template>
  <div class="vue-component">
    <h1 align="center">接口测试</h1>
  <el-form :model="form" ref="form" label-width="80px">
			<table cellpadding="0" cellspacing="1" class="formtable">
				<tr>
				<td align="right">
						<label class="Validform_label" style="font-size: 14px">
							  请求类型：
						</label>
					</td>
					<td style="height: 40px;padding-left: 15px">
						<input name="requestMethod"  class="form-control i-checks" type="radio" value="GET" checked="checked" >GET
						<input name="requestMethod"  class="form-control i-checks" type="radio" value="POST"  >POST 
						&nbsp;&nbsp;<span><font color="gray">默认GET请求方式</font></span> 
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label" style="font-size: 14px">
							 请求的URL：
						</label>
					</td>
					<td class="value" style="padding-left: 15px">
						<input type="text" id="serverUrl" placeholder="输入请求地址" value=""  style="width:600px;height: 40px" datatype="url">
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label" style="font-size: 14px">
							 请求参数：
						</label>
					</td>
					<td class="value" style="padding-left: 15px">
						  <input type="text" id="requestBody" placeholder="输入请求参数" value="" style="width:600px;height: 40px" >
                           <span><font color="gray">格式:  name1=value1&name2=value2, 如果是get请求请留空。</font></span>

					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label" style="font-size: 14px">
							返回结果:
						</label>
					</td>
					<td class="value" style="padding-left: 15px">
						 <textarea id="json-field" title="返回结果" style="width:600px;height: 100px"></textarea>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label" style="font-size: 14px">
							操作：
						</label>
					</td>
					<td class="value" style="padding-left: 15px">
						 <button class="ace_button" style="width: 10%;height:30px;font-size: 12px" onclick="sendSever();">确定</button>&nbsp;
				 		 <button class="ace_button" style="width: 10%;height:30px;font-size: 12px" onclick="gReload();">重置</button>
					</td>
				</tr>
			</table>
		</el-form>
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
