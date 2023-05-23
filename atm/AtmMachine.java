/*
package AtmMachine;*/
import java.util.Scanner;

class Atm
{
    float Balance;
    int PIN=8090;
    public void checkpin(){
         System.out.println("Enter Your pin:");
         Scanner sc=new Scanner(System.in);
         int enterpin=sc.nextInt();
         if(enterpin==PIN)
         {
            menu();

         }
         else 
         {
            System.out.println("Enter a valid pin");

             }
    }
    public void menu()
    {
        {
            System.out.println("Enter your choice:");
            System.out.println("1. Check A/C Balnace");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. EXIT");
            Scanner sc=new Scanner(System.in);
            int opt=sc.nextInt();
            if(opt==1){
                checkBalance();
            }
            else if(opt==2){
                withdrawMoney();
            
            }
            else if(opt==3){
                depositMoney();
            }
            else if(opt==4){
                return;
            
            }
            else{
                System.out.println("Enter a valid choice");
                menu();
            }

        }
    }
        public void checkBalance()
        {
            System.out.println("Balance:"+ Balance);
            menu();
        }
        public void withdrawMoney(){
            System.out.println("Enter Amount to withdraw: ");
            Scanner sc=new Scanner(System.in);
            float amount=sc.nextFloat();
            if(amount>Balance){
                System.out.println("Insufficient Balance");

            }
            else{
               Balance=Balance-amount;
               System.out.println("Money withdrawl Succesful"); 
            }
            menu();
        }
        public void depositMoney(){
            System.out.println("Enter the Amount:");
            Scanner sc=new Scanner(System.in);
            float amount=sc.nextFloat();
            Balance=Balance+amount;
            System.out.println("Money Deposited Successfully");
            menu();

        }
    }

    public class AtmMachine{
        public static void main(String[] args)
        {
          Atm obj=new Atm();
          obj.checkpin();
        }
    }

     

