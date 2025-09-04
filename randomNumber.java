import java.util.Random;
public class randomNumber {
    public static void main(String[] args){
        Random random = new Random();
        //int num1 = random.nextInt(1,67);
        //double num2 = random.nextDouble();
        boolean headTails = random.nextBoolean();
        System.out.println(headTails);


    }
}
