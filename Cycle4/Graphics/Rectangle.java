package Graphics;

import java.util.Scanner;

public class Rectangle implements Area_calc {
    @Override
    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length : ");
        int l = sc.nextInt();
        System.out.println("Enter the Width : ");
        int w = sc.nextInt();
        System.out.println("Area of Triangle : " + (l*w));
    }
}
