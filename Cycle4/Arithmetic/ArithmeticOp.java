package Arithmetic;

public class ArithmeticOp implements Addition, Division, Multiplication, Substraction {
    public void addition(int num1, int num2) { System.out.println("Addition : " + (num1+num2));}

    public void substract(int num1, int num2) { System.out.println("Substration : " + (num1-num2));}

    public void multiply(int num1, int num2) {System.out.println("Multiplication : " + (num1*num2));}

    public void divide(double num1, double num2){
        if (num2 == 0) {
        throw new ArithmeticException("Cannot divide by 0");
        } else {
            System.out.println("Division: " + (num1/num2));
        }
    }
}
