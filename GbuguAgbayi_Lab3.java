
//Agbayi Gbugu, 00454992, computer engineering, 9/25/19,12:17pm.
 
 import java.util.Scanner;
 
 public class GbuguAgbayi_Lab3
 
 {
   public static void main (String []args)
  {
   {
    {
     {
     
      double x, y, z;
      int i, j, k;
      x=0;
      y=9.0;
      z=0.6;
      i=15;
      j=15;
      k=7;
      
      System.out.print("Part A: Combined Assignment\n"); /* declared the variables x,y and z. then used the combined assignment operator */
         
         System.out.print("\t x="+(x+=5)+",\n" ); 
         
         System.out.print("\t y=" +(y-=5)+",\n" );
    
         System.out.print("\t z="+(z*=5)+",\n" ); 
         
         System.out.print("\t i="+(i/=k)+" and " );
    
         System.out.println("\t j=" +(j%=k)+ "\n" );
  
      }
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
     boolean booleanTrue;
     boolean booleanFalse;
         booleanTrue=true;
         booleanFalse=false;
     char charA;
     char charZ;
         charA= 65;
         charZ= 90;
     
      System.out.print("Part B: Combined Assignment\n");  /* two variables (High and Low) where created for the primitive Data Type */
     
      System.out.print(" The range of a byte variable is from" +" " + byteLow + " to " + byteHigh + '\n');
  
      System.out.print(" The range of a short variable is from" +" " + shortLow+  " to " + shortHigh +'\n');
  
      System.out.print(" The range of an int variable is from" +" "+ intLow + " to " + intHigh + '\n');
  
      System.out.print(" The range of an long variable is from" +" " + longLow + " to " + longHigh + '\n');
  
      System.out.print(" The range of a float variable is from" +" " + floatLow + " to " + floatHigh + '\n');
  
      System.out.print(" The range of a double variable is from" +" " + doubleLow + " to " + doubleHigh +'\n');
  
      System.out.print(" Boolean data types can be either " +" "+ booleanTrue + " or " + booleanFalse +'\n');
  
      System.out.println(" Uppercase Alphabet runs from " +" "+ charA + " to " + charZ +'\n');
    
       }
    System.out.print("Part C:instantiate and use Scanner object \n"); /* a java statment was imported the scanner class,which was used to store various variables */

    
   Scanner keyboard= new Scanner(System.in);
    String first_name=  "Agbayi";
    String last_name= "Gbugu";
    String university_name= " Hampton University ";
    Scanner Full= new Scanner(System.in);
    String myFull_name= first_name + " " +last_name;
    String school_name= myFull_name + " attends " + university_name; 
    
    System.out.print(myFull_name + "\n");
    System.out.print(university_name + "\n");
    System.out.print(school_name + "\n");
    
    System.out.println("Enter your first name:");
    first_name=keyboard.nextLine();
    System.out.println("Enter your favorite number:");
   int favNumber=keyboard.nextInt();
    System.out.println(first_name +" " + "favorite number is" + " "+ favNumber + "." +"\n");
    }
    
  
    System.out.print("Part D:String Maniplulation \n"); /*variables where declared for the name, school, size, touppercase, tolowercase, firstletter, lastletter  */
    
    Scanner keyboard= new Scanner(System.in);
    String first_name=  "Agbayi";
    String last_name= "Gbugu";
    String university_name= " Hampton University ";
    Scanner Full= new Scanner(System.in);
    String myFull_name= first_name + " " +last_name;
    String school_name= myFull_name + " attends " + university_name;
      System.out.print(school_name + "\n");
 int Size;
  Scanner length= new Scanner(System.in);
   String size= " 12 ";
  System.out.print(" My name contains" + size + "characters including spaces" + "\n");
   
  Scanner UpperCase= new Scanner(System.in);
     String ToUpperCase= " Agbayi Gbugu ";
   System.out.print(" My name in upperCase is" + ToUpperCase + "\n");
    
  Scanner LowerCase= new Scanner(System.in);
  String ToLowerCase= " agbayi gbugu ";
  System.out.print(" My name in lowerCase is" + ToLowerCase + "\n");
  
    Scanner CharAt = new Scanner(System.in);
   String firstLetter= "A";
   String lastLetter= "G";
    System.out.print("My last name begines with"+ " " + lastLetter + "\n");
    
     Scanner myNewString = new Scanner(System.in);
   char Oldchar, b= 5;
   Scanner next = new Scanner(System.in);
   char oldchar, c= 9;
   System.out.print("oldChar" + b +"," + c + "\n");
   
     Scanner D = new Scanner(System.in);
    char Newchar, B= 10 ;
    Scanner F = new Scanner(System.in);
     char newchar, C= 18;
     System.out.println("NewChar" + B +"," + C);    
    
    
    }
 }
 
