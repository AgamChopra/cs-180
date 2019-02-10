/**
 * HW03 ComputerCustomizer
 *
 * This program  prompts a user for their
 * choice of processor, memory,
 * storage, graphics, and mouse or trackpad.
 * It then calculates and displays the total price.
 *
 * @author Agam Chopra
 *
 * @version January 30, 2019
 *
 */

import java.util.*;

public class ComputerCustomizer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float st_pr;
        st_pr = 4999;
        float prs[] = new float[]{0, 800, 1600, 2400};
        float mem[] = new float[] {0, 800, 2400};
        float str[] = new float[] {0, 800, 2800};
        float grph[] = new float[] {0, 600};
        float per[] = new float[] {0, 50, 149};
        int chs[] = new int[]{0, 0, 0, 0, 0};

        System.out.println("CS180's Computer Customizer");
        System.out.println();
        System.out.printf("Starting price: $%.2f", st_pr);
        System.out.println();

        System.out.print("Processor choices");
        System.out.printf("%n(1) 8-core Intel Xeon W (+ $%.2f)", prs[0]);
        System.out.printf("%n(2) 10-core Intel Xeon W (+ $%.2f)", prs[1]);
        System.out.printf("%n(3) 14-core Intel Xeon W (+ $%.2f)", prs[2]);
        System.out.printf("%n(4) 18-core Intel Xeon W (+ $%.2f)%n", prs[3]);
        System.out.print("Your choice: ");
        chs[0] = scan.nextInt();
        System.out.println();
        System.out.print("Memory choices");
        System.out.printf("%n(1) 32GB DDR4 RAM (+ $%.2f)", mem[0]);
        System.out.printf("%n(2) 32GB DDR4 RAM (+ $%.2f)", mem[1]);
        System.out.printf("%n(3) 32GB DDR4 RAM (+ $%.2f)%n", mem[2]);
        System.out.print("Your choice: ");
        chs[1] = scan.nextInt();
        System.out.println();
        System.out.print("Storage choices");
        System.out.printf("%n(1) 1TB SSD (+ $%.2f)", str[0]);
        System.out.printf("%n(2) 2TB SSD (+ $%.2f)", str[1]);
        System.out.printf("%n(3) 4TB SSD (+ $%.2f)%n", str[2]);
        System.out.print("Your choice: ");
        chs[2] = scan.nextInt();
        System.out.println();
        System.out.print("Graphics choices");
        System.out.printf("%n(1) Radeon Pro Vega 56 (+ $%.2f)", grph[0]);
        System.out.printf("%n(2) Radeon Pro Vega 64 (+ $%.2f)%n", grph[1]);
        System.out.print("Your choice: ");
        chs[3] = scan.nextInt();
        System.out.println();
        System.out.print("Mouse or Trackpad");
        System.out.printf("%n(1) Mouse (+ $%.2f)", per[0]);
        System.out.printf("%n(2) Trackpad (+ $%.2f)", per[1]);
        System.out.printf("%n(3) Both (+ $%.2f)%n", per[2]);
        System.out.print("Your choice: ");
        chs[4] = scan.nextInt();

        //I'm not using any conditional statements because the logic for my code
        //doesn't require any conditional statements that'll consume precious
        //execution/run time.  This holds since we're told to assume no incorrect
        //value of choice will be entered by the user.
        //I'm adding an if else statement just to demonstrate that yes I know
        //how this works as an error check before final calculation and output.
        if(chs[0]<1||chs[0]>4||chs[1]<1||chs[1]>3||chs[2]<1||chs[2]>3||chs[3]<1||chs[3]>2||chs[4]<1||chs[4]>3){
                        System.out.printf("%nERROR!! Incorrect choice!!");
        }else {
            st_pr += (prs[chs[0] - 1] + mem[chs[1] - 1] + str[chs[2] - 1] + grph[chs[3] - 1] + per[chs[4] - 1]);
            System.out.printf("%nTotal price: $%.2f", st_pr);
        }
    }
}