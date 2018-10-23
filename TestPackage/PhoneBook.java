package edu.project3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

/**
 * Contains an arraylist of contacts and modifies it
 * displays contacts in alphabetical order
 * @author Thomas McSwain
 *
 */
public class PhoneBook {
	private ArrayList<Contact> book = new ArrayList<Contact>();
	/**
	 * Adds a contact to book arraylist
	 * 
	 */
	public void add(Contact c) {
		
		book.add(c);
		
	}
	/**
	 * Removes contact with the name, name.
	 * @throws InputMismatchException - Throws exception when name is not found in the Phonebook
	 */
	public void remove(String name) throws InputMismatchException{
		
		for(Contact c:book) {
			if(name.equals(c.getName())) {
				book.remove(c);
				return;
			}
			
		}
		throw new InputMismatchException();
	}
	/**
	 * Finds the contact with name:name then replaces it with a new contact with new names.
	 * 
	 * @param name
	 * @param newName
	 * @param number
	 * @param email
	 * @param notes
	 * @throws InputMismatchException
	 */
	public void edit(String name,String newName,String number,String email,String notes) throws InputMismatchException{
		
		for(Contact c:book) {
			if(name.equals(c.getName())) {
				int index = book.indexOf(c);
				book.remove(c);
				book.add(index,new Contact(newName,number,email,notes));
				return;
			}
			
		}
		throw new InputMismatchException();
	}
	/**
	 * Sorts phonebook lexographical order.
	 */
	public void sort() {
		Collections.sort(book);
	}
	/**
	 * Prints formated contacts in the phonebook to console.
	 */
	public void display() {
		for(Contact c:book) {
			System.out.println(c.toString());
		}
	}
	
}