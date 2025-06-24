import java.util.Scanner;
public class odd{
    int x;
    void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        x=scanner.nextInt();
        scanner.close();
    }
    void oddeven(){
        if(x%2==0){
            System.out.println("even numbber");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        odd check=new odd();
        check.read();
        check.oddeven();
        
    }
}