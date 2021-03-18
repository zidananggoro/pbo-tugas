package com.tutorial;

import java.util.Scanner;

public class Bismillah {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Masukkan angka pertama  : ");
            int angka1 = input.nextInt();

            System.out.println("Masukkan angka ke 2 : ");
            int angka2 = input.nextInt();

            try{
                System.out.println("Hasilnya adalah : "+(angka1/angka2));
            }catch(ArithmeticException e){
                System.out.println("ArithmeticException is handled. But take care of the variable");
            }

        }
    }


