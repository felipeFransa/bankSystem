package br.com.felipe.bankSystem.main;

import br.com.felipe.bankSystem.model.User;

import java.util.Scanner;

public class MainUser {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        Scanner readingNumber = new Scanner(System.in);
        User user = new User();

        System.out.println("enter your name:");
        String name = reading.nextLine();
        user.setName(name);

        System.out.println("enter your age:");
        Integer age = readingNumber.nextInt();
        user.setAge(age);

        System.out.println("enter your password:");
        String password = reading.nextLine();
        user.setPassword(password);

        System.out.println("enter your AG number account");
        Integer numberAccount = readingNumber.nextInt();
        user.setNumberAccount(numberAccount);

        System.out.println("enter your type account");
        String typeAccount = reading.nextLine();
        user.setTypeAccount(typeAccount);

        System.out.println("enter your value account:");
        Integer valueAccount = readingNumber.nextInt();
        user.setValueAccount(valueAccount);

        System.out.println(user.getName());
        System.out.println(user.getPassword());
        System.out.println(user.getNumberAccount());
        System.out.println(user.getValueAccount());
        System.out.println(user.getTypeAccount());
        System.out.println(user.getAge());
    }
}
