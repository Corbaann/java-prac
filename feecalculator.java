import java.util.Scanner;
public class feecalculator{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter admission number");
        Double Admno=scanner.nextDouble();
        System.out.println("enter name");
        String name=scanner.next();
        System.out.println("enter band between 1-5");
        int band=scanner.nextInt();
        int totalfee=90000;
        String scholarship;
        String loan;
        String gov;
        if(band==1){
            scholarship=15000+"";
            loan=22000+"";
            gov="37000";
            totalfee=totalfee-37000;
            System.out.println("your admission number is"+Admno+"and your name is"+name+"your in band 1,you have a scholarship of "+scholarship+" and a loan of "+loan+" and your total fee is "+totalfee+" and you are eligible for government support of "+gov);
        }
        else if(band==2){
            scholarship="25000";
            loan="25000";
            gov="50000";
            totalfee=totalfee-50000;
            System.out.println("your admission number is"+Admno+"and your name is"+name+"your in band 2,you have a scholarship of "+scholarship+" and a loan of "+loan+" and your total fee is "+totalfee+" and you are eligible for government support of "+gov);

        }
        else if(band==3){
            scholarship="35000";
            loan="25000";
            gov="62000";
            totalfee=totalfee-62000;
            System.out.println("your admission number is"+Admno+"and your name is"+name+"your in band 3,you have a scholarship of "+scholarship+" and a loan of "+loan+" and your total fee is "+totalfee+" and you are eligible for government support of "+gov);
        }
        else if(band==4){
            scholarship="45000";
            loan="29000";
            gov="74000";
            totalfee=totalfee-74000;
            System.out.println("your admission number is"+Admno+"and your name is"+name+"your in band 4,you have a scholarship of "+scholarship+" and a loan of "+loan+" and your total fee is "+totalfee+" and you are eligible for government support of "+gov);

        }
        else if(band==5){
            scholarship="55000";
            loan="31000";
            gov="86000";
            totalfee=totalfee-86000;
            System.out.println("your admission number is"+Admno+"and your name is"+name+"your in band 5,you have a scholarship of "+scholarship+" and a loan of "+loan+" and your total fee is "+totalfee+" and you are eligible for government support of "+gov);
        }
        else{
            System.out.println("invalid band number, please enter a band between 1-5");
        }
        scanner.close();

    }
    
}
