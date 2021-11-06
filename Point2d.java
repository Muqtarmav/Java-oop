package Assesment;

import java.util.Scanner;

public class Point2d {
    public Point2d(int x1, int y1) {
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter point1,  x & y  coordinate");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        System.out.println("enter point2 x & y coordinates" );
        int x2 = input.nextInt();
        int y2 = input.nextInt();


        Point2d p1 = new Point2d(x1, y1);
        System.out.println(x1 + y1);

        Point2d p2 = new Point2d(x2, y2);
        System.out.println(p2.toString());

    }
}
