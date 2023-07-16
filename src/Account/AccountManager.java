package Account;

import java.util.TreeSet;

public class AccountManager {
     static TreeSet<Account> accounts = new TreeSet<>();


    public static Account login(String email, int password){
        for (Account account: accounts){
            try {
                account.login(email,password);
                if (account.getStatus() == Account.AuthenticationStatus.Success){
                    return account;
                }
            }catch (InvalidAuthenticationException e){
                System.out.println(e.getMessage());

            }

        }
        return null;
    }

    public TreeSet<Account> getAccounts() {
        return accounts;
    }

}
