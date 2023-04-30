import java.util.Scanner;

public class cashier_system {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
int x=1;
int customerCount = 0;
char choice;
String name;
do { 
    
    
    customerCount++;
    String[] product = {"COKE", "CANDY", "CONDOM", "ICECREAM", "COFFEE", "MEDICATIONS", "CANNED", "LIQOUR", "EGG", "NAPKIN"};
    double[] price = {20.0, 3.00, 35.0, 30.0, 50.0, 70.0, 60.0, 90.0, 9.00, 15.0};

    int[] quantities = new int[10];
    boolean doneShopping = false;    
    
   
    
    {
    System.out.print("PLEASE ENTER YOUR NAME: ");
    name=s.nextLine();
    System.out.print("---------------------------------------------");
    System.out.print("WELCOME CUSTOMER! HOW'S YOUR DAY!");
    System.out.print("--------------------------------------");
    }
    System.out.println("-------------------------------------------");
    System.out.println("WELCOME TO OUR STORE! HERE IS OUR PRODUCTS:");
    for (int i = 0; i < product.length; i++) {
        System.out.println("["+(i + 1) + "] " + product[i] + " - PHP " + price[i]);
    }
    System.out.println("-------------------------------------------");
    System.out.println("ENTER 0 TO CHECK OUT");
    System.out.println("-------------------------------------------");
    while (!doneShopping) {
    
        System.out.print("ENTER THE NUMBER OF THE PRODUCT YOU WANT TO BUY ): ");
        int productNumber = s.nextInt();

        if (productNumber == 0) {
            doneShopping = true;
        } else if (productNumber < 1 || productNumber > product.length) {
            System.out.println("INVALID PRODUCT NUMBER! TRY AGAIN.");
            System.out.println("-------------------------------------------");
        } else {
            System.out.print("QUANTITY OF THE PRODUCT: ");
            int quantity = s.nextInt();
            quantities [productNumber - 1] += quantity;
            System.out.println("-------------------------------------------");
        }
    }
    
    double total = 0;
    double tax=0;
    System.out.println("-------------------------------------------"); 
    System.out.println("COSTUMER NAME: "+ name);
    System.out.println("-------------------------------------------"); 
    System.out.println("********7/7********");
    System.out.println("HERE ARE THE ITEMS YOU BOUGHT:");
    for (int i = 0; i < product.length; i++) {
        if (quantities[i] > 0) {
            double subtotal = quantities[i] * price[i];
            System.out.println(product[i] + "  x " + '('+quantities[i]+')' + " - PHP " + subtotal);
            total += subtotal;
        
            tax = total * 0.12;

        }
    }
    System.out.println("TAX FEE: "+tax);
    double ttotal =total+tax;
    System.out.println("YOUR TOTAL IS: PHP " + ttotal);

    do {
        System.out.print("ENTER PAYMENT: " );
        double pay =s.nextDouble();
        if (pay >= ttotal) {
            pay -= ttotal;
            System.out.println("CHANGE: PHP "+pay);
            System.out.println("THANK YOU AND COME AGAIN.");
            System.out.println("*******************");
            System.out.println("-------------------------------------------");

            break;
        } else {
            System.out.println("-------------------------------------------");
            System.out.println("NOT ENOUGH AMOUNT");
            System.out.println("-------------------------------------------");
        }
    } while (x==1);

    System.out.println("******************************************");
    System.out.print("NEW CUSTOMER? Yes(Y)No(N) ");
    choice = s.next().charAt(0);

} while (choice =='y'|| choice =='Y');

System.out.println("Number of customers served today: " + customerCount);
        }
    }
}
