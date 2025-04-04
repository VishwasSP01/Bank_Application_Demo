import java.util.Objects;
import java.util.UUID;

public class HDFC_User implements BankInterface{

   private String name;
   private String accountNo;
   private double balance;
   private String password;
   private double rateofIntrest;

    public HDFC_User(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateofIntrest = 6.8;
        this.accountNo = String.valueOf(UUID.randomUUID());
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

    public double getRateofIntrest() {
        return rateofIntrest;
    }

    public void setRateofIntrest(double rateofIntrest) {
        this.rateofIntrest = rateofIntrest;
    }



    @Override
    public double checkbalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance + amount;
        return "amount credited" + balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {

        // first I have to check weather the given password is correct or not
        if(Objects.equals(enteredPassword, password)){

            // now check weather am I giving the right amount or not
            if(amount > balance){
                return "Insufficient Balance";
            }
            else {
                balance = balance - amount;
                return "Amount withdrawn and remaining amount is : " +balance;
            }


        }
        else{
            return "Wrong Password";
        }


    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateofIntrest)/100;
    }
}
