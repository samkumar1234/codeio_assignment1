class Bank{
    int acc_no;
    double balance;

    Bank(){ balance = 0; }

    Bank(double b){ balance = b; }

    void deposit(double amount)
    {
        if(balance < 0){
            balance = 0;
        }
        
        balance += amount;
    }

    void withdraw(double amount)
    {
        if(balance <= 0)
        {
            System.out.print("Zero Balance amount");
            return;
        }

        balance -= amount;
    }

    void acc_disp()
    {
        System.out.println("Account Number : "+acc_no);
        System.out.println("Balance amaount : "+balance);
    }

}

public class Bank_acc {
    public static void main(String[] args) {

        Bank b = new Bank();
        Bank b2 = new Bank(1200.0);

        b.acc_no = 24567821;
        b2.acc_no = 34529254;
        
        b.deposit(500.0);
        b2.withdraw(750.0);

        b.acc_disp();
        b2.acc_disp();

    }
}
