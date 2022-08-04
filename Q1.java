package com.company;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        System.out.print("Choose your operation: ");
        String operation = in.next();

        if(operation.equals("+"))
        {
            System.out.println(num1+num2);
        }
        else if (operation.equals("-")) {
            System.out.println(num1-num2);
        }
        else if(operation.equals("/")) {
        System.out.println(num1/num2);
        }
        else if(operation.equals("*")) {
        System.out.println(num1*num2);
        }
        else if(operation.equals("%")) {
        System.out.println(num1%num2);
        }
        else {
            System.out.println("This is a wrong operation");
        }
    }
}
