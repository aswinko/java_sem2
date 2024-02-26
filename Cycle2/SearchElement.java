import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {

    public static int search(int arr[], int key){
        
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println("Name: Aswin K O \nReg no : 23MCA023 \nDate : 26/02/2024");
        System.out.println("2. Search an element in an array.");

        int size = 2;
        int arr[] = new int[size];

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Array elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value to be searched : ");
        int key = sc.nextInt();

        int res = search(arr, key);
            
        String dd = res == -1 ? "Item not found!" : "Item found at " + (res+1);
        System.out.println(dd);
    }
}
