package Assesment;

import java.util.Scanner;

public class Yummy {
    static void add() {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int total;

        System.out.println("enter first number");
        num1 = input.nextInt();
        System.out.println("enter second number");
        num2 = input.nextInt();

        total = num1 + num2;
        System.out.println(total);
    }

    public static void  main(String [] args){
        add();


    }
}



