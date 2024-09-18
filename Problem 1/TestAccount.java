public class TestAccount {
    public static void main(String[] args) {

        //a
        Account Acc1 = new Account("Acc1", "Jim", 5000);
        Account Acc2 = new Account("Acc2", "Angus", 4000);


        //b
        System.out.println("Account 1 Balance:");
        System.out.println(Acc1.getBalance());
        System.out.println("Account 2 Balance:");
        System.out.println(Acc2.getBalance());

        //c
        Acc1.transferTo(Acc2, 1000);

        //d 
        System.out.println("Account 1 Balance:");
        System.out.println(Acc1.getBalance());
        System.out.println("Account 2 Balance:");
        System.out.println(Acc2.getBalance());
    }
}
