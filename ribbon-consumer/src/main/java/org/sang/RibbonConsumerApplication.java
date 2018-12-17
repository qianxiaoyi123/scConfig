package org.sang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/*java -jar provider-0.0.1-SNAPSHOT.jar --server.port=8080
java -jar provider-0.0.1-SNAPSHOT.jar --server.port=8081
先把两个服务提供者注册
向localhost:9000/ribbon-consumer地址发起请求
Ribbon输出了当前客户端维护的HELLO-SERVICE的服务列表情况，每一个provider的位置都展示出来，Ribbon就是按照这个列表进行轮询，进而实现基于客户端的负载均衡。同时这里的日志还输出了其他信息，比如各个实例的请求总数量，第一次连接信息，上一次连接信息以及总的请求失败数量等
*
*
* */
@EnableCircuitBreaker//开启断路器功能
@SpringBootApplication
@EnableDiscoveryClient//表示该应用是一个Eureka客户端应用，这样该应用就自动具备了发现服务的能力。
public class RibbonConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumerApplication.class, args);
	}
	//RestTemplate可以帮助我们发起一个GET或者POST请求，这个我们在后文会详细解释，这里我们只需要提供一个RestTemplate  Bean就可以了，在提供Bean的同时，添加@LoadBalanced注解，表示开启客户端负载均衡。
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
