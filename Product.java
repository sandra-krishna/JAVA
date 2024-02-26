import java.util.Scanner;

class Product {
    String pcode;
    String pname;
    double price;

    public Product(String pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Sandra Krishna P S");
	        System.out.println("Roll no:46");
	        System.out.println("Date:13/2/2024");
	        System.out.println("Find Product having the lowest price"); 
        Scanner scanner = new Scanner(System.in);

       
        Product[] products = new Product[3];

        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product code: ");
            String pcode = scanner.nextLine();
            System.out.print("Product name: ");
            String pname = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); 
            products[i] = new Product(pcode, pname, price);
        }

        
        Product lowestPriceProduct = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].price < lowestPriceProduct.price) {
                lowestPriceProduct = products[i];
            }
        }

        
        System.out.println("\nProduct with the lowest price:");
        System.out.println("Product code: " + lowestPriceProduct.pcode);
        System.out.println("Product name: " + lowestPriceProduct.pname);
        System.out.println("Price: " + lowestPriceProduct.price);

        scanner.close();
    }
}
