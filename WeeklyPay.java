//**********************************************************
// Author: Aryan Ved
//
// Descirption: Simple Java code to calculate take home pay based on tax brackets
//
// Date: 05/12/2019
//*********************************************************
import java.util.*;

public class WeeklyPay
{
   public static void main (String[] args)
   {
      
      //Declare variables
      
      Scanner input = new Scanner (System.in);
      
      final double A = 0.0; //Declare variables for each respective tax bracket
      final double B = 0.1; //Tax bracket B
      final double C = 0.2; //Tax bracket C
      final double D = 0.29; //Tax bracket D
      final double E = 0.35; //Tax bracket E
      double payPerHour; //Variable to store pay per hour
      double hoursWorked; //variable to store hours worked
      double payForHours = 1; 
      double payAfterTax = 1; 
      double finalPay = 1;
      String taxCategory;
      String donations;
      
      //Input and/or assign values to variables
      
      System.out.println("What is your Hourly Pay rate?: "); //Asks hourly pay rate    
      payPerHour = Double.parseDouble(input.nextLine());
      System.out.println("How many hours have you worked?: ");   //Asks number of hours worked
      hoursWorked = Double.parseDouble(input.nextLine());   
      System.out.println("Enter your Tax Catagory: ");    //Asks tax catagory
      taxCategory = input.nextLine();
   
   
      //Processing (calculations) and Output (print the final results)
      
      //Pay for hours
      
      if ((hoursWorked > 40) && (hoursWorked < 30000))
      {
         payForHours = (payPerHour * 40) + ((hoursWorked - 40) * (2 * payPerHour));
      }
      else if (hoursWorked <= 40)
      {
         payForHours = payPerHour * hoursWorked;
      }    
      
      // Tax deducted
      
      if (taxCategory.equalsIgnoreCase("A")) //Calculate Tax Bracket A
      {
         payAfterTax = payForHours - (payForHours * A);
      
         System.out.println("Would you like to Donate to us today ($10)? (Respond Y/N): ");   
         donations = input.nextLine();  //take user input for donation
      
         if (donations.equalsIgnoreCase("Y")) //If user said yes for donations
         {
            finalPay = payAfterTax - 10; //subtract 10 for donation value
            System.out.println("Your Final Pay is: ");
            System.out.print(finalPay); //print final pay after donation deduction
         }
         else if (donations.equalsIgnoreCase("N"))
         {
            finalPay = payAfterTax;
            System.out.println("Your Final Pay is: ");
            System.out.print(finalPay); //print final pay as is
         }
         else 
         {
            System.out.println("Donations?");
         }
      
      
      }
      else if (taxCategory.equalsIgnoreCase("B"))
      {
         payAfterTax = payForHours - (payForHours * B);
         
         System.out.println("Would you like to Donate to us today ($10)? (Respond Y/N): ");   
         donations = input.nextLine();  
      
         if (donations.equalsIgnoreCase("Y"))
         {
            finalPay = payAfterTax - 10;
            System.out.println("Your Final Pay is: ");
            System.out.print(finalPay);
         }
         else if (donations.equalsIgnoreCase("N"))
         {
            finalPay = payAfterTax;
            System.out.println("Your Final Pay is: ");
            System.out.print(finalPay);
         }
         else 
         {
            System.out.println("Donations?");
         }
      
      
      }
      else if (taxCategory.equalsIgnoreCase("C"))
      {
         payAfterTax = payForHours - (payForHours * C);
         System.out.println("Would you like to Donate to us today ($10)? (Respond Y/N): ");   
         donations = input.nextLine();  
      
         if (donations.equalsIgnoreCase("Y"))
         {
            finalPay = payAfterTax - 10;
            System.out.println("Your Final Pay is: ");
            System.out.print(finalPay);
         }
         else if (donations.equalsIgnoreCase("N"))
         {
            finalPay = payAfterTax;
            System.out.println("Your Final Pay is: ");
            System.out.print(finalPay);
         }
         else 
         {
            System.out.println("Donations?");
         }
      
      
      }
      else if (taxCategory.equalsIgnoreCase("D"))
      {
         payAfterTax = payForHours - (payForHours * D);
         
         System.out.println("Would you like to Donate to us today ($10)? (Respond Y/N): ");   
         donations = input.nextLine();  
      
         if (donations.equalsIgnoreCase("Y"))
         {
            finalPay = payAfterTax - 10;
            System.out.println("Your Final Pay is: ");
            System.out.print(finalPay);
         }
         else if (donations.equalsIgnoreCase("N"))
         {
            finalPay = payAfterTax;
            System.out.println("Your Final Pay is: ");
            System.out.print(finalPay);
         }
         else 
         {
            System.out.println("Donations?");
         }
      
      
      }
      else if (taxCategory.equalsIgnoreCase("E"))
      {
         payAfterTax = payForHours - (payForHours * E);
         
         System.out.println("Would you like to Donate to us today ($10)? (Respond Y/N): ");   
         donations = input.nextLine();  
      
         if (donations.equalsIgnoreCase("Y"))
         {
            finalPay = payAfterTax - 10;
            System.out.println("Your final Pay is: ");
            System.out.print(finalPay);
         }
         else if (donations.equalsIgnoreCase("N"))
         {
            finalPay = payAfterTax;
            System.out.println("Your final take-home pay is: ");
            System.out.print("$" + finalPay);
         }
         else 
         {
            System.out.println("Donations?");
         }
      
      
      }
      else 
      {
         System.out.println("Please, Enter a valid tax category");
      }
      
   }//end main method
}//end class

//*********************************************************
//SAMPLE OUTPUT
/* ----jGRASP exec: java WeeklyPay
 What is your Hourly Pay rate?: 
 1
 How many hours have you worked?: 
 4
 Enter your Tax Catagory: 
 A
 Would you like to Donate to us today?: 
 n
 Your Final Pay is: 
 4.0
  ----jGRASP: operation complete.
  
  ----jGRASP exec: java WeeklyPay
 What is your Hourly Pay rate?: 
 1
 How many hours have you worked?: 
 41
 Enter your Tax Catagory: 
 B
 Would you like to Donate to us today?: 
 y
 Your Final Pay is: 
 27.8
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java WeeklyPay
 What is your Hourly Pay rate?: 
 15
 How many hours have you worked?: 
 43
 Enter your Tax Catagory: 
 E
 Would you like to Donate to us today?: 
 n
 Your Final Pay is: 
 448.5
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java WeeklyPay
 What is your Hourly Pay rate?: 
 14
 How many hours have you worked?: 
 1
 Enter your Tax Catagory: 
 T
 Please, Enter a valid tax category
 
  ----jGRASP: operation complete.
 
 */
//*********************************************************