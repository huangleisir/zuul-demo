# zuul-demo
Zuul Demo
zuul很有意思，不想那个ek，rb那样，还要什么服务端，客户端，zuul统统不需要，也不依赖于其他业务工程，他就是一个转发，重定向的东西

zuul.routes.book.path=/books\/\*\/\*

zuul.routes.book.url=http://localhost:8090

 注意这里是从星号开始匹配的 ，一句话，仔细琢磨，把什么都说清楚了
 
 
 http://blog.csdn.net/liaokailin/article/details/51525908
 
 
//http://localhost:8080/api/rest/abc 
//将demo2里面的zuul.routes.book.stripPrefix=true toggle切换为false试试看
    //true表示从星号开始匹配  
    /**
zuul.prefix=/api true还是false跟这个没关系，他是来设置是否从/rest开始匹配（.path值跟controller路径映射值，从
.path值的哪里开始跟controller路径映射匹配非常关键）
 false从/rest开始匹配 默认为true，
从星号开始匹配 所以此时请求/abc
zuul.routes.book.stripPrefix=true 
zuul.routes.book.path=/rest/*
zuul.routes.book.url=http://localhost:8090

zuul几种路由类型：
1.简单路由， zuul配置里面的url后面跟的是http，https开头的url
2.ribbon路由， 用serviceId（需要将zuul网关添加ek客户端配置）
3.forwad路由，
4.自定义路由 通过自定义的正则表达式来做
5. 请求头的配置
zuul干嘛用的：只记得三点，路由转发过滤
忽然就是想不起来ribbon是干啥用的

https://github.com/huangleisir/common-pics/blob/master/Screenshot_20171210-112337.png
这个ribbon是怎么用，要配合restTemplate来用
![image](https://github.com/huangleisir/common-pics/blob/master/Screenshot_20171210-112337.png)
























