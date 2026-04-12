
<template>
  <div class="vue-component">
    </t:base>
<style>
ul {
    list-style-type: none;
    list-style-image: none;
    margin-bottom: 3px;
}
li {
    margin-bottom: 3px;
}
.conditionType {
    display: block;
    margin-bottom: 3px;
    padding: 3px 0 3px;
    width: 100%;
}select {
    padding-right: 2px!important;
}
select {
    padding: 5px 7px;
}
textarea, input[type=text], input[type=password], select {
    font-family: "Verdana","微软雅黑","宋体","Lucida Grande";
    padding: 3px;
    border: 1px solid #ddd;
    outline: 0;
    box-sizing: border-box;
}
#dsUL .conditionSelect {
    width: 200px;
}
.datagrid .panel-body {
	position: relative;
    overflow: auto;
}
</style>
<div class="easyui-layout" fit="true">
	<div region="center" style="padding: 1px;">
		<t:datagrid name="jeecgDemoListquery" title="多条件动态查询" actionUrl="jeecgListDemoController.do?datagrid" idField="id" queryMode="group" checkbox="true"
			extendParams="headerContextMenu: [
                { text: '保存列定义', iconCls: 'icon-save', disabled: false, handler: function () { saveHeader(); } },
                { text: '自定义菜单', iconCls: 'icon-reload', disabled: false, handler: function (e, field) { alert($.string.format('您点击了{0}', field)); } }
            ],">
			<el-table-column prop="id" label="编号"></el-table-column>
			<el-table-column prop="name" label="用户名"></el-table-column>
			<el-table-column prop="content" label="个人介绍"></el-table-column>
			<el-table-column prop="phone" label="办公电话"></el-table-column>
			<el-table-column prop="createDate" label="创建日期"></el-table-column>
			<el-table-column prop="email" label="邮箱"></el-table-column>
			<el-table-column prop="age" label="年龄"></el-table-column>
			<el-table-column prop="salary" label="工资"></el-table-column>
			<el-table-column prop="birthday" label="生日"></el-table-column>
		</el-table>
		<div id="jeecgDemoListquerytb"  style="padding: 3px; height: 67px">
			<div style="float: left;">
		  		<ul id="dsUL">
					<li id="anyAll" class="conditionType">
                    	<span class="anyAll">
							过滤条件匹配： 
                        	<select id="anyallSelect" name="mchtyp" style="width:200px" class="select">
                            	<option value="and" selected="selected">And(所有条件都要求匹配)</option>
                            	<option value="or" >Or(条件中的任何一个匹配)</option>
                            </select>
                        </span>
                    </li>
    				<li id="dsLI" name="dsLI" class="conditions oop">
    					<span>
    						<select id="field" name="cons[0].fld" id="orgCode" >
    							<option value="">&nbsp;</option>
    							<option value="name">用户名</option>
    							<option value="content">个人介绍</option>
    							<option value="phone">办公电话</option>
    							<option value="createDate">创建日期</option>
    							<option value="email">邮箱</option>
    							<option value="age">年龄</option>
    							<option value="salary">工资</option>
    							<option value="birthday">生日</option>
    						</select>
    					</span>
    					<span>
                        	<select id="condition" name="cons[0].ctyp" class="compareType" style="width:150px">
								<option>&nbsp;</option>
	    						<option value="=">等于</option>
	    						<option value="!=" >不等于</option>
	    						<option value=">" >大于</option>
	    						<option value=">=" >大于等于</option>
	    						<option value="lt" >小于</option>
	    						<option value="lte" >小于等于</option>
	    						<option value="likeBegin" >以...开始</option>
	    						<option value="likeEnd" >以...结束</option>
	    						<option value="like" >包含</option>
	    						<option value="not like" >不包含</option>
	    						<option value="in" >在...中</option>
	    						<option value="not in" >不在...中</option>
    						</select>
                      	</span>
    					<span style="position: relative; z-index: 2000;">
    						<input id="conValue" name="cons[0].val" type="text" class="text conditionValue" title="">
    					</span>
    					<span>
                            <a id="add" href="javascript:addULChild()" class="fa fa-plus-square" title="添加一个新的过滤条件" style="margin-left: 3px;"></a>
                            <a id="delete" href="javascript:void(0)" onclick="deleteULChild(this)" class="fa fa-minus-square" title="删除此过滤条件" style="margin-left: 23px;"></a>
    					</span>
    					</li>
					</ul>
			</div>
			<div style="float: right;">
				 <input  id="_sqlbuilder" name="sqlbuilder"   type="hidden" />
				<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="mySearch()" >查询</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-reload" onclick="searchReset()">重置</a>
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
