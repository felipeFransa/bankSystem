import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Reading = new Scanner(System.in);
        String firstName = "Felipe Fransa";
        int age = 27;
        String password = "a8f3s3f3";
        String typeAccount = "Corrente";
        double accountBalance = 3.200;
        int option = 0;

        System.out.println("************");
        System.out.println("\nName client: " + firstName);
        System.out.println("Type Account: " + typeAccount);
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
            } else if (option == 2) {
                System.out.println("What amount do you want to transfer?");
                double value = Reading.nextDouble();
                if (value > accountBalance) {
                    System.out.println("Not on balance");
                }else {
                    accountBalance =- value;
                    System.out.println("New balance now: " + accountBalance);
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