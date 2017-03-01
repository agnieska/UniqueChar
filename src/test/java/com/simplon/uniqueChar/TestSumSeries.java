package com.simplon.uniqueChar;

import junit.framework.TestCase;

/**
 * Created by Agnieszka on 27/02/17.
 */
public class TestSumSeries extends TestCase {


    @org.junit.Test
    public void testSumSeries1_0 () {


        // set
        int parameter = 0;
        Double expected = 0.00;

        // test
        Double result = SumSeries.sumSeries1(parameter);

        // assert
        assertEquals(expected, result);
    }

    @org.junit.Test
    public void testSumSeries1_1 () {


        // set
        int parameter = 1;
        Double expected = 1.00;

        // test
        Double result = SumSeries.sumSeries1(parameter);

        // assert
        assertEquals(expected, result);
    }

    @org.junit.Test
    public void testSumSeries1_2 () {


        // set
        int parameter = 2;
        Double expected = 1.25;

        // test
        Double result = SumSeries.sumSeries1(parameter);

        // assert
        assertEquals(expected, result, 1e-3);
    }



    @org.junit.Test
    public void testSumSeries1_5 () {


        // set
        int parameter = 5;
        Double expected = 1.57;

        // test
        Double result = SumSeries.sumSeries1(parameter);

        // assert
        assertEquals(expected, result, 1e-3);
    }



    @org.junit.Test
    public void testSumSeries2_5 () {


        // set
        int parameter = 5;
        Double expected = 1.57;

        // test
        Double result = SumSeries.sumSeries2(parameter);

        // assert
        assertEquals(expected, result, 1e-3);
    }


    @org.junit.Test
    public void testSumSeries3_5 () {


        // set
        int parameter = 5;
        Double expected = 1.57;

        // test
        Double result = SumSeries.sumSeries3(parameter);

        // assert
        assertEquals(expected, result, 1e-3);
    }
}