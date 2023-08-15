import java.util.UUID;

public class HDFC implements BankAppInterface{


    private String name;
    private String accountNo = String.valueOf(UUID.randomUUID());

    private String password;
    private double balance;;
    final String IFSCCode= "HDFC123321456";


    final double rateOfInterest=7.1;

//   default constructor
    public HDFC() {

    }

    public HDFC(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNo=String.valueOf(UUID.randomUUID());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    @Override
    public String fetchBalance(String password) {

        if(this.password.equals(password)){
            return "This is your balance"+this.balance;
        }
        return "Please enter your correct password" ;
    }

    @Override
    public String addMoney(double amount) {
        this.balance += amount;
        return "Your amount is added succesfully.This is your balance"+this.balance;
    }

    @Override
    public String withdrawMoney(double amount, String password) {
 if(this.password.equals(password)){
     if(this.balance< amount){
         return"Insufficient balance";
     }
     else{
         this.balance-=amount;
         return "Your amount is withdrawn succesfully.This is your balance"+this.balance;
     }
 }
 return "Please enter your correct password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
           this.password=newPassword;
            return "Your password has been changed successfully";
        }

        return "Please enter the correct password";
    }

    @Override
    public String calculateInterest(int year) {
        return  "Your Rate of Interest is "+((this.balance*year*rateOfInterest)/100.0);
    }

    @Override
    public String toString() {
        return "HDFC{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", IFSCCode='" + IFSCCode + '\'' +
                ", rateOfInterest=" + rateOfInterest +
                '}';
    }
}
