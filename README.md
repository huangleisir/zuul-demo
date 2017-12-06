# zuul-demo
Zuul Demo
zuul很有意思，不想那个ek，rb那样，还要什么服务端，客户端，zuul统统不需要，也不依赖于其他业务工程，他就是一个转发，重定向的东西

zuul.routes.book.path=/books/*/*
zuul.routes.book.url=http://localhost:8090

 注意这里是从星号开始匹配的 ，一句话，仔细琢磨，把什么都说清楚了
