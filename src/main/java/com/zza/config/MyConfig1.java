package com.zza.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(User.class)
public class MyConfig1 {

}
