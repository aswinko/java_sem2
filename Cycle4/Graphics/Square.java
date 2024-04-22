package Graphics;

import java.util.Scanner;

public class Square implements Area_calc {
    @Override
    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side : ");
        int side = sc.nextInt();
        System.out.println("Area of Square : " + (side*side));
    }
}
