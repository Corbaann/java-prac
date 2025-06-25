import java.util.Scanner;
public class marks {
  public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      System.out.println("enter first project marks");
      int proj1=scanner.nextInt();
      System.out.println("enter second project marks");
      int proj2=scanner.nextInt();
      System.out.println("enter third project marks");
      int proj3=scanner.nextInt();
      System.out.println("enter forth project marks");
      int proj4=scanner.nextInt();
      System.out.println("enter fifth project marks");
      int proj5=scanner.nextInt();
      double average=(proj1+proj2+proj3+proj4+proj5)/5;
      System.out.printf("your average for %d, %d, %d, %d, %d is %.2f%n", proj1, proj2, proj3, proj4, proj5, average);
scanner.close();
  }  
  

}
