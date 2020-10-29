# 1. UAA architecture decisions

Date: 2018-12-27

## Status

Accepted

## Context

基础平台需要建造一个统一的账户和授权中心，可以独立部署以及水平扩展，不依赖SpringCloud等微服务框架，适应ServiceMesh架构，并实现对现有业务以及未来业务的支持。

支持包括新旧业务系统等单点登录；多租户的支持；手机、第三方平台（微信、qq）、密码等认证。

## Decision

使用Spring Security和Spring Security Oauth2.0作为基础框架，结合RBAC以及OAuth2.0标准，从新开始实现UAA。

在Spring Security5发布后，重构代码，支持现有功能上支持OIDC。

## Consequences

由于Spring Security的重构以及进度较慢，不仅要知道Web Security和Oauth2的架构，还需要深入了解框架的细节。

现有业务系统的改造存在难度，之前网关的登录代码都和Spring Cloud组件耦合在一起，以及一些认证的流程是自己实现，没有在框架级别解决。