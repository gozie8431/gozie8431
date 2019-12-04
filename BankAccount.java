/**
* Name: Agbayi Gbugu
* ID: 00454992
* S&T 126      */ 

import java.util.*;
import java.text.DecimalFormat;

public class BankAccount
{

   private String name;                // Account name
   private double rate;                // interest rate     
   private double balance;             // Account balance
   private String pattern="$###,###.00";
   double Deposit;
   double Withdraw;                                //Attributes 
   double deposit;
   double withdraw;
   double Newbalance;
   double  NewBalance;
   Scanner keyboard = new Scanner(System.in);
    
   
   
   
   public BankAccount(String aName, double aBalance)     //Constructor 
   {
      name = aName;
      balance = aBalance;
           
   }
   
   public String getname()    //	Accessor
   {
      return name;
   }
   
   public double getbalance()
   {
      return balance;
   }
   
    public double getDeposit()
   {
      return Deposit;
   }

    public double getWithdraw()
   {
      return Withdraw;
   }
    public double getdeposit()
   {
      return deposit;
   }

    public double getwithdraw()
   {
      return withdraw;
   }


    private double calculateRate()     //	Accessor
   {
      if (balance >= 10000.00)
      {
         rate = 0.15;
      }
      else if (balance >= 1000.00 && balance <= 10000.00)
      {
         rate = 0.07;
      }
      else rate = 0.02;
      return rate;
           
   }
   
   private void addInterest()    //	Mutator
   {
      if (balance >= 0.0)
      {
         System.out.println("Balance before interest: " + (balance + getDeposit()));
         double interest = balance * calculateRate(); 
         System.out.println("Amount of interest added: " + interest);
         Newbalance = ((balance + getDeposit()) + interest);
         System.out.println("New Balance: " + Newbalance);
      }
   }
  
   private void subInterest()
   {   
      if (Newbalance >= 0.0)
      {
         System.out.println("Balance before interest: " + (balance - getWithdraw()));
         double interest = balance * calculateRate(); 
         System.out.println("Amount of interest added: " + interest);
         double NewBalance = ((balance - getWithdraw()) + interest);
         System.out.println("New Balance: " + NewBalance);   
         }
         else if(Newbalance <= 0.0)
         {
         System.out.println("Balance before interest: " + (Newbalance - getWithdraw()));
         double interest = Newbalance * calculateRate(); 
         System.out.println("Amount of interest added: " + interest);
         double NewBalance = ((Newbalance - getWithdraw()) + interest);
         System.out.println("New Balance: " + NewBalance);    
      }
        
  }
  private void addInt()
   {
      if (balance >= 0.0)
      {
         System.out.println("Balance before interest: " + (balance + getdeposit()));
         double interest = balance * calculateRate(); 
         System.out.println("Amount of interest added: " + interest);
         Newbalance = ((balance + getdeposit()) + interest);
         System.out.println("New Balance: " + Newbalance);
      }
   }
  
   private void subInt()
   {   
      if (Newbalance >= 0.0)
      {
         System.out.println("Balance before interest: " + (balance - getwithdraw()));
         double interest = balance * calculateRate(); 
         System.out.println("Amount of interest added: " + interest);
         double NewBalance = ((balance - getwithdraw()) + interest);
         System.out.println("New Balance: " + NewBalance);   
         }
         else if(Newbalance < 0.0)
         {
         System.out.println("Balance before interest: " + (Newbalance - getwithdraw()));
         double interest = Newbalance * calculateRate(); 
         System.out.println("Amount of interest added: " + interest);
         double NewBalance = ((Newbalance - getwithdraw()) + interest);
         System.out.println("New Balance: " + NewBalance);    
      }
        
  }

       
   public void executeMenu()                       //	executeMenuFILI
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Bank Menu:");
      System.out.println("\t [D]: Deposit");
      System.out.println("\t [W]: Withdraw");
      System.out.println("\t [B]: Balance");
      System.out.println("Choose an option:");
      char menuFILI = keyboard.next().charAt(0);
     //double CurrentBalance = Newbalance;
       switch(menuFILI)
       {
          case 'D':
             System.out.println("How much would you like to deposit: ");
              Deposit = keyboard.nextDouble();
             addInterest();
             break;
          case 'W':
           System.out.println("How much would you like to withdraw: ");
            Withdraw = keyboard.nextDouble();
            subInterest();
            break;
         case 'B':
            System.out.println(getname() + ", you current balance is " + NewBalance);
            break;
         case 'd':
            System.out.println("How much would you like to deposit: ");
            deposit = keyboard.nextDouble();
            addInt();        
            break;
         case 'w':
            System.out.println("How much would you like to withdraw: ");
            withdraw = keyboard.nextDouble();
            subInt();
            break;
         case 'b':
            System.out.println(getname() + ", you current balance is " +  Newbalance);
            break;
         default:
            System.exit(0);
      }
     
   
   }     
              

 public boolean verifyUser(String name)      //extra credit
   {     
      if(name.equalsIgnoreCase(getname()))
      {
         return true;
      }
      else 
      {
         System.out.println("Incorrect user. System is exiting...");
         System.exit(0);
         return false;
      }
   
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}