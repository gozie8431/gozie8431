/* Name: Agbayi Gbugu
   Assignment#: 1
   Due date: 9/30/2019
   Location: ST 126 
*/
import java.util.*;

public class GbuguA_P1
{
   public static void main(String[]args)
   
  { 
   String name;
   double aAG, bAG, rAG;
    aAG= 7.0;
    bAG= 9.0;
    rAG= 6.0;
    double c=5.0;
      double result1 = Math.pow(c,7) + 3*aAG;
     double result2 = Math.pow(bAG,3) - Math.pow(3*aAG,3)*bAG + Math.pow(bAG,3);
    double result3 = (3*aAG-2/4) + (2*bAG-1/8);
     double result4 = Math.pow(4*rAG,3)+ 2/3;
   
 
   Scanner keybored=new Scanner(System.in);
   System.out.println("result1="+ result1);
   
   System.out.println("result2="+ result2);
   
   System.out.println("result3="+ result3);
   
   System.out.println("result4="+ result4);
   
   Scanner in=new Scanner(System.in);
   System.out.println("Enter values,(make sure they are doubles)");
   
   aAG=keybored.nextDouble(); 
   bAG=keybored.nextDouble();
   rAG=keybored.nextDouble();
   
   double newresult1 = Math.pow(c,7) + 3*aAG;
     double newresult2 = Math.pow(bAG,3) - Math.pow(3*aAG,3)*bAG + Math.pow(bAG,3);
    double newresult3 = (3*aAG-2/4) + (2*bAG-1/8);
     double newresult4 = Math.pow(4*rAG,3)+ 2/3;
   

   
   System.out.println("newresult1="+ newresult1);
   
   System.out.println("newresult2="+ newresult2);
   
   System.out.println("newresult3="+ newresult3);
   
   System.out.println("newresult4="+ newresult4);
   
   System.out.println("input values for strings");
   
   String string1=keybored.nextLine();
   
     keybored.nextLine();
   
   String string2=keybored.nextLine();
    
       
   int Size;

    
     Scanner length=new Scanner(System.in);

   System.out.print(" string1 contains how many characters?" + "\n");
   String size1=keybored.nextLine();


  System.out.print(" string1" +" "+ size1+ "\n");
   
   
     Scanner length2=new Scanner(System.in);

   System.out.print(" string2 contains how many characters?" + "\n");
   String size2=keybored.nextLine();


  System.out.print(" string2=" +" "+ size2+ "\n");
   
   System.out.println((string1)+""+(string2));
   String string3=keybored.nextLine();
 

   
   
   }
} 