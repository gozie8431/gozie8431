/* Name: Agbayi Gbugu
   Assignment#: 6
   Due date: 10/23/2019
   Location: ST 126 
   id#: 4992
*/

public class GA_TestScore     //class
{
  private String CourseName;
  private double CourseScore;
  
   public GA_TestScore()
    {
       CourseName = null;
       CourseScore = 0;     // Attributes
     
    }
   public void setCourseName(String newName)    /* methods*/
   {  
    CourseName = newName;
   }
   public void setCourseScore(double newS)
   {  
    CourseScore = newS;
   }
   public String getCourseName()
   {  
    return CourseName;
   }
   public double getCourseScore()
   { 
    return CourseScore;
   }
   


}