import java.util.Scanner;
public class mathClass {
    public static void main(String[] args){
       /* System.out.println(Math.PI);
        System.out.println(Math.E);
        double result ;
        result = Math.pow(5,3);
        result = Math.abs(-9);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14);
        result = Math.floor(3.14);
        result = Math.min(5,1);
        result = Math.max(423,343);

        System.out.println(result);*/
        //FIND THE HYPOTENUSE C = A^2 + B^2
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Enter first integer: ");
        a = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        b = scanner.nextInt();
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The hypotenuse of is: " + c);

        scanner.close();
    }
}
