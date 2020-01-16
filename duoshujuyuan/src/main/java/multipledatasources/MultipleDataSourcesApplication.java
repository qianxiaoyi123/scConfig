package multipledatasources;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("multipledatasources.mapper")
//开启缓存
@EnableCaching
//开启定时器
@EnableScheduling
//将该服务注册到eureak Server里面去@EnableDiscoveryClient  //hystrix：@EnableCircuitBreaker
@EnableAsync
public class MultipleDataSourcesApplication {
	public static void main(String[] args) {
		SpringApplication.run(MultipleDataSourcesApplication.class, args);
	}


	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
