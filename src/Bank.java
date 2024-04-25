import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> Customers = new ArrayList<>();

    public void addCustomer(String firstName, String lastName, int PIN) {
        Customer newCustomer = new Customer(firstName, lastName, PIN);
        Customers.add(newCustomer);
    }

    public void removeCustomer(int PIN) {
        boolean customerFound = false;
        for (int x = 0; x < Customers.size(); x++) {
            Customer customer = Customers.get(x);
            int pin = customer.getPIN();
            if (PIN == pin) {
                Customers.remove(customer);
                customerFound = true;
            }
            if (customerFound){
                System.out.println("Customer removed");
            }
            else{
                System.out.println("Customer not found");
            }
        }
    }
    public Customer getCustomer(int PIN) {
        boolean customerFound = false;
        Customer customer = null;
        for (int x = 0; x < Customers.size(); x++) {
            customer = Customers.get(x);
            int pin = customer.getPIN();
            if (PIN == pin) {
                customerFound = true;
            }
            if (customerFound) {
                System.out.println("Welcome");
            } else {
                System.out.println("Customer not found");
            }
        }
        return customer;
    }
   private void getAllCustomers(){
        for(int x = 0;x<Customers.size();x++){
            System.out.println(Customers.get(x));
        }
    }
}

