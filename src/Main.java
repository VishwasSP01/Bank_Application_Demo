import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name, Password and Balance to create account ");

        // first thing take as inputs to create user
        String name = sc.nextLine();
        String password = sc.nextLine();
        double balance = sc.nextDouble();

        SBI_User User = new SBI_User(name,balance,password);

        // add some cash, so calling the assMoney function
        //I am calling the return type string
        String message = User.addMoney(100000);
        System.out.println(message);

        //withdraw money
        System.out.println("Enter the amount that you want to withdraw: ");
        int money = sc.nextInt();
        System.out.println("Enter Password");
        String pass = sc.next();
        System.out.println(User.withdrawMoney(money, pass));

        // calculate rate of Intrest
        System.out.println("The interest earned is: " +User.calculateInterest(10));




        Scanner scc = new Scanner(System.in);
        System.out.println("Enter the name, password and the balance to create the account ");
        String name1 = scc.nextLine();
        String passw = scc.nextLine();
        double bal = scc.nextDouble();

        HDFC_User uuser = new HDFC_User(name,bal, passw);

        //lets add some cash here
        String messagee = uuser.addMoney(200000);
        System.out.println(messagee);

        // withdraw
        System.out.println("Enter the amount to be withdrawn: ");
        int moneyy = scc.nextInt();
        System.out.println("Enter the Password: ");
        String pas = scc.next();
        System.out.println(uuser.withdrawMoney(moneyy, pas));

        // rate of Int
        System.out.println(uuser.calculateInterest(5));


        // adding canara user
        Scanner sv = new Scanner(System.in);
        System.out.println("Enter name,Pass and bal: ");
        String nam = sv.nextLine();
        String pa = sv.nextLine();
        double ba = sv.nextDouble();

        canara_User use = new canara_User(nam, ba, pa);

        // lets add some cash into it
        String messa = use.addMoney(20000);
        System.out.println(messa);

        //withdraw
        System.out.println("Enter the amt to be withdrawn: ");
        int mone = sv.nextInt();
        System.out.println("Enter the password: ");
        String ppa = sv.next();
        System.out.println(use.withdrawMoney(mone, pa));

        //rate of Int
        System.out.println("The interest we get is "+use.calculateInterest(5));



    }

}