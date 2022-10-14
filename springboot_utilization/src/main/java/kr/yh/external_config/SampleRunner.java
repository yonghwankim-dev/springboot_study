package kr.yh.external_config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Value("${yonghwan.name}")
    private String name;

    @Value("${yonghwan.age}")
    private int age;

    @Value("${yonghwan.fullName}")
    private String fullName;

    @Value("${server.port}")
    private int port;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("name is " + name);
        System.out.println("age is " + age);
        System.out.println("fullName is " + fullName);
        System.out.println("port is " + port);
    }
}
