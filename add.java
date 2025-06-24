import java.util.Scanner;
public class add {
    int a;
    int b;
    void enter(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nter first number");
        a=scanner.nextInt();
        System.out.println("enter second number");
        b=scanner.nextInt();
    }
    void addNo(){
        int sum =a+b;
        System.out.println("sum of "+a+" and "+b+" is "+sum);

    }
    public static void main(String[] args) {
        add obj=new add();
        obj.enter();
        obj.addNo();
    }
    
    
}
