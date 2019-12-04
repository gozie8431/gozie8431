/* Name: Agbayi Gbugu
   Assignment#: 5
   Due date: 10/9/2019
   Location: ST 126 
   id#: 4992
*/
import java.util.*;

public class GbuguA_Lab5
{
   public static void main(String[]args)
   
  { // Part A - read inputs from keybored using Scanner
       
      Scanner keyboard = new Scanner(System.in);
       
       System.out.println("Part A - read inputs from keybored using Scanner");
         System.out.print("\n");
         
       System.out.print("What is your name?" + " " + "\n");     //the user inputs their name
       String fullname = keyboard.nextLine();
       System.out.print("My name is" + " " + fullname + "." + " " + "\n");
         System.out.print("\n");
    
       System.out.print("What is your age?" + " " + "\n");
       String age = keyboard.nextLine();           //the user inputs their age
       System.out.print("My age is" + " " + age + "." + " " + "\n");
        System.out.print("\n");
      
       System.out.print("What is your GPA?" + " " + "\n");
       String GPA = keyboard.nextLine();        //the user inputs their GPA
       System.out.print("My GPA is" + " " + GPA + "." + " " + "\n");
      System.out.print("\n");
      
       System.out.print("What is your Major?" + " " + "\n");
       String Major = keyboard.nextLine();        //the user inputs their Major
       System.out.print("My Major is" + " " + Major + "." + " " + "\n");
        System.out.print("\n");
      
       System.out.print("how many classes are you taking?" + " " + "\n");
        String noClass = keyboard.nextLine();     //the user inputs the number of classes their taking
       System.out.print("I am taking" + " " + noClass + " " + "number of classes." + " " + "\n");
      System.out.print("\n");
          
      
      //Part B - Data Conversion
      
      System.out.println("Part B - Data Conversion");
       System.out.print("\n");
      
     //(a) 
      byte vByte;
      short vShort;           /* Declared a series of variables */
      int vInt;
      long vLong ;
      float vFloat;
      double vDouble;
      
      vByte = 123;
      vShort = vByte;         
      vInt = vShort;
      vLong = vInt;
      vFloat = vLong;
      vDouble = vFloat;
      
      System.out.print("Byte ="+ " " + vByte + "\n");
      System.out.print("short ="+ " " + vShort + "\n");
      System.out.print("int ="+ " " + vInt + "\n");
      System.out.print("long ="+ " " + vLong + "\n");
      System.out.print("float ="+ " " + vFloat + "\n");
      System.out.print("Double ="+ " " + vDouble + "\n");
      System.out.print("\n");
      
      //(b)
      
       vDouble = 123.456;
       vFloat = (float)vDouble;     /*the variables vDouble was defined and the order reverse from highest to lowest rank*/
       vLong = (long)vFloat;
       vInt =(int)vLong;
       vShort = (short)vInt;
       vByte = (byte)vShort;
      
       System.out.print("Double ="+ " " + vDouble + "\n");
       System.out.print("float ="+ " " + vFloat + "\n");
       System.out.print("long ="+ " " + vLong + "\n");
       System.out.print("int ="+ " " + vInt + "\n");
       System.out.print("short ="+ " " + vShort + "\n");
       System.out.print("Byte ="+ " " + vByte + "\n");
    
    
    
      //Part C – String Manipulation
      System.out.println("Part C - String Manipulation");
       System.out.print("\n");
    //(a)
    String name = "Agbayi Gbugu";
    String school = "Hampton University";
     String school_name= name + " attends " + school; //string concatination is being used to combine the name and the school
      System.out.print(school_name + "\n");
      
      
   
      //(b) 
       int Size;
     Scanner length= new Scanner(System.in); // the length assigns the size of to size 
     String size= " 12 ";
     System.out.print("My name contains" + size + "characters including spaces" + "\n");
    
      //(c)
  
     Scanner UpperCase= new Scanner(System.in); // name was converted to uppercase
     String ToUpperCase= " Agbayi Gbugu ";
     System.out.print("My name in upperCase is" + ToUpperCase + "\n");
    
     Scanner LowerCase= new Scanner(System.in); // name was converted to lowercase
     String ToLowerCase= " agbayi gbugu ";
     System.out.print("My name in lowerCase is" + ToLowerCase + "\n");
       //(d)
     Scanner CharAt = new Scanner(System.in); // two variable were declared
     String firstLetter= "A";
     String lastLetter= "G";
     System.out.print("My last name begines with"+ " " + lastLetter + "\n");

      //(e)
     Scanner myNewString = new Scanner(System.in); // the old and new char are being replaced 
     char Oldchar, b= 5;
     Scanner next = new Scanner(System.in);
     char oldchar, c= 9;
     System.out.print("oldChar" + b + c + "\n");
   
     Scanner D = new Scanner(System.in);
     char Newchar, B= 10 ;
     Scanner F = new Scanner(System.in);
     char newchar, C= 18;
     System.out.print("NewChar" + B + C);    
    System.out.print("\n");
    
    // Part D – Mixed & Matched User Input with Calculation
    
    System.out.print("Part D – Mixed & Matched User Input with Calculation");
    System.out.print("\n");
    
    double total, cost, rate, tax;
    System.out.print("insert cost(in percent)" + "\n");
    cost = keyboard.nextFloat();
    System.out.print("\n");
    
    System.out.print("insert rate(in percent)" + "\n");
    rate = keyboard.nextFloat();
    System.out.print("\n");
    
    tax = cost * rate;
    
    total = cost + tax;
    
    System.out.print("The Total =" + " " + total + "\n");
    System.out.print("The Cost =" + " " + cost + "\n");
    System.out.print("The Rate =" + " " + rate + "\n");
    System.out.print("The Tax =" + " " + tax + "\n");
    
 
    }  
    
 }