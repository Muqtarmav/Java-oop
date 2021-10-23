package Assesment;
import jdk.jfr.Frequency;

import java.util.Arrays;
import java.util.Scanner;
import java.security.SecureRandom;
public class dnnd {
    public static void main(String [] args){
       // int count =0;
        int number = 0;
        int total =0;

        Scanner input = new Scanner(System.in);

        System.out.println("enter number or -1 to quit");
        number = input.nextInt();

        while (number != -1){
            total = total + number;
            number++;


            System.out.println("enter number or -1 to quit");
            number= input.nextInt();
        }
            System.out.println(total);
    }
}

class hhhfhh {
    public static void main(String[] args) {
        double p = 1000;
        double r = 0.05;
        double a = 0;
        for (int n = 1; n <= 10; n++) {
            a = p * Math.pow(1 + r, n);

        }
    }
}

class iuueue{
    public static void main (String [] args){
     int   total = 0;
        for (int count = 1; count <= 10; count++) {
            //  total = total + count;
            if (count == 5) {
                continue;
            }

            System.out.println(count);
        }
    }
}

class ueye{
    public static void main(String [] args){

        int[] array = new int[10];

        System.out.printf("%s%8s%n", "value", "index");

        for (int count = 0; count < array.length; count ++){
            System.out.printf("%5d%8d%n", count, array[count]);
        }


    }
}

class tytwy{
    public static void main(String [] args ){
int total = 0;
        int[] array = {10, 11, 23, 112, 22, 334};

        for (int count : array)
        total = total + count;


            System.out.println(total);

        }
    }

class uururu{
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        int grade;
        int total = 0;
       int count = 0;
        System.out.println("enter grade");
        grade = input.nextInt();

        while ( grade != -1) {
            total = total + grade;
            count++;


            System.out.println("enter grade");
            grade = input.nextInt();

        }
        System.out.println(total);
    }
}



class ddjjd{
    public static void main(String [] args){

        int [] array = new int[10];

        System.out.printf("%s%8s%n", "value", "index");
        for (int count = 0; count < array.length; count++){
          //  System.out.println(count);
            //System.out.println(array[count]);
            System.out.printf("%5d%8d%n", count, array[count]);

        }


    }
}

class jhhf{
    public static void main(String [] args){

        String [] cars = {"amg", "bentley", "porche"};

            cars[0] = "mercedes";
       // for (int count =  0; count < cars.length; count++){
            System.out.println(cars[0]);
        }
        }






class Iiii{
    public static void main(String [] args){
        int [][] array = {{1, 2, 3}, {4, 5, 6}};


        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++)
                System.out.printf("%d ", array[row][column]);

                System.out.println();
           // System.out.printf("%5d%8d%n", row, array[column]);
        }
    }
}

class fjjfj{
    public static void main(String [] args){
        String text = "cat";
        String txt = "dog";

        System.out.println(text + " " + txt);
    }
}
//
//class fhhf{
//    public static void main(String [] args){
//        int [][] arrayb = {{5, 6, 7}, {8}, {9, 10, 11}};
//
//        for (int row = 0; row < arrayb.length; row++) {
//            for (int column = 0; column < arrayb[row].length; column++) ;
//            System.out.printf("%d ", arrayb[row][column]);
//        }
//        System.out.println();
//    }
//}

class ghd{
    public static void main(String [] args){
        final int Array_length = 10;
        int [] array = new int [Array_length];

        for (int counter = 0; counter < array.length; counter++){
           array[counter] = 2 + 2 * counter;
        }
        System.out.printf("%s%8s%n", "index", "value");

        for (int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n", counter,  array[counter]);
        }

    }
}

class ufhjfj{
    public static void main(String [] args){

        SecureRandom randomNumbers = new SecureRandom();
        int[] frequency = new int[7];
        for (int roll = 1; roll <= 6000000; roll++)
            ++frequency [1 + randomNumbers.nextInt(6)];

            System.out.printf("%s%10s%n", "Face", "Frequency");

            for (int face = 1; face < frequency.length; face++)
            System.out.printf("%4d%10d%n", face, frequency[face]);
    }
}

class rujj{
    public static void main(String [] args ){
        int [] frequency = new int[7];

        SecureRandom random = new SecureRandom();
        for ( int  roll = 1; roll < 20000; roll++){
            ++frequency[1 + random.nextInt(6)];

            System.out.printf("%s%10s5n", "Face", "Frequency");
        }

        for (int face = 1; face < frequency.length; face++ ){
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }
    }
}

class fhd{
    public static void main (String [] args){
        int total = 0;
        int [] array = {10, 11, 15, 23, 44, 55, 2};

        for (int value : array){
            total = total + value;
        }
        System.out.println(total);

    }


}

class uyur{
    public static void main (String [] args){
        int [][] array = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}};

        for(int row = 0; row < array.length; row++)
        {
            for (int column = 0; column < array[row].length; column++) {

                System.out.print(array[row][column]);
            }
            System.out.println();
        }

    }
}

class yyyu{
    public static void main(String [] args){
        int total = 0;
        int [] array = {10, 44, 73, 8, 15, 16};

        Arrays.sort(array);
        System.out.println(array);

        for ( int number : array){
            System.out.println(number);
        }

        int [] fill = new int [10];
        Arrays.fill(fill, 5);
       // System.out.printf(fill, "fill");



    }
}

class uryr{
    public static void main(String [] args){
        int[] b = {1, 5, 6, 77, 5, 88};
        int total = 0;


        System.out.printf("%s%8s%n", "index", "values");

        for (int count = 0; count < b.length; count++){
            System.out.printf("%5d%8d%n", count, b[count]);
            System.out.println();

            total = total + b[count];


        }
        System.out.println(total);
    }
}

 class BarChart {
     public static void main(String[] args) {
         int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

         System.out.println("Grade distribution:");

         // for each array element, output a bar of the chart
         for (int counter = 0; counter < array.length; counter++) {
             // output bar label ("00-09: ", ..., "90-99: ", "100: ")
             if (counter == 10)
                 System.out.printf("%5d: ", 100);
             else
                 System.out.printf("%02d-%02d: ",
                         counter * 10, counter * 10 + 9);
             for (int stars = 0; stars < array[counter]; stars++)
                 System.out.print("*");


             System.out.println();
         }
     }

 }

 class Chart{
    public static void main(String [] args){

        int [] b = {0, 0, 0, 0, 1, 0, 3, 4, 2, 1, 2};
        System.out.println("grades distribution");

        for (int count = 0; count < b.length; count ++){

            if (count == 10) {
                System.out.printf("%5d%n ", 100);
            }
                        else{
                            System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
                }

            for ( int counter = 0; counter < b[count]; counter++){
                System.out.print("*");

            }
            System.out.println();

            }
        }
    }

