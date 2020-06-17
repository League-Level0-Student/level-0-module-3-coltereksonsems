package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Story_Time {

	public static void main(String[] args) {
	
		String bob = JOptionPane.showInputDialog("You own an amusement park in the 1960s. Your 1923 wooden coaster needs new trains becuase the old ones are damaged. This will cost a lot of money. yes or no? ");
		 if (bob.contentEquals("no")) {
        	 bob = JOptionPane.showInputDialog("The coaster can no longer operate. What will you do now? abandon it or sell it?");}
		 if (bob.contentEquals("sell it")) {
        	 bob = JOptionPane.showInputDialog("Two parks have offered to buy the ride. Spackman's Kiddieland and Bell's Beach. Which one will you choose?");}
		 if (bob.contentEquals("abandon it")) {
        	 bob = JOptionPane.showInputDialog("The ride is now rotting at the edge of your property. Your park now lacks a main attraction. What coaster will you purchase to replace it? A new wooden coaster or a steel wild mouse? ");}
		 if (bob.contentEquals("a new wooden coaster")) {
        	 bob = JOptionPane.showInputDialog("The public is angry, but respects your descision.Now the Pretzel, a haunted house ride is being vandalized by guests. what will you do? put up chicken wire or replace all of the props with new ones?");}
		 if (bob.contentEquals("replace all props with new ones")) {
        	 bob = JOptionPane.showInputDialog("All of your spending and unpopular descisions have lead the park to go bankrupt. R.I.P. forest park 1892-1969.");}
		 if (bob.contentEquals("a steel wild mouse")) {
	        	 bob = JOptionPane.showInputDialog("All of your spending and unpopular descisions have lead the park to go bankrupt. R.I.P. forest park 1892-1969.");}
		 if (bob.contentEquals("Spackman's Kiddieland")) {
        	 bob = JOptionPane.showInputDialog("Angered, Bell's Beach spread false rumors and lead your park to close. R.I.P. forest park 1892-1969. ");}
		 if (bob.contentEquals("Bell's Beach")) {
        	 bob = JOptionPane.showInputDialog("Angered, Spackman's Kiddieland spread false rumors and lead your park to close. R.I.P. forest park 1892-1969. ");}
		 if (bob.contentEquals("put up chicken wire")) {
        	 bob = JOptionPane.showInputDialog("All of your spending and unpopular descisions have lead the park to go bankrupt. R.I.P. forest park 1892-1969. ");}

	
	
		 
		 
		 
		 
		 
		 
		 if (bob.contentEquals("yes")) {
        	 bob = JOptionPane.showInputDialog("It put a dent in your finances but your public relations are higer than ever. But now a fire burned the park's Rotor to the ground! rebuild or scrap?");}
		 if (bob.contentEquals("scrap it")) {
        	 bob = JOptionPane.showInputDialog("When transportng the ride to the scrapyard, you hired unexperienced staff who got injured and sued you. R.I.P. forest park 1892-1969. ");}
		 if (bob.contentEquals("rebuild it")) {
        	 bob = JOptionPane.showInputDialog("Your park would continue to be succesful for many more years but in 1996, Six Flags offered to buy the park. Yes or no?");}
		 if (bob.contentEquals("no")) {
        	 bob = JOptionPane.showInputDialog("Your park would become the largest family-owned park in the U.S. Congratulations!");}
		 if (bob.contentEquals("yes")) {
        	 bob = JOptionPane.showInputDialog("Most of the rides you built and others you fought to preserve were demolished and the park was renamed to SIX FLAGS XTREME ZONE. Sorry.");}
		 
		 
		 
		 
		 
		 
		 }}
	

	
	
	
	
	
	
	
	

