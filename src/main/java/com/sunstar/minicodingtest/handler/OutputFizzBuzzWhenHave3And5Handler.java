package com.sunstar.minicodingtest.handler;

import com.sunstar.minicodingtest.constant.FizzBuzzConstant;

public class OutputFizzBuzzWhenHave3And5Handler extends AbstractHandler {
    @Override
    protected String result(int number) {
        return FizzBuzzConstant.FIZZ_BUZZ;
    }

    @Override
    protected Boolean match(int number) {
        return String.valueOf(number).contains(FizzBuzzConstant.FIZZ_3) && String.valueOf(number).contains(FizzBuzzConstant.BUZZ_5);
    }
}
