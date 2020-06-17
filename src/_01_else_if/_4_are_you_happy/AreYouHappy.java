package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		String bob = JOptionPane.showInputDialog("Are you happy");
		String speedway = ("");
		if (bob.equals("yes")) {

		}
		if (bob.contentEquals("no")) {
			speedway = JOptionPane.showInputDialog("Do you want to be happy?");
		}
		if (speedway.contentEquals("no")) {
			System.out.print("Keep doing what you are doing!");
		}

		if (speedway.contentEquals("yes")) {
			System.out.print("change something!");
		}

	}
}
