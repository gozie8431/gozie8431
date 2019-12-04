/* Name: Agbayi Gbugu
   Assignment#: 8
   Due date: 11/6/2019
   Location: ST 126 
   id#: 4992
*/

// Part B 
import java.util.Scanner;

public class GbuguA_Lab8
{
   public static void main(String []args)
   
   {  
     
      Scanner keyboard = new Scanner(System.in);      // scanner
      
     System.out.print("Enter the dimensions of the kitchen:");
     double kitchenL= keyboard.nextDouble();    // user's inputs
     double kitchenW= keyboard.nextDouble();
      AG_Rectangle kitchen = new AG_Rectangle("kitchen", kitchenL, kitchenW); // rectangle object
   
   System.out.print("\n");
  
     System.out.print("Enter the dimensions of the bedroom:");
   double  bedroomL= keyboard.nextDouble();      // user's inputs
   double  bedroomW= keyboard.nextDouble();
    AG_Rectangle bedroom = new AG_Rectangle("bedroom", bedroomL, bedroomW);       // rectangle object
       System.out.print("\n");
   
   
     System.out.print("Enter the dimensions of the living room:");
    double livingroomL= keyboard.nextDouble();      // user's inputs
    double  livingroomW= keyboard.nextDouble();
    AG_Rectangle livingroom = new AG_Rectangle("livingroom", livingroomL, livingroomW);       // rectangle object
    
       System.out.print("\n");
   
     System.out.print("Enter the dimensions of the dining room:");
    double diningroomL= keyboard.nextDouble();      // user's inputs
    double  diningroomW= keyboard.nextDouble();   
   AG_Rectangle diningroom = new AG_Rectangle("diningroom", diningroomL, diningroomW);    // rectangle object
   
       System.out.print("\n");
       
        double bathroomL= 12.5;
        double  bathroomW= 15.5;   
   AG_Rectangle bathroom = new AG_Rectangle("bathroom", bathroomL, bathroomW);    // rectangle object
   
       System.out.print("\n");
   
 
   
       System.out.print("This house has 5 rooms:" + "\n");
        
       System.out.print("kitchen:" + kitchenL + " by " + kitchenW + "\n");
   
       System.out.print("bedroom:" + bedroomL + " by " + bedroomW + "\n");
   
       System.out.print("living room:" + livingroomL + " by " + livingroomW + "\n" );
   
       System.out.print("dining room:" + diningroomL + " by " + diningroomW + "\n" );
   
       System.out.print("Bathroom:" + bathroomL + " by " + bathroomW + "\n");

       double Area = ((kitchenL * kitchenW)+(bedroomL * bedroomW)+( livingroomL *  livingroomW)+(diningroomL * diningroomW)+(bathroomL * bathroomW)); // calculate area


       System.out.print("The total area of the house is" +" "+ Area + "\n");
   
   
    
       System.out.print("Enter the NEW dimensions of the Bedroom" + "\n");
       double bedroomL2 = keyboard.nextDouble();        //new value for the bedroom
       double bedroomW2= keyboard.nextDouble();      // user's inputs
       AG_Rectangle bedroom2 = new AG_Rectangle("bedroom2", bedroomL2, bedroomW2);
       

      System.out.print("\n");
       System.out.print("\n");
       
     
       System.out.print("Enter the NEW dimensions of the bathroom" + "\n");
      double  bathroomL2 = keyboard.nextDouble();        //new value for the bathroom
      double bathroomW2 = keyboard.nextDouble();        // user's inputs
       AG_Rectangle bathroom2 = new AG_Rectangle("bathroom2", bathroomL2, bathroomW2);
       
       
       System.out.print("\n");
   
       System.out.print("The remodeled house whit 5 rooms has the followimg dimensions:" + "\n");
        
       System.out.print("kitchen:" + kitchen.getLength() + " by " + kitchen.getWidth() + "\n");
   
       System.out.print("bedroom:" + bedroom2.getLength() + " by " + bedroom2.getWidth() + "\n");
   
       System.out.print("living room:" + livingroom.getLength() + " by " + livingroom.getWidth() + "\n" );
   
       System.out.print("dining room:" + diningroom.getLength() + " by " + diningroom.getWidth() + "\n" );
   
       System.out.print("Bathroom:" + bathroom2.getLength() + " by " + bathroom2.getWidth() + "\n");

       double Area2 = ((kitchen.getArea())+(bedroom2.getArea())+( livingroom.getArea())+(diningroom.getArea())+(bathroom2.getArea()));      // calculate area

       System.out.print("The total area of the house is" +" "+ Area + "\n");

   //part C


         System.out.print("Enter 3 interger values" + "\n");
         int num1 = keyboard.nextInt();
         int num2 = keyboard.nextInt();      //3 interger values
         int num3 = keyboard.nextInt();
         
         
         if (num1 % 3 == 0)
         System.out.print(" num1 =" + num1 + "is divisible by 3." + "\n");
       
         else
         System.out.print(" num1 =" + num1 + "is not divisible by 3." + "\n");
   
          if (num2 % 3 == 0)
         System.out.print(" num2 =" + num2 + "is divisible by 3." + "\n");
      
         else                                                                                  // if-else statments
         System.out.print(" num2 =" + num2 + "is not divisible by 3." + "\n");
   
          if (num3 % 3 == 0)
         System.out.print(" num3 =" + num3 + "is divisible by 3." + "\n");
       
         else
         System.out.print(" num3 =" + num3 + "is not divisible by 3." + "\n");
   

   
   
   
   
   
   
   
   
   
   
   
   
   
        
   
   
   
   }
}   
      