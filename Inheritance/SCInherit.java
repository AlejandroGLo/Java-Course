

class Account {
    private String accNo;
    private String name;
    private String address;
    private String phoneNo;
    private String dob;
    protected long balance;  // Changed from private to protected

    public Account(String acc, String n, String address, String phoneNo, String dob) {
        this.accNo = acc;
        this.name = n;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.balance = 0;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getDOB() {
        return dob;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {  // Added setter for balance
        this.balance = balance;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String acc, String n, String address, String phoneNo, String dob) {
        super(acc, n, address, phoneNo, dob);  // Explicitly calling superclass constructor
    }

    public void deposit(long amt) {
        balance += amt;
    }

    public void withdraw(long amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class LoanAccount extends Account {
    public LoanAccount(String acc, String n, String address, String phoneNo, String dob) {
        super(acc, n, address, phoneNo, dob);  // Explicitly calling superclass constructor
    }

    public void payEMI(long amt) {
        balance -= amt;
    }

    public void repay(long amt) {
        if (balance == amt) {
            balance = 0;
        }
    }
}

public class SCInherit {
    public static void main(String args[]) {
        SavingsAccount sa = new SavingsAccount("12345", "John Doe", "NYC", "1234567890", "01-01-1990");
        sa.deposit(5000);
        sa.withdraw(2000);
        System.out.println("Savings Account Balance: " + sa.getBalance());

        LoanAccount la = new LoanAccount("67890", "Jane Doe", "LA", "0987654321", "02-02-1985");
        la.payEMI(500);
        System.out.println("Loan Account Balance: " + la.getBalance());
    }
}

