public class Account {
    //Attributes
    private String id ;
    private String name ;
    private int balance = 0;

    //Parameterized Constructor
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

}