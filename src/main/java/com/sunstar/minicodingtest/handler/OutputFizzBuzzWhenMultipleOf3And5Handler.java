package com.sunstar.minicodingtest.handler;

import com.sunstar.minicodingtest.constant.FizzBuzzConstant;

public class OutputFizzBuzzWhenMultipleOf3And5Handler extends AbstractHandler {
    @Override
    protected String result(int number) {
        return FizzBuzzConstant.FIZZ_BUZZ;
    }

    @Override
    protected Boolean match(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }
}
