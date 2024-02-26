import java.util.Arrays;
import java.util.Scanner;

class SortString {
    public static void main(String[] args) {

        System.out.println("Name: Aswin K O \nReg no : 23MCA023 \nDate : 26/02/2024");
        System.out.println("1. Program to Sort strings");

        int size, temp;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();

         char charArr[] = str.toCharArray();

         size = charArr.length;

         for (int i = 0; i < size; i++){
            for (int j = i + 1; j < size; j++){
                if (charArr[i] > charArr[j]){
                    temp = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = (char) temp;
                }
            }
         }
        // Arrays.sort(charArr);
         
         System.out.println("Sorted string : " + new String(charArr));

    }
}