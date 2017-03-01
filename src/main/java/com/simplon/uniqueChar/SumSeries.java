package com.simplon.uniqueChar;

/**
 * Created by Agnieszka on 27/02/17.
 * Your task is to write a function which returns the sum of following series upto nth term(parameter).
 * Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
 * Rules:
 * You need to round the answer upto 2 decimal places and return it as String.
 * If the given value is 0 then it should return 0.00.
 * You will only be given Natural Numbers as arguments.
 * Examples:
 * SeriesSum(1) => 1 = "1"
 * SeriesSum(2) => 1 + 1/4 = "1.25"
 * SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57"
 * Implement and test NthSeries
 */


public class SumSeries {


    public static double sumSeries1(int n) {

        double res = 0.00;
        if (n == 0) return res;
        else if (n == 1) {
            res = 1.00;
            return res;
        } else if (n > 1) {
            double [] tab = new double [n];
            res = 1.00;
            tab[0] = 1;
            for (int i = 1; i <n; i++) {
                tab[i] = (tab[i-1] + 3);
                res = res + (1/tab[i]);

            }
        }
        return res;
    }




    public static void main (String[] args) {

    }


    public static double sumSeries2(int n) {


        if (n <= 0)
            return 0.00;
        else if (n==1)
            return 1.00;
        else {
            double res = 0.00;
            double mian = 1 + (3 * n);
            res = res + (1.00 / mian) + sumSeries2(n - 1);
        return res;
        }
    }


    public static double sumSeries3(int n) {

            double [] tab = new double [n];
            double res = 0.00;
            for (int i = 0; i <(n); i++) {
                tab[i] = 1+3*i;
                res = res + (1/tab[i]);
            }
        return res;
    }

    //return String.format("%.2f", res).replaceAll(",",".");
} // classe
