
<template>
  <div class="vue-component">
    <el-form :model="form" ref="form" label-width="80px">
	<table style="width: 550px" cellpadding="0" cellspacing="1" class="formtable">
		<tbody><th>首页风格</th>
			<!--
			<tr>
				<td class="value"><input type="radio" value="bootstrap" name="indexStyle" /> <span>BootStrap风格</span></td>
			</tr>
			-->
			<tr>
				<td class="value"><input type="radio" value="acele" name="indexStyle"  /><span>ACE平面风格</span></td>
			</tr>
			<tr>
				<td class="value"><input type="radio" value="shortcut" name="indexStyle" /> <span>ShortCut风格</span></td>
			</tr>
			<tr>
				<td class="value"><input type="radio" value="default" name="indexStyle" /> <span>经典风格</span></td>
			</tr>
			<tr>
				<td class="value"><input type="radio" value="sliding" name="indexStyle"  /><span>Sliding云桌面</span></td>
			</tr>
			
			<!-- 
			<tr>
				<td class="value"><input type="radio" value="ace" name="indexStyle"  /><span>ACE2平面风格</span></td>
			</tr>
			<tr>
				<td class="value"><input type="radio" value="diy" name="indexStyle"  /><span>DIY平面风格</span></td>
			</tr>
			  -->
			<tr>
				<td class="value"><input type="radio" value="hplus" name="indexStyle"  /><span>H+平面风格</span></td>
			</tr>
			<tr>
				<td class="value"><input type="radio" value="fineui" name="indexStyle"  /><span>FineUI风格</span></td>
			</tr>
			<tr>
				<td class="value"><input type="radio" value="adminlte" name="indexStyle"  /><span>AdminLTE风格</span></td>
			</tr>
		</tbody>
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
