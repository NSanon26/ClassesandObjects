public class BankAccount {
    int accountNumber;
    int balance;

    public BankAccount(int pAccountNumber, int pBalance){
        accountNumber = pAccountNumber;
        balance = pBalance;

    }

    public void getBalance(){
        System.out.println("The current Balance is $" + balance);
    }
    public void deposit(int amount){
        System.out.println("The new balance is $" + (balance + amount) + ". The old balance was $" + balance + ".");
    }

    public void withdraw(int amount2){
        if(amount2 > balance){
            System.out.println("Insufficient funds, you tried to take out $" + amount2 +", but you only have $" + balance + ". You need $" + (amount2 - balance) + ".");
        }
        if(amount2 < balance) {
            System.out.println("The new balance is $" + (balance - amount2) + ". The old balance was $" + balance + ".");
        }
    }


}
