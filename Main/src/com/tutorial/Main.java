package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int[] array = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        System.out.print("nilai yang di masukan : ");
        int index = userInput.nextInt();


        //excaption handling (try,catch,finally)
        try{
            System.out.printf("index ke %d adalah %d", index,array[index]);
        }catch (Exception e){
            System.out.print(e);
        }
        finally {
            System.out.println("\nakhir dari porgram");
        }

    }
}
