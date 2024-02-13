
public class Product {
    int pCode;
    String pName;
    int price;

    public Product(int pCode, String pName, int price) {
        this.pCode = pCode;
        this.pName = pName;
        this.price = price;
    }

    public void display() {
        System.out.println("Product code : " + pCode);
        System.out.println("Product name : " + pName);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {


        System.out.println("Name: Aswin K O \nReg no : 23MCA023 \nDate : 06/02/2024");
        System.out.println("1, Define a class product with data members pcode, pname and price. Create 3 objects of the class and find the product having the lowest price.");
        
        Product prdt1 = new Product(1, "Pc", 499999);
        Product prdt2 = new Product(2, "Light", 322);
        Product prdt3 = new Product(3, "Watch", 29999);

        System.out.println("Product 1 ");
        prdt1.display();
    
        System.out.println("Product 2 ");
        prdt2.display();

        System.out.println("Product 3 ");
        prdt3.display();
        
        if(prdt1.price < prdt2.price && prdt1.price < prdt3.price){
            System.out.println("Lowest price Have : " + prdt1.pName);
        }else if (prdt2.price < prdt3.price && prdt2.price < prdt1.price) {
            System.out.println("Lowest price Have : " + prdt2.pName);
        } else {
            System.out.println("Lowest price Have : " + prdt3.pName);
        }
        
    }
    
}