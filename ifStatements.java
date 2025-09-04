import java.util.Scanner;
public class ifStatements {
    public static void main(String[] args){
        int age;
        String name;
        boolean isStudent;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:  ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Are you a student(true/false): ");
        isStudent = scanner.nextBoolean();
        //for name
        if (name.isEmpty()) {
            System.out.println("The name space is empty.");
        }else{
            System.out.println("Hello "+name+"!");
        }
        //for student
        if (isStudent){
            System.out.println("Yu are a student.");

        }else{
            System.out.println("You are not a student");
        }
        //for age
        if(age > 18){
            System.out.println("Your an adult");
        }else if(age == 0){
            System.out.println("your a baby");
        }else if (age > 65){
            System.out.println("Your seneior citizen!");
        }else {
            System.out.println("you are teenager");
        }

        scanner.close();

    }
}
