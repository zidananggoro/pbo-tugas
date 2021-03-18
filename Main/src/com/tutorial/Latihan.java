package com.tutorial;

import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka;
        System.out.println("Masukkan angka tidak boleh lebih dari 2 ");
        try {
            System.out.print("Masukkan angka : ");
            angka = input.nextInt();
            if (angka > 2) {
                throw new Exception("Tidak boleh lebih dari 2 sayang !");
            } else {
                System.out.println("Terima kasih sudah tidak memasukkan angka yang tidak lebih dari 2 ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
