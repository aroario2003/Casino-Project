import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;
import sun.tools.tree.FinallyStatement;

import java.awt.Graphics;
import java.lang.Object.wait;
import java.lang.reflect.Array;

//this prject is going be a app at some point 
//everyone who participates will get some kind of link to the beta of the game at some point
//please edit this and keep it the language in print statements clean
//if you do not know how to do something than please access the group chat that I will be putting all people who join into.
//this app will be open source
//your cooperation is appreciated, however if any malicious code is inserted into this file and uploaded to my github
//the person in question will be immediatley kicked out of group chat and will not be allowed to work on this project any longer
//I will be deeming one person as administrator apart from myself and that person has right to do whatever they want with the file
//If you have a question leave it before the section your question is about and I will answer it ASAP
//DO NOT EDIT THESE COMMENTS PLEASE!
//thank you!

public class FlipaCoin {
     public static void main(String[] args){
       //define variables
       //You may edit the variables if they do not make sense
       int tp = 1;
       double hp = .05;
       int td = 10;
       int hd = 5;
       int hn = 8;
       int tn = 15;
       int hq = 13;
       int tq = 25;
       int cfh = 3;
       double dc = 1.00;
       //print the title
       System.out.println("The Virtual Coin Flipper");
       //wait 1 second to execute the next command 
       synchronized (args){
       try {
           args.wait(1000);
       } 
       catch (InterruptedException e) {
           e.printStackTrace();
       }
       //pick which coin to use 
       System.out.println("What type of coin do you want to use? penny, dime, nickel or quarter");
       Scanner coins = new Scanner(System.in);
      String answer = coins.nextLine();
      //loop the next lines of code
       for (int i = 0; i < 6; i = i + 1) {
            int hot = (int) Math.round(Math.random() * (3 - 1) + 1);
            //If hot is 1 than print heads
           if (hot == 1) {
               System.out.println("heads");
           }
           //if certain input is given than give specified output
           if (answer.equals("penny") && hot == 1){
               System.out.println("You got "+hp+" cents");
           }
           if (answer.equals("dime") && hot == 1){
               System.out.println("You got "+hd+" cents");
           }
           if (answer.equals("nickel") && hot == 1){
               System.out.println("You got "+hn+" cents");
           }
           if (answer.equals("quarter") && hot == 1){
               System.out.println("you got "+hq+" cents" );
           }
           //If hot is 2 than print tails
           if (hot == 2) {
               System.out.println("tails");
           }
           //if certain input is given than give specified output
           if (answer.equals("penny") && hot == 2){
            System.out.println("You got "+tp+" cent");
           }
           if (answer.equals("dime") && hot == 2){
               System.out.println("You got "+td+" cents");
           }
           if (answer.equals("nickel") && hot == 2){
               System.out.println("you got "+tn+" cents");
           }
           if (answer.equals("quarter") && hot == 2){
               System.out.println("you got "+tq+" cents");
           }
           //condition for hot is 3
           if (hot == 3){
               System.out.println("Your coin has fallen off your hand");
               try{
                   args.wait(1000);
               }
               catch (InterruptedException t){
                   t.printStackTrace();
               }
               System.out.println("You lost "+cfh+" cents");
           }
           //wait one second to execute the next command 
           try {
               args.wait(1000);
           }
           catch (InterruptedException r){
               r.printStackTrace();
           }
           //ask if the user wants to flip again
           if (i == 0 || i == 1 || i == 2 || i == 3){
           System.out.println("Would you like to flip again?");
            Scanner input = new Scanner(System.in);
            String yon = input.nextLine();
            //if the user inputs no than stop the loop
          if (yon.equals("no")){
              break;
         }
        }
         if (i == 4){
         System.out.println("Would you like to play a bonus flip?");
         Scanner bonus = new Scanner(System.in);
         String dollar = bonus.nextLine();
         if (dollar.equals("yes")){
             System.out.println("This time you have a dollar coin and one flip only! Good Luck!");
             synchronized (args){
             try {
                 args.wait(1000);
             }
             catch (InterruptedException q){
                 q.printStackTrace();
             }
             System.out.println("You will now roll a dice, 1=lose 50 cents, 2=lose bonus 3=gain 1 dollar");
             try{
                 args.wait(1000);
             }
             catch (InterruptedException w){
                 w.printStackTrace();
             }
             diceroll();
              int e = (int) Math.round(Math.random() * (2 - 1) + 1);
         if (e ==1){
            System.out.println("You got heads");
            try {
                args.wait(1000);
            }
            catch (InterruptedException s) {
                s.printStackTrace();
            }
            System.out.println("You gained 50 cents");
           } 
         if (e == 2){
             System.out.println("You got tails");
             try {
                 args.wait(1000);
             }
             catch (InterruptedException f){
                 f.printStackTrace();
             }
             System.out.println("You gained 1 dollar");
            }
            System.out.println("Would you like to play a speedround?");
            Scanner again = new Scanner(System.in);
             String play = again.nextLine();
             if (play.equals("yes")){
                 speedround();
              }
              if (i == 5){
                System.out.println("Would you like to play Slot Machine?");
                 Scanner slot = new Scanner(System.in);
                  String machine = slot.nextLine();
                SlotMachine();
              }  
              //above is necessary code in order for this game to work 
              //make sure it works before submitting to github you noob!
             }
            }
           }
          } 
         }
        }
        //diceroll, this is necessary for the casino
        //Administrator only!
       public static void diceroll(){
        int d = (int) Math.round(Math.random() * (3 - 1) + 1);
        if (d == 1){
            System.out.println("You got a 1");
           System.out.println("You lost 50 cents");
        }
        if (d == 2){
            System.out.println("you got a 2, this will exit the game in the future");
        }
        if (d == 3){
            System.out.println("You got 3");
            System.out.println("You gained 1 dollar");
         }
       }
       //speedround (Do not edit, this is for administrator only)
       static void speedround(){
           System.out.println("Speed round time! Make as much money as possible with 3 rounds!");
            int tp2 = 1;
            double hp2 = .05;
            int td2 = 10;
            int hd2 = 5;
            int hn2 = 8;
            int tn2 = 15;
            int hq2 = 13;
            int tq2 = 25;
            for (int sp = 0; sp < 3; sp += 1){
           int s = (int) Math.round(Math.random() * (4 -1) + 1);
           //conditions for s
           if (s == 1){
               System.out.println("You got a penny");
           }
           if (s == 2){
               System.out.println("You got a dime");
           }
           if (s == 3){
               System.out.println("You got a nickel");
           }
           if (s == 4){
               System.out.println("You got a quarter");
           }
           int hot2 = (int) Math.round(Math.random() * (2 - 1) + 1);
           //If hot is 1 than print heads
          if (hot2 == 1) {
              System.out.println("heads");
          }
          //if certain input is given than give specified output
          if (s == 1 && hot2 == 1){
              System.out.println("You got "+hp2+" cents");
          }
          if (s == 2 && hot2 == 1){
              System.out.println("You got "+hd2+" cents");
          }
          if (s == 3 && hot2 == 1){
              System.out.println("You got "+hn2+" cents");
          }
          if (s == 4 && hot2 == 1){
              System.out.println("you got "+hq2+" cents" );
          }
          //If hot is 2 than print tails
          if (hot2 == 2) {
              System.out.println("tails");
          }
          //if certain input is given than give specified output
          if (s == 1 && hot2 == 2){
           System.out.println("You got "+tp2+" cent");
          }
          if (s == 2 && hot2 == 2){
              System.out.println("You got "+td2+" cents");
          }
          if (s == 3 && hot2 == 2){
              System.out.println("you got "+tn2+" cents");
          }
          if (s == 4 && hot2 == 2){
              System.out.println("you got "+tq2+" cents");
          }
         }
       }
       //code for slot machine sub game
       //you may edit this as you please
       static void SlotMachine(){
           int jackpot = 7;
           int cherry = 1;
           int diamond = 5;
           int four = 4;
           int three =3;
           int two = 2;
           int one = 1;
            int seven = (int) Math.round(Math.random() * (4 - 1) + 1);
            int twenty = (int) Math.round(Math.random() * (4 - 1) + 1);
            int Five = (int) Math.round(Math.random() * (4 - 1) + 1);
            int randomNumber = (int) Math.round(Math.random() * (4 - 1) + 1);
           System.out.println("Welcome to Slot Machine, you have three reels, they are diamond, charry, and seven(7). Try to get 4 of any of the three, seven is jackpot!");
           Thread.sleep(2000);
           System.out.println("Each reel is assigned a random number and 4 fours is jackpot or the same as 4 sevens(final draft will revise)")
            
         }
         static void AddUp(){
           System.out.println("Input the cents you got per each round of each game, pressing enter after each one");
            int num = 0;
            double y = 0;
            for (int t = 0; t < 10; t++){
                Scanner in = new Scanner(System.in);
                num = in.nextInt();
                y += num;
            }
            System.out.println("Your total is: "+y+" cents");
       }
    }