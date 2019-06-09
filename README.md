# Spring-Demo

# 首先会从spring源码中的设计模式入手, 然后主键进行分析 - 2019年5月24日

## 简单工厂模式

1 需求?

  我想实现什么就实现什么,只需要告诉工厂就可以实现

2 设计
  
  接口,实现, 工厂 
  
  
 观察者的使用场景
 1监听器,日志收集, 短信通知, 邮件通知
 
 
 工厂 创建型 模式
 BeanFactory1 FactoryBean
 
 spring单利
 实现手段,懒汉式, 饿汉式, 注册登记式,序列化处理
 spring中使用的是注册登记式
 
 
 原型模式重要点,复制
 为了配置信息可以被重复使用,而且互不干扰
 
 
 代理模式
 字节码增强,动态实现非侵入式编程
 
 策略模式
 固定的一些算法统一起来
 特点:巧妙的避免了if..else或者switch
 
 
 模板方法
 流程固定,某一个环节有差异
 jdbcTemplate, 工作流
 代码 模拟spring jdbcTemplate 简单实现
 spring-orm
 
 
 
 委派模式
 代理模式的特殊情况
 spring中servletDispatch, Delegate命名结尾的都是委派
 
 
 适配器模式
兼容,转换
spring中 以 Adapter结尾

装饰器
委派+适配器, 注重的扩展,覆盖, 保证is-a的关系
在Spring中Derocator结尾, Wrapper结尾

观察者
针对于目标对象的一举一动,要得到反馈
应用场景: 事件监听,日志监听, 短信通知
listener monitor observer


OOP:封装,继承,多态
关心的是事物之间的联系

BOP bean与bean之前的关系, 不希望每次认为重复管理,希望交给spring管理

IOC控制反转
创建对象的控制权反转, 控制权指的是new出对象, 最开始的时候谁使用则由谁new出对象, 有了spring以后所有的bean都交给了spring来new出对象,这叫做控制反转交给了spring

DI技术
解决对象动态赋值问题, 解决对象与对象之间的关系, 动态调用getter,setter,采用反射


 