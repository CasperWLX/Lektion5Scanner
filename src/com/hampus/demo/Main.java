package com.hampus.demo;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("Input Number!");
            int result = input.nextInt();

            System.out.println("you picked " + result);

        }while(true);
    }
}
