import java.util.ArrayList;

public class Customer {
    private int PIN;
    private ArrayList<Account> Accounts = new ArrayList<>();
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName, int PIN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.PIN = PIN;
        Accounts = new ArrayList<Account>();
    }
    public void addAccount(double initialDeposit){
        Account newAccount = new Account(initialDeposit);
        Accounts.add(newAccount);
    }
    private void closeAccount(int PINInput){
       for(int x = 0; x< Accounts.size(); x++){
           Account account  = Accounts.get(x);
           int PINTest = account.getAccountNumber();
           if(PINInput==PINTest){
               Accounts.remove(x);
           }
       }
    }

    public int getPIN(){
        return PIN;
    }
    public ArrayList<Account> getAccounts(){
        return Accounts;
    }
    public Account getAccount (int accountNumber){
        int c = 0;
        for(int x = 0; x<Accounts.size();x++){
            Account testAccount = Accounts.get(x);
            if(testAccount.getAccountNumber()==accountNumber){
                break;
            }
            else{
                c++;
            }
        }
        return Accounts.get(c);
    }
    public Account getOnlyAccount(){
        return Accounts.get(0);
    }
}
