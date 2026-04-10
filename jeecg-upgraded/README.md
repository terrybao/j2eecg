# JEECG 前端升级项目

## 项目概况

这是一个将 JEECG 前端从 JSP + jQuery + EasyUI 升级到 Vue3 + Vite + Element Plus 的项目。

## 技术栈

- **前端框架**: Vue 3
- **构建工具**: Vite
- **UI 组件库**: Element Plus
- **路由管理**: Vue Router
- **状态管理**: Pinia
- **HTTP 客户端**: Axios

## 项目结构

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

## 快速开始

### 安装依赖

```bash
npm install
```

### 启动开发服务器

```bash
npm run dev
```

### 构建生产版本

```bash
npm run build
```

### 预览生产构建

```bash
npm run preview
```

## 核心功能

1. **登录页面** - 基于 Element Plus 实现的登录表单
2. **主页** - 项目首页，提供导航功能
3. **Demo 列表** - 从原 jsp 页面迁移的示例列表，包含数据展示、搜索、分页、增删改查等功能

## 升级说明

- 保持后端 API 不变，前端通过 Axios 调用
- 路线保持 jsp/js 对应 vue3 一一对应，降低升级难度
- 使用复制/复刻的方式进行升级
- 尽量少生成代码

## 文档

详细的升级计划和迁移指南请参考 [upgrade-plan.md](doc/upgrade-plan.md)。