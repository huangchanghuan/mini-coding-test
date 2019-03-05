package com.sunstar.minicodingtest.client;

import com.sunstar.minicodingtest.constant.FizzBuzzConstant;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzClient1Test {

    private FizzBuzzClient1 fizzBuzzClient1 = FizzBuzzClient1.getInstance();

    @Test
    public void shouldFizzWhenMultipleOf3() {
        Assert.assertEquals(FizzBuzzConstant.FIZZ,fizzBuzzClient1.print(3));
        Assert.assertEquals(FizzBuzzConstant.FIZZ,fizzBuzzClient1.print(66));
    }

    @Test
    public void shouldBuzzWhenMultipleOf5() {
        Assert.assertEquals(FizzBuzzConstant.BUZZ,fizzBuzzClient1.print(5));
        Assert.assertEquals(FizzBuzzConstant.BUZZ,fizzBuzzClient1.print(100));
    }

    @Test
    public void shouldFillBuzzWhenMultipleOf3And5() {
        Assert.assertEquals(FizzBuzzConstant.FIZZ_BUZZ,fizzBuzzClient1.print(15));
        Assert.assertEquals(FizzBuzzConstant.FIZZ_BUZZ,fizzBuzzClient1.print(75));
    }

    @Test
    public void shouldNumber() {
        Assert.assertEquals("7",fizzBuzzClient1.print(7));
        Assert.assertEquals("98",fizzBuzzClient1.print(98));
    }

}
