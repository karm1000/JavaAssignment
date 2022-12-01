import java.util.Random;

class BankAccount{
    static long account_number_gen = 1234567890;
    long account_number;
    String account_holder_name;
    double amount;
    boolean operationRunning = false;

    BankAccount(String account_holder_name,double amount){
        account_number = account_number_gen++;
        this.account_holder_name = account_holder_name;
        this.amount = amount;
    }

    public synchronized void deposit(double x){
        try {
            if(operationRunning){
                wait();
            }else {
                operationRunning = true;
                double prev_amount = this.amount;
                amount += x;
                System.out.println("Deposit Done");
                System.out.println("Name : "+account_holder_name);
                System.out.println("For account Number : "+account_number);
                System.out.println("Current Balance : "+prev_amount+"+"+x+"= "+amount);
                System.out.println();

                operationRunning = false;
                notifyAll();
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public synchronized void withdrawal(double x){
        try {
            if(operationRunning){
                wait();
            }else {
                operationRunning = true;

                if(x>amount){

                    System.out.println("Sorry, You have insufficient balance");
                    System.out.println("Withdrawal cannot be Done");
                    System.out.println("Name : "+account_holder_name);
                    System.out.println("For account Number : "+account_number);
                    System.out.println("Current Balance : "+amount);
                    System.out.println();
                }else {
                    double prev_amount = this.amount;
                    amount -= x;
                    System.out.println("Withdrawal Done");
                    System.out.println("Name : "+account_holder_name);
                    System.out.println("For account Number : "+account_number);
                    System.out.println("Current Balance : "+prev_amount+"-"+x+"= "+amount);
                    System.out.println();
                }
                operationRunning = false;
                notifyAll();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return account_holder_name+"\nAccount Number - "+account_number+"\nBalance : "+amount+"\n";
    }
}

class Deposit extends Thread{
    BankAccount b;
    double x;

    Deposit(BankAccount b,double x){
        this.b = b;
        this.x = x;
        start();
    }

    @Override
    public void run() {
        b.deposit(this.x);
    }
}

class Withdrawal extends Thread{
    BankAccount b;
    double x;

    Withdrawal(BankAccount b,double x){
        this.b = b;
        this.x = x;
        start();
    }

    @Override
    public void run() {
        b.withdrawal(this.x);
    }
}

public class BankingSystem {
    public static void main(String[] args)throws InterruptedException {
        BankAccount bankAccount = new BankAccount("Karm Soni",100000);
        Deposit deposit = new Deposit(bankAccount,90000);
        Withdrawal withdrawal = new Withdrawal(bankAccount,30000);

        deposit.join();
        withdrawal.join();

        System.out.println();
        System.out.println(bankAccount);

    }
}
