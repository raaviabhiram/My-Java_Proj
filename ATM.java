import java.util.Scanner;

class User{
    long acc_no ;
    String acc_holder_name ;
    public User(){
        acc_holder_name = "Raavi Abhiram";
        acc_no = 13332200242l ;
    }
    public String accHolderName(){
        return acc_holder_name;
    }
    public long accNo(){
        return acc_no;
    }

}

public class ATM{
    public static void main(String[] args) {
        float balance = 1000 , withdraw , deposit;
        Scanner sc = new Scanner(System.in);
        User us = new User();
        while(true){
            System.out.println("Welcome to ATM Mr." + us.accHolderName());
            System.out.println("Account number: " + us.accNo());
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Terminate");
            System.out.print("Select a option to perform action ");
            int a = sc.nextInt();
            switch(a){
                case 1:
                    System.out.print("Enter the amount to be deposited ");
                    deposit = sc.nextFloat();
                    System.out.format("The amount being deposited is %.2f \n" , deposit);
                    System.out.format("The total balance is %.2f \n" , balance+deposit);
                    balance = balance + deposit ;
                    break;
                case 2 :
                    System.out.print("Enter amount to be withdrawn ");
                    withdraw = sc.nextFloat();
                    System.out.format("The amount to be withdrawn is %.2f \n" , withdraw);
                    if(balance >=withdraw){
                        System.out.println("Withdraw has been succesfull");
                    }
                    else {
                        System.out.println("Insufficient balance");
                    }

                    System.out.format("Balance is %.2f \n" , balance-withdraw);
                    balance = balance - withdraw ;
                    break;
                case 3:
                    System.out.println("The balance in your account is "+ balance );
                    break;
                case 4 :
                    System.exit(0);
                default:
                    System.out.println("Enter a valid transaction number ");
            }

        }


    }
}