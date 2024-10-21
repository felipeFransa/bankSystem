package br.com.felipe.bankSystem.main;

import br.com.felipe.bankSystem.model.User;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Reading = new Scanner(System.in);
        User user = new User();
        LocalDate nowDate = LocalDate.now();

        user.setName("Felipe França");
        user.setTypeAccount("Corrente");
        double accountBalance = 5.000;
        int option = 0;

        System.out.println("************");
        System.out.println("\nName client: " +user.getName());
        System.out.println("Type Account: " +user.getTypeAccount());
        System.out.println("Balance: " + accountBalance);
        System.out.println("\n************");

        String menu = """
                ** Digite sua opcão **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor\s
                4 - Sair
                """;

        while (option != 4) {
            System.out.println(menu);
            option = Reading.nextInt();

            if (option == 1) {
                System.out.println("Balance: " +accountBalance);
                System.out.println(nowDate);
            } else if (option == 2) {
                System.out.println("What amount do you want to transfer?");
                System.out.println(nowDate);
                double value = Reading.nextDouble();
                if (value > accountBalance) {
                    System.out.println("Not on balance");
                    System.out.println(nowDate);
                }else {
                    accountBalance =- value;
                    System.out.println("New balance now: " + accountBalance);
                    System.out.println(nowDate);
                }
            } else if (option == 3) {
                System.out.println("enter the transfer amount: ");
                double value = Reading.nextDouble();
                accountBalance += value;
                System.out.println("Your current balance is: " +accountBalance);
            } else if (option != 4){
                System.out.println("Option invalidate.");
            }
        }
    }
}