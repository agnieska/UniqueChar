package com.simplon.uniqueChar;

import java.lang.*;

/**
 * Created by Agnieszka on 27/02/17.
 * Define toAlternativeString(String) such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase.
 * For example: altERnaTIng cAsE <=> ALTerNAtiNG CaSe
 * Implement and test it
 */
public class LowerUpperString {


    public static String toAlternativeString(String st) {

        String newString="";
        for (int i = 0; i < st.length(); i++) {

            if (Character.isLowerCase(st.charAt(i)))
                newString = newString + Character.toUpperCase(st.charAt(i)) ;
            else if (Character.isUpperCase(st.charAt(i)))
                newString = newString + Character.toLowerCase(st.charAt(i)) ;
            else  newString = newString + st.charAt(i);
        }
        return newString;
    }

}// classe