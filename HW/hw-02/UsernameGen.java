import java.util.Scanner;
import java.util.Calendar;

/**
 * HW02 Username Generator
 *
 * This program inputs details about a person and
 * displays them in a username output.
 *
 * @author Agam Chopra
 *
 * @version January 27, 2019
 *
 */

public class UsernameGen{
    public static void main(String[] args) {
    //I/O & Logic
        System.out.println("What is your full name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();           					//input name

        name = name.replace(name.substring(1,name.indexOf(" ")+1),"");	//removes characters
        name = name.toLowerCase();										//converts to lowerC

        System.out.println("What is your birth year?");
        int age = scanner.nextInt();                					//birth year
       
        age = Calendar.getInstance().get(Calendar.YEAR) - age;			//estimates age

        String username = name + age;
        
        System.out.println("Your username is "+username);				//displays username

    }
}