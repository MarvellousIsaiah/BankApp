package logistics;

public class Account{
            private String name;
            private String pin;
            private int number;
            private int balance;


            public Account(int number,String name,String pin){
                   this.name = name;
                   this.pin = pin;
                   this.balance = 0;
                   this.number = number;

            }



            public void deposit(int amountToDeposit){
               if (amountToDeposit < 0)throw new IllegalArgumentException("invalid amount, enter a valid amount");
               balance+= amountToDeposit;
         }

            public void withdraw(String pin,int amountToWithdraw){
                    if (!(pin.equals(this.pin)&&amountToWithdraw > 0 && amountToWithdraw<balance))throw new IllegalArgumentException("enter a valid amount");
                    balance-=amountToWithdraw;
            }

            public int getBalance(String pin){
                if(pin.equals(this.pin))return balance;
                throw new IllegalArgumentException("invalid pin");
            }

            public int getNumber(){
                return number;
            }


            public String getPin(){
                return pin;
            }

    }













