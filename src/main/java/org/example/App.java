package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Calculator calculator =new  Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int firstInt = sc.nextInt();

        System.out.println("Введите знак операции ");
        String operation = sc.nextLine();

        System.out.println("Введите второе число ");
        int secondInt = sc.nextInt();

        switch (operation) {
          case "+"-> System.out.println(calculator.plus(firstInt, secondInt));
          case "-"-> System.out.println(calculator.plus(firstInt, secondInt));

        }
    }
}
