public class BankAccount {
	private static String bankName = "AYU's BANK";
	private static int totalAccounts = 0;
	
	private final int accountNumber;
	private String accountHolderName;
	private double balance;

	BankAccount(int accountNumber, String accountHolderName, double balance){
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountNumber = accountNumber;
		totalAccounts++;
	}
	
	public static int getTotalAccounts() {
		return totalAccounts;
	}
	
	public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: $" + balance);
        }
    }
	
	public static void main(String [] args) {
		BankAccount acc1 = new BankAccount(101, "ayushi" , 10000);
		BankAccount acc2 = new BankAccount(102, "pranjal", 2345678);
		
		acc1.displayAccountDetails();
		System.out.println();
		acc2.displayAccountDetails();
		
		System.out.println("\n Total Account: " + BankAccount.getTotalAccounts());
	}
}




















