package br.com.felipe.bankSystem.main;

import br.com.felipe.bankSystem.model.User;

public class MainUser {
    public static void main(String[] args) {
        User user = new User();

        user.setName("Felipe");
        user.setAge(27);
        user.setPassword("a8f3s3f3");
        user.setNumberAccount(5071);
        user.setTypeAccount("corrente");
        user.setValueAccount(4200);
    }
}
