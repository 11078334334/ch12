package com.wisely.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
@EnableTurbine
@RestController
public class MonitorApplication {
    @RequestMapping("/")
    public String home() {
        return "Hello Docker!!看到这句话没有？monitor";
    }
    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class, args);
    }
}
