import java.util.Scanner;
public class company {
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter id number");
    int idno=scanner.nextInt();
    System.out.println("Previous reading");
    double previousReading=scanner.nextDouble();
    System.out.println("Current reading");
    double currentReading=scanner.nextDouble();
    double unitsUsed=currentReading-previousReading;
    double litrs=unitsUsed*1000; 
    double standingcharge=150;
    double bill=15*unitsUsed+150;
    System.out.println("your id number is "+idno+" and your previous reading is "+previousReading+" and your current reading is "+currentReading+" and you have used "+unitsUsed+" units of water which is equal to "+litrs+" litres and your total bill is "+bill);

scanner.close();
    
}
    
}
