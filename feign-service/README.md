# Feign的常用配置
## Feign自己的配置
```yaml
feign:
  hystrix:
    enabled: true #在Feign中开启Hystrix
  compression:
    request:
      enabled: false #是否对请求进行GZIP压缩
      mime-types: text/xml,application/xml,application/json #指定压缩的请求数据类型
      min-request-size: 2048 #超过该大小的请求会被压缩
    response:
      enabled: false #是否对响应进行GZIP压缩
logging:
  level: #修改日志级别
    com.jourwon.springcloud.service: debug

```

## Feign中的Ribbon配置
在Feign中配置Ribbon可以直接使用Ribbon的配置，具体可以参考[Spring Cloud Netflix Ribbon：服务消费者之服务调用(Hoxton版本)](https://blog.csdn.net/ThinkWon/article/details/103729080)

## Feign中的Hystrix配置
在Feign中配置Hystrix可以直接使用Hystrix的配置，具体可以参考[Spring Cloud Netflix Hystrix：断路器-服务容错保护(Hoxton版本)](https://blog.csdn.net/ThinkWon/article/details/103732497)