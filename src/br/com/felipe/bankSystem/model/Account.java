package br.com.felipe.bankSystem.model;

public class Account {
    private int numberAccount;
    private int accountAG;
    private String typeAccount;

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public int getAccountAG() {
        return accountAG;
    }

    public void setAccountAG(int accountAG) {
        this.accountAG = accountAG;
    }
}