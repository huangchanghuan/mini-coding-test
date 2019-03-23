package com.sunstar.minicodingtest.handler;

public abstract class AbstractHandler {

    private AbstractHandler nextHandler;

    public final String print(int number) {
        return match(number) ? result(number) : nextHandler.print(number);
    }

    /**
     * Current handler processing
     * @param number input number
     * @return
     */
    protected abstract String result(int number);

    /**
     * Determines whether to be processed by the current handler
     * @param number input number
     * @return
     */
    protected abstract Boolean match(int number);

    public void setNextHandler(AbstractHandler abstractHandler) {
        this.nextHandler = abstractHandler;
    }
}
