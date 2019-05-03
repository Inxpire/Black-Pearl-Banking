package Blackpearlbanking.account;


import javax.persistence.Entity;
import javax.persistence.Id;

//ClASS
@Entity //This is an annotation to let Spring know that this is an entity for my database. Spring knows that this means it should create a table with the name of the classname
public class Account {

    //CLASS FIELDS (VARIABLES)
    @Id //This let's Spring know that I intend this to be the primary key of my table. This enables spring to convert an object to a row and a row to an object
    private String accountID;
    private String accountNumber;
    private String accountSortCode;
    private String accountType;
    private int accountBalance;
    private int availableBalance;
    private int overdraft;


    //GETTERS AND SETTERS
    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountSortCode() {
        return accountSortCode;
    }

    public void setAccountSortCode(String accountSortCode) {
        this.accountSortCode = accountSortCode;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(int availableBalance) {
        this.availableBalance = availableBalance;
    }

    public int getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

    //CONSTRUCTORS

    //NO ARGUMENTS CONSTRUCTOR
    public Account() {

    }

    //OBJECT CONSTRUCTOR WITH ARGUMENTS
    public Account(String accountID, String accountNumber, String accountSortCode, String accountType, int accountBalance, int availableBalance, int overdraft) {
        super();
        this.accountID = accountID;
        this.accountNumber = accountNumber;
        this.accountSortCode = accountSortCode;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        this.availableBalance = availableBalance;
        this.overdraft = overdraft;
    }
}
