/* Name: Agbayi Gbugu
   Assignment#: 7
   Due date: 10/30/2019
   Location: ST 126 
   id#: 4992
*/

public class GA_ServiceQuote        //class
{
   private double partsCharges;
   private double laborCharges;
   private double SalesTax;
   private double TotalCharges;
   
public GA_ServiceQuote()            // Attributes
{    
   partsCharges = 0;
   laborCharges = 0;
   
}
public void setPartsCharges(double p)        /* methods*/
{
   partsCharges = p;
}   
   
public void setLaborCharges(double l)
{ 
   laborCharges = l;
}   

public void setTotalCharges(double t)
{
  TotalCharges = t; 
}
          
public double getPartsCharges()
{
   return partsCharges;   
}

public double getLaborCharges()  
{
   return laborCharges;   
}
public double getSalesTax()
{
   return ((getPartsCharges() + getLaborCharges())*0.085);
}
public double getTotalCharges()
{
   return (getPartsCharges() + getLaborCharges() + getSalesTax());
}   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   


}