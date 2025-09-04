
import java.util.Scanner;
public class compoundInterestCalculator {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double principle ;
        double rate;
        int timesCompounded;
        int years;
        double amount;
        System.out.println("Enter the principle amount: ");
        principle = scanner.nextDouble();

        System.out.println("Enter the interest rate (%): ");
        rate = scanner.nextDouble()/100;

        System.out.println("Enter the no of times compounded: ");
        timesCompounded = scanner.nextInt();

        System.out.println("enter no of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1+ rate/timesCompounded,timesCompounded*years);
        System.out.printf("The amount after %d years is $%.2f",years,amount);

        scanner.close();






    }
}
