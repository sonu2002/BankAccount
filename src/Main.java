public class Main {

    public static void main(String[] args) {

        HDFC SonuAccount=new HDFC("Sonu", "phogat123", 100000 );

        SBI account=new SBI("Sonu", "phogat", 100000);

//    System.out.println( SonuAccount);
//    System.out.println(SonuAccount.fetchBalance("phogat123"));
//    System.out.println(SonuAccount.addMoney(10000));
//    System.out.println(SonuAccount.withdrawMoney(10000, "phogat123"));
//    System.out.println(SonuAccount.changePassword("phogat123", "psycho123"));
//    System.out.println(SonuAccount.withdrawMoney(5000,"psycho123"));
//    System.out.println(SonuAccount.calculateInterest(5));


        System.out.println(account.fetchBalance("phogat"));
        System.out.println(account.withdrawMoney(1000,"phogat"));
        System.out.println(account.changePassword("phogat", "psy"));
    }
}
