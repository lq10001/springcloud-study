# springcloud 微服务测试

## 公众号：全栈程序员之路
![输入图片说明](https://mp.weixin.qq.com/mp/qrcode?scene=10000004&size=102&__biz=MzIzMTE0NTE5Mg==&mid=2651421365&idx=1&sn=ec2b310f1888fca3560ba504af0077f5&send_time= "在这里输入图片标题")

## 为什么要用微服务？
随着产品的迭代，功能会越来越多，开发维护的压力，会越来越大。
使用微服务，把很多功能独立成一个服务，可以由专业的团队来维护。利于开发维护，降低系统的耦合性。

## 微服务几个关键点：
1. 服务发现
2. 网关
3. 分布式配置。
4. 熔断机制，
5. 负载均衡，

## 技术实现：
整套架构，使用SpringCloud实现。
备注：SpringCloud基于SpringBoot，配置服务，通常只需要3步
1. 添加相应的maven库
2. 配置propertis文件
3. 配置注解

## 总结：
1. SpringCloud整套解决方案，已经比较成熟，可以用于生产环境中。
2. 只能通过Jar包部署，war部署，小伟我折腾了一晚上，注册服务中心，就是不能发现服务。
3. Java的应用，真心占内存。服务发现，启动起来，就占用了1G内存。其他的Web服务，500M。

