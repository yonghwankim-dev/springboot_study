package com.yh.basic;

import com.yh.Holoman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HolomanConfiguration {

    @Bean
    public Holoman holoman(){
        Holoman holoman = new Holoman("lee", 15);
        return holoman;
    }
}
