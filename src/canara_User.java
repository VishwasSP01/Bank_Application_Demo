import java.util.Objects;
import java.util.UUID;

public class canara_User implements BankInterface{

    private String name;
    private String accountNO;
    private double balance;
    private String password;
    private double rateofInterest;

    public canara_User(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateofInterest = 6.9;
        this.accountNO = String.valueOf(UUID.randomUUID());
    }

    //lets acces those values using the getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNO() {
        return accountNO;
    }

    public void setAccountNO(String accountNO) {
        this.accountNO = accountNO;
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
        return "Amount Credited " +balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword, password)){

            if(amount>balance){
                return "Insufficient balance";
            }
            else{
                balance = balance - amount;
                return "Amount withdrawn and the remaining is: "+balance;
            }
        }
        else{
            return "Wrong Password";
        }

    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateofInterest)/100;
    }
}
