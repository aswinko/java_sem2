import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {

        System.out.println("Name: Aswin K O \nReg no : 23MCA023 \nDate : 06/02/2024");
        System.out.println("2, Read 2 matrices from the console and perform matrix addition.");


        int arr1[][] = new int[2][2];
        int arr2[][] = new int[2][2];
        int arr3[][] = new int[2][2];



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st array elements : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the 2nd array elements : ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Array elements are : ");

        for (int[] is : arr3) {
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
