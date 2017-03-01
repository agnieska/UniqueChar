package com.simplon.uniqueChar;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;


/**
 * Unit test for simple App.
 */
/**
 * Created by Agnieszka on 27/02/17.
 */
public class TestLetterCompress extends TestCase{


    @org.junit.Test
    public void testCreateUniqueArray () {

        // set
        String st = "aabcccccaaa";
        String[] tab = st.split("");
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b");
        expected.add("c");

        // test
        ArrayList<String> result = LetterCompress.createUniqueArray(tab);

        // assert
        assertEquals(expected, result);
    }


    @org.junit.Test
    public void testLetterCompress1 () {


        // set
        String st = "aabcccccaaa";
        String expected = "a5b1c5";

        // test
        String result = LetterCompress.LetterCompress1(st);

        // assert
        assertEquals(expected, result);
    }


    @org.junit.Test
    public void testLetterCompress2 () {


        // set
        String st = "aabcccccaaa";
        String expected = "a5b1c5";

        // test
        String result = LetterCompress.LetterCompress2(st);

        // assert
        assertEquals(expected, result);
    }


    @org.junit.Test
    public void testCountSameStrings () {


        // set
        String st = "aabcccccaaa";
        String[] tab = st.split("");
        String a= "a";
        int expected = 5;

        // test
        int result = LetterCompress.countSameStrings(a,tab);

        // assert
        assertEquals(expected, result);
    }




}
