/* Name: Agbayi Gbugu
   Assignment#: 7
   Due date: 10/30/2019
   Location: ST 126 
   id#: 4992
*/

import java.util.*;

public class GbuguA_lab7

{
 public static void main (String[]args)
     {
   String Cname;     // to hold customer's name
   String Caddress;  // to hold customer's address
   String Cphone;    // to hold customer's phone number
   String CarM; // to hold customer's car make
   String CarMod; // to hold customer's car model
   int CarY;   //to hold customer's car year
   double parts;  // to hold customer's car parts
   double labor; // to hold customer's labor charge

   
   // a scanner object was created for keyboard inputs 
   Scanner keyboard = new Scanner(System.in);
   
   //get customer's name
   GA_Customer NameC = new GA_Customer(); // object 1: customer class

 System.out.print("Enter the customer's name:" + "\n");
   Cname = keyboard.nextLine();
   NameC.setName(Cname);
   
  // get customer's address 
   System.out.print("Enter the customer's address:" + "\n");
   Caddress = keyboard.nextLine();
   NameC.setAddress(Caddress);
   
   // get customer's phone number
   System.out.print("Enter the customer's phone number:" + "\n");
   Cphone = keyboard.nextLine();
   NameC.setPhone(Cphone);

  
   GA_Car Car = new GA_Car();      // object 2: Car class
   System.out.print("Enter car make:" + "\n");
   CarM = keyboard.nextLine();
   Car.setMake(CarM);


  // get car model
   System.out.print("Enter car model:" + "\n");
   CarMod = keyboard.nextLine();
   Car.setModel(CarMod);


   // get car year    
   System.out.print("Enter car year:" + "\n");
   CarY = keyboard.nextInt();
   Car.setYear(CarY);
   
    GA_ServiceQuote price = new GA_ServiceQuote();      // object 2: ServiceQuote class
       System.out.print("Enter the parts charges:" + "\n");
       parts = keyboard.nextDouble();     // get parts pricing
       price.setPartsCharges(parts);

   
       System.out.print("Enter the labor charges:" + "\n");
       labor = keyboard.nextDouble();     // get labor pricing
       price.setLaborCharges(labor);
   
   
   System.out.print("Joe Automotive Shop" + "\n");
   System.out.print("Service Estimate" + "\n");
   System.out.print("\n");
   
   System.out.print("Customer's Name" + "   "+ NameC.getName() + "\n");
   System.out.print("Customer's Address" + "   "+ NameC.getAddress() + "\n");
   System.out.print("Customer's Phone Number" + "   "+ NameC.getPhone() + "\n");
   System.out.print("\n");
   
   System.out.print("Car Make" +"   "+ Car.getMake() + "\n");
   System.out.print("Car Model" +"   "+ Car.getModel() + "\n");
   System.out.print("Car Year" +"   "+ Car.getYear() + "\n");
   System.out.print("\n");
   
   System.out.print("Parts Charges" +"   "+  price.getPartsCharges() + "\n");
   System.out.print("Labor Charges" +"   "+  price.getLaborCharges() + "\n");
   System.out.print("Sale Tax" +"   "+  price.getSalesTax() + "\n");
   System.out.print("Total Charge" +"   "+  price.getTotalCharges() + "\n");
   

   
   
      }
}