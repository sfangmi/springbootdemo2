package com.zza;

import com.zza.config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(MyImportSelector.class)
public class Springbootdemo2Application {

    public static void main(String[] args) {


        ConfigurableApplicationContext ctx = SpringApplication.run(Springbootdemo2Application.class, args);
        System.out.println("helloword");

    }

}
