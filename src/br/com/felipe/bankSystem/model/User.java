package br.com.felipe.bankSystem.model;

public class User {
    private String name;
    private int age;
    private String typeAccount;
    private String password;
    private int valueAccount;
    private int numberAccount;

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public int getValueAccount() {
        return valueAccount;
    }

    public void setValueAccount(int valueAccount) {
        this.valueAccount = valueAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
