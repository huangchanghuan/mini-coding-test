package com.sunstar.minicodingtest.client;

import com.sunstar.minicodingtest.handler.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Stage 1
 */
public class FizzBuzzClient1 {
    private static final Logger logger = LoggerFactory.getLogger(FizzBuzzClient1.class);

    private static FizzBuzzClient1 fizzBuzzClient1 = new FizzBuzzClient1();

    private AbstractHandler handler;

    private FizzBuzzClient1() {
        // init handlers
        handler = new OutputFizzBuzzWhenMultipleOf3And5Handler();
        AbstractHandler fizz = new OutputFizzWhenMultipleOf3Handler();
        AbstractHandler buzz = new OutputBuzzWhenMultipleOf5Handler();
        AbstractHandler number = new OutputNumberHandler();
        handler.setNextHandler(fizz);
        fizz.setNextHandler(buzz);
        buzz.setNextHandler(number);
        logger.debug("client1 finishes init");
    }

    public String print(int number) {
        return handler.print(number);
    }

    public static FizzBuzzClient1 getInstance() {
        return fizzBuzzClient1;
    }

}
