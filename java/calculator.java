package com.saikat;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Take input from the user till user doesn't press X or x
        int ans = 0;
        while(true){
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);
            System.out.println();
            if(op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.println("Enter the two number --- ");
                System.out.print("num1 : ");
                int num1 = input.nextInt();
                System.out.print("num2 : ");
                int num2 = input.nextInt();

                if (op == '+'){
                    ans = num1+num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    if (num2!= 0){
                        ans = num1 / num2;
                    }
                }
            }else if ( op == 'x' || op == 'X'){
                break;
            }else {
                System.out.println("Invalid operator!!!!");
            }
            System.out.println(ans);
        }
    }
}
