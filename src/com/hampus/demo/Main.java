package com.hampus.demo;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please write something");
        String name = input.nextLine();
        System.out.println(name);
    }
}
