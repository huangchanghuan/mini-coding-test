package com.sunstar.minicodingtest;

import com.sunstar.minicodingtest.client.FizzBuzzClient1;
import com.sunstar.minicodingtest.client.FizzBuzzClient2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.IntStream;

@SpringBootApplication
public class MiniCodingTestApplication {
    private static final Logger logger = LoggerFactory.getLogger(MiniCodingTestApplication.class);

    public static void main(String[] args) {

        if (args.length == 0) {
            logger.debug("args is empty");
            return;
        }

        if ("1".equals(args[0])) {
            stage1();
            return;
        }

        if ("2".equals(args[0])) {
            stage2();
            return;
        }

        logger.debug("args is not right : {}", args[0]);
    }

    private static void stage1() {
        logger.info("stage 1 : ");
        IntStream.rangeClosed(1, 100).mapToObj(value -> FizzBuzzClient1.getInstance().print(value))
                .forEach(System.out::println);
    }

    private static void stage2() {
        logger.info("stage 2 : ");
        IntStream.rangeClosed(1, 100).mapToObj(value -> FizzBuzzClient2.getInstance().print(value))
                .forEach(System.out::println);
    }

}
