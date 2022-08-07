public class Account {
    private int id;
    private Customer customer;
    private double balance=0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }


    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return this.customer.toString()+"balance=$"+balance;
    }
    public String getCustomername(){
        return this.customer.getName();

    }
    public Account deposit(double amount){
        this.setBalance(amount);
      return this;
    }

    public Account withdraw(double amount){
        if(this.balance >= amount){
            this.balance = this.getBalance() - amount;
        }else{
            System.out.println("amount withdrawn exceeds the current balance");
        }
        return this;
    }

}
