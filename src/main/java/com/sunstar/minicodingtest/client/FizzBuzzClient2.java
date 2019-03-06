package com.sunstar.minicodingtest.client;

import com.sunstar.minicodingtest.handler.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Stage 2
 */
public class FizzBuzzClient2 {
    private static final Logger logger = LoggerFactory.getLogger(FizzBuzzClient2.class);

    private static FizzBuzzClient2 fizzBuzzClient2 = new FizzBuzzClient2();

    private AbstractHandler handler;

    private FizzBuzzClient2() {
        // init handlers
        handler = new OutputFizzBuzzWhenMultipleOf3And5Handler();
        AbstractHandler fizzBuzz = new OutputFizzBuzzWhenHave3And5Handler();
        AbstractHandler fizz = new OutputFizzWhenMultipleOf3Handler();
        AbstractHandler fizz1 = new OutputFizzWhenHave3Handler();
        AbstractHandler buzz = new OutputBuzzWhenMultipleOf5Handler();
        AbstractHandler buzz1 = new OutputFizzWhenHave5Handler();
        AbstractHandler number = new OutputNumberHandler();
        handler.setNextHandler(fizzBuzz);
        fizzBuzz.setNextHandler(fizz);
        fizz.setNextHandler(fizz1);
        fizz1.setNextHandler(buzz);
        buzz.setNextHandler(buzz1);
        buzz1.setNextHandler(number);
        logger.debug("client2 finishes init");
    }

    public String print(int number) {
        return handler.print(number);
    }

    public static FizzBuzzClient2 getInstance() {
        return fizzBuzzClient2;
    }

}
