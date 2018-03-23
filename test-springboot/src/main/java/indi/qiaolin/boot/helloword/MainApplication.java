package indi.qiaolin.boot.helloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  @author  qiaolin
 *  @date 2018年3月23日
 */

@SpringBootApplication // 标注这是一个SpringBoot应用
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
