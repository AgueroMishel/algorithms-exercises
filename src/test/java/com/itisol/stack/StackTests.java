package com.itisol.stack;

import org.junit.Assert;
import org.junit.Test;

public class StackTests {

//    @Test
    public void testStackWithMinElementConstantTime() {
        StackMin stackMin = null; // Add Custom Implementation

        stackMin.push(4);
        stackMin.push(9);
        stackMin.push(6);

        //4, 9, 6

        Assert.assertEquals(4, stackMin.min());

        stackMin.pop();
        stackMin.pop();

        //4

        Assert.assertEquals(4, stackMin.min());

        stackMin.push(2);
        stackMin.push(5);
        stackMin.push(11);
        stackMin.push(1);

        //4,2,5,11,1

        Assert.assertEquals(1, stackMin.min());

        stackMin.pop();

        //4,2,5,11

        Assert.assertEquals(2, stackMin.min());

        stackMin.push(32);
        stackMin.push(2);
        stackMin.push(2);
        stackMin.push(534);
        stackMin.push(4);
        stackMin.push(42);

        //4,2,5,11,32,2,2,534,4,42

        Assert.assertEquals(2, stackMin.min());

        stackMin.pop();
        stackMin.pop();
        stackMin.pop();
        stackMin.pop();
        stackMin.pop();
        stackMin.pop();
        stackMin.pop();
        stackMin.pop();
        stackMin.pop();

        //4

        Assert.assertEquals(4, stackMin.min());
    }

}
