import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double DRIVE_LENGTH = 100;
        double tankSize = 0;
        double fuelPerMile = 0;
        double fuelCost = 0;

        double tripCost = 0;
        double tankCost = 0;
        String trash = "";

        boolean sizeDone  = false;
        boolean mileDone = false;
        boolean costDone = false;

        do {
            System.out.println("enter tank size in gallons: ");
            if (in.hasNextDouble()){
                tankSize = in.nextDouble();
                in.nextLine();
                sizeDone = true;
            }
            else {
                trash = in.nextLine();
                System.out.println( trash + " is not a valid input. Please Try again.");
            }
        } while (!sizeDone); // get tank size

        do {
            System.out.println("Enter car's miles per gallon: ");
            if (in.hasNextDouble()){
                fuelPerMile = in.nextDouble();
                in.nextLine();
                mileDone = true;
            }
            else {
                trash = in.nextLine();
                System.out.println( trash + " is not a valid input. Please Try again.");
            }
        } while (!mileDone); // get miles per gallon

        do {
            System.out.println("Enter Fuel cost per gallon: ");
            if (in.hasNextDouble()){
                fuelCost = in.nextDouble();
                in.nextLine();
                costDone = true;
            }
            else {
                trash = in.nextLine();
                System.out.println( trash + " is not a valid input. Please Try again.");
            }
        } while (!costDone); // get fuel price
        tripCost =  (DRIVE_LENGTH / fuelPerMile ) * fuelCost;
        tankCost = tankSize * fuelCost;
        System.out.println("it would take " + tripCost + "$ to drive 100 miles. it would take " + tankCost + "$ to fill one tank of gas.");


    }
}
