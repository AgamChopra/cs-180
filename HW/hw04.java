import java.util.Scanner;
/*
Written by: Agam Chopra
*/

public class CardCounter{
    //Write Your Code Here...
    public static void main(String[] args) {
        System.out.println("Welcome to the Card Counter Program!");
        System.out.println();

        Scanner scan = new Scanner(System.in);
        int total = 0;
        int flag = 1;
        String StrIn;
        int len;

        while (flag != 0) {
            //input
            for(int i = 0; i<2; i++) {
                if(i == 0)
                    System.out.println("Enter Your Hand:");
                else
                    System.out.println("Enter Dealers Hand:");
                StrIn = scan.next();
                len = StrIn.length() - 1;
                //logic
                for (; len >= 0; len--) {
                    if (StrIn.charAt(len) == '2' || StrIn.charAt(len) == '3' || StrIn.charAt(len) == '4' || StrIn.charAt(len) == '5' || StrIn.charAt(len) == '6')
                        total++;
                    else if (StrIn.charAt(len) == 'J' || StrIn.charAt(len) == 'Q' || StrIn.charAt(len) == 'K' || StrIn.charAt(len) == 'A')
                        total--;
                    else if (len != StrIn.length() - 1 && (StrIn.charAt(len) == '1' && StrIn.charAt(len + 1) == '0'))
                        total--;
                }
            }
            //output
            System.out.println("Running Count = "+ total);
            System.out.println();
            System.out.println("Continue? (Y/N):");
            if (scan.next().compareTo("N") == 0)
                flag = 0;
        }
    }
}
