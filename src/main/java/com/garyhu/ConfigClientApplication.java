package com.garyhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: garyhu
 * @since: 2018/11/19 0019
 * @decription:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication {

    public static void main(String[] args)throws Exception{
        SpringApplication.run(ConfigClientApplication.class,args);
    }
}
