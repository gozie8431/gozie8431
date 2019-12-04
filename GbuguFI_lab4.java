/* Agbayi Gbugu
   00454992
   computer engineering
   10/2/2019
*/
import java.util.Scanner;

public class GbuguFI_lab4

{
  public static void main(String [] args)
   
   {
            Scanner keyboard=new Scanner(System.in);

      double chemistryGrade, physicsGrade, calculusGrade, historyGrade;
     
        System.out.print("Part A: Calculating GPA \n"); //Part A: Calculating GPA       /* four variables where being declared and the GPA was being caculated*/
     
   System.out.println("Enter your grade for Chemistry: \n"); // print chemistryGrade
    chemistryGrade = keyboard.nextDouble();
     
   System.out.println("Enter your grade for Physics: \n");// print  physicsGrade
     physicsGrade = keyboard.nextDouble();


   System.out.println("Enter your grade for Calculus: \n");// print calculusGrade
    calculusGrade = keyboard.nextDouble();


   System.out.println("Enter your grade for History: \n");// print historyGrade
    historyGrade = keyboard.nextDouble();

   double GPA = (chemistryGrade + physicsGrade + calculusGrade + historyGrade)/4 ;


   
     System.out.println("The grade for Chemistry is" + " " + chemistryGrade + "," + " The grade for Physics is" + " " + physicsGrade + "," +" the grade for Calculus is" + " " + calculusGrade + "," + " the grade for History is" + " " + historyGrade + "." + "\n");
     System.out.println("and the GPA for the semester is" + " " + GPA + "." + "\n");
     
     
     System.out.print("Part B: Methods on String \n");//Part B: Methods on String
     
       double  first, second;
     
        String firstString = "Bowie High School";// high school
         String secondString= "Bowie, Maryland";// home town
         
        int length = firstString.length();
   System.out.print(firstString + " " + "contains how many characters?" + "\n");  
  System.out.print(firstString + " contains " + " " + length + " " + "characters" + "\n");   
   
    int length2 = secondString.length();
   System.out.print(secondString + " " + "contains how many characters?" + "\n");
  
  System.out.print(secondString + " contains " + " " + length2 + " " + "characters" + "\n");   
   
   System.out.print("\n");
   
   
   String myUniversity= "attends Hampton University";
   String myName= "Agbayi Gbugu";// full name
   
   String myVar1= myUniversity.toLowerCase();// was converted to lowercase
   System.out.print(myVar1 + " " + "myVar1 in lowerCase" + "\n");
   System.out.print("\n");
   
   String myVar2= myVar1.replace('i','&');//replaced 'i','&' characters
   System.out.print(myVar2 + " " +"myVar1 letter i to & characters" + "\n");
   System.out.print("\n");
   
   String myVar3= myName + " " + myUniversity;// concatinate two variables myName and myUniversity
   System.out.print(myVar3);
   System.out.print("\n");
   System.out.print(myVar3.charAt(2));
   System.out.print("\n");
   
  int Index = myUniversity.indexOf('m');//the index was converted to 'm'
   System.out.print("the index of the first occurrence of the first character is" + " " + Index + "\n");
   System.out.print("\n");
   
   String myVar4 = myUniversity.substring(8,16);//substring of myUniversity
   System.out.print(myVar4);
   System.out.print("\n");
   
    System.out.print("Part C: Cube Volume and surface Area \n"); /* three variables where being defined lenght, Width, height and the surface area and volume where calculated*/
    System.out.print("\n");
    
    int lenght, Width, height;
      lenght=10;
      Width=8;
      height=5;
       
    int Surface=(2*Width*height)+(2*Width*lenght)+(2*height*lenght);
      int Volume=Width*height*lenght;
    System.out.print("enter the lenght, Width, height of the cubic box:" + " " + lenght + " " + Width + " " + height + "\n" );
   System.out.print("\n");
    System.out.print(" The box is " + " " + lenght + " " + "inches long," + " " + Width + " " + "inches wide," + " " + height + " " + "inches high." + "\n");
    System.out.print("The surface area of the box is" + " " + Surface + " " + "square inches and its volume is" + " " + Volume + " " + "cubic inches.");
     
   
   }
   
}