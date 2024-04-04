import logistics.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {


    @Test
    public void testThatAccountRegister() {
        Bank bank = new Bank();
        var accountToCompare = bank.registerAccount("marvy", "1234");
        assertEquals(accountToCompare, bank.findAccount(1));
    }

    @Test
    public void testFindAccount() {
        Bank bank = new Bank();
        var accountToCompare = bank.registerAccount("marvy", "1234");
        assertEquals(accountToCompare, bank.findAccount(1));
    }

    @Test
    public void testDeposit() {
        Bank bank = new Bank();
        var accountToCompare = bank.registerAccount("marvy", "1234");
        bank.deposit(1, 200);
        assertEquals(200, bank.checkBalance(1, "1234"));

    }

    @Test
    public void testWithdraw() {
        Bank bank = new Bank();
        var accountToCompare = bank.registerAccount("marvy", "1234");
        bank.deposit(1, 500);
        bank.withdraw(1, 300, "1234");
        assertEquals(200, bank.checkBalance(1, "1234"));


    }

    @Test
    public void testCheckBalance() {
        Bank bank = new Bank();
        var accountToCompare = bank.registerAccount("marvy", "1234");
        assertEquals(accountToCompare, bank.checkBalance(1, "1234"));


    }

    @Test
    public void transfer() {
        Bank bank = new Bank();
        var accountToCompare = bank.registerAccount("marvy", "1234");
        var accountToCompares = bank.registerAccount("isaiah", "1235");
        bank.deposit(1, 1000);
        var senderAccountNumber = bank.findAccount(1);
        var beneficialAccountNumber = bank.findAccount(2);
        senderAccountNumber.withdraw("1234", 500);
        beneficialAccountNumber.deposit(500);
        assertEquals(500, bank.checkBalance(1, "1234"));
    }

    @Test
    public void removeAccount() {
        Bank bank = new Bank();
        var accountToCompare = bank.registerAccount("marvy", "1234");
        var accountToCompares = bank.registerAccount("isaiah", "1235");
        var account = bank.findAccount(1);
        bank.removeAccount(2,"1235");
        assertEquals(2, bank.removeAccount(2, "1235"));


    }
}

