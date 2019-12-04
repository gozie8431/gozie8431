/**
* Name: Agbayi Gbugu
* ID: 00454992
* Major: Computer Engineering
* 11/20/2019 12:00pm
* S&T 126      */ 

import java.text.DecimalFormat;     //import DecimalFormat class
import java.util.Scanner;           //import Scanner class
import java.util.*;                 //import Random object

public class GbuguA_Lab10
{
   public static void main(String[]args)
   {
   //Part A -While-Loop – Rolling Dice: 
   
      int dice1_AG = 0, dice2_AG = 0, sum = 0;
        
      Random rand_AG = new Random();           // Random object
      Scanner keyboard = new Scanner(System.in);      //Scanner object
      
        System.out.println("Part A - While-Loop – Rolling Dice:");
        System.out.println("\n");
          
       while(sum != 8)
       {   
         dice1_AG = rand_AG.nextInt(6)+1;
            
         dice2_AG = rand_AG.nextInt(6)+1;
   
   
         sum = (dice1_AG + dice2_AG);  
         System.out.println("Dice are " + dice1_AG+ " "+ dice2_AG + "(sum =" + sum +")");
           
        } 
    
            System.out.println("Eight Rolled.");
   
   // Part B.  For loop – Square, Cube, and Square Root
   
      System.out.println("Part B.  For loop – Square, Cube, and Square Root:");
      System.out.println("\n");
      
      DecimalFormat Formatter_AG = new DecimalFormat("0.000");    //DecimalFormat class 
      
      System.out.println("Please enter an integer number: ");
      int limit_AG = keyboard.nextInt();     //user input
      
      System.out.println("Number" +" "+ "Square" +" "+ "Cube" +" "+ "Square root");
      
      int totalSqure_AG  = 0, totalCube_AG = 0, totalSqrt_AG = 0;
                  

     for(int Number = 1; Number <= limit_AG ; Number++)
      { 
        System.out.println(Number +" "+" "+" "+" "+" "+" "+ Number * Number +" "+" "+" "+" "+" "+" "+
                            Number * Number * Number +" "+" "+" "+" "+" "+" "+ Formatter_AG.format(Math.sqrt(Number)));
      
      
      //Part C - For-Loop - Running Total
      
         totalSqure_AG  += Number * Number;
         totalCube_AG += Number * Number * Number;    //additional variables 
         totalSqrt_AG += Math.sqrt(Number);
       }  
         System.out.println("\n");
         System.out.println("Part C - For-Loop - Running Total:");
         System.out.println("\n");
         System.out.println("Sum of Square = " + totalSqure_AG);
         System.out.println("Sum of Cube = " + totalCube_AG);
         System.out.println("Sum of Square Root = " + Formatter_AG.format(totalSqrt_AG));
         
     //Part D -   Do-While: Guessing Number
      
        int MY_DIGIT = 8;     //an integer constant 
        System.out.println("\n");
        System.out.println("Part D -   Do-While: Guessing Number:");
        System.out.println("\n");
        System.out.println("Guess what is my favorite digit? (0 - 9): ");
        int guessNum = keyboard.nextInt();     //user input 
        
        do     //Do-While loop
        {
            System.out.println("Incorrect, please try to guess again. (0 - 9):");
            guessNum = keyboard.nextInt();      //user input
                          
         }
         while(guessNum != MY_DIGIT);
         System.out.println("good guess");

         
         
      //Part E -  Using Loop to Validate Input
      int MY_DIGIT2 = 3;
       System.out.println("Guess what is my favorite digit? (0 - 9):");
       int value = keyboard.nextInt();    //user input
       
       do      //nested loop
       {
         if(value < 0 || value <9)
         {
         System.out.println("The number you enter is not in range, please reenter a number ( 0 - 9 ):");
         value = keyboard.nextInt();      //user input
         }
         else
         {
            System.out.println(" ");
         }

       }
       while(value != MY_DIGIT2);
       System.out.println("Good Guess!!");
       
       
       
       System.out.println("Agbayi Gbugu, 00454992, Computer Engineering ");
         
        


        
}
}
      
     
      
      
      
      
      
   
   
   
   
   
  
     

