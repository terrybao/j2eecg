# JEECG 前端升级计划

## 1. 项目概况

当前 JEECG 项目使用的前端技术栈：
- JSP + jQuery + EasyUI
- 后端基于 Java

升级目标：
- 保持后端不变
- 前端重写为 Vue3 + Vite + Element Plus
- 路线保持 jsp/js 对应 vue3 一一对应，降低升级难度
- 使用复制/复刻的方式进行升级
- 尽量少生成代码

## 2. 升级步骤

### 2.1 项目初始化
1. 创建 Vue3 + Vite 项目
2. 安装 Element Plus 及相关依赖
3. 配置项目结构

### 2.2 核心功能迁移

#### 2.2.1 登录页面
- 对应文件：`/workspace/src/main/webapp/webpage/login/login.jsp`
- 迁移为 Vue 组件：`src/views/login/index.vue`

#### 2.2.2 主页面框架
- 对应文件：`/workspace/src/main/webapp/webpage/main/` 下的各种 main.jsp 文件
- 迁移为 Vue 组件：`src/views/main/index.vue`

#### 2.2.3 数据表格
- 对应文件：如 `jeecgDemoList.jsp` 等
- 迁移为 Vue 组件，使用 Element Plus 的 el-table

#### 2.2.4 表单页面
- 对应文件：如 `jeecgDemo-add.jsp`、`jeecgDemo-update.jsp` 等
- 迁移为 Vue 组件，使用 Element Plus 的 el-form

#### 2.2.5 菜单导航
- 对应文件：`/workspace/src/main/webapp/webpage/main/left.jsp`
- 迁移为 Vue 组件，使用 Element Plus 的 el-menu

### 2.3 工具类和通用功能
- 提取通用工具函数
- 迁移 AJAX 请求逻辑
- 处理权限管理
- 实现国际化

## 3. 技术方案

### 3.1 项目结构
```
jeecg-upgraded/
├── doc/              # 文档目录
├── src/              # 源码目录
│   ├── assets/       # 静态资源
│   ├── components/   # 组件
│   ├── views/        # 页面
│   ├── utils/        # 工具类
│   ├── api/          # API 请求
│   ├── router/       # 路由
│   ├── store/        # 状态管理
│   └── App.vue       # 根组件
├── public/           # 公共资源
├── index.html        # 入口 HTML
├── vite.config.js    # Vite 配置
├── package.json      # 依赖配置
└── README.md         # 项目说明
```

### 3.2 核心依赖
- Vue 3
- Vite
- Element Plus
- Axios
- Vue Router
- Pinia (状态管理)

### 3.3 关键技术点
1. **组件化开发**：将 JSP 页面拆分为 Vue 组件
2. **响应式数据**：使用 Vue 3 的 Composition API
3. **路由管理**：使用 Vue Router 替代 JSP 页面跳转
4. **状态管理**：使用 Pinia 管理全局状态
5. **表单验证**：使用 Element Plus 的表单验证
6. **表格功能**：使用 Element Plus 的表格组件替代 EasyUI 表格
7. **API 调用**：使用 Axios 替代 jQuery 的 AJAX

## 4. 迁移策略

### 4.1 文件映射
- JSP 文件 → Vue 组件
- JavaScript 文件 → Vue 组件的方法或工具函数
- 后端 API 保持不变，前端通过 Axios 调用

### 4.2 功能对应
| 原功能 | 新实现 |
|-------|-------|
| EasyUI 表格 | Element Plus Table |
| EasyUI 表单 | Element Plus Form |
| EasyUI 对话框 | Element Plus Dialog |
| EasyUI 菜单 | Element Plus Menu |
| jQuery AJAX | Axios |
| 模板标签 | Vue 指令和组件 |

### 4.3 代码生成
- 尽量手动迁移，保证代码质量
- 对于重复模式，可考虑编写简单的迁移工具

## 5. 测试计划

### 5.1 功能测试
- 登录功能
- 菜单导航
- 数据表格展示
- 表单提交
- 数据增删改查
- 文件上传

### 5.2 兼容性测试
- 主流浏览器兼容性
- 响应式布局测试

## 6. 风险评估

### 6.1 潜在风险
- 部分复杂业务逻辑迁移难度较大
- 第三方插件兼容性问题
- 性能优化需要重点关注

### 6.2 应对策略
- 分模块迁移，逐步测试
- 保持与后端 API 的兼容性
- 优化前端性能，减少不必要的渲染

## 7. 时间估计

| 阶段 | 时间 |
|------|------|
| 项目初始化 | 1 天 |
| 核心功能迁移 | 7-10 天 |
| 测试和调试 | 3-5 天 |
| 部署和上线 | 1-2 天 |

## 8. 交付物

- Vue3 + Vite + Element Plus 前端项目
- 升级文档和迁移指南
- 测试报告

## 9. 后续维护

- 建立前端代码规范
- 定期更新依赖
- 优化性能和用户体验
- 提供技术支持和培训