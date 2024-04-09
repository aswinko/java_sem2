package Cycle3;

import java.util.Scanner;

public class Overload {

   public void area(int l, int b, int h) {
    System.out.println("Area of Cuboid : " + (2 * (l*b + b*h + l*h)));//2 (lb + bh + lh)
   }

   public void area(int l, int b) {
    System.out.println("Area of Rectangle : " + (l*b));
   }

   public void area(int r) {
    System.out.println("Area of Circle : " + (3.14 * r * r));
   }

    public static void main(String[] args) {

        System.out.println("Aswin K O \t 23MCA023 \t 06/03/24"); 
        System.out.println("1. Area of different shapes using overloaded functions.");

        Overload or  = new Overload();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius : ");
        or.area(sc.nextInt());

        System.out.println("Enter the length and breadth : ");
        or.area(sc.nextInt(), sc.nextInt());

        System.out.println("Enter the length , breadth and height : ");
        or.area(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
}
 