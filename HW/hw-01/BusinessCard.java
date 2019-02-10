import java.util.Scanner;

/**
 * HW01 BusinessCard
 *
 * This program inputs details about a person and
 * displays them in a formal output.
 *
 * @author Agam Chopra
 *
 * @version January 20, 2019
 *
 */

public class BusinessCard {
    public static void main(String[] args) {
        //Input
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();           //name
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();                //age
        System.out.print("Enter your GPA: ");
        float gpa = scanner.nextFloat();            //gpa
        scanner.nextLine();                         //scanner to read /n delimiter
        System.out.print("Enter your major: ");
        String major = scanner.nextLine();          //major
        System.out.print("Enter your email: ");
        String mail = scanner.nextLine();           //email
        //Output
        System.out.printf("%nName:  %s%n", name);
        System.out.printf("Age:   %d%n", age);
        System.out.printf("GPA:   %.2f%n", gpa);
        System.out.printf("Major: %s%n", major);
        System.out.printf("Email: %s%n", mail);

    }
}