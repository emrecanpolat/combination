package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        komb(10,5);


    }

    public static long fact(int girilenSayi){

        if (girilenSayi>=1){
            return girilenSayi*fact(girilenSayi-1);
        }else {
            return 1;
        }

    }

    public static void komb(int n,int r){
        long nFact = fact(n);
        long rFact = fact(r);
        long nEksiRFact = fact(n-r);
        long combination = nFact/(rFact*(nEksiRFact));

        System.out.println(combination);
    }




}


