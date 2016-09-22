
/**
 * Example of a well written class
 * 
 * @author Jack Chalmers
 * @version 9/21/16
 */
public class BankAccount
{
    /*instance Fields*/
    private int pin;
    private double balance;
    private int acctNum;
    private String acctName;

    
    public BankAccount()
    {
        /**/
        pin = 0;
        balance = 0;
        acctNum = 0;
        acctName = "";
    }

    public BankAccount(int pin, double balance, int acctNum, String acctName)
    {
        this.pin = pin;
        this.balance = balance;
        this.acctNum = acctNum;
        this.acctName = acctName;
    }
    
    public void printBalance()
    {
        System.out.println("your balance is: " + balance);
    }
    
    public String toString()
    {
        return (acctName + " and Balance " + balance);
    }
}
