import java.util.Scanner;


public class Calculator {
    
    
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }
    
  
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }
    
    
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }
    
  
    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return Double.NaN;
        }
        return num1 / num2;
    }
    
    
    public static void displayMenu() {
        System.out.println("\n===== CALCULATOR MENU =====");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");
        System.out.println("============================");
    }
    
   
    public static double[] getUserNumbers(Scanner scanner) {
        double[] numbers = new double[2];
        
        System.out.print("Enter the first number: ");
        numbers[0] = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        numbers[1] = scanner.nextDouble();
        
        return numbers;
    }
    
   
    public static void displayResult(double num1, double num2, char operation, double result) {
        if (Double.isNaN(result)) {
            System.out.println("Calculation could not be completed due to an error.");
        } else {
            System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operation, num2, result);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;
        
        System.out.println("Welcome to the Java Calculator!");
        
        while (continueCalculating) {
            displayMenu();
            System.out.print("Enter your choice (1-5): ");
            
            int choice = scanner.nextInt();
            
            if (choice >= 1 && choice <= 4) {
                
                double[] numbers = getUserNumbers(scanner);
                double num1 = numbers[0];
                double num2 = numbers[1];
                double result = 0;
                char operation = ' ';
                
               
                switch (choice) {
                    case 1:
                        result = addition(num1, num2);
                        operation = '+';
                        System.out.println("\nPerforming Addition...");
                        break;
                        
                    case 2:
                        result = subtraction(num1, num2);
                        operation = '-';
                        System.out.println("\nPerforming Subtraction...");
                        break;
                        
                    case 3:
                        result = multiplication(num1, num2);
                        operation = '*';
                        System.out.println("\nPerforming Multiplication...");
                        break;

                        case 4:
                        result = division(num1, num2);
                        operation = '/';
                        System.out.println("\nPerforming Division...");
                        break;
                }
                
                
                displayResult(num1, num2, operation, result);
                
            } else if (choice == 5) {
                continueCalculating = false;
                System.out.println("Thank you for using the Java Calculator!");
                
            } else {
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
            
           
            if (continueCalculating && choice >= 1 && choice <= 4) {
                System.out.print("\nDo you want to perform another calculation? (y/n): ");
                String continueChoice = scanner.next().toLowerCase();
                
                if (!continueChoice.equals("y") && !continueChoice.equals("yes")) {
                    continueCalculating = false;
                    System.out.println("Thank you for using the Java Calculator!");
                }
            }
        }
        
        scanner.close();
    }
}