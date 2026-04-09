# JEECG 项目升级部署指南

## 1. 项目结构

```
├── jeecg-boot/         # Spring Boot 3 后端项目
│   ├── src/main/java/  # Java 源代码
│   ├── src/main/resources/  # 配置文件
│   └── pom.xml         # Maven 配置文件
├── jeecg-frontend/     # Vue 3 前端项目
│   ├── src/            # 前端源代码
│   ├── package.json    # npm 配置文件
│   └── vite.config.ts  # Vite 配置文件
└── .trae/documents/     # 项目文档
```

## 2. 环境要求

### 后端环境
- JDK 17+
- Maven 3.6+
- MySQL 5.7+ / Oracle 11g / SQL Server 2008+
- Redis 6.0+ (可选)

### 前端环境
- Node.js 16+
- npm 7+ 或 pnpm 6+

## 3. 后端部署步骤

### 3.1 数据库配置
1. 创建数据库，执行数据库脚本：
   - MySQL：`docs/jeecg_4.0_mysql.sql`
   - Oracle：`docs/jeecg_4.0_oracle11g.dmp`
   - SQL Server：`docs/jeecg_4.0_sqlserver2008.sql`

2. 修改数据库配置文件：`jeecg-boot/src/main/resources/application.yml`
   ```yaml
   spring:
     datasource:
       url: jdbc:mysql://localhost:3306/jeecg?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai
       username: root
       password: root
   ```

### 3.2 构建项目
```bash
cd jeecg-boot
mvn clean package -DskipTests
```

### 3.3 运行项目
- 使用 Maven 插件运行：
  ```bash
  mvn spring-boot:run
  ```

- 或使用 jar 包运行：
  ```bash
  java -jar target/jeecg-boot.jar
  ```

## 4. 前端部署步骤

### 4.1 安装依赖
```bash
cd jeecg-frontend
npm install
```

### 4.2 开发环境运行
```bash
npm run dev
```

### 4.3 生产环境构建
```bash
npm run build
```

构建后的文件会生成在 `dist` 目录，可以部署到 Nginx 或其他静态文件服务器。

## 5. 配置说明

### 5.1 后端配置
- 数据库配置：`application.yml` 中的 `spring.datasource` 部分
- Redis 配置：`application.yml` 中的 `spring.redis` 部分
- JWT 配置：`application.yml` 中的 `jwt` 部分
- 服务器配置：`application.yml` 中的 `server` 部分

### 5.2 前端配置
- API 基础路径：`src/utils/axios.ts` 中的 `baseURL`
- 路由配置：`src/router/index.ts`
- 环境配置：`.env` 文件（可根据需要创建）

## 6. 启动和访问方式

### 6.1 后端服务
- 启动后访问：http://localhost:8080/jeecg
- Swagger 文档：http://localhost:8080/jeecg/swagger-ui.html

### 6.2 前端服务
- 开发环境：http://localhost:5173
- 生产环境：根据部署的服务器地址访问

### 6.3 登录信息
- 默认用户名：admin
- 默认密码：123456

## 7. 常见问题及解决方案

### 7.1 后端启动失败
- 检查数据库连接是否正确
- 检查端口是否被占用
- 检查依赖包是否下载完整

### 7.2 前端访问后端API失败
- 检查后端服务是否启动
- 检查前端API基础路径是否正确
- 检查跨域配置是否正确

### 7.3 登录失败
- 检查用户名和密码是否正确
- 检查JWT配置是否正确
- 检查数据库中用户信息是否存在

## 8. 项目升级说明

### 8.1 从 Spring MVC 升级到 Spring Boot 3
- 移除了 XML 配置文件，使用注解和 Java 配置
- 升级了依赖包版本，确保与 Spring Boot 3 兼容
- 保持了原有业务逻辑和 API 接口不变

### 8.2 新增 Vue 3 前端
- 使用 Vue 3 + Vite + Element Plus 技术栈
- 实现了现代化的用户界面
- 保持了与后端 API 的兼容性

## 9. 性能优化建议

1. 使用 Redis 缓存热点数据
2. 优化数据库查询，添加适当的索引
3. 合理使用 Spring Boot 的缓存机制
4. 前端使用懒加载和代码分割
5. 配置 Nginx 作为前端静态文件服务器和反向代理

## 10. 安全建议

1. 定期更新依赖包，修复安全漏洞
2. 使用 HTTPS 协议
3. 加强密码加密和验证
4. 实现细粒度的权限控制
5. 定期备份数据库

## 11. 联系方式

如果在部署过程中遇到问题，请联系技术支持团队。