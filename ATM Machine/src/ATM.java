import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATM {

    private boolean userAuthenticated;
    private int currentAccountNumber;
    private BankDatabase bankDatabase;

    private static ATM uniqueinstance;

    public ATM()
    {
        userAuthenticated = false;
        bankDatabase = new BankDatabase();
    }

    public static ATM getInstance() {
        if (uniqueinstance == null) {
            uniqueinstance = new ATM();
        }
        return uniqueinstance;
    }

    public void run() throws IOException {
        authenticate();
    }
    void authenticate() throws IOException
    {
        System.out.println("----------WELCOME TO ATM MACHINE-------------");
        System.out.println("Please enter your account number");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        int accountNumber = Integer.parseInt(reader.readLine());
        Account userAccount = bankDatabase.getAccount(accountNumber);

        System.out.println("Please enter PIN");
        int pin = Integer.parseInt(reader.readLine());

        if(userAccount != null && userAccount.validatePIN(pin)) {
            userAuthenticated = true;
            currentAccountNumber = accountNumber;
            System.out.println("Login Successful");
            displayMenu();

        } else {
            System.out.println("Invalid account number or PIN.");
        }
    }

    public void displayMenu() throws IOException{
        int ch;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        do {
            System.out.println("\n ----------WELCOME TO ATM MACHINE-------------");
            System.out.println("1. Balance Enquiry \n 2. Withdraw \n 3. Deposit \n 4.Exit ");
            System.out.println("Enter your choice: ");
            ch = Integer.parseInt(reader.readLine());
            switch (ch) {
                case 1:
                    if(userAuthenticated) {
                        System.out.println("Available Balance --> "+bankDatabase.getAvailableBalance(currentAccountNumber));
                    } else {
                        System.out.println("User does not have permission to do this operation");
                    }
                    break;
                case 2:
                    if(userAuthenticated) {
                        System.out.println("Enter amount to withdraw");
                        double amount = Double.parseDouble(reader.readLine());
                        bankDatabase.withdraw(currentAccountNumber, amount);
                        System.out.println("Available Balance --> "+bankDatabase.getAvailableBalance(currentAccountNumber));
                    } else {
                        System.out.println("User does not have permission to do this operation");
                    }

                    break;
                case 3:
                    if(userAuthenticated) {
                        System.out.println("Enter amount to deposit");
                        double amount = Double.parseDouble(reader.readLine());
                        bankDatabase.deposit(currentAccountNumber, amount);
                        System.out.println("Available Balance --> "+bankDatabase.getAvailableBalance(currentAccountNumber));
                    } else {
                        System.out.println("User does not have permission to do this operation");
                    }

                    break;
                case 4:
                    System.out.println("See you soon...");
                    break;
            }
        }
        while (ch != 4);
    }
}
