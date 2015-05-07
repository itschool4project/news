package javacode.core.services.util;

import javacode.core.models.entities.Account;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 04/05/15
 */
public class AccountList {

    private List<Account> accounts = new ArrayList<Account>();

    public AccountList(List<Account> list) {
        this.accounts = list;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
