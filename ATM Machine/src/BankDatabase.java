import java.util.ArrayList;

public class BankDatabase
{
   static ArrayList<Account> accounts = new ArrayList<>() ;
   
   
   public BankDatabase()
   {
      Account accounts1 = new Account("Customer1", 12345, 1111, 1000.0);
      Account accounts2 = new Account("Customer2", 98765, 2222, 200.0);
      Account accounts3 = new Account("Customer3", 19234, 3333, 200.0);
      Account accounts4 = new Account("Manager1", 99999, 0000, 0);
      accounts.add(accounts1);
      accounts.add(accounts2);
      accounts.add(accounts3);
      accounts.add(accounts4);
   }
   public Account getAccount(int accountNumber)
   {

      for (Account currentAccount : accounts)
      {
         if (currentAccount.getAccountNumber() == accountNumber)
            return currentAccount;
      }

      return null;
   }

   public double getAvailableBalance(int userAccountNumber)
   {
      return getAccount(userAccountNumber).getAvailableBalance();
   }

   public void withdraw(int userAccountNumber, double amount)
   {
      getAccount(userAccountNumber).withdraw(amount);
   }

   public void deposit(int userAccountNumber, double amount)
   {
      getAccount(userAccountNumber).deposit(amount);
   }
   
}