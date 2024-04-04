import logistics.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void testDeposit() {
        Account account = new Account(1, "marvy", "1234");
        account.deposit(500);
        assertEquals(500, account.getBalance("1234"));
    }

    @Test
    public void  testWithdraw(){
        Account account = new Account(1,"marvy","1234");
        account.deposit(1500);
        account.withdraw("1234",500);
        assertEquals(1000,account.getBalance("1234"));
    }

    @Test
    public  void testThatBalanceCanBeChecked(){
        Account account = new Account(1,"marvy","1234");
        assertEquals(0,account.getBalance("1234"));

    }
    @Test
    public void testForInvalidPin(){
        Account account = new Account(1,"marvy","1234");
        account.deposit(1000);
        assertThrows(IllegalArgumentException.class,()-> account.withdraw("12345",500));

    }
    @Test
    public void testForInsufficientBalance(){
        Account  account = new Account(1,"marvy","1234");
        account.deposit(100);
        assertThrows(IllegalArgumentException.class,()-> account.withdraw("1234",1000));
    }


    }

