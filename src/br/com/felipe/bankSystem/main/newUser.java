package br.com.felipe.bankSystem.main;

import br.com.felipe.bankSystem.model.User;

import java.util.Scanner;

public class newUser {
        public static void main(String[] args) {

            Scanner readingText = new Scanner(System.in);
            Scanner readingNumber = new Scanner(System.in);
            User user = new User();

            String password = "a8f3s3f3";
            int bankAccountNumber = 5071;

            System.out.println("enter your name:");
            String nowName = readingText.nextLine();
            user.setName(nowName);

            System.out.println("enter your type account:");
            String typeAccount = readingText.nextLine();
            user.setTypeAccount(typeAccount);

            System.out.println("enter your password");
            String nowPassword = readingText.nextLine();
            user.setPassword(nowPassword);

            System.out.println("enter your account:");
            int verificationBankAccountNumber = readingNumber.nextInt();
            user.setNumberAccount(verificationBankAccountNumber);

            System.out.println("enter your age:");
            int age = readingNumber.nextInt();
            user.setAge(age);

            if (bankAccountNumber == verificationBankAccountNumber && nowPassword.equals(password) ) {
                System.out.println("Account Validate");
                System.out.println(user.getName()+" Seja bem vindo, sua conta "+user.getNumberAccount());
            }else {
                System.out.println("Account invalidate");
            }
        }
}

