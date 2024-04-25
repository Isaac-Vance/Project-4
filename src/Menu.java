import java.util.Scanner;
public class Menu {
    Bank bank = new Bank();
    Scanner scan = new Scanner(System.in);

    public void runMenu() {
        System.out.println("***MENU***");
        System.out.println("Please make a selection:");
        System.out.println("1. Access account");
        System.out.println("2. Open a new account");
        System.out.println("3. Close all accounts");
        System.out.println("4. Exit");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                accessAccount();
                break;
            case 2:
                openAccount();
                break;
            case 3:
                closeAllAccounts();
                break;
            case 4:
                break;
        }
    }

    private void accessAccount() {
        System.out.print("Enter PIN: ");
        int PIN = scan.nextInt();
        Customer customer = bank.getCustomer(PIN);
        if (customer.getAccounts().size() > 1) {
            customer.getAccounts();
            System.out.print("Which account would you like?");
            int accountNumber = scan.nextInt();
            Account account = customer.getAccount(accountNumber);
        } else {
            Account account = customer.getOnlyAccount();
        }
        System.out.println("***Account Menu***");
        System.out.println("1. Make a deposit");
        System.out.println("2. Make a withdrawal");
        System.out.println("3. See account balance");
        System.out.println("4. Close account");
        System.out.print("Make a selection: ");
        int selection = scan.nextInt();
        switch (selection) {
            case 1:

        }

        private void createCustomer() {
            System.out.println("What is your first name?");
            scan.nextLine();
            String firstName = scan.nextLine();
            System.out.println("What is your last name?");
            String lastName = scan.nextLine();
            System.out.print("Choose a PIN number: ");
            int PIN = scan.nextInt();
            bank.addCustomer(firstName, lastName, PIN);
        }
        private void openAccount () {
            System.out.print("Are you a new customer? (y/n)");
            char answer = scan.next().charAt(0);
            if (answer == 'y') {
                createCustomer();
            }
            System.out.print("Enter your PIN: ");
            int PIN = scan.nextInt();
            Customer CurrentCustomer = bank.getCustomer(PIN);
            System.out.print("Enter your initial deposit: ");
            int initialDeposit = scan.nextInt();
            CurrentCustomer.addAccount(initialDeposit);
        }
        private void closeAllAccounts () {
            System.out.print("Enter your PIN");
            int PIN = scan.nextInt();
            if (bank.getCustomer(PIN) != null) {
                bank.removeCustomer(PIN);
                System.out.print("Customer removed.");
            } else {
                System.out.print("Customer not found");
            }

        }
    }
}
