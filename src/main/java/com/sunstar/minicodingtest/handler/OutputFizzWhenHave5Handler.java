package com.sunstar.minicodingtest.handler;

import com.sunstar.minicodingtest.constant.FizzBuzzConstant;

public class OutputFizzWhenHave5Handler extends AbstractHandler {
    @Override
    protected String result(int number) {
        return FizzBuzzConstant.BUZZ;
    }

    @Override
    protected Boolean match(int number) {
        return String.valueOf(number).contains(FizzBuzzConstant.BUZZ_5);
    }
}
