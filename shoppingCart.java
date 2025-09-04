import java.util.Scanner;
public class shoppingCart {
    public static void main (String[] args){
        //SHOPPING CART PROGRAM
        Scanner scanner = new Scanner(System.in);
        String item;
        int quantity;
        char currency = '$';
        double price;
        double total;
        System.out.println("Enter the item you want to buy: ");
        item = scanner.nextLine();
        System.out.println("Enter the price of the item: ");
        price = scanner.nextDouble();
        System.out.println("Enter the quantity of item you would like to buy: ");
        quantity = scanner.nextInt();
        total = price*quantity;
        System.out.println("The total amount for " + item +"/s" +" is " + currency + total );






        scanner.close();


    }
}
