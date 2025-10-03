interface Payment{
    void pay();
    void refund();
}

class CreditCardPayment implements Payment{

    public void pay()
    {
        System.out.println("Payment made successful through Credit card");
    }

    public void refund()
    {
        System.out.println("Amount refunded");
    }
}

class UPIPayment implements Payment{

    public void pay()
    {
        System.out.println("Payment made successful through UPI");
    }

    public void refund()
    {
        System.out.println("Amount refunded");
    }
}

public class Payment_System  {
    public static void main(String[] args) {
        
        Payment c = new CreditCardPayment();
        c.pay();
        c.refund();

        Payment u = new UPIPayment();
        u.pay();
        u.refund();

    }
}