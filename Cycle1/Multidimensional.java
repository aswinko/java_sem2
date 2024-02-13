import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {

        System.out.println("Name: Aswin K O \nReg no : 23MCA023 \nDate : 06/02/2024");
        System.out.println("2, Read 2 matrices from the console and perform matrix addition.");


        int arr[][] = new int[2][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int temp = 0;
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                temp += arr[i][j];
            }
        }

        System.out.println("Matrix addition : " + temp);

        System.out.println("Array elements are : ");

        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }


        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //             System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

       
    }
}
