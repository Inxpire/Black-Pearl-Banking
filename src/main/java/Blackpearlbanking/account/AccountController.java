package Blackpearlbanking.account;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

//Tells spring this is a REST controller
@RestController
public class AccountController {

    @Autowired //marks the below for spring as something that needs dependency injection in this case from my business-services AccountService class
    private AccountService accountService;

    @RequestMapping("/accounts")
    public List<Account> getAllAccounts(){
        return accountService.getAllAccounts();
    }

    @RequestMapping("/accounts/{id}")//This is telling spring that I am passing in a variable called id in this case
    public Account getAccount(@PathVariable String id) {  //This annotates where the get variable should be passed to
        return accountService.getAccount(id);
    }

    @RequestMapping(method = POST, value="/accounts")//I am using the postman app to send JSON post request and add an account
        public void addAccount(@RequestBody Account account){
        accountService.addAccount(account);
    }

    @RequestMapping(method = PUT, value="/accounts/{id}")//This is to make changes to an existing account {id} with PUT,
    public void updateAccount(@RequestBody Account account, @PathVariable String id){
        accountService.updateAccount( id, account);
    }

    @RequestMapping(method =DELETE, value="accounts/{id}")//This is my delete method to delete whole accounts from the account arrayList
    public void deleteAccount(@PathVariable String id){
        accountService.deleteAccount(id);
    }


}
