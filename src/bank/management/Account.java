
package bank.management;

/**
 *
 * @author REFAT KHAN
 */





public abstract class Account {
    public double totalBalance;
    public double bal;
    abstract void deposit(double ammount);
    abstract void withdraw(int ammount);
    
    
}
