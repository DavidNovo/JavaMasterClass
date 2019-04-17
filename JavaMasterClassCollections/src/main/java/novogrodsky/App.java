package novogrodsky;


/**
 * Hello world! .
 */
public class App {


  /**
   * The main method 'nuff said.
   */
  public static void main(String[] args) {
    System.out.println("Hello World!");

    // first part, using the built-in Arrays
/*    int[] myIntegers = BuiltInArray.getIntegers(5);
    int[] sorted = BuiltInArray.sortIntegers(myIntegers);
    BuiltInArray.printArray(sorted);*/

    // Code exercise to understand ArrayLists
    // Create a program that implements a simple mobile phone with the following capabilities.
    // Able to store, modify, remove and query contact names.
    // You will want to create a separate class for Contacts (name and phone number).
    // Create a master class (MobilePhone) that holds the ArrayList of Contacts
    // The MobilePhone class has the functionality listed above.
    // Add a menu of options that are available.
    // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
    // and search/find contact.
    // When adding or updating be sure to check if the contact already exists (use name)
    // Be sure not to expose the inner workings of the Arraylist to MobilePhone
    // e.g. no ints, no .get(i) etc
    // MobilePhone should do everything with Contact objects only.

    // Start running the mobile phone application
    //MobilePhone.start();

    // Autoboxing and unboxing
    //
    //// this is an example of autoboxing, putting a primitive into an object
    System.out.println("autoboxing");
    Integer myIntegerClass = 45;
    System.out.println(myIntegerClass.intValue());
    ////
    //// unboxing take the primitive value out of its wrapper class
    System.out.println("unboxing");
    int myInteger = myIntegerClass;
    System.out.println(myInteger);


    // You job is to create a simple banking application.
    // There should be a Bank class
    // It should have an arraylist of Branches
    // Each Branch should have an arraylist of Customers
    // The Customer class should have an arraylist of Doubles (transactions)
    // Customer:
    // Name, and the ArrayList of doubles.
    // Branch:
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch
    // Bank:
    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions

  }

}
