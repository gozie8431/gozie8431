/* Name: Agbayi Gbugu
   Assignment#: 5
   Due date: 10/16/2019
   Location: ST 126 
   id#: 00454992
*/
 import java.util.Scanner;

   public class GbuguA_Midterm

{
  public static void main(String [] args)
   
   {

// Part A – Arithmetic Operators 

    double total, cost, tax; // Define double variables: total, cost, and tax 
     double sale_tax_rate = 8.5;// Define a constant double variable: sale_tax_rate and initialize the value to 8.5%  c
     cost = 250;
     tax = cost * sale_tax_rate;// Calculate the tax by multiplying the cost by the sale_tax_rate 
     total = cost + tax;//Calculate the total by adding the cost and tax 
     
      System.out.print("The cost is" + " " + cost + "\n");
       System.out.print("The tax is" + " " + tax + "\n");
       System.out.print("The total is" + " " + total + "\n");
   
   
// Part B – Primitive Data Types 
   
   /* two variables (High and Low) where created for the primitive Data Type */
    byte byteLow;
     byte byteHigh;
       byteLow=-128;
       byteHigh=127; 
     short shortLow;
     short shortHigh;
       shortLow=-32768;
       shortHigh=32767;
     int intLow;
     int intHigh;
       intLow=-2147483648;
       intHigh=2147483647;
     long longLow;
     long longHigh;
        longLow=-9223372036854775808L;
        longHigh=9223372036854775807L;
     float floatLow;
     float floatHigh;
        floatLow=-3.4E-38f;
        floatHigh=3.4E38f;
     double doubleLow;
     double doubleHigh;
         doubleLow= -1.7E-308;
         doubleHigh=1.7E308;
        
         // Create two variable booleanTrue and booleanFalse for true and false respectively, and print them as part of the sentence shown here
     boolean booleanTrue;
     boolean booleanFalse;
         booleanTrue=true;
         booleanFalse=false;
         
         // Create two variables charA and charZ
     char charA;
     char charZ;
         charA= 65;
         charZ= 90;
     
      System.out.print("Part B: Primitive Data Types \n");      
      System.out.print(" The range of a byte variable is from" +" " + byteLow + " to " + byteHigh + '\n');
  
      System.out.print(" The range of a short variable is from" +" " + shortLow+  " to " + shortHigh +'\n');
  
      System.out.print(" The range of an int variable is from" +" "+ intLow + " to " + intHigh + '\n');
  
      System.out.print(" The range of an long variable is from" +" " + longLow + " to " + longHigh + '\n');
  
      System.out.print(" The range of a float variable is from" +" " + floatLow + " to " + floatHigh + '\n');
  
      System.out.print(" The range of a double variable is from" +" " + doubleLow + " to " + doubleHigh +'\n');
  
      System.out.print(" Boolean data types can be either " +" "+ booleanTrue + " or " + booleanFalse +'\n');
  
      System.out.println(" Uppercase Alphabet runs from " +" "+ charA + " to " + charZ +'\n');
      
      
      
      
  //Part C – Using a Scanner 
    
   Scanner keyboard= new Scanner(System.in);// Create a Scanner object
  
    System.out.println("Enter your first name:");//Ask the user to input their name
    String first_name=keyboard.nextLine();
    
 
    System.out.println("Enter your age:");// Ask the user to input their age
   String Age=keyboard.nextLine();
         
   
    System.out.println("Enter your GPA:");// Ask the user to input their GPA
    String GPA=keyboard.nextLine();
   
    
    System.out.println("Enter the number of classes you are taking:");// Ask the user to input the number of classes they are currently taking 
    String classes=keyboard.nextLine();
   
    System.out.println("Your name is" + " " + first_name +'\n');
    System.out.println("Your age is" + " " + Age +'\n');
    System.out.println("Your GPA is" + " " + GPA +'\n');
    System.out.println("You are taking" + " " + classes + " " + "classes" +'\n');
   
   
   //Part D – Methods on String
   
    Scanner str= new Scanner(System.in);
    
    
    String firstString= "Bowie high school";
    String secondString= "Bowie MD";
    System.out.print("i went to" + " " + firstString +'\n');
    System.out.print("i lived in" + " " + secondString +'\n');
     
    int Size;
     Scanner length= new Scanner(System.in); //  Print out firstString and its length 
     String size = "17";
     System.out.print("My high school contains" + " " + size + " " + "characters including spaces" + "\n");
    
    int Size2;
     Scanner length2= new Scanner(System.in); //  Print out secondString and its length 
     String size2 = "8";
     System.out.print("i lived in Bowie MD which contains" + " " + size2 + " " + "characters including spaces" + "\n");
    
      char second;
     second=secondString.charAt(0);
     System.out.print("print out the first character of the  secondString" +'\n'); 
      System.out.print(second);// print out the secondString and the first character of the secondString

      
      
   }
}