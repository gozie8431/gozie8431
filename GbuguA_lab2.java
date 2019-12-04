public class GbuguA_lab2



//Agbayi Gbugu, 00454992, computer engineering, 10-2-2019 12:18.



{

   public static void main(String[] args)

  

   // Part A.(two intergers were defined "distance and time"). 

   { int distance = 305;

      int time = 8;

    System.out.println(" Part A: " + "\"" + "Variable and Literals" + "\"");

    System.out.println("the distance between two cities is " + distance + " miles and it takes " + time + " hours to drive between them.");

    

   

    

   // Part B.(three where defined "Total, Cost, and Tax" and cost and tax where calcluated to find the total).

   double Total, Cost, and, Tax;

      Total = 349.6;

      Cost = 320.0;

      Tax = 0.925;

   System.out.println(" Part B: " + "\"" + "Arithmetic Operators 1" + "\"");

    System.out.println("cost is " + Cost + " the sales tax is " + Tax + " and the total is " + Total + " . " );

    

    

       // Part c.(four intergers were defined "dividend, divisor, quotient, And, remainder" and the quotient was calculated dividing by dividend by the divisor).

   int dividend, divisor, quotient, And, remainder;

    dividend = 23;

    divisor = 7;

    quotient =3;

    remainder =2;

   System.out.println(" Part C: " + "\"" + "Arithmetic Operators 2" + "\"");

    System.out.println("when " +  dividend + " is dividend by " + divisor + " and the quotient is " + quotient + " and the remainder is " + remainder +" . " );

   
   //Widening through Assignment Statement Conversion:
   
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
    
    
   
    }

}    

