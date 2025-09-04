import java.util.Scanner;
public class mathClass2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.println("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2* Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);
        volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
        System.out.println("The circumferece of cicle is: " + circumference + "cm");
        System.out.println("The area of circlee is: "+ area + "cm²");
        System.out.println("The volume of the circle is: "+ volume + "cm³");




        scanner.close();    
    }
}
