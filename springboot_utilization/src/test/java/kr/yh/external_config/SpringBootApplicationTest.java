package kr.yh.external_config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

//@TestPropertySource(properties = "yonghwan.name=YongHwan3")
//@SpringBootTest(properties = "yonghwan.name=YonHwan2")
@TestPropertySource(locations = {"classpath:/application.properties", "classpath:/test.properties"})
@SpringBootTest
public class SpringBootApplicationTest {

    @Value("${yonghwan.name}")
    private String name;

    @Value("${yonghwan.age}")
    private long age;

    @Value("${my.secret}")
    private String mySecret;

    @Value("${my.number}")
    private long myNumber;

    @Value("${my.bignumber}")
    private long myBigNumber;

    @Value("${my.uuid}")
    private String myUuid;

    @Value("${my.number.less.than.ten}")
    private long myNumberLessThanTen;

    @Value("${my.number.in.range}")
    private long myNumberInRange;

    @Test
    public void test(){
        //given

        //when
        String actual = name;
        //then
        assertThat(actual).isEqualTo("YongHwan");
    }

    @Test
    public void test2(){
        //given

        //when
        long actual = age;
        //then
        assertThat(actual).isEqualTo(20);
    }

    @Test
    public void randomValueTest(){
        //given

        //when
        String actual1 = mySecret;
        long    actual2 = myNumber;
        long    actual3 = myBigNumber;
        String actual4 = myUuid;
        long    actual5 = myNumberLessThanTen;
        long    actual6 = myNumberInRange;
        //then
        System.out.println(actual1);
        System.out.println(actual2);
        System.out.println(actual3);
        System.out.println(actual5);
        System.out.println(actual4);
        System.out.println(actual6);
    }
}
