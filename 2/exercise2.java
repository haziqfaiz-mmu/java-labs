import java.util.Date;
import java.util.Scanner;

public class exercise2 {
   public static void main(String[] args){

    Account[] accountArray = new Account[3];
    String choice;double deposit,withdraw;
    Scanner input = new Scanner(System.in);

    accountArray[0] = new Account(101,1000);
    accountArray[1] = new Account(102,2000);
    accountArray[2] = new Account(103,3000);

    printArray(accountArray);

    System.out.println("Enter amount to deposit into first account: ");
    deposit = input.nextDouble();
    accountArray[0].deposit(deposit);
    System.out.println("Balance = "+accountArray[0].getBalance());

    System.out.println("Enter amount to withdraw into first account: ");
    withdraw = input.nextDouble();
    accountArray[0].withdraw(withdraw);
    System.out.println("Balance = "+accountArray[0].getBalance());

    System.out.println("Enter amount to withdraw into first account: ");
    withdraw = input.nextDouble();
    accountArray[0].withdraw(withdraw);
    System.out.println("Balance = "+accountArray[0].getBalance());

   } 

    static void printArray(Account[] accountArray){
       for(int i =0;i<accountArray.length;i++){
           System.out.println("Account id = "+accountArray[i].getId());
           System.out.println("Created = "+accountArray[i].getDateCreated());
           System.out.println("Balance = "+accountArray[i].getBalance());
           System.out.println();
       }
   }
}

class Account{
    private int id;
    private double balance;
    private Date dateCreated;

    Account(){
        this.id=0;
        this.balance=0;
        this.dateCreated = new Date();
    }

    Account(int id, double balance){
        this.id=id;
        if(balance>=100) this.balance=balance;
        else this.balance=0;
        this.dateCreated=new Date();
    }

    public int getId(){
        return this.id;
    }

    public double getBalance(){
        return this.balance;
    }

    public Date getDateCreated(){
        return this.dateCreated;
    }

    public void withdraw(double amount){
        if(amount>this.balance) System.out.println("Not enough balance");
        else this.balance = this.balance - amount;
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }
}
