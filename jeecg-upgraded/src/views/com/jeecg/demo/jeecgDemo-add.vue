
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
		<input id="id" name="id" type="hidden" value="${jeecgDemoPage.id }"/>
		<table style="width: 90%;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="name" name="name" type="text" style="width: 150px" class="inputxt"  datatype="*"/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">名称</label>
					</td>
					<!-- <td rowspan="10">
						<div id="touxiang" style="width:100px;vertical-align:top"></div>
					</td> -->
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							年龄:
						</label>
					</td>
					<td class="value">
					
					     	 <input id="age" value="" name="age" type="text" style="width: 150px" class="inputxt" datatype="d"/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">年龄</label>
						</td>
				</tr>
				<!-- <td class="value"> -->
				<tr>
					<td align="right">
						<label class="Validform_label">
							生日:
						</label>
					</td>
					<td class="value">
							   <input id="birthday" name="birthday" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()" 
					      						/>    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">生日</label>
						</td>
				</tr>
				
				<tr>
					<td align="right">
						<label class="Validform_label">
							部门:
						</label>
					</td>
					<td class="value">
							  <el-select v-model="form.sex" placeholder="请选择"></el-select>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">性别</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							入职状态:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="status" type="list" 
									typeGroupCode="sf_yn" defaultVal="N" hasLabel="false"  title="入职状态" ></el-select>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">入职状态</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							图片:
						</label>
					</td>
					<td class="value">
					<t:webUploader type="image" displayTxt="false" bizType="photosucai" name="touxiang" auto="true" ></t:webUploader>
						<span class="Validform_checktip Validform_right" style="display: none;">图片已上传</span>
					</td>
				</tr>
				
				<tr>
					<td align="right">
						<label class="Validform_label">
							附件:
						</label>
					</td>
					<td class="value">
						<t:webUploader auto="true" name="fujian" fileNumLimit="3" datatype="*"></t:webUploader>
						<span class="Validform_checktip Validform_right" style="display: none;">文件已上传</span>
					</td>
				</tr>
				<t:hasPermission code="jeecgdemo_add">
				<tr>
					<td align="right">
						<label class="Validform_label">
							个人介绍:
						</label>
					</td>
					<td class="value">
								
								
						    	<textarea name="content" id="content" style="width: 100%;height:300px"></textarea>
							    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">个人介绍</label>
						</td>
				</tr>
				</t:hasPermission>
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
