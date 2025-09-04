public class nestedIf {
    public static void main(String[] args){
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;
        if(isStudent){
            if(isSenior){
                System.out.println("You get a 20% discount");
                System.out.println("You get a 10% discount");
                price *= 0.7;
            }else{
                System.out.println("You get a 10% discount");
                price *= 0.9;}
        }else{
            if(isSenior){
                System.out.println("You get a 20% discount");
                price *= 0.8;
            }
            price *= 1;
        }
        System.out.println("The price of the ticket is : "+ price);
    }
}
