import java.util.Arrays;
import java.util.Scanner;

public class Symmetric {

    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter no of columns : ");
        int column = sc.nextInt();

        int arr[][] = new int[row][column];

        System.out.println("Enter the array elements : ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }

    }
}