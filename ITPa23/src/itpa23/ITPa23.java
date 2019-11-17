/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpa23;

import java.util.Scanner;
import java.text.DecimalFormat;



/**
 *
 * @author anakalia
 */
public class ITPa23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat totalConv = new DecimalFormat("000.##");
        
        float answer;
        int chosenNumber, age, userInput, yearOfBirth, bday=0, total, runningCount;
        String birthday, amIRight="No";
        
        while (amIRight.equalsIgnoreCase("no")){
        System.out.println("Please enter a number between 2 and 10");
        userInput = input.nextInt();
        
        if (userInput <=1 || userInput >=11) {
            System.out.println("Please try again");
            System.exit(0);
        }
        else {
            System.out.println("Thank you, remember that number");
        }
                
        runningCount = userInput * 2;
        System.out.println("First we will multiply your chosen number by 2");
        System.out.println("That gives us " + runningCount);
        
        runningCount = runningCount + 5;
        System.out.println("Now we will add 5 which gives us " + runningCount);
        
        runningCount = runningCount * 50;
        System.out.println("The next step is to multiply that by 50. We're now up to " + runningCount);
        
        
        System.out.println("For the next step I have to ask....Have you had your birthday this year or is it today? (Yes, no or today)");
        birthday = input.next();
                
        if (birthday.equalsIgnoreCase("yes")) {
            bday = 1769;
        }
        else if (birthday.equalsIgnoreCase("no")) {
            bday = 1768;
        }
        else {
            System.out.println("Happy Birthday!!!");
            bday = 1769;
        }
        
        runningCount = runningCount + bday;
        System.out.println("So now we add " + bday + " to that figure which gives us " + runningCount);
        
        System.out.println("By the way, what year were you born in? (yyyy)");
        yearOfBirth = input.nextInt();
        
        runningCount = runningCount - yearOfBirth;
        System.out.println("I'm now going to subtract your year of birth from our number so far");
        
        answer = (float) runningCount;
        
        System.out.println("The final figure is your original chosen number followed immediately by your age");
        System.out.println(totalConv.format(answer));   
        System.out.println("Did I get it right?");
        amIRight = input.next();
        
        }
        
        System.out.println("Thank you for playing my little math game");
    }
}
