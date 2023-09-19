package com.hampus.demo;

import com.hampus.demo.modules.Student;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Objects
        Scanner input = new Scanner(System.in);
        Student benny = new Student();


        //Game
        do
        {
            System.out.println("Input Benny's age!");
            int result = input.nextInt();

            System.out.println("you picked " + result);
            benny.setAge(result);
            System.out.println("Benny's age is: " + benny.getAge());

        }while(true);
    }
}
