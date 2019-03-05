package com.sunstar.minicodingtest.handler;

import com.sunstar.minicodingtest.constant.FizzBuzzConstant;

public class OutputFizzWhenMultipleOf3Handler extends AbstractHandler {
    @Override
    protected String result(int number) {
        return FizzBuzzConstant.FIZZ;
    }

    @Override
    protected Boolean match(int number) {
        return number % 3 == 0;
    }
}
