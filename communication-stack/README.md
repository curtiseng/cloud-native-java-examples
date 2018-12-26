### Communication Stack

#### 通信类型

+ Web API(Application programming interface)
+ WS(Web Service)

#### 通信协议

+ json + http
+ soap + xml + http
+ grpc
+ graphQL

#### 架构风格

+ rest
+ web service

#### java 远程调用标准

- JAX-RPC(弃用)

- JAX-WS

- JAX-RS

#### tips

+ 如果你需要SOAP使用JAX-WS。如果你需要Restful使用JAX-RS。我会避免使用JAX-WS的Restful WS

+ gRPC has significant technical advantages to SOAP/XML.

  > gRPC is clearly the better solution if you intend to build a large, multi-service, distributed system or want to build cloud APIs for mobile devices. And it's not just because developers hate XML.

  + The gRPC protocol is built on top of http2 - a protocol designed to overcome many of the shortcomings in http, primarily performance.

  + protobuf is a much simpler serialization format that achieves far better performance than XML

  + gRPC allows message streaming in both directions. For some use cases this is vital for achieving performance.

  +  there's a growing ecosystem to make it easier to work with large distributed systems. I could list a bunch, but I will just point to one: gRPC has many options for the load balancing of requests: <https://grpc.io/blog/loadbalancing>.
