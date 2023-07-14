import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Interface a = new MethodImplement();
        Scanner sc = new Scanner(System.in);

        System.out.println("ATM Interface");

        System.out.println("User ID:");
        int user_id = sc.nextInt();
        

        System.out.println("User Pin:");
        int user_pin = sc.nextInt();

        if (check_id_pin(user_id, user_pin)) {
            while (true) {
                System.out.println("\nEnter 1:- Transaction History");
                System.out.println("Enter 2:- Withdraw");
                System.out.println("Enter 3:- Deposit");
                System.out.println("Enter 4:- Transfer");
                System.out.println("Enter 5:- View Balance");
                System.out.println("enter 6:- Close");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        a.for_transactionHistory();
                        break;

                    case 2:
                        System.out.println("Enter Amount: ");
                        double withdrawAmount = sc.nextDouble();
                        a.for_withdraw(withdrawAmount);
                        break;

                    case 3:
                        System.out.println("Enter Amount: ");
                        double depositAmount = sc.nextDouble();
                        a.for_deposit(depositAmount);
                        break;

                    case 4:
                        System.out.println("Enter ID: ");
                        int tranferID = sc.nextInt();
                        if (tranferID == 1000) {
                            System.out.println("Enter Amount To Transfer");
                            double transferAmount = sc.nextDouble();
                            a.for_transfer(transferAmount);
                            System.out.println("Money TRANSFERED\n");
                            a.for_viewBalance();
                        } else {
                            System.out.println("Invalid ID\n");
                        }
                        break;

                    case 5:
                        a.for_viewBalance();
                        break;

                    case 6:
                        System.out.println("THANK YOU\n");
                        System.exit(0);
                        break;
                }
            }
        } else {
            System.out.println("INVALID USERID OR PIN");
        }
    }

    public static boolean check_id_pin(int id, int pin) {
        if (id == 1234 && pin == 4321) {
            return true;
        } else {
            return false;
        }
    }
}