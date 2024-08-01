package com.zza.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(People.class)
public class Myconfig2 {

}
