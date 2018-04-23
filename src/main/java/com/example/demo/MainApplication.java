package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@SpringBootApplication
@ImportResource({"classpath:root-context.xml"})
public class MainApplication {
	public static void main(String[] args) {
		
        SpringApplication.run(MainApplication.class, args);

        // 启动dubbo服务.
        com.alibaba.dubbo.container.Main.main(args);
	}
}
