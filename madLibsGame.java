import java.util.Scanner;
public class madLibsGame {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        System.out.println("Enter an adjective (Description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter an noun: ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective (Description): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb ending with -ing(action) : ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective (Description): ");
        adjective3 = scanner.nextLine();
        scanner.close();




        System.out.println("Today read a " + adjective1 + " book.");
        System.out.println("In that book i saw " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I am " + adjective3 );




    }
}
