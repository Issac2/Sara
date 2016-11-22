首先介绍下这个项目，该项目是一个纯净版不掺和任何业务的基础框架项目。

##如何运行成功
* 直接导入本项目，肯定会各种红感叹号，这是由于本项目依赖了我写的第三方包和第三方插件，而这些官服是没有的，而无论是哪个我都已经提供了源码放入了github中，
  地址分别是https://github.com/love-somnus/rest-core.git   https://github.com/love-somnus/extract-maven-plugin.git
  git clone 到本地后，分别进入项目，cmd运行mvn install 命令，安装包到本地仓库，成功后再maven update下sara项目，所有的感叹号都会消失
* 项目中jdbc目前用的外网mysql已经失效，需要你改成有用的，或者改成你本地的链接（配置在sara-config模块中的env/configurations-dev.properties）
  然后再运行数据库脚本（在sara-base模块中的META-INF/mybatis/sql）
* 如果你选择是用tomcat插件启动该项目，那么请直接clean tomcat7:run
* 如果你是选择手动部署项目到eclipse里的tomcat中，那么你还需要对项目打包一次，命令为 clean package，
  另外还有一系列的操作请参考我的这篇文章http://blog.csdn.net/lovesomnus/article/details/53215704
* 当你已经成功启动后，可以通过此链接查看项目是否正常
  http://localhost:8080/sara/resource/application.wadl
* 如何测试调用具体接口，请选择使用chrome的postman，firefox的httprequester
* 如何在后台服务中调用rest风格的服务，可以参考我的另一篇文章 http://blog.csdn.net/lovesomnus/article/details/51164055


## 技术选型

### 管理
* maven依赖和项目管理
* git版本控制

### 后端
* IOC容器 Spring
* WEB框架 SpringMVC
* ORM框架 mybatis
* 验证框架 hibernate validator
* restful框架 jersey
* 缓存 ehcache
* 数据源 druid
* 日志 slf4j+logback

##答疑

###1、我们的项目为什么要分模块

###2、如何利用Maven的Profile构建不同环境的部署包

###3、如何更有效地跟踪Bug—记录带有详细参数值的SQL

###4、为什么日志框架我们选择了logback而抛弃了log4j

###5、我们该在什么时候做请求参数校验，如何去实现

###6、项目中的异常处理那么乱，我们该如何统一定义、统一处理

###7、为什么我们的restful服务实现选择了基于jax-rs规范的jersey框架，而不是其它

###8、我们该如何调用restful服务，为什么不选择传统方法httpclient方式

###9、我们为何要新整出一个maven插件，它承担了什么任务

###10、有人质疑为什么配置文件要整那么细


详情介绍请到我的CSDN博客来阅读
[link text](http://blog.csdn.net/lovesomnus/article/details/52514622 "关于我在github上fund-deposit项目的介绍")
