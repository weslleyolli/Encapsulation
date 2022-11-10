package application;

import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Account account;
		
		JOptionPane.showMessageDialog(null, "Welcome to Well bank");
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter account number"));
		String holder = JOptionPane.showInputDialog("Enter account holder: ");
		String response = JOptionPane.showInputDialog("Do you want to make a deposit: y/n");
		double initialDeposit;
		
		if(response.equalsIgnoreCase("y")) {
			initialDeposit = Double.parseDouble(JOptionPane.showInputDialog("Enter initial deposit value: "));
			account = new Account(number, holder, initialDeposit);
		}
		
		else {
			account = new Account(number, holder);
		}
		
		JOptionPane.showMessageDialog(null, "Account data: \n" + account);
		
		double depositValue = Double.parseDouble(JOptionPane.showInputDialog("Enter a deposit value: "));
		account.deposit(depositValue);
		
		JOptionPane.showMessageDialog(null, "Update account data: \n" + account);
		
		double withdrawValue = Double.parseDouble(JOptionPane.showInputDialog("Enter a withdraw value: "));
		account.withdraw(withdrawValue);
		
		JOptionPane.showMessageDialog(null, "Update account data: \n" + account);
	}

}
