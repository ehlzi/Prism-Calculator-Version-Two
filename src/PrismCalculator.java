import java.util.Scanner;

public class PrismCalculator {

    public static void main(String[] args) {

        double lensPower, lensDecentration, prismPower, fPD, sPD, tPD, lensPower1, lensPower2, prismPower1, prismPower2, totalPower;
        int prismChoice;

        Scanner UserInput = new Scanner(System.in);

        System.out.println("Welcome to the prism Calculator!");
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Are we calculating a new Prism or correcting?");
        System.out.println();
        System.out.println("1. New Prism \n"
                        + "2. Correcting Old Prism \n" 
                        + "3. Restart Program \n" 
                        + "4. Exit Program" + "\n");
        prismChoice = UserInput.nextInt();

        switch (prismChoice) {

            case 1:

            System.out.println("Please insert the power of the lens (F): ");
            lensPower = UserInput.nextInt();

            System.out.println("Please insert the decentration of the lens (dec - mm): ");
            lensDecentration = UserInput.nextInt();

            prismPower = (lensPower * lensDecentration) / 10;
            System.out.println("\n" + "The result is " + prismPower + "\n");
                
            break;

            case 2:

            System.out.println("\n" + "Please insert the first PD (largest number): ");
            fPD = UserInput.nextDouble();

            System.out.println("\n" + "Please insert the second PD (smallest number): ");
            sPD = UserInput.nextDouble();
                
            tPD = (fPD - sPD)/2;

            System.out.println("\n" + "Please insert the power of the first lens: ");
            lensPower1 = UserInput.nextDouble();

            System.out.println("\n" + "Please insert the power of the second lens: ");
            lensPower2 = UserInput.nextDouble();

            prismPower1 = (lensPower1 * tPD) / 10;

            prismPower2 = (lensPower2 * tPD) / 10;

            totalPower = prismPower1 + prismPower2;

            System.out.println("\n" + "The total power would be :" + totalPower + "\n");
                
            break;

            case 3 :

            Main.main(args);

            case 4 :

            System.out.println();
            System.exit(0);

            }

        main(args);

    }
    
}
