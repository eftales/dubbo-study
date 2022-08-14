# debbo-study
一个 dubbo 简单的demo。

想把它跑起来需要：
1. 在 README.md 同级文件夹下执行 mvn clean install
2. 运行 Provider 类
3. 运行 Consumer 类


## TIPS
如果你要搭配自己的 zookeeper 地址
1. 修改 provider/src/main/resources/provider.xml 中 zookeeper 服务器的地址
2. 修改 consumer/src/main/resources/consumer.xml 中 zookeeper 服务器的地址
3. 把 consumer/src/main/resources/consumer.xml 中的 dubbo:reference 的 url 属性删掉