####spring-cloud-zh 说明

zh-eureka-server：服务注册与发现中心   address:http://localhost:8761/

zh-admin-service ：admin服务提供方

zh-feign-client :服务消费方web端

zh-config-service 配置中心

####启动前准备

1、打开jpa自动创建表的配置，数据源修改成自己本地的数据源

​      spring.jpa.hibernate.ddl-auto=create-drop

2、修改config server配置 到本地目录

```properties
 spring.cloud.config.server.git.uri = file:///D:/%E6%8A%80%E6%9C%AF%E6%AF%94%E8%B5%9B/project-demo/spring-cloud-zh/
```

 

2、依次启动zh-eureka-server、zh-config-server、zh-admin-service、zh-feign-client





rest接口

1、查找所有用户信息
http://localhost:9080/user/find/all
