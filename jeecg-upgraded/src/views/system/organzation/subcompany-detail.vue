
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
					<input id="id" name="id" type="hidden" />
					<input id="cc" type="hidden" name="TSPDepart.id">
		<table style="width: 100%;" cellpadding="0" cellspacing="1" class="formtable" disabled="disabled">
				<tr>
					<td align="right" style="width: 30%;height:30px">
						<label class="Validform_label">
							上级编码:
						</label>
					</td>
					<td class="value">
					         ${depart.TSPDepart.orgCode }
						</td>
				</tr>
				<tr>
					<td align="right" style="width: 30%;height:30px">
						<label class="Validform_label">
							上级名称:
						</label>
					</td>
					<td class="value">
					         ${depart.TSPDepart.departname }
						</td>
				</tr>
				<tr>
					<td align="right" style="width: 30%;height:30px">
						<label class="Validform_label">
							编码:
						</label>
					</td>
					<td class="value">
					         ${depart.orgCode }
						</td>
				</tr>
				<tr>
					<td align="right" style="width: 30%;height:30px">
						<label class="Validform_label">
							公司名称:
						</label>
					</td>
					<td class="value">
					         ${depart.departname }
					     	 
						</td>
				</tr>
				<tr>
					<td align="right" style="height:30px">
						<label class="Validform_label">
							公司描述:
						</label>
					</td>
					<td class="value">
					         ${depart.description }
					     	
						</td>
				</tr>
				<tr>
					<td align="right" style="height:30px">
						<label class="Validform_label">
							机构类型:
						</label>
					</td>
					<td class="value">
					         公司
					     	
						</td>
				</tr>
				<tr>
					<td align="right" style="height:30px">
						<label class="Validform_label">
							电话:
						</label>
					</td>
					<td class="value" style="height:30px">
					 		${depart.mobile }
					     	
						</td>
				</tr>
				<tr>
					<td align="right" style="height:30px">
						<label class="Validform_label">
							传真:
						</label>
					</td>
					<td class="value">
							${depart.fax }
					     	
						</td>
				</tr>
				<tr>
					<td align="right" style="height:30px">
						<label class="Validform_label">
							地址:
						</label>
					</td>
					<td class="value">
							${depart.address }
					     	 
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
