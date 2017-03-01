package com.simplon.uniqueChar;


import java.util.*;

/**
 * Created by Agnieszka on 14/02/17.
 */
public class UniqueChar
{


        static boolean verifUniqueCaracters(String mot) {

boolean isUnique = true;
            if ((mot == null) || (mot == ""))
                isUnique= false;
            else
                for (int i = 0; i < mot.length(); i++) {
                    char c = mot.charAt(i);
                    for (int j = 0; j < mot.length(); j++) {
                        if ((i != j) && c == (char) mot.charAt(j)) {
                            isUnique = false;
                            break;
                        } else isUnique= true;
                    }
                }
      return isUnique;
        }



        public static void main(String[] args){


            boolean v = verifUniqueCaracters("jasiek");

            if (v==true) System.out.println("ok");
            else System.out.println("ko");




    }



}
