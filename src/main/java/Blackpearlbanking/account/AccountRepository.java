package Blackpearlbanking.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, String> {//gives generic types to Spring and means AccountRespository has access to all of the crud methods



    //addAccount()
    //getAllAccounts()
    //getAccount(String id)
    //updateAccount(account a)
    //deleteAccount(String id)


}
