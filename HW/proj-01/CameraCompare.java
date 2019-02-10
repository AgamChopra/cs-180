import java.util.*;
import java.lang.Math;
/**
 * TODO: This program compares 2 cameras and displays
 * which one is better.
 *
 * @author Agam Chopra
 * @version Feb 05, 2019
 */
public class CameraCompare {

    public static void main(String[] args) {
        /**
         * DO NOT REMOVE ANY OF THESE VARIABLES!
         *
         * These should be used by your program to complete the outlined task.
         *
         * You may add variables as you see fit.
         */

        Scanner scan = new Scanner(System.in);

        /**
         * Part 1 -- Obtaining Camera Details
         */
        System.out.println("Enter attributes of Camera 1:");  // DO NOT REMOVE THIS LINE

        System.out.println("Is it WiFi enabled? (true/false)");
        boolean hasWiFi1 = scan.nextBoolean();
        System.out.println("Is it water resistant? (true/false)");
        boolean isWaterResistant1 = scan.nextBoolean();
        System.out.println("Is it GPS enabled? (true/false)");
        boolean hasGPS1 = scan.nextBoolean();
        System.out.println("Is the lens able to zoom? (true/false)");
        boolean hasZoom1 = scan.nextBoolean();
        scan.nextLine();
        System.out.println("What is the condition? (New/Refurbished/Used)");
        String condition1 = scan.nextLine();
        System.out.println("Enter price from $0.00 to $1000.00");
        double price1 = scan.nextDouble();
        price1 = (double)Math.round(price1*100)/100;
        System.out.println("Enter user rating from 0 to 5");
        int userRating1 = scan.nextInt();


        /**
         * DO NOT REMOVE THESE LINES
         */
        System.out.println("======================");
        System.out.println("Enter attributes of Camera 2:");

        System.out.println("Is it WiFi enabled? (true/false)");
        boolean hasWiFi2 = scan.nextBoolean();
        System.out.println("Is it water resistant? (true/false)");
        boolean isWaterResistant2 = scan.nextBoolean();
        System.out.println("Is it GPS enabled? (true/false)");
        boolean hasGPS2 = scan.nextBoolean();
        System.out.println("Is the lens able to zoom? (true/false)");
        boolean hasZoom2 = scan.nextBoolean();
        scan.nextLine();
        System.out.println("What is the condition? (New/Refurbished/Used)");
        String condition2 = scan.nextLine();
        System.out.println("Enter price from $0.00 to $1000.00");
        double price2 = scan.nextDouble();
        price2 = (double)Math.round(price2*100)/100;
        System.out.println("Enter user rating from 0 to 5");
        int userRating2 = scan.nextInt();

        /**
         * Part 2 -- Computing Camera Values
         */
        int cameraValue1 = 0;
        if(hasWiFi1) cameraValue1++;
        if(hasGPS1) cameraValue1++;
        if(isWaterResistant1) cameraValue1++;
        if(hasZoom1) cameraValue1++;
        if (condition1.equals("New")) cameraValue1 += 2;
        else if (condition1.equals("Refurbished")) cameraValue1++;

        int cameraValue2 = 0;
        if(hasWiFi2) cameraValue2++;
        if(hasGPS2) cameraValue2++;
        if(isWaterResistant2) cameraValue2++;
        if(hasZoom2) cameraValue2++;
        if (condition2.equals("New")) cameraValue2 += 2;
        else if (condition2.equals("Refurbished")) cameraValue2++;
        /**
         * Part 3 -- Camera Comparison
         */
        int better = 0;
        double pvr1;
        pvr1 = price1/cameraValue1;
        double pvr2;
        pvr2 = price2/cameraValue2;
        if(cameraValue1==cameraValue2&&userRating1==userRating2&&price1==price2) {
        }
        else if(userRating1==userRating2&&price1==price2) {
            if(cameraValue1>cameraValue2) better = 1;
            else better = 2;
        }
        else if(cameraValue1==cameraValue2&&price1==price2){
            if(userRating1>userRating2) better = 1;
            else better = 2;
        }
        else if(cameraValue1==cameraValue2&&userRating1==userRating2){
            if(price1<price2) better = 1;
            else better = 2;
        }
        else{
            if(pvr1==pvr2) {
            }
            else if(pvr1<pvr2) better = 1;
            else better = 2;
        }

        /**
         * Part 4 -- Comparison Results
         *
         * DO NOT REMOVE THESE LINES
         */
        System.out.println("======================");
        System.out.println("Result of Comparison:");

        if(better==0) System.out.println("Camera 1 and Camera 2 are equal.");
        else if(better==1) System.out.println("Camera 1 is better than Camera 2!");
        else System.out.println("Camera 2 is better than Camera 1!");


        // DO NOT USE System.Exit!
    }

}
