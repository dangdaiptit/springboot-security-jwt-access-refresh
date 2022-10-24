package com.tutorial.apidemo.Springboot.tutorial;

//import com.tutorial.apidemo.Springboot.tutorial.config.RsaKeyProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class SpringbootTutorialApplication {

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTutorialApplication.class, args);
    }
}
