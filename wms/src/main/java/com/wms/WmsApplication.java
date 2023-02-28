package com.wms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WmsApplication {

    public static void main(String[] args) {
        System.out.println("成功运行");
        SpringApplication.run(WmsApplication.class, args);
    }

}
