package com.itisol.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortableTests {

    private Sortable sortable;

    @Before
    public void setUp() {
        sortable = null; //replace with your implementation
    }

//    @Test
    public void sortTest() {
        Integer [] unsorted = new Integer[] { 5,6,3,7,2,0 };
        Integer [] sorted = sortable.sort(unsorted);

        Assert.assertEquals(unsorted.length, sorted.length);

        Integer previousElement = sorted[0];
        for (int i = 1; i < sorted.length; i++) {
            Assert.assertTrue( sorted[i] > previousElement );
            previousElement = sorted[i];
        }
    }
}
