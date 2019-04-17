package novogrodsky;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class represents a mobile phone.
 */
public class MobilePhone {

  // to retrieve user cl input
  private static Scanner scanner = new Scanner(System.in);

  private static ArrayList<Contact> contacts = new ArrayList<Contact>();

  //

  /**
   * This starts the phone app.
   */
  public static void start() {
    boolean quit = false;
    int choice = 0;

    // print the instructions
    printInstructions();

    // start this processing loop
    while (!quit) {
      System.out.println("Enter your choice:");
      choice = scanner.nextInt();
      scanner.nextLine();

      // list the options for the main menu
      // TODO: check the input is valid.
      switch (choice) {
        case 0:
          printInstructions();
          break;
        case 1:
          printContacts();
          break;
        case 2:
          addContact();
          break;
        case 3:
          modifyContact();
          break;
        case 4:
          removeContact();
          break;
        case 5:
          searchContact();
          break;
        case 6:
          quit = true;
          break;
        default:
          System.out.println("Please enter a number associated with a menu option.");
      }
    }
  }

  /**
   * Search the contact list.
   */
  public static void searchContact() {
    System.out.println("Please enter the contact's name you want to find: ");
    String searchOnName = scanner.nextLine();
    int position = -1;
    for (int i = 0; i < contacts.size(); i++) {
      if (contacts.get(i).getFullName().contains(searchOnName)) {
        position = i;
      }
    }
    if (position > -1) {
      System.out.println("The name is in the contact list.");
    } else {
      System.out.println("The name is not in the list.");
    }
    return;
  }


  /**
   * Remove a contact from the list.
   */
  public static void removeContact() {
    System.out.println("Please enter the number of the contact you want to remove: ");
    int toRemove = scanner.nextInt();
    contacts.remove(toRemove - 1);
  }

  /**
   * Modify a contact on the list.
   */
  public static void modifyContact() {
    System.out.println("Please enter the number of the contact you want to modify: ");
    int toModify = Integer.parseInt(scanner.nextLine()) - 1;
    System.out.println("Enter the new name of the contact: ");
    String newName = scanner.nextLine();
    System.out.println("Enter the new phone number of the contact:");
    String newPhoneNumber = scanner.nextLine();
    Contact newContact = new Contact(newName, newPhoneNumber);
    contacts.set(toModify, newContact);
    System.out.println("Contact at position " + (toModify + 1) + "has been changed");
  }

  /**
   * This adds a contact object to the contacts array.
   */
  public static void addContact() {
    System.out.println("Please enter the full name of the new contact: ");
    String fullName = scanner.nextLine();
    System.out.println("Please enter the phone number of the contact: ");
    String phoneNumber = scanner.nextLine();
    Contact contact = new Contact(fullName, phoneNumber);
    contacts.add(contact);

  }

  /**
   * This method prints the contacts stored in the phone.
   */
  public static void printContacts() {
    System.out.println("You have " + contacts.size() + " contacts in your phone");
    for (int i = 0; i < contacts.size(); i++) {
      System.out.println(
          (i + 1) + ". " + contacts.get(i).getFullName() + "," + contacts.get(i).getPhoneNumber());
    }

  }

  /**
   * Printing the instructions for the phone to the System.out
   */
  public static void printInstructions() {
    System.out.println("\nPress ");
    System.out.println("\t 0 - To print choice options.");
    System.out.println("\t 1 - To print the list of contacts.");
    System.out.println("\t 2 - To add a contact to the phone.");
    System.out.println("\t 3 - To modify a contact in the phone.");
    System.out.println("\t 4 - To remove a contact from the phone.");
    System.out.println("\t 5 - To search for a contact in the list.");
    System.out.println("\t 6 - To quit the phone.");
  }

}
