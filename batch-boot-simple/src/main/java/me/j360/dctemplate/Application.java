package me.j360.dctemplate;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * Package: me.j360.dctemplate
 * User: min_xu
 * Date: 16/6/13 下午4:09
 * 说明：参数用--xxx=xxx的形式传递
 */

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}