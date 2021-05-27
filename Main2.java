package com.company;


import java.util.Scanner;

public class Main2{
   static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
       // write your code her
        int[] numbers = new int[5];
        int sum=0;


        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter element"+ i);
            numbers[i] = scanner.nextInt();
        }

        for(int i=0;i<numbers.length;i++){
           sum=sum+numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            System.out.println("my array's element is "+numbers[i]);
        }
        System.out.println("Sum of array is "+ sum);
    }
}
