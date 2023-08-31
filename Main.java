package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 5;
        long factorial = fact(num);
        System.out.println(num + " sayısının faktoriyeli: " + factorial);

    }

    public static long fact(int girilenSayi){

        if (girilenSayi>=1){
            return girilenSayi*fact(girilenSayi-1);
        }else {
            return 1;
        }


    }




}


