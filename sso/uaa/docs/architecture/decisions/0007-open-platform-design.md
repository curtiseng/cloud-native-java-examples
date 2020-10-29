# 7. open platform design

Date: 2018-12-28

## Status

Accepted

## Context

开放平台设计

## Decision

用户认证授权开放平台主要关注于用户的认证，对于用户角色权限管理方面的要求比较低，而且开放平台不应该影响
内部业务线的使用，所以需要使用限流等隔离机制，区分开内部业务线和开放平台。

同时开放平台有可能供给不信任端点使用，需要严格控制用户的信息，而OIDC标准是解决这个问题的协议。

OpenID Connect是一个基于OAuth 2.0协议构建的简单身份层，相比于OpenID2.0，OIDC更加的Api友好。

注：OpenID Connect performs many of the same tasks as OpenID 2.0, but does so in a way that is API-friendly, and usable by native and mobile applications. OpenID Connect defines optional mechanisms for robust signing and encryption. Whereas integration of OAuth 1.0a and OpenID 2.0 required an extension, in OpenID Connect, OAuth 2.0 capabilities are integrated with the protocol itself.


## Consequences

Consequences here...
