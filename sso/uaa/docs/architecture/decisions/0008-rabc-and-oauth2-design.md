# 8. RABC and Oauth2.0 design

Date: 2019-03-14

## Status

Accepted

Amends [5. resource authority decisions](0005-resource-authority-decisions.md)

## Context

UAA只关注Authorization，但在企业级应用里有复杂的角色授权，Oauth2.0和RABC的结合需要一个解决方案。

[5. resource authority decisions](0005-resource-authority-decisions.md)是一种可行的方案，但会加重Oauth客户端的任务。

## Decision

- 在没有多组户的要求下，获取角色信息和认证授权在一个进程内，可以很容易的将角色信息放在JWT里。
- 在需要多租户的时候，授权服务器的层次高了一等级，在授权时要求不同业务线（或者Client）不同的角色信息。这里有三种解决办法：一种是每一个角色权限对应一个scope，由Oauth客户端传给授权服务端，这里需要注意的是scope是角色权限的子集；第二种方法是由授权服务器在授权时查询权限服务器；第三种是进行二次Oauth认证，由业务线自己颁发携带角色权限信息的token。
  
  注：The OAuth 2.0 Scope do not express a user's permissions. They express what an OAuth 2.0 Client may do on the user's behalf - independently of whether or not the user is actually allowed to do that. For example, the user could lie and say that the client is allowed to access some protected resource which he does not have access to ("Read all classified documents", but he is not allowed to view any classified documents).


## Consequences

Consequences here...
