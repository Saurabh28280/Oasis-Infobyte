import java.util.Scanner;
public class atmmachine {
    public static void main(String[] args) {
        int balance = 50000, withdrawl;
        System.out.println("Enter Your PIN");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        if (pin == 2002) {
            System.out.println("Welcome to HDFC Bank");
            System.out.println("Press 1 to check your account balance");
            System.out.println("Press 2 to withdraw money");
            System.out.println("Press 3 to deposite");
            System.out.println("Press 4 to transfer money");
            System.out.println("Press 5 for transaction history");
            System.out.println("Press 6 to exit");


        } else {
            System.out.println("You PIN is incorrect,Enter PIN again");
        }
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your account balance is : " + balance);
                    break;
                case 2:

                    System.out.println("Enter the amount to be withdrawl\n" +
                            "note:amount should be multiple of 100,for ex.100,500,1000 etc.");
                    withdrawl = sc.nextInt();
                    if (withdrawl <= balance) {
                        System.out.println("Please Collect your cash");
                    } else {
                        System.out.println("You have insufficient balance");
                    }
                    System.out.println("Remaining balance is,");
                    balance = balance - withdrawl;
                    System.out.println(balance);
                    break;
                case 3:
                    System.out.println("Enter amount to be deposite\n" +
                            "note:amount should be multiple of 100,for ex.100,500,1000 etc");
                    int amount = sc.nextInt();

                    if (amount >= 20000) {
                        System.out.println("You can deposite only 20000 per transaction\n" +
                                "Please try again");

                    } else {
                        System.out.println("Your amount has been successfully deposited");

                    }
                    System.out.println("Your total balance is");
                    balance = balance + amount;
                    System.out.println(balance);
                    break;
                case 4:
                    System.out.println("Please enter the account number of benificiary");
                    long acountnumber1 = sc.nextLong();
                    System.out.println("Please Confirm your account number");
                    long acountnumber2 = sc.nextLong();
                    System.out.println("Enter amount to be transfered");
                    int money = sc.nextInt();
                    if (money<=balance){
                        System.out.println("Fund transfered sucessfully");
                    }
                    else{
                        System.out.println("You have insufficient balance\n"+balance);
                    }
                    balance=balance-money;
                    System.out.println(" Your remaining balance is\n"+balance);
                    break;
                case 5:
                    System.out.println("your trannsaction history has been sent on your registered mobile number and Email id ");

                    break;

                case 6:
                    System.out.println("You have logged out successfully");
                    System.exit(0);
                    break;




            }

        }


    }
}

