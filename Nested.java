public class Nested {
    public static void main(String[] args) {
        
    boolean student =true;
    boolean sinior=false;
    double price =199;
    if(student){
        if(sinior){
        System.out.println("you get a 10% discount for being a student");
        System.out.println("you get a 20% discount for being a sinior");
        price = price*0.7;
        }
        else{
            System.out.println("you get a 10% discount for being a student");
            price *= 0.9;
        }
    }
        else{
            if(sinior){
                System.out.println("you get a 20% discount for being a sinior");
                price*=0.8;

            }
        }
        System.out.println("the price of the ticket is"+price);
       
        }

            
       

        }
        
            
        
     