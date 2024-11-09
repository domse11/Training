import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {

    private int accountnumber;
    private double balance;
    private String customer_name;
    private String email;
    private int phone_number;

    Scanner scanner = new Scanner(System.in);

    public double depositing() {

        try {

            System.out.println("Enter Depositing amount");

            double depositamount = scanner.nextDouble();

            if (depositamount <= 0) {
                System.out.println("Deposit amount must be greater than 0");

            } else {
                this.balance += depositamount;
                System.out.println("Current balance is " + this.balance);
            }

        } catch (InputMismatchException e) {
            System.out.println("enter a valid number");
            scanner.next();
        }
        scanner.close();
        return this.balance;
    }


    public double withdrawing() {

        try {

            System.out.println("Enter withdrawing amount");
            double withdrawbalance = scanner.nextDouble();

            if (withdrawbalance >= this.balance) {

                System.out.println("Current balance is " + this.balance);
                System.out.println("You can't withdraw more money than is in your bank account");

            } else if (balance <= 0) {
                System.out.println("Balance must be greater than zero");
            } else {
                this.balance -= withdrawbalance;
                System.out.println("Current balance is " + this.balance);
            }

        } catch (InputMismatchException e) {
            System.out.println("Enter a valid number");
            scanner.next();
        }
        scanner.close();
        return this.balance;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        System.out.println("Current balance is: " + balance);
        return balance;
    }

    public void setBalance(double balance) {
        System.out.println("Balance set to " + balance);
        this.balance = balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

}

