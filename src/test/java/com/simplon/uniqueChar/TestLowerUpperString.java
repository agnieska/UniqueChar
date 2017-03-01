package com.simplon.uniqueChar;

import junit.framework.TestCase;

/**
 * Created by Agnieszka on 27/02/17.
 */
public class TestLowerUpperString extends TestCase {



    @org.junit.Test
    public void testToAlternativeString () {


        // set
        String st = "altERnaTIng cAsE";
        String expected = "ALTerNAtiNG CaSe";

        // test
        String result = LowerUpperString.toAlternativeString(st);

        // assert
        assertEquals(expected, result);
    }



}
