import java.util.Scanner;

class Bank {
    double accno;
    double accbal;
    String name;

    // Default constructor with default values
    Bank() {
        accno = 0;
        accbal = 0.0;
        name = "No Name";
    }

    // Parameterized constructor to initialize with provided values
    Bank(double accno, double accbal, String name) {
        this.accno = accno;
        this.accbal = accbal;
        this.name = name;
    }

    void depositMoney(double deposit) {
        accbal = accbal + deposit;
        System.out.print("BALANCE: " + accbal);
        System.out.println();
    }

    void withdrawMoney(double withdraw) {
        if (withdraw < 0 || accbal - withdraw < 0) {
            System.out.println("Can't be done");
        } else {
            accbal = accbal - withdraw;
            System.out.print("BALANCE: " + accbal);
            System.out.println();
        }
    }

    void checkBalance() {
        System.out.println();
        System.out.println("BALANCE: " + accbal);
    }

    void printAccDetails() {
        System.out.println();
        System.out.println("DETAILS: ");
        System.out.println("Name: " + name);
        System.out.println("AccNo: " + accno);
        System.out.println("AccBalance: " + accbal);
    }
}

class BankDemo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        Bank b1 = new Bank();

        System.out.println("Enter the account number: ");
        b1.accno = s.nextDouble();
        System.out.println("Enter the account balance: ");
        b1.accbal = s.nextDouble();
        s.nextLine(); // Consume the newline character left in the buffer
        System.out.println("Enter the name: ");
        b1.name = s.nextLine();

        System.out.println("Withdraw(1) or Deposit(2): ");
        int action = s.nextInt();

        if (action == 1) {
            System.out.println("Withdraw Amount: ");
            double withdraw = s.nextDouble();
            b1.withdrawMoney(withdraw);
        } else if (action == 2) {
            System.out.println("Deposit Amount: ");
            double deposit = s.nextDouble();
            b1.depositMoney(deposit);
        }

        b1.checkBalance();
        b1.printAccDetails();


        Bank b2 = new Bank(123456, 8900.0, "Dona Belly");
	
	System.out.println();
	System.out.println ("DETAILS: ");
	System.out.println ("Dona Belly\t\t123456\t\t8900.00");
        System.out.println("Withdraw(1) or Deposit(2): ");
        action = s.nextInt();


        if (action == 1) {
            System.out.println("Withdraw Amount: ");
            double withdraw = s.nextDouble();
            b2.withdrawMoney(withdraw);
        } else if (action == 2) {
            System.out.println("Deposit Amount: ");
            double deposit = s.nextDouble();
            b2.depositMoney(deposit);
        }

        b2.checkBalance();
        b2.printAccDetails();
    }
}
