# cloud-native-java-examples

### 单体必须：
+ communication-stack: **rest(OpenFegin, restTemplate)**, grpc, soap-cxf, soap-spring
+ cache: **redis(redisson)**, hazelcast with kubernetes
+ db pool: **druid**, HikariCP
+ orm: **hibernetes(jpa, validator)**, mybatis, jdbcTemplate
+ api-doc: **springfox-swagger2**
+ serialization: **jackson**, jdk serialization, Avro, Kryo 
+ service-ensure: **hystrix**, **spring-retry**
+ metric: **micrometer**, prometheus-dropwizard(format the dropwizard metric as prometheus).
+ security: **spring web security**

### 单体过渡:
+ kubernetes部署，单应用伸缩
+ kubernetes原生ingress and engress和**nginx controller**
+ 下面可独立使用的中间件(**apollo**, **spring security oauth**, **spring-kafaka**)

### Spring cloud微服务解决方案：
##### 可独立使用以及继承到istio方案里的中间件
+ config-center: **apollo**, spring cloud config(耦合)
+ sso: **spring security oauth**, keycloak, spring cloud security(耦合)
+ mq: **spring-kafaka**, spring cloud stream
##### spring cloud耦合在一起的解决方案
+ registry: eureka, consul
+ server-lb(gateway): zuul2+eureka+ribbon, spring cloud geteway
+ client-lb: ribbon+fegin, ribbon+restTempalte

### Istio微服务解决方案
##### maybe change(替换):
+ **spring-retry**(native retry via envoy)

##### maybe enhance(结合增强)：
+ **spring security oauth** (spring security 5 and istio citadel)
+ **hystrix**, (istio traffic-management)

##### maybe add(增加):
+ registry: istio polit
+ server-lb: istio gateway, kubernetes native api gateway
+ client-lb(istio traffic-management)
+ other new feature: A/B ...
