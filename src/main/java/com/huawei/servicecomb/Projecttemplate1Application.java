package com.huawei.servicecomb;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class Projecttemplate1Application {
    public static void main(String[] args) {
         SpringApplication.run(Projecttemplate1Application.class,args);
    }
}
