package kr.yh;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringbootUtilizationApplication {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
    }

}
