import java.util.Scanner;

import Graphics.Circle;
import Graphics.Rectangle;
import Graphics.Square;
import Graphics.Triangle;

public class graphicsMain {
    public static void main(String[] args) {
        System.out.println("Aswin K O\n23MCA023\n15-04-24");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the choice 1 - Circle 2 - Rectangle 3 - Square 4 - Triangle : ");
        int choice = sc.nextInt();

        Circle cr = new Circle();
        Rectangle rec = new Rectangle();
        Triangle tr = new Triangle();
        Square sq = new Square();

        switch (choice) {
            case 1:
                cr.area();
                break;
            case 2:
                rec.area();
                break;
            case 3:
                sq.area();
                break;
            case 4:
                tr.area();
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }
}
