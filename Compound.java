import java.util.Scanner;
public class Compound {
    public static void main(String[] args) {
        String item;
        double amount;
        double grams;
        double measurement;
         Scanner scanner=new Scanner(System.in);
         System.out.println("enter the price per kg");
         amount=scanner.nextDouble();
         System.out.println("enter the grams per the above amount");
         grams=scanner.nextDouble();
         measurement=amount/grams;
         System.out.printf("the amount per kg is %f",measurement);
         measurement=scanner.nextDouble();
         scanner.close();
        


    }
    
}
