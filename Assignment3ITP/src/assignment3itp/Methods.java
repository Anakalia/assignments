/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3itp;

/**
 *
 * @author andi loveday
 */
public class Methods {
        
    public static void pause() {
        
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);} catch (InterruptedException ex) {
                System.out.println();
            }
        }
    }
//Unable to find what it means by identifier expected.
//Code runs even with errors.
    //tried using throws InterruptedException within the method name, no change.
    public static void pause2() {
        for (int i = 1; i < 8; i++) {
            try {
                Thread.sleep(500);} catch (InterruptedException ex) {
                System.out.println();
            }
        }
    }

    public static void errorExit() {
        System.out.println("You must be concussed because you didn't enter yes or no, you pass out again.");
                Methods.pause();
                System.out.println("Come back later, when you wake up, to try again.");
                Methods.pause();
                System.exit(0);
    }
    
    public static double getRNG() {
        double x = Math.random() * ((100 - 1) + 1) + 1;
        return x;
    }

    public static int nameid (){
        int nameid=1, newRNG;
        
        newRNG = (int) getRNG();
        
        if (newRNG > 0 && newRNG < 10) {
                nameid = (int) 1;
            } else if (newRNG > 10 && newRNG < 25) {
                nameid = (int) 2;
            } else if (newRNG > 25 &&   newRNG < 50) {
                nameid = (int) 3;
            } else if (newRNG > 50 && newRNG < 80) {
                nameid = (int) 4;
            } else if (newRNG > 80 && newRNG < 100) {
                nameid = (int) 5;}
        
            //System.out.println(newRNG); ADDED IN TO CHECK THE RNG WAS DIFFERENT EVERY TIME.
            return nameid;
          }
    
    /**
     *
     * @return
     */
    public static String name() {
        int nameid = nameid();
        String name=" ";
        
        switch (nameid) {
                case 1:
                    name = "Eskarina Smith";
                    break;
                case 2:
                    name = "Jolda Dumbello";
                    break;
                case 3:
                    name = "Zegon Muffallo";
                    break;
                case 4:
                    name = "Igala Thistle";
                    break;
                case 5:
                    name = "Lytso Kasith";
            }
        
        //System.out.println(nameid); ADDED IN TO CHECK THE ID WAS DIFFERENT EVERY TIME.
        return name;
        
    }
    
    public static String weaponBag(){
        String weapon=" ";
        int newRNG;
                
        newRNG = (int) getRNG();
        
        if (newRNG > 0 && newRNG < 10) {
                weapon = "A spikey mace you found on a dead man.";
            } else if (newRNG > 10 && newRNG < 25) {
                weapon = "A frying pan *shrug* Well it worked for Rapunzel didn't it?!";
            } else if (newRNG > 25 && newRNG < 50) {
                weapon = "An inflatable mallet (you knew you should have thrown that away *sigh*)";
            } else if (newRNG > 50 && newRNG < 80) {
                weapon = "A Fairy Sword. It's only 1 inch long, well fairies are small you know! \nIt might hurt a little...get it? " + 
                        "A little sword might hurt a little? \nOk ok, sorry, I'll drop the sense of humour! *grumbles*";
            } else if (newRNG > 80 && newRNG < 100) {
                weapon = "A feather...Really, a feather? What are you gonna do? Tickle him to death?! \n You kick the bag into a bush. Stupid thing" +
                        " it never has worked properly so what's the point in carrying it around?";}
    //System.out.println(newRNG); ADDED IN TO CHECK THE RNG WAS DIFFERENT EVERY TIME.
    return weapon;
    }
    
    public static String weaponHome(){
        String weapon=" ";
        int newRNG;
                
        newRNG = (int) getRNG();
        
        if (newRNG > 0 && newRNG < 10) {
                weapon = "A spikey mace you found on a dead man";
            } else if (newRNG > 10 && newRNG < 25) {
                weapon = "A frying pan *shrug* Well it worked for Rapunzel didn't it?!";
            } else if (newRNG > 25 && newRNG < 50) {
                weapon = "An inflatable mallet (you knew you should have thrown that away *sigh*)";
            } else if (newRNG > 50 && newRNG < 80) {
                weapon = "A Fairy Sword. It's only 1 inch long, well fairies are small you know! \nIt might hurt a little...get it? " + 
                        "A little sword might hurt a little? \nOk ok, sorry, I'll drop the sense of humour! *grumbles*";
            } else if (newRNG > 80 && newRNG < 100) {
                weapon = "A feather...Really, a feather? That's what happens when you get the forest folk to clean your house for you!";}
    //System.out.println(newRNG); ADDED IN TO CHECK THE RNG WAS DIFFERENT EVERY TIME.
    return weapon;
    }
    
    public static String bridge() {
    String crossing = " ";
    int newRNG;
                
        newRNG = (int) getRNG();
        
         if (newRNG > 0 && newRNG < 10) {
                crossing = " the bridge breaks and just as you're about to fall a dragon swoops down and saves you, \ndropping you "
                        + "safely on the other side and flying away! \nPhew that was lucky.";
            } else if (newRNG > 10 && newRNG < 25) {
                crossing = " the bridge breaks, you try to save yourself by grabbing on to the rope." 
                        + "\nYou hang on for dear life until you realise the rope is really a snake." +
                        " \nYou let go in fear and fall to your death..."; 
                System.exit(0);
                
            } else if (newRNG > 25 && newRNG < 50) {
                crossing = " you trip over your laces (your mother always told you to double knot them) and roll across the bridge."
                        + " \nAt least you've made it across I guess.";
            } else if (newRNG > 50 && newRNG < 80) {
                crossing = " you realise it's quite strong and walk across safely.";
            } else if (newRNG > 80 && newRNG < 100) {
                crossing = " you realise just how old it is so take it slow and steady.\nThat's how the tortoise won the race right?";
            }
         
         //System.out.println(newRNG); ADDED IN TO CHECK THE RNG WAS DIFFERENT EVERY TIME.
         return crossing;
}
    public static String ending(){
        String ending=" ";
        int newRNG;
                
        newRNG = (int) getRNG();
        
        if (newRNG > 0 && newRNG < 20) {
               ending = "and suddenly a giant flying rabbit swoops down and carries you off to a\n"
                       + "frozen, far away peak. Well isn't this lovely! I guess this is where\n"
                       + "I leave you. Watch out for Yeti's.";
            } else if (newRNG > 20 && newRNG < 40) {
                ending = "...you wake up...oh, it's all been a dream! It's time to go to work.";
            } else if (newRNG > 40 && newRNG < 60) {
                ending ="you hear Mugglewump crying, then you notice the milk spilt all over \n"
                        + "the floor. Oh the poor goblin!! That's why he took the mop. You offer\n"
                        + "to help clean it up. He thanks you and you become firm friends.";
            } else if (newRNG > 60 && newRNG < 80) {
                ending ="your internet dies...time to read a book I guess!";
            } else if (newRNG > 80 && newRNG < 100) {
               ending = "you run in to attack Mugglewump with your weapon but trip and headbutt him. "
                       + "\n He falls to the ground. You grab grandma's mop and run home." ;
               Methods.pause();
            }
    //System.out.println(newRNG); ADDED IN TO CHECK THE RNG WAS DIFFERENT EVERY TIME.
    return ending;
    }
}
