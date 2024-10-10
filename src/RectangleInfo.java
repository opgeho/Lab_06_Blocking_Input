import java.util.Scanner;
import java.lang.Math;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        double length = 0;
        double width = 0;

        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash = "";

        boolean lDone = false;
        boolean wDone = false;

        do {
            System.out.println("What is the length of the rectangle?");
            if (in.hasNextDouble()){
                length = in.nextDouble();
                in.nextLine();
                lDone = true;
            }
            else {
                trash = in.nextLine();
                System.out.println(trash + " is an invalid input. please try again.");
            }
        } while (!lDone);

        do {
            System.out.println("What is the width of the rectangle?");
            if (in.hasNextDouble()){
                width = in.nextDouble();
                in.nextLine();
                wDone = true;
            }
            else {
                trash = in.nextLine();
                System.out.println(trash + " is an invalid input. please try again.");
            }
        } while (!wDone);
        area = length * width;
        perimeter = (length * 2) + (width * 2);
        diagonal = Math.sqrt((length * length) + (width * width));

        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The Diagonal is " + diagonal);

    }
}
