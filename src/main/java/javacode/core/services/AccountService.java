package javacode.core.services;

import javacode.core.models.entities.Account;
import javacode.core.services.util.AccountList;

/**
 * Created by Ivan on 04/05/15
 */
public interface AccountService {
    Account findAccount(Integer id);
    Account createAccount(Account data);
    AccountList findAllAccounts();
    Account findByAccountName(String name);
}
