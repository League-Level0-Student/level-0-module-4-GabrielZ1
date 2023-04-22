package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickelsAsString = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int nickelsAsInt = Integer.parseInt(nickelsAsString);
		// Ask the user how many dimes they have, and convert their answer
		String dimesAsString = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimesAsInt = Integer.parseInt(dimesAsString);
		// Ask the user how many quarters they have, and convert their answer
		String quartersAsString = JOptionPane.showInputDialog("How many quarters do you have?");
		int quartersAsInt = Integer.parseInt(quartersAsString);
		// Calculate how much money the user has.  Hint: Use a double variable 
		double totalMoney = nickelsAsInt*0.05 + dimesAsInt*0.10 + quartersAsInt*0.25;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		JOptionPane.showMessageDialog(null, "You have $" + totalMoney);
	}
}

