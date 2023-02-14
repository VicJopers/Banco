package VicJopers.Projeto.Java;

import java.util.ArrayList;
import java.util.List;

public class Banck {
    private String agencia;
    private List<Account> accounts;  // DEPOIS DE CRIAR A LISTA TEM Q DAR UM NOME A ELA
    private int lastAccount=1;
    public Banck(String agencia){
        this.agencia = agencia;
        this.accounts = new ArrayList<>();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void insertAccounts(Account account){
        accounts.add(account);
    }
    public Account generateAccount(String name){
        Account account = new Account(agencia, " "+lastAccount, name);
        lastAccount++;
        return account;
    }
}
