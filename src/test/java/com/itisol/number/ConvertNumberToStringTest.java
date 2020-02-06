package com.itisol.number;


import org.junit.Assert;
import org.junit.Test;

public class ConvertNumberToStringTest {

    @Test
    public void testNumberUnderOneThousand() {

        int firstNumber = 345;
        int secondNumber = 100;
        int thirdNumber = 5;
        int fourthNumber = 42;

        Assert.assertEquals("345", ConvertNumber.convertNumberToCommaFormattedString(firstNumber));
        Assert.assertEquals("100", ConvertNumber.convertNumberToCommaFormattedString(secondNumber));
        Assert.assertEquals("5", ConvertNumber.convertNumberToCommaFormattedString(thirdNumber));
        Assert.assertEquals("42", ConvertNumber.convertNumberToCommaFormattedString(fourthNumber));
    }


    @Test
    public void testNumberMoreThanOneThousand() {

        int firstNumber = 3450;
        int secondNumber = 1000;
        int thirdNumber = 534435;
        int fourthNumber = 42345;

        Assert.assertEquals("3,450", ConvertNumber.convertNumberToCommaFormattedString(firstNumber));
        Assert.assertEquals("1,000", ConvertNumber.convertNumberToCommaFormattedString(secondNumber));
        Assert.assertEquals("534,435", ConvertNumber.convertNumberToCommaFormattedString(thirdNumber));
        Assert.assertEquals("42,345", ConvertNumber.convertNumberToCommaFormattedString(fourthNumber));
    }

    @Test
    public void testNumberMoreThanOneMillion() {

        int firstNumber = 34503456;
        int secondNumber = 1000000;
        int thirdNumber = 53443565;
        int fourthNumber = 45000000;

        Assert.assertEquals("34,503,456", ConvertNumber.convertNumberToCommaFormattedString(firstNumber));
        Assert.assertEquals("1,000,000", ConvertNumber.convertNumberToCommaFormattedString(secondNumber));
        Assert.assertEquals("53,443,565", ConvertNumber.convertNumberToCommaFormattedString(thirdNumber));
        Assert.assertEquals("45,000,000", ConvertNumber.convertNumberToCommaFormattedString(fourthNumber));
    }

    @Test
    public void testNumberWithZeroInMiddle() {
        int firstNumber = 53043065;
        int secondNumber = 6053;
        int thirdNumber = 1002003004;

        Assert.assertEquals("53,043,065", ConvertNumber.convertNumberToCommaFormattedString(firstNumber));
        Assert.assertEquals("6,053", ConvertNumber.convertNumberToCommaFormattedString(secondNumber));
        Assert.assertEquals("1,002,003,004", ConvertNumber.convertNumberToCommaFormattedString(thirdNumber));
    }

}
