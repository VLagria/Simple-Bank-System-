/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banksystem;

import java.util.Scanner;

/**
 *
 * @author Sherlock
 */
public class BankSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        String accountNumber;
        double balance, withdraw;
        double cash;
        String choice = null;
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter Account ID");
        accountNumber = myObj.nextLine();
        System.out.println("Enter Name");
        name = myObj.nextLine();
        
        CheckingAccount checking = new CheckingAccount(accountNumber, name);
        while (true) {            
               switch (selection(choice)) {
               case "D":
                   System.out.println("Enter amount to deposit");
                   cash = myObj.nextDouble();
                   checking.deposit(cash);
                   System.out.println("Balance is: " + checking.getBalance());
                   selection(choice);
                   break;
               case "W":
                  System.out.println("Enter amount to withdraw");
                  withdraw = myObj.nextDouble();
                  checking.withdraw(withdraw);
                  System.out.println("Balance is: " + checking.getBalance());
                  selection(choice);
                   break;
               case "B":
                    System.out.println("Balance is: " + checking.getBalance());
                    selection(choice);
                   break;
               case "E":
                   System.exit(0);
                   break;
               default:
                   throw new AssertionError();
           }
        }
       

   	 
   }

    private static String selection(String choice) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("[D]Deposit \n"
                + "[W]Withdraw \n"
                + "[B]Balance \n"
                + "[E]Exit");
        choice = myObj.nextLine();
        return choice;
    }
    
}
