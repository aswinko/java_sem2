package Graphics;
// import Cycle4.Graphics.Area_calc;

import java.util.Scanner;

public class Circle implements Area_calc {

    @Override
    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int r = sc.nextInt();
        System.out.println("Area of circle : " + (3.14*r*r));
    }
}
