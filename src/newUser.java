import java.util.Scanner;

public class newUser {
        public static void main(String[] args) {

            Scanner ReadingText = new Scanner(System.in);
            Scanner ReadingNumber = new Scanner(System.in);

            String firstName = "Felipe";
            int age = 27;
            double Balance = 3.200;
            String typeAccount = "Corrente";

            String password = "a8f3s3f3";
            int bankAccountNumber = 5071;

            boolean accessOrBank = false;

            System.out.println("enter your name:");
            String nowName = ReadingText.nextLine();
            System.out.println("enter your password");
            String nowPassword = ReadingText.nextLine();
            System.out.println("enter your account:");
            int verificationBankAccountNumber = ReadingNumber.nextInt();

            if (bankAccountNumber == verificationBankAccountNumber && nowPassword.equals(password) ) {
                System.out.println("Account Validate");
                accessOrBank = true;
            }else {
                System.out.println("Account invalidate");
            }
            if (accessOrBank){
                System.out.println("Welcome " +firstName);
            }
        }
}


