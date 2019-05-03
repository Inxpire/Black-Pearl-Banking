package Blackpearlbanking.account;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//When Spring boots it initializes an instance of this service class to be used by other classes
@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;


    private List<Account> accounts  = new ArrayList<>(Arrays.asList(
        new Account("1", "987765", "56-00-47", "Savings Account", 500, 500, 0 ),
                new Account("2", "987665", "56-00-47", "Current Account", 500, 1100, 600 ),
                new Account("3", "983765", "56-00-47", "Joint Account", 2000, 2500, 500 )
        ));


    //SERVICE METHODS -To service the client with what they request
    //get all accounts
    public List<Account> getAllAccounts(){
        List<Account> accounts = new ArrayList<>();
        accountRepository.findAll().forEach(accounts::add);
        return accounts;
    }



    //get an account
    public Account getAccount(String id) {
     return accounts.stream().filter(a -> a.getAccountID().equals(id)).findFirst().get();//Lamda expression for filtering

    }

    //add an account
    public void addAccount(Account account){
        accountRepository.save(account);
    }


    //update an account
    public void updateAccount(String id, Account account) {
        for (int i = 0 ; i < accounts.size(); i++){

            Account a = accounts.get(i);

            if(a.getAccountID().equals(id)){
                accounts.set(i, account);
                return;
            }
        }
    }

    //delete an account
    public void deleteAccount( String id){
        accounts.removeIf(a -> a.getAccountID().equals(id));
    }
}
