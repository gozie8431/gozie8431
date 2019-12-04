/* Name: Agbayi Gbugu
   Assignment#: 9
   Due date: 11/13/2019
   Location: ST 126 
   id#: 00454992
*/

import java.util.Scanner;     // import Scanner into the program

public class GbuguA_Lab9
{
  
   
 public static void main( String [] args)       // main method
 {
   Scanner Keyboard = new Scanner(System.in);
   //Part A:
   System.out.println("Part A: \'Evaluate Score\'");
   System.out.println("\n");
    
    int myScore;
    System.out.println("Enter your numeric assignment score (0 - 100): ");
    myScore = Keyboard.nextInt();            // user input
    System.out.println("Your score is " + myScore +", "+ evaluateScore(myScore));
    System.out.println("\n");
    
    //Part B:
    System.out.println("Part B: \'Area Code\' "); 
    System.out.println("\n");
    int areaCode;
    System.out.println("Enter a 3 digit area code for your phone number:  ");
    areaCode = Keyboard.nextInt();              // user input
    System.out.println("Your area code is " + areaCode +", "+ getAreaCode(areaCode));
    System.out.println("\n");
    
    //Part C:
    System.out.println("Part C: \'Store Point\' ");
    System.out.println("\n");
    int amount;
    System.out.println("Enter the dollar amount purchased in the last month: ");
    amount = Keyboard.nextInt();          // user input
    
    String purches = " ";
    
    if(amount == 0)
    {
     System.out.println("You purchased " + amount + " dollars last month and are awarded 0 points.");
    }
    else if(amount <= 50)
    {
    System.out.println("You purchased " + amount + " dollars last month and are awarded 2 points.");
    }
     else if(amount > 50 && amount <= 100)
    {
    System.out.println("You purchased " + amount + " dollars last month and are awarded 4 points.");
    }
     else if(amount > 100 && amount <= 150)
    {
    System.out.println("You purchased " + amount + " dollars last month and are awarded 6 points.");
    }
     else if(amount > 150)
    {
    System.out.println("You purchased " + amount + " dollars last month and are awarded 8 points.");
    }
    
    
    
    
}    
 
    
  //Part A: Evaluate Score 
   public static String evaluateScore (int score)
   
   { 
      String result = " "; 
      
     if(score < 60)                                //if-elseif statements
    { 
      result = "Need to improve more.";
    }
     else if (score >= 60 && score < 69)
     {
     result = "Poor, with room to improve.";
     }
       else if (score >= 70 && score < 79)
     {
     result = "Just enough, but you can do more.";
     }
      else if (score >= 80 && score < 89)
     {
     result = "Good job!";
     }
       else if (score >= 90 && score < 99)
     {
     result = "Excellence!!";
     }
      else if (score >= 100)
     {
     result = "Outstanding!!!";
     }

      return result;

   }
   

//Part B: Area Code
   
      public static String getAreaCode(int aCode)
   {
         String area = " ";
      
      switch(aCode)                          //switch statement
      {
      case 212:
      area = "New York City, NY";
      break; 
      case 202:
      area = "Washington, DC";
      break;
      case 213:
      area = "Los Angeles, CA";
      break; 
      case 305:
      area = "Miami, FL";
      break;
      case 240:
      area = "Maryland, MD";
      break;
      default:
      area = "No city found";
      }
      return area;
   }
   
      
   
   
   
   
   




 
}