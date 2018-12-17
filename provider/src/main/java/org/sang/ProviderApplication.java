package org.sang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//向这个服务注册中心注册一个服务提供者了
@EnableDiscoveryClient//通过添加@EnableDiscoveryClient注解来激活Eureka因为我们在HelloController中注入了DiscoveryClient
@SpringBootApplication
public class ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
	}
}
