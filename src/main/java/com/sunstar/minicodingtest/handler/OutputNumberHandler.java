package com.sunstar.minicodingtest.handler;

public class OutputNumberHandler extends AbstractHandler {
    @Override
    protected String result(int number) {
        return String.valueOf(number);
    }

    @Override
    protected Boolean match(int number) {
        return true;
    }
}
