/* Name: Agbayi Gbugu
   Assignment#: 6
   Due date: 10/23/2019
   Location: ST 126 
   id#: 4992
*/
import java.util.*;

public class GA_Lab6
{
   public static void main(String[] args)
  {
    double mathGrade, historyGrade, programmingGrade, physicsGrade, chemistryGrade;    
     
     Scanner keyboard = new Scanner(System.in);

     GA_TestScore math = new GA_TestScore();  // object 1: math
    System.out.print("Enter your first course name" + "\n");      //enter course name
   String firstCourse = keyboard.nextLine();    //course names 
   math.setCourseName(firstCourse);
   
   System.out.print("and its associated score (between 0 and 4.0)" + "\n");
        mathGrade = keyboard.nextDouble();
         math.setCourseScore(mathGrade);        //the accessors
         keyboard.nextLine();
         
          GA_TestScore history = new GA_TestScore();     // object 2: history
     System.out.print("Enter your second course name" + "\n");       //enter course name

   String secondCourse = keyboard.nextLine();      //course names 
history.setCourseName(secondCourse);
   
   System.out.print("and its associated score (between 0 and 4.0)" + "\n");
        historyGrade = keyboard.nextDouble();
    history.setCourseScore(historyGrade);        //the accessors
         keyboard.nextLine();

    
    
    GA_TestScore programming = new GA_TestScore();    // object 3: programming
     System.out.print("Enter your third course name" + "\n");     //enter course name

   String thirdCourse = keyboard.nextLine();    //course names 
 programming.setCourseName(thirdCourse);

   System.out.print("and its associated score (between 0 and 4.0)" + "\n");
       programmingGrade = keyboard.nextDouble();
    programming.setCourseScore(programmingGrade);         //the accessors
         keyboard.nextLine();

    
    
     GA_TestScore physics = new GA_TestScore();    // object 4: physics
     System.out.print("Enter your forth course name" + "\n");     //enter course name

   String forthCourse = keyboard.nextLine();    //course names 
 physics.setCourseName(forthCourse);

   System.out.print("and its associated score (between 0 and 4.0)" + "\n");
        physicsGrade = keyboard.nextDouble();
    physics.setCourseScore(physicsGrade);        //the accessors
         keyboard.nextLine();

    
    
     GA_TestScore chemistry = new GA_TestScore();     // object 5: chemistry
    System.out.print("Enter your fifth course name" + "\n");      //enter course name

   String fifthCourse = keyboard.nextLine();    //course names 
chemistry.setCourseName(fifthCourse);

   System.out.print("and its associated score (between 0 and 4.0)" + "\n");
        chemistryGrade = keyboard.nextDouble();
    chemistry.setCourseScore(chemistryGrade);          //the accessors
         keyboard.nextLine();

   
   System.out.print(math.getCourseName() + " " + math.getCourseScore() + "\n");

    System.out.print(history.getCourseName() + " " + history.getCourseScore() + "\n");
   
     System.out.print(programming.getCourseName() + " " + programming.getCourseScore() + "\n");

    System.out.print(physics.getCourseName() + " " + physics.getCourseScore() + "\n");
   
     System.out.print(chemistry.getCourseName() + " " + chemistry.getCourseScore() + "\n");
   
   
   double average = (math.getCourseScore() + history.getCourseScore() + programming.getCourseScore() + physics.getCourseScore() + chemistry.getCourseScore())/5;     //calculate the average score 
    System.out.print("The student's average for the current semester is" + " " + average );
   
   
   
   
   }
}    