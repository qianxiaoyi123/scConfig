package org.sang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//双击package生成在target下生成新的jar
/*C:\Windows\System32\drivers\etc目录下的hosts文件总添加两行配置，如下:
127.0.0.1 peer1
127.0.0.1 peer2
* 当前文件夹上面输入cmd进入
* 使用java -jar eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
* java -jar eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
* 来启动实现高可用注册中心
*
* 我们可以看到，在peer1的节点的DS replicas我们已经可以看到peer2节点了，在peer2的DS replicas中我们也可以看到peer1节点了。

OK，如此之后，我们的服务注册中心集群就搭建好了，
*
*
*/
@EnableEurekaServer//启动一个服务注册中心的方式
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
