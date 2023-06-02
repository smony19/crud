

// Account.java
// Represents a bank account

public class Account 
{
   private int accountNumber;
   private int pin;
   private double availableBalance;
   private String username;

   public Account(String Username, int theAccountNumber, int thePIN,
                  double theAvailableBalance)
   {
      setUsername(Username);
      setAccountNumber(theAccountNumber);
      setPin(thePIN);
      setAvailableBalance(theAvailableBalance);

   }

   public boolean validatePIN(int userPIN)
   {
       return userPIN == getPin();
   }
   public double getAvailableBalance()
   {
      return availableBalance;
   }

   public void withdraw(double amount)
   {
      setAvailableBalance(getAvailableBalance() - amount);
   }

    public void deposit(double amount)
    {
        setAvailableBalance(getAvailableBalance() + amount);
    }

   public int getAccountNumber()
   {
      return accountNumber;  
   }

   public String getUsername() {
        return username;
    }

   public void setUsername(String username) {
        this.username = username;
    }

   public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

   public int getPin() {
        return pin;
    }

   public void setPin(int pin) {
        this.pin = pin;
    }

   public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

   
}