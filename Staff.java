import java.util.Scanner;
public class Staff{
    public static void main(String[] args) {
        String item;
        double price;
        int quantity;
        double total;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the item you wish to purchase");
        item=scanner.nextLine();
        System.out.println("the price of the item");
        price=scanner.nextDouble();
        System.out.println("enter the quantity of items ");
         quantity=scanner.nextInt();
         total=price*quantity;
         System.out.println("the total price for "+quantity+" "+item+" is "+total);



        scanner.close();
    }


}

