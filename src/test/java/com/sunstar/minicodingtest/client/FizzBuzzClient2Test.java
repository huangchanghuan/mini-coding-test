package com.sunstar.minicodingtest.client;

import com.sunstar.minicodingtest.constant.FizzBuzzConstant;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzClient2Test {

    private FizzBuzzClient2 fizzBuzzClient2 = FizzBuzzClient2.getInstance();

    @Test
    public void shouldFizzWhenMultipleOf3() {
        Assert.assertEquals(FizzBuzzConstant.FIZZ,fizzBuzzClient2.print(3));
        Assert.assertEquals(FizzBuzzConstant.FIZZ,fizzBuzzClient2.print(66));
    }

    @Test
    public void shouldFizzWhenHave3() {
        Assert.assertEquals(FizzBuzzConstant.FIZZ,fizzBuzzClient2.print(33));
        Assert.assertEquals(FizzBuzzConstant.FIZZ,fizzBuzzClient2.print(73));
    }

    @Test
    public void shouldBuzzWhenMultipleOf5() {
        Assert.assertEquals( FizzBuzzConstant.BUZZ,fizzBuzzClient2.print(5));
        Assert.assertEquals( FizzBuzzConstant.BUZZ,fizzBuzzClient2.print(100));
    }

    @Test
    public void shouldBuzzWhenHave5() {
        Assert.assertEquals(FizzBuzzConstant.BUZZ,fizzBuzzClient2.print(56));
        Assert.assertEquals(FizzBuzzConstant.BUZZ,fizzBuzzClient2.print(59));
    }

    @Test
    public void shouldFillBuzzWhenMultipleOf3And5() {
        Assert.assertEquals(FizzBuzzConstant.FIZZ_BUZZ,fizzBuzzClient2.print(15));
        Assert.assertEquals(FizzBuzzConstant.FIZZ_BUZZ,fizzBuzzClient2.print(75));
    }

    @Test
    public void shouldFizzBuzzWhenHave3And5() {
        Assert.assertEquals(FizzBuzzConstant.FIZZ_BUZZ,fizzBuzzClient2.print(35));
        Assert.assertEquals(FizzBuzzConstant.FIZZ_BUZZ,fizzBuzzClient2.print(53));
    }

    @Test
    public void shouldNumber() {
        Assert.assertEquals("7",fizzBuzzClient2.print(7));
        Assert.assertEquals("98",fizzBuzzClient2.print(98));
    }

}
