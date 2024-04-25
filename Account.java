public class Account {
    int accountNumber;
    double balance;
    static int totalAccounts = 1000;
    public Account(double balance){
        totalAccounts++;
         this.balance = balance;
         this.accountNumber = totalAccounts;
    }
    private void Deposit(double depositAmount){
        System.out.print("Enter how much you would like to deposit: ");

        balance += depositAmount;
    }
    private void Withdraw(double withdrawalAmount) {
        if(withdrawalAmount>balance){
            System.out.print("Insufficient funds");
        }
        else{
            balance -= withdrawalAmount;
        }
    }
    public void displayInfo(){
        System.out.println("Account number: "+accountNumber+"\nBalance: "+balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
