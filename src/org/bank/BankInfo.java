package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
		System.out.println("Savings account");

	}
	public void fixed() {
		System.out.println("Fixed account");

	}
	public static void main(String[] args) {
		BankInfo b1=new BankInfo();
		b1.fixed();
		b1.deposit();
		b1.saving();
		
	}

}
