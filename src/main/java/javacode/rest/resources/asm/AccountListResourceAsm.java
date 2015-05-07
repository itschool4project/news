package javacode.rest.resources.asm;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import javacode.core.services.util.AccountList;
import javacode.rest.mvc.AccountController;
import javacode.rest.resources.AccountListResource;
import javacode.rest.resources.AccountResource;

import java.util.List;

/**
 * Created by Ivan on 04/05/15
 */
public class AccountListResourceAsm extends ResourceAssemblerSupport<AccountList, AccountListResource> {


    public AccountListResourceAsm() {
        super(AccountController.class, AccountListResource.class);
    }

    @Override
    public AccountListResource toResource(AccountList accountList) {
        List<AccountResource> resList = new AccountResourceAsm().toResources(accountList.getAccounts());
        AccountListResource finalRes = new AccountListResource();
        finalRes.setAccounts(resList);
        return finalRes;
    }
}
