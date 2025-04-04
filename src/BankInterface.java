public interface BankInterface {
    double checkbalance();
    String addMoney(int amount); // the return type is String because,
    // this will return saying your amount is added
    String withdrawMoney(int amount, String password);
    // same here also the return type is String, here I am adding Password so that
    // only who knows password will be able to withdraw the amount
    double calculateInterest(int years);
    // here to calculate the Interest I need P T R
    // P & R, AMount and Rate of Interest will be variables in Class so I get it from there
    // so I just add years and the return type will be double


}
