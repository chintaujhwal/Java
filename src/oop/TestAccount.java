package oop;

public class TestAccount {

	public static void main(String[] args) {
		 SavingsAccount s1; // object reference
		 
		 s1 = new SavingsAccount(1001, "James Gosling"); // call method
		 s1.deposit(20000);
		 s1.print();
		 
		 SavingsAccount s2  = new SavingsAccount(1002,"Scott Guthrie");
		 System.out.printf("Balance = %.2f",s2.getBalance());
	}
}
