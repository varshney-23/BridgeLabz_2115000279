import java.util.*;

class Bank {
	private String name;
	private List<Customer> customers;

	public Bank(String name) {
		this.name = name;
		this.customers = new ArrayList<>();
	}

	public void openAccount(Customer customer, double initialDeposit) {
		customer.addAccount(new BankAccount(this, initialDeposit));
		customers.add(customer);
	}

	public String getName() {
		return name;
	}
}

class Customer {
	private String name;
	private List<BankAccount> accounts;

	public Customer(String name) {
		this.name = name;
		this.accounts = new ArrayList<>();
	}

	public void addAccount(BankAccount account) {
		accounts.add(account);
	}

	public void viewBalance() {
		System.out.println("Customer: " + name);
		for (BankAccount account : accounts) {
			System.out.println("Bank: " + account.getBank().getName() + ", Balance: " + account.getBalance());
		}
	}
}

class BankAccount {
	private Bank bank;
	private double balance;

	public BankAccount(Bank bank, double balance) {
		this.bank = bank;
		this.balance = balance;
	}

	public Bank getBank() {
		return bank;
	}

	public double getBalance() {
		return balance;
	}
}

public class BankDemo {
	public static void main(String[] args) {
		Bank bank1 = new Bank("Varshney Bank");
		Bank bank2 = new Bank("Om Bank");

		Customer cust1 = new Customer("Ayu");
		Customer cust2 = new Customer("Pran");

		bank1.openAccount(cust1, 500.0);
		bank1.openAccount(cust2, 1000.0);
		bank2.openAccount(cust1, 1500.0);

		cust1.viewBalance();
		System.out.println();
		cust2.viewBalance();
	}
}