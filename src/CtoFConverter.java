import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double cTemp = 0;
        double fTemp = 0;
        String trash = "";

        boolean cDone = false;

        do {
            System.out.println("Enter celsius temperature: ");
            if (in.hasNextDouble()) {
                cTemp = in.nextDouble();
                in.nextLine();
                cDone = true;
                fTemp = cTemp * (9.0 / 5) + 32;
                System.out.println("The temperature " + cTemp + " in Farenheit is " + fTemp);
            } else {
                trash = in.nextLine();
                System.out.println( trash + " is not a valid temperature. please try again.");
            }
        } while (!cDone);
    }
}