import java.util.*;

abstract class BankAccount
{
    int savings;

    BankAccount(int savings)
    {
        this.savings = savings;
    }

    public abstract void deposit(int amount);
    public abstract void withdraw(int amount);
}

class Savings_Account extends BankAccount
{

    Savings_Account(int savings)
    {
        super(savings);
    }
    

    void get_balance()
    {
        System.out.println("Current Amount in the Account : "+savings);
    }

    public void withdraw(int amount)
    {
        int balance = savings - amount;

        if(balance < 500) //assume the minimum balance as 500
        {
            System.out.println("The minimum balance in the account should be 500 or above...");
        }else{
            savings -= amount;
            get_balance();
        }
    }

    public void deposit(int amount)
    {
        
        savings += amount;
        System.out.println("Deposited Successfully...");
        get_balance();
    
    }

}

class Current_Account extends BankAccount
{
    final int LIMIT = 100000;

    Current_Account(int savings)
    {
        super(savings);
    }

    public void get_balance()
    {
        System.out.println("Current Amount in the Account: "+savings);
    }

    public void withdraw(int amount)
    {
        int available = savings + LIMIT;

        if(amount > available)
        {
            System.out.println("Overdraft limit exceeded! Cannot withdraw");
        }else{
            savings -= amount;
            System.out.println("Withdraw Successfull.");
            get_balance();
        }
    }

    public void deposit(int amount)
    {
        savings += amount;
        System.out.println("Deposited Successfully");
        get_balance();
    }
}
public class Bank_Account {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1 for Savings Account");
        System.out.println("Enter 2 for Current Account");
        System.out.println("-------------------------------------------------");

        System.out.println("Enter the Account Type");
        int acctype = in.nextInt();

        if(acctype == 1){
            System.out.println("Enter number of Transactions : ");
            int n = in.nextInt();

            Savings_Account[] acc = new Savings_Account[n];

            for(int i=0;i<n;i++)
            {

               System.out.println("Transaction "+(i+1));
               System.out.println("Withdraw amount from Bank Press the opcode 1");
               System.out.println("To show the current amount in the account Press the opcode 2");
               System.out.println("Press any key to exit the Transaction...");
               System.out.println("-----------------------------------------------------------------------");

               System.out.println("Enter the balance");
               int savings = in.nextInt();

               if(savings < 500){
                  System.out.println("Minimum balance is 500, give higher balance");
                  continue;
               }

               acc[i] = new Savings_Account(savings);
               System.out.println("Enter the OpCode : ");
               int ch = in.nextInt();

                switch(ch)
                {
                  case 1:
                    System.out.println("Enter the amount to withdraw from the account : ");
                    int amount = in.nextInt();
                    acc[i].withdraw(amount);
                    break;
                  case 2:
                    acc[i].get_balance();
                    break;
                  default:
                    System.out.println("EXIT");
                }

                System.out.println("---------------------------------------------------------------------");
            }
        }else if(acctype == 2){

           System.out.println("Enter number of Transactions : ");
           int n = in.nextInt();

           Current_Account[] acc = new Current_Account[n];

           for(int i=0;i<n;i++)
           {

              System.out.println("Transaction "+(i+1));
              System.out.println("Withdraw amount from Bank Press the opcode 1");
              System.out.println("To show the current amount in the account Press the opcode 2");
              System.out.println("Press any key to exit the Transaction...");
              System.out.println("-----------------------------------------------------------------------");

              System.out.println("Enter the balance");
              int savings = in.nextInt();

              acc[i] = new Current_Account(savings);
              System.out.println("Enter the OpCode : ");
              int ch = in.nextInt();

              switch(ch)
              {
                case 1:
                  System.out.println("Enter the amount to withdraw from the account : ");
                  int amount = in.nextInt();
                  acc[i].withdraw(amount);
                  break;
                case 2:
                  acc[i].get_balance();
                  break;
                default:
                  System.out.println("EXIT");
              }

              System.out.println("---------------------------------------------------------------------");
            }
        }else{
            System.out.println("Invalid number for an Account Type...");
        }


        
    }
}
