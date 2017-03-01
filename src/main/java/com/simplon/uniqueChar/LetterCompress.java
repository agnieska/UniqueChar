package com.simplon.uniqueChar;

import java.util.ArrayList;

/**
 * Implement and test a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a5b1c5.
 * Created by Agnieszka on 27/02/17.
 */
public class LetterCompress {


    public static String LetterCompress1(String st) {

        String resultat = "";

            // je cree un tableau de strings " a,a,b,c,c,c,c,c,a,a,a "
            String[] tabStrings = st.split("");


            // je cree une liste avec les caractere uniques "a, b, c "
            ArrayList<String> uniqueArray = new ArrayList<String>();
            for (int i = 0; i < tabStrings.length; i++) {
                if (!uniqueArray.contains(tabStrings[i]))
                    uniqueArray.add(tabStrings[i]);
            }

            // je compte les strings qui se repetent avec 2 boucles :
            // la premiere pur parcourir "a,b,c" et la deuxieme pour compter
            for (int i = 0; i < uniqueArray.size(); i++) {
                int count = 0;
                for (int j = 0; j < tabStrings.length; j++) {
                    if (tabStrings[j].equals(uniqueArray.get(i)))
                        count++;
                }
                // je mets le resultat dans une chaine
                resultat = resultat + uniqueArray.get(i) + count;
            }
        return resultat;
    }




    public static String LetterCompress2 (String st) {

        // je cree un tableau de strings " a,a,b,c,c,c,c,c,a,a,a "
        String[] tabStrings = st.split("");
        String resultat = "";

        // j'appelle une methode pour faire une liste "a,b,c"
        ArrayList<String> uniqueArray = createUniqueArray(tabStrings);

        for (int i = 0; i < uniqueArray.size(); i++){
            int count=0;

            // j'appelle une methode pour compter les strings qui se repetent
            count = countSameStrings (uniqueArray.get(i), tabStrings);
            resultat = resultat + uniqueArray.get(i) + count;
        }

        return resultat;
    }

    public static int countSameStrings (String a, String[] Liste ){
        int count = 0;
        for (int i = 0; i < Liste.length; i++) {
            if (Liste[i].equals(a)) count++;
        }
        return count;
    }



    public static ArrayList<String> createUniqueArray(String[] tab) {

        ArrayList<String> uniquetab = new ArrayList<String>();

        for (int i = 0; i < tab.length; i++) {
            if (!uniquetab.contains(tab[i]))
                uniquetab.add(tab[i]);
        }
        return uniquetab;
    }


} // classe
