package com.sunstar.minicodingtest.handler;

public abstract class AbstractHandler {

    private AbstractHandler nextHandler;

    public String print(int number) {
        return match(number) ? result(number) : nextHandler.print(number);
    }

    protected abstract String result(int number);

    protected abstract Boolean match(int number);

    public void setNextHandler(AbstractHandler abstractHandler) {
        this.nextHandler = abstractHandler;
    }
}
