# 用户安全与认证技术体系
#### 架构篇

+ 用户中心是云原生的基石
    - 什么是云原生
    - 为什么企业需要用户中心及其复杂度(以google为例)
    - 用户中心的组成(账户信息、登录客户端、资源服务、老旧系统、开放平台、统一第三方登录)
+ 用户认证技术
    - Base(基于Security各种基础词汇，比如认证、授权、鉴权、身份保持...)
    - OAuth2
    - OIDC
    - JOSE标准
    - 关系与取舍
+ 用户中心架构选择
    - 非OAuth2方案(session共享、CAS、Token)
    - 身份保持方案(Session、Token、JWT)
    - RABC与OAuth2,集中或者分散
    - 网关统一认证与资源服务器独立认证
    - 代理认证与一些"旁门左道"
    - 一个可行的方案
+ 多租户与地区亲和

#### 单体实现篇

+ 权限控制模式与模型设计
    - RBAC
    - ABAC
    - 数据权限
    - 其他(ReBAC、OrBAC)
+ 使用Spring Security保护Web
    - Spring Security架构(config、core、web、过滤器、配置装配)
    - 授权(Authorization:Session和JWT方案)
    - 鉴权(Authentication:字符串匹配算法，动态鉴权)
    - 保护REST API
    - 保护WebFlux API
+ 单页面应用前端权限控制

#### 分布式实现篇

+ 使用Spring Security OAuth2实现用户中心
    - Spring Security OAuth2架构(不同组件过滤器的优先级配合)
    - Spring Security5 OAuth2架构与重构原因
+ 授权服务器实现(无状态、多租户)
    - 用户服务实现与同步方案
    - 使用Spring Security5实现OIDC
    - 集成第三方Provider
    - 授权服务集成LDAP
    - 多租户(三种隔离级别与实现方式)
+ 认证方式
    - 认证网关密码模式登录
    - OAuth2Login实现登录
    - 单点登录(OAuth2单点登录原理，浏览器识别)
+ 资源服务器实现(资源服务器与鉴权的关系)
+ 开放平台实现
+ OAuth2 Proxy实现
    - nginx实现
    - treafik实现

#### 安全增强

+ 安全增强
    - 授权服务器注意事项
    - 客户端注意事项
    - HTTPS
    - CSRF、CORS
    - LocalStorage、Cookie
    - session管理
    - 记录登录状态
    - 内容安全策略(CSP)
    - 密码加密
    - 使用Vault管理密钥    
+ Istio Security增强内部服务安全
    - Istio实现服务间流量调用的安全
    - Istio里的密码加密技术
    - 结合增强