package logistics;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int accountNumber = 1;
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Account registerAccount(String name, String pin) {
        Account account = new Account(accountNumber, name, pin);
        accountNumber++;
        accounts.add(account);
        return account;
    }

    public Account findAccount(int accountNumber) {
        for (var account : accounts) if (account.getNumber() == accountNumber) return account;
        throw new IllegalArgumentException("invalid account number");
    }

    public void deposit(int accountNumber, int amount) {
        var account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdraw( int accountNumber,int amount, String pin) {
        var account = findAccount(accountNumber);
        account.withdraw("1234",amount);


    }

    public int checkBalance(int accountNumber, String pin) {
        var account = findAccount(accountNumber);
        return account.getBalance(pin);
    }

    public int removeAccount(int accountNumber, String pin) {
        var account = findAccount(accountNumber);
        if (pin.equals(account.getPin())) accounts.remove(account);
        return accountNumber;
    }

    public void transfer(int senderNumber, int beneficialNumber, int amount, String pin) {
        var senderAccountNumber = findAccount(1);
        var beneficialAccountNumber = findAccount(2);
        senderAccountNumber.deposit(amount);
        beneficialAccountNumber.withdraw(pin, amount);

    }
}
