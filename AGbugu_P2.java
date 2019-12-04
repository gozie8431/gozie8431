/**
* Name: Agbayi Gbugu
* ID: 00454992
* S&T 126      */ 
import java.util.*;
public class AGbugu_P2

{
   public static void main(String [] args) 
   
   { 
      Scanner keyboard = new Scanner(System.in);
   
     
      System.out.println("Enter your name:");
      String name = keyboard.nextLine();
      
      
      System.out.println("How much money would you like to deposit, initially:");
      double balance = keyboard.nextDouble();
      
      BankAccount info = new BankAccount(name, balance);
   
      
      keyboard.nextLine();
   
      System.out.println("Thank for creating an account with us!");
      
      System.out.println("Please enter the name associated with this bank account for verification:");
      String verifyUserName = keyboard.nextLine();
       
      info.verifyUser(verifyUserName);
      
      info.executeMenu();
      info.executeMenu();
      info.executeMenu();
      info.executeMenu();
      info.executeMenu();
      info.executeMenu();
      info.executeMenu();
         
         
         
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   }
   
      
}
