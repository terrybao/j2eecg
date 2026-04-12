
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
					<input id="id" name="id" type="hidden" />
					<input id="cc" type="hidden" name="TSPDepart.id" value="${pid }">
		<table style="width: 100%;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							岗位名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="departname" name="departname" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">岗位名称</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							岗位描述:
						</label>
					</td>
					<td class="value">
					     	 <textarea id="description" name="description" rows="5" cols="80"></textarea>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">岗位描述</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							机构类型:
						</label>
					</td>
					<td class="value">
					     	 
					        <input name="orgType" id="orgType" type="radio" value="3" checked="checked"/> 岗位
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">机构类型</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							电话:
						</label>
					</td>
					<td class="value">
					     	 <input id="mobile" name="mobile" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">电话</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							传真:
						</label>
					</td>
					<td class="value">
					     	 <input id="fax" name="fax" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">传真</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							地址:
						</label>
					</td>
					<td class="value">
					     	 <input id="address" name="address" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">地址</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
						</label>
					</td>
					<td class="value">
					     	<button type="button" class="blueButton" style="width:80px;height:30px" onclick="formSubmit();">保存 </button>
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
