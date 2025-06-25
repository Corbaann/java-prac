import java.util.Scanner;
public class hours {
    void hours(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter time in minutes");
        int minutes =scanner.nextInt();
        int hours=minutes/60;
        System.out.println("time in hours is"+hours);
    }
    void minutes(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter time in hours");
        int hours=scanner.nextInt();
        int minutes=hours*60;
        System.out.println("time in minutes is "+minutes);  
    }
    public static void main(String[] args) {
        hours obj=new hours();
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose 1 for minutes to hours or 2 for hours to minutes");
        int choice = scanner.nextInt();
        if (choice == 1) {
            obj.hours();
        } else if (choice == 2) {
            obj.minutes();
        } else {
            System.out.println("Invalid choice");
        }
        scanner.close();
    }
    
}
