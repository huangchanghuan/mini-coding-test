package com.sunstar.minicodingtest.handler;

import com.sunstar.minicodingtest.constant.FizzBuzzConstant;

public class OutputFizzWhenHave3Handler extends AbstractHandler {
    @Override
    protected String result(int number) {
        return FizzBuzzConstant.FIZZ;
    }

    @Override
    protected Boolean match(int number) {
        return String.valueOf(number).contains(FizzBuzzConstant.FIZZ_3);
    }

}
