import java.util.Scanner;

class Main {
  
public static void main(String[] args) {

    //Variables
    int choice;

    //Scanner Input Initialization
    Scanner UserInput = new Scanner(System.in);

    //Prompts
    System.out.println();
    System.out.println("---------------------------------- \n"
                    + "Welcome to  Elzie's Math and Prism Calculator \n"
                    + "----------------------------------");
	System.out.println("\n"
                    + "1. Basic Calculator \n"
                    + "2. Prism Calculator \n"
                    + "3. Close Program");
    System.out.println();
    System.out.println("(Type '1', '2', or '3')" + "\n");
    
    //LOGIC
    choice = UserInput.nextInt();

    switch (choice) {

        case 1 :

        BasicCalculator.main(args);

        case 2 :

        PrismCalculator.main(args);

        case 3 :

        System.exit(0);

        case 4 :

        System.out.println("\n" + "I don't understand.. Please try again!" + "\n");
        main(args);
    
        }

    UserInput.close();
    
    }

}
