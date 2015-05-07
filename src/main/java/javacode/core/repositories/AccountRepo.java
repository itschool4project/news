package javacode.core.repositories;

import javacode.core.models.entities.Account;

import java.util.List;

/**
 * Created by Ivan
 */
public interface AccountRepo {
    List<Account> findAllAccounts();
    Account findAccount(Integer id);
    Account findAccountByName(String name);
    Account createAccount(Account data);
}
