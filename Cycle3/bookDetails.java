package Cycle3;

import java.util.Scanner;
class Publisher{
    String publisher;
    Publisher(String pub){
        this.publisher=pub;
    }
}
class Book extends Publisher{
    String book;
    Book(String pub,String boo){
        super(pub);
        book=boo;
    }
}
class Literature extends Book{
    String category;
    Literature(String pub, String boo){
        super(pub, boo);
    }
    void display(){
        System.out.println("Publisher :"+publisher);
        System.out.println("Book :"+book);
    }
}
class Fiction extends Book{
    Fiction(String pub, String boo){
        super(pub, boo);
    }
    void display(){
        System.out.println("Publisher :"+publisher);
        System.out.println("Book :"+book);
    }
}
public class bookDetails{
    public static void main(String[] args) {
        System.out.println("Aswin K O \t 23MCA023 \t 06/03/24"); 
        System.out.println("4. Write a program has class Publisher, Book, Literature and Fiction.");

        System.out.println("Enter the No. of Literature Books : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Literature arr[]=new Literature[num];
        System.out.println("Enter the Literature Book Details : ");
        int x = 0,j=0;
        for(int i =0;i<num;i++)
        {
            x = i +1;
            System.out.println(x+").");
            System.out.println("Book : ");
            String boo =sc.next();
            System.out.println("Publisher: ");
            String pub =sc.next();
        
            arr[i]=new Literature(boo,pub);
        }
        System.out.println("Enter the No. of Fiction Books : ");
        int num1 = sc.nextInt();
        Fiction arr1[]=new Fiction[num1];
        System.out.println("Enter the Fiction Book Details : ");
        int x1 = 0,j1=0;
        for(int i =0;i<num1;i++)
        {
            x1 = i +1;
            System.out.println(x1+").");
            System.out.println("Book : ");
            String boo =sc.next();
            System.out.println("Publisher: ");
            String pub =sc.next();
        
            arr1[i]=new Fiction(boo,pub);
        }
        System.out.println("********Informations of all the Literature Books************");
        for(int i=0;i<num;i++){
            j=i+1;
            System.out.println(j+").");
            arr[i].display();
            
        }
        System.out.println("********Informations of all the Fiction Books************");
        for(int i=0;i<num1;i++){
            j1=i+1;
            System.out.println(j1+").");
            arr1[i].display();     
        }
        sc.close();
    }
    
}
