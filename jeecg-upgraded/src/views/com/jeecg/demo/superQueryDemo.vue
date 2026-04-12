
<template>
  <div class="vue-component">
    </t:base>

<div class="easyui-layout" fit="true">
<div region="center" style="padding: 1px;">
<t:datagrid name="jeecgDemoList2" title="高级查询示例"  actionUrl="jeecgListDemoController.do?datagrid"
	idField="id" queryMode="group" checkbox="true" extendParams="headerContextMenu: [
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
	<div class="toolbar"></div>
	<div class="toolbar"></div>
	<div class="toolbar"></div>
</el-table></div>
</div>
<div style="position:relative;overflow:auto;">
	<div id="w" class="easyui-window" data-options="closed:true,title:'高级查询构造器'" style="width:600px;height:370px;padding:0px">
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'east',split:true" style="width:130px">
<div class="easyui-accordion" style="width:120px;height:300px;">
		<div title="查询历史" data-options="iconCls:'icon-search'" style="padding:0px;">
			<ul id="tt" class="easyui-tree" data-options="onClick:function(node){//单击事件  
       historyQuery( node.id);  
    },ondbClick: function(node){alert('s');
				$(this).tree('beginEdit',node.target);
			},onContextMenu: function(e,node){
				e.preventDefault();
				$(this).tree('select',node.target);
				$('#mmTree').menu('show',{
					left: e.pageX,
					top: e.pageY
				});
			},  
         onAfterEdit:function(node){  
            if(node.text!=''){ his[node.id].name=node.text; saveHistory();}
	}">
			</ul>
		</div>
</div></div>
			<div data-options="region:'center'" style="padding:0px;">
				<table id="tg" class="easyui-treegrid" title="查询条件编辑" style="width:450px;height:300px;"
			data-options="
				iconCls: 'icon-ok',
				rownumbers: true,
				animate: true,
				fitColumns: true,
				//url: 'sqlbuilder.json',//可以预加载条件
				method: 'get',
				idField: 'id', autoEditing: true,          //该属性启用双击行时自定开启该行的编辑状态
                extEditing: false,           //该属性启用行编辑状态的 ExtEditing 风格效果，该属性默认为 true。
                singleEditing: false ,
				treeField: 'field',toolbar:toolbar,onClickRow: function (e) {
                   $('#tg').treegrid('beginEdit',e);//'beginEdit‘方法必须有一个参数
                }
			">
		<thead>
			<tr>
				<th data-options="field:'relation',width:19,formatter:function(value,row){
							return value=='and'?'并且':'或者';
						},editor:{
							type:'combobox',
							options:{
								valueField:'relationId',
								textField:'relationName',
								data:  
								[  
								{'relationId':'and','relationName':'并且'},  
								{'relationId':'or','relationName':'或者'}  
								],  
								required:true
							}}">关系</th>
				<th data-options="field:'field',width:30,formatter:function(value,row){
								var data=  
								[  
								{'fieldId':'content','fieldName':'个人介绍'},
								{'fieldId':'name','fieldName':'用户名' },
								{'fieldId':'age','fieldName':'年龄'},
								{'fieldId':'salary','fieldName':'工资'}
								];
							for(var i=0;i<data.length;i++){
								if(value == data[i]['fieldId']){
									return data[i]['fieldName'];
								}
							}
							return value;
						},editor:{
							type:'combobox',
							options:{
								valueField:'fieldId',
								textField:'fieldName',
								data:  
								[  
								{'fieldId':'content','fieldName':'个人介绍'},
								{'fieldId':'name','fieldName':'用户名' },
								{'fieldId':'age','fieldName':'年龄'},
								{'fieldId':'salary','fieldName':'工资'}
								],  
								required:true
                                ,  onSelect : function(record) {
                                    	var opts = $('#tg').treegrid('getColumnOption','value');
										if(record.editor){
												opts.editor=record.editor;
										}else{
											return ;
										}
										var tr = $(this).closest('tr.datagrid-row');
										var index = parseInt(tr.attr('node-id'));
										$('#tg').treegrid('endEdit', index);
										$('#tg').treegrid('beginEdit', index);
                                    }
							}}">字段</th>
				<th data-options="field:'condition',width:20,align:'right',formatter:function(value,row){
								var data=  
								[  
								{'conditionId':'=','conditionName':'等于'},
								{'conditionId':'>','conditionName':'大于'},
								{'conditionId':'<','conditionName':'小于'},
								{'conditionId':'like','conditionName':'包含'},
								{'conditionId':'in','conditionName':'在其中'}
								];
							for(var i=0;i<data.length;i++){
								if(value == data[i]['conditionId']){
									return data[i]['conditionName'];
								}
							}
							return value;
						},editor:{
							type:'combobox',
							options:{
								valueField:'conditionId',
								textField:'conditionName',	
							data:  
								[  
								{'conditionId':'=','conditionName':'等于'},
								{'conditionId':'>','conditionName':'大于'},
								{'conditionId':'<','conditionName':'小于'},
								{'conditionId':'like','conditionName':'包含'},
								{'conditionId':'in','conditionName':'在其中'}
								],  
								required:true
							}}">条件</th>
				<th data-options="field:'value',width:30,editor:'text'">值</th>
					<th data-options="field:'opt',width:30,formatter:function(value,row){
							return '<a  onclick=\'removeIt('+row.id+')\' >删除</a>';
						}">操作</th>
			</tr>
		</thead>
	</table>
	
			</div>
			<div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
				<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="javascript:queryBuilderSearch()">OK</a>
				<a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="javascript:void(0)" onclick="javascript:$('#w').window('close')">Cancel</a>
			</div>
		</div>	
	</div>		
</div>
<div id="mm" class="easyui-menu" style="width:120px;">
		<div onclick="append()" data-options="iconCls:'icon-add'">添加</div>
		<div onclick="edit()" data-options="iconCls:'icon-edit'">编辑</div>
		<div onclick="save()" data-options="iconCls:'icon-save'">保存</div>
		<div onclick="removeIt()" data-options="iconCls:'icon-remove'">删除</div>
		<div class="menu-sep"></div>
		<div onclick="cancel()">取消编辑</div>
	</div>
<div id="mmTree" class="easyui-menu" style="width:100px;">
		<div onclick="editTree()" data-options="iconCls:'icon-edit'">编辑</div>
		<div onclick="deleteTree()" data-options="iconCls:'icon-remove'">删除</div>
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
