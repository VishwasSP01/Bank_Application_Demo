import java.util.Objects;
import java.util.UUID;

public class SBI_User implements BankInterface {

    // making them as private and I can access using getters and setters
    // making rateofintrest static, I don't want anyone outside this class to change.
    // if any changes for the rateofIntrest i have to chance here only

    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateofInterest;


    // creating the constructors to pass the values

    public SBI_User(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        // user will pass these 3 things
        // also he has to be given accNo and rate of Int, this I have to initilize
        this.rateofInterest = 6.5;

        // this uuid will generate random 16 dig num
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    // using getters and setters to access the variables

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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateofInterest() {
        return rateofInterest;
    }

    public void setRateofInterest(double rateofInterest) {
        this.rateofInterest = rateofInterest;
    }





    @Override
    public double checkbalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance + amount;
        return "your new balance is" +balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredpassword) {

        // now here I have to compare both passwords weather they are matching or not
        //to compare two stings: since everything in java is object
        // in object class there is thing called equals, using that I can compare anything

        if(Objects.equals(enteredpassword,password)){

            // now even though my passward is correct I still cannot make tranctions
            // because I have check balance and take only what you have

            if (amount>balance){
                return "Sorry Insufficient Balance";
            }
            else {
                balance = balance - amount;
                return "amount withdrawn and the remaining is: " +balance ;
            }
        }
        else {
            return "Wrong Password";
        }

    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateofInterest)/100;
    }
    // also I don't want to allocate space or memory
    // again and again : this is known as compile time binding

}
