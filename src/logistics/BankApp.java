package logistics;
import javax.security.auth.login.AccountNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BankApp{
static void appDisplay() {
        System.out.println("welcome to mavericks bank >>>>> how can we help you today");
        System.out.printf("%S%n%S%n%S%n%S%n%S%n%S%n%S%n", "enter 1 to deposit>>>>>>>", "enter 2 to withdraw >>>>>>>>>>", "enter 3 to transfer >>>>>>>>", "enter 4 to check Balance >>>>>>>>", "enter 5 to register customer >>>>>>>>> ", "enter 6 to remove account >>>>>>>>>>", "enter 7 to find account >>>>>>>>>>>");
        }


public static void bankApp() {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        appDisplay();
        while (scanner.hasNext()){
        try {
        int response = scanner.nextInt();
        switch (response) {

        case 1 -> {
        System.out.println("enter your account number");
        int accountNumber = scanner.nextInt();
        System.out.println("enter the amount to be deposited");
        int amountToBeDeposited = scanner.nextInt();
        bank.deposit(accountNumber, amountToBeDeposited);
        System.out.printf("you deposited %d to %d account %n", amountToBeDeposited, accountNumber);
        System.out.println();
        appDisplay();

        }
        case 2 -> {
        System.out.println("enter your account number");
        int accountNumber = scanner.nextInt();
        System.out.println("enter the amount to be withdrawn");
        int amountToBeWithdrawn = scanner.nextInt();
        System.out.println("input your pin");
        String pin = scanner.next();
        bank.withdraw(accountNumber, amountToBeWithdrawn, pin);
        System.out.printf("you withdraw  %d from %d account thanks for banking with us%n ", amountToBeWithdrawn, accountNumber);
        System.out.println();
        appDisplay();
        }
        case 3 -> {
        System.out.println("enter your account number");
        int accountNumber = scanner.nextInt();
        System.out.println("enter the recipient account number");
        long recipientAccountNumber = scanner.nextLong();
        System.out.println("enter the amount you will like to be transferred out of your account");
        int amountToBeTransferred = scanner.nextInt();
        System.out.println("input your pin");
        String pin = scanner.next();
        bank.transfer(accountNumber, (int) recipientAccountNumber, amountToBeTransferred, pin);
        System.out.print("transfer successful");
        System.out.println();
        appDisplay();
        }
        case 4 -> {
        System.out.println("enter your account number");
        long accountNumber = scanner.nextLong();
        System.out.println("enter your pin");
        String pin = scanner.next();
        var value = bank.checkBalance((int) accountNumber, pin);
        System.out.println("your remaining balance is" + "     " + value);
        System.out.println();
        appDisplay();
        }


        case 5 -> {
        System.out.println("enter your first name");
        String firstName = scanner.next();
        System.out.println("enter your second name");
        String secondName = scanner.next();
        System.out.println("enter your pin");
        String pin = scanner.next();
        var value = bank.registerAccount(firstName+secondName, pin);
        System.out.println("Congrats here is your account preview " + "     " + value);
        System.out.println();
        appDisplay();
        }

        case 6 -> {
        System.out.println("enter your first name");
        long accountNumberToRemove = scanner.nextLong();
        System.out.println("enter your pin");
        String pin = scanner.next();
        bank.removeAccount((int) accountNumberToRemove, pin);
        System.out.println("tchhh!!! your account has been permanently removed ");
        System.out.println();
        appDisplay();
        }


        case 7 -> {
        System.out.println("enter your first name");
        long accountNumberToBeFound = scanner.nextLong();
        var latestAccount = bank.findAccount((int) accountNumberToBeFound);
        System.out.println(latestAccount);
        appDisplay();
        }

        }
        } catch (InputMismatchException | IllegalArgumentException e) {
        System.out.println(e.getMessage());
        System.out.println("respect yourself \n \n ");
        bankApp();
        }
        }
        }
    public static void main(String[] args){
        bankApp();
    }
}