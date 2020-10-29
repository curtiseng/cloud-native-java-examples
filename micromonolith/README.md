# micromonolith

一个用户通过用户名查找书籍的微单体例子，web服务依赖用户服务和书籍服务。

#### quickstart

`development`是为了方便开发的一个虚拟项目，使用的系统的文件链接。

```bash
cd development
sh run.sh
```

#### question:
+ 底层业务jar的依赖是否使用provider？

  可以，作用是介绍业务jar的大小，其他使用与否没有影响

+ development模块引入依赖是否有影响？

  需要全部引入相同依赖，在service层也有依赖JavaEE的地方，所以只能全部依赖，不确保这会不会影响微服务版本的使用。

+ 底层业务的bean是否可以注入到web层？

  可以，但每个子包都需要专门配置

+ 一些非web层的配置该放在哪里？

  放在web层可以，放在业务jar包中不确定会不会多个相同配置有问题

+ IDEA缓存问题？

  文件修改显示不同步，但不印影响编译
