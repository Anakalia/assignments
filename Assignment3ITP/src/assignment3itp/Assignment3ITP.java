/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3itp;

import java.util.Scanner;

/**
 *
 * @author andi loveday
 */
public class Assignment3ITP {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nameChoice, weapon = " ", weaponChoice, name = " ", bridgeChoice, charge = " ";
        int nameid, newRNG;
        boolean weaponChosen = false;

        System.out.println("Welcome to Andi's interactive fantasy adventure \n");
        Methods.pause();
        System.out.println("Let me set the scene...\n");
        Methods.pause();
        System.out.println("You are an aspiring mage who lives in the woods in your little hut.\n");
        Methods.pause2();
        System.out.println("You've just woken up with a headache.\n'What happened? Who am I?' you think. \nYou're confused and need to remember your name!\n");
        Methods.pause2();
        System.out.println("To remember your name you need to check the runes.\n");
        Methods.pause2();
        System.out.println("Would you like to throw the runes?");
        System.out.println("Enter: \nYes or No");
        /*I had initially planned 3 options here however, to simplify the game I have added
a yes/no option instead. This will then call the dice method to choose a name. May find a way to make it more fun and complex later if
I have time before submission.*/

        nameChoice = input.next();
        if (nameChoice.equalsIgnoreCase("no") || nameChoice.equalsIgnoreCase("n")) {
            System.out.println("You've decided that you don't want to remember you name, you just want to go home and sleep.");
            System.out.println("Maybe when you wake up you may reconsider, but now we say goodbye here.");
            Methods.pause();
            System.out.println("Goodbye o/");
            System.exit(0);
        } else if (nameChoice.equalsIgnoreCase("yes") || nameChoice.equalsIgnoreCase("y")) {

            name = Methods.name();

            /*moved all methods into their own class to help troubleshoot issues with the switch case and found
            they work better from there and makes the code much clearer. */
            System.out.println("You throw the runes into the air and watch as they fall to the ground.\n");
            Methods.pause();
            System.out.println("Suddenly it all comes back to you!\n");
            Methods.pause();
            System.out.println("Your name is " + name + ", and you were attacked by that stinky goblin, Mugglewump.\n"
                    + "He hit you over the head from behind and he's stolen your grandma's mop!\n");
            Methods.pause2();

                System.out.println("You MUST get it back. You decide to go after Mugglewump.");
                Methods.pause();
                System.out.println("Should you take a weapon? Just in case of course!\nEnter: \nYes or No");

                weaponChoice = input.next();
                if (weaponChoice.equalsIgnoreCase("no") || weaponChoice.equalsIgnoreCase("n")) {
                    System.out.println("You're not really the violent type. You could try asking for your "
                            + "grandmas mop back nicely. Who knows, it may work!");
                    weaponChosen = false;

                } else if (weaponChoice.equalsIgnoreCase("yes") || weaponChoice.equalsIgnoreCase("y")) {
                    System.out.println("You have a range of weapons in your magic bag but it's a bit temperamental and doesn't "
                            + "always work. Or you could walk home and get something.\n");
                    Methods.pause();
                    System.out.println("Would you just like to try the bag? It may be working after you fell on it?\n"
                            + "Enter: \nYes or No");
                   
                    
                        weaponChoice = input.next();

                        if (weaponChoice.equalsIgnoreCase("Yes") || weaponChoice.equalsIgnoreCase("Y")) {
                            weapon = Methods.weaponBag();
                            System.out.println(weapon);
                            weaponChosen = true;
                        } else if (weaponChoice.equalsIgnoreCase("No") || weaponChoice.equalsIgnoreCase("N")) {
                            System.out.println("Would you like to go home for one instead?");
                            System.out.println("Enter: \nYes or No");
                            weaponChoice = input.next();

                            if (weaponChoice.equalsIgnoreCase("Yes") || weaponChoice.equalsIgnoreCase("Y")) {
                                weapon = Methods.weaponHome();
                                System.out.println(weapon);
                                weaponChosen = true;
                            } else if (weaponChoice.equalsIgnoreCase("No") || weaponChoice.equalsIgnoreCase("N")) {
                                System.out.println("So you didn't really want a weapon after all. Lets just carry on Mage Indecisive...\n");
                                weaponChosen = false;

                            } else {
                                Methods.errorExit();
                            }

                        } else {
                            Methods.errorExit();
                        }
                    }
                else {
                            Methods.errorExit();
                        }
        }
        
        else {
                            Methods.errorExit();
                        }
        
        if (weaponChosen == true) {
            Methods.pause2();
            System.out.println("\nArmed with your weapon, you set off following Mugglewumps smelly footprints.");
            Methods.pause();
        } else {
            System.out.println("You set off following Mugglewumps smelly footprints.");
            Methods.pause();
        }

        System.out.println("You come across a bridge. It doesn't look very strong or safe but "
                + "Mugglewumps footprints lead right across it.\n");
        Methods.pause2();
        System.out.println("Now you have to decide if you want to try crossing the bridge"
                + " or follow the path down the ravine and up the other side. \nThe path will take much longer, but it is much safer.");
        Methods.pause2();
        System.out.println("Would you like to risk crossing the bridge?");
        System.out.println("Enter: \nYes or No");

        bridgeChoice = input.next();

        if (bridgeChoice.equalsIgnoreCase("Yes") || bridgeChoice.equalsIgnoreCase("Y")) {
            System.out.println("As you start to cross" + Methods.bridge());
        } else if (bridgeChoice.equalsIgnoreCase("No") || bridgeChoice.equalsIgnoreCase("N")) {
            System.out.println("You prefer to take the longer path, you're in no rush after all.\n"
                    + "It may take you an extra hour but the exercise will do you good.");
            Methods.pause2();
            System.out.println("Wow, that hill back up was steep!");
            Methods.pause2();
        }
        else {
                            Methods.errorExit();
                        }

        System.out.println("Well we've made it to the other side 'phew'."
                + "\nYou see Mugglewumps tent ahead. You know grandma's mop is in there.");
        Methods.pause();
        System.out.println("You prepare yourself for battle with Mugglewump to retrieve it.");
        Methods.pause();

        System.out.println("You take a deep breath...it's now or never.");
        Methods.pause();
        System.out.println("Are you ready to charge?"
                + "\nEnter: \nYes or No?");

        charge = input.next();
        Methods.pause2();

        if (charge.equalsIgnoreCase("No") || charge.equalsIgnoreCase("N")) {
            System.out.println("You're too tired from that hit to the head and the long journey."
                    + "\nYou decide that you're just going to curl up in that patch of moss and sleep."
                    + "\nYou can always just get another mop anyway.");
            Methods.pause2();
            System.out.println("Thank you for playing. See you next time around!");
            System.exit(0);
        } else if (charge.equalsIgnoreCase("Yes") || charge.equalsIgnoreCase("Y")) {
            System.out.println("You start to charge towards Mugglewumps hut screaming " + Methods.ending());
        }
        Methods.pause2();
        System.out.println("Well thank you for playing, it was lovely meeting you.");
        System.out.println("Goodbye!");
    }

}
