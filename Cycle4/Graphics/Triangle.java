package Graphics;

import java.util.Scanner;

public class Triangle implements Area_calc {
    @Override
    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the breadth : ");
        int b = sc.nextInt();
        System.out.println("Enter the height : ");
        int h = sc.nextInt();
        System.out.println("Area of Triangle : " + (0.5*b*h));
    }
}
