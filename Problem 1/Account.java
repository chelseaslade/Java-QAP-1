public class Account {

    //Attributes
    private String id ;
    private String name ;
    private int balance = 0;
    
    //Parameterized Constructor
    public Account(String id, String name) 
    {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //Methods
    public String getID() 
    {
        return this.id;
    }

    public String getName() 
    {
        return this.name;
    }

    public int getBalance() 
    {
        return this.balance;
    }

    public int credit(int amount)
    {
        return (this.balance + amount);
    }

    public int debit(int amount) 
    {
        if (amount <= this.balance) 
        {
            this.balance = this.balance - amount;
        }
        else 
        {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo(Account receivingAcc, int amount) 
    {
        if (amount <= this.balance) {
            receivingAcc.balance += amount;
            this.balance -= amount;
        }
        else {
            System.out.println("Amount exceeded balance.");
        }
        return this.balance;
    }

    public String toString() 
    {
        String accountString = "Account [id=" + this.id + ",name=" + this.name + ",balance=" + this.balance;
        System.out.println(accountString);
        return accountString;
    }
}
