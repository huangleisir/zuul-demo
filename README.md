# zuul-demo
Zuul Demo
zuul很有意思，不想那个ek，rb那样，还要什么服务端，客户端，zuul统统不需要，也不依赖于其他业务工程，他就是一个转发，重定向的东西

zuul.routes.book.path=/books/*\/*

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


