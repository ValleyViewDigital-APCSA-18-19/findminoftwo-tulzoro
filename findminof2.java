/**
 * Jeanine Rioux
 * 9/13/3017
 * CSA 3.1) Write an application takes reads two integer variables and 
 * exchanges their values if the first one is greater than the second one.
 * */
package findminoftwo;

import java.util.Scanner;

public class FindMinofTwo 
{
    public static void main (String[] args)
    {
        int num1 = 0;
        int num2 = 0;
        int holder;
        
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("Enter a number");
        num1 = keyboard.nextInt();
        
        System.out.println("Enter a second number");
        num2 = keyboard.nextInt();
        
        System.out.println ("Your first number is " + num1
                            + " and your second number is "
                            + num2);
        if (num1 > num2)
        {
           System.out.println("Ahh, your first number is higher.");
            holder = num1;
            num1 = num2;
            num2 = holder;
            
            System.out.println ("After replacement, your first number is "
                                + num1 + " and your second number is "
                                + num2);
        }//End if
        else
        {
            System.out.println ("Your second number is higher so your first number is still "
                                + num1 + " and your second number is still " + num2);
        }//End else
        
    } // End method main
}// End class FindMinofTwo
