import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        double num1, num2, answer;
        int operator;

        Scanner UserInput = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to the basic calculator!");
        System.out.println("\n" + "1. Addition \n" + "2. Subtraction \n" + "3. Multiplication \n" + "4. Division \n" + "5. Restart Program\n" + "6. Close Program \n");
        operator = UserInput.nextInt();


        switch (operator) {

            case 1 :

            System.out.println();
            System.out.println("First Number: ");
            num1 = UserInput.nextDouble();

            System.out.println("Second Number: ");
            num2 = UserInput.nextDouble();

            answer = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + answer + "\n");
            
            break;

            case 2 :

            System.out.println();

            System.out.println("First Number: ");
            num1 = UserInput.nextDouble();

            System.out.println("Second Number: ");
            num2 = UserInput.nextDouble();

            answer = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + answer + "\n");
            
            break;

            case 3 :
                    
            System.out.println();

            System.out.println("First Number: ");
            num1 = UserInput.nextDouble();

            System.out.println("Second Number: ");
            num2 = UserInput.nextDouble();

            answer = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + answer + "\n");
            
            break;

            case 4 :

            System.out.println();

            System.out.println("First Number: ");
            num1 = UserInput.nextDouble();

            System.out.println("Second Number: ");
            num2 = UserInput.nextDouble();

            answer = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + answer + "\n");
            
            break;

            case 5 :
                    
            Main.main(args);

            case 6 :
            
            System.exit(0);

            default :

            System.out.println("\n" + "Please select the correct operator - +, -, *, or /" + "\n");
            
            break;

        }
        
        main(args);
        

    }
    
    
}
