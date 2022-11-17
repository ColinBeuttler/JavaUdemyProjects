import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import models.Contact;
import models.ContactManager;

public class Main {
    
    static ContactManager manager = new ContactManager();
    public static void main(String[] args) {
        
        
       try{
           loadContacts("contacts.txt");
           System.out.println("CONTACTS LOADED\n\n");
        System.out.println(manager);
       }

       catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
       }
       
      manageContacts();
        
    }

    /**
     * Name: manageContacts
     *
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) add b) remove a contact c) exit.
     *   •        case a: ask for the name, phone number and birthDate.
     *   •        case b: ask who they'd like to remove.
     *   •        case c: break the loop.
     *   • 3. close Scanner.
     */

    public static void manageContacts() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Type 'a' to add a contact or tyep 'b' to remove a contact.");
                String answer = scan.nextLine();

                switch (answer) {

                    case "a": {
                        System.out.println("Type the contact name");
                        String name = scan.nextLine();
                        if (name == null || name.isBlank()) {
                            System.out.println("\nThe input you provided is not valid. Registration failed.");
                        }
                        System.out.println("Type the contact phone Number");
                        String phoneNumber = scan.nextLine();
                        if (phoneNumber.length() < 5) {
                            System.out.println("\nEnter a valid phone number");
                        }
                        System.out.println("Type the contact birth date");
                        String birthDate = scan.next();
                        try {
                            manager.addContact(new Contact(name, phoneNumber, birthDate));
                        } catch (ParseException e) {
                            System.out.println(e.getMessage());
                        } finally {
                            System.out.println("\n\nUPDATED CONTACTS\n\n" + manager);

                        }
                        break;
                    }

                    case "b": {
                        System.out.println("\nWho would you like to remove?");
                        scan.nextLine();
                        String remove = scan.nextLine();
                        manager.removeContact(remove);
                        System.out.println("\n\nUPDATED CONTACTS\n\n" + manager);
                        break;
                    }

                    default: {
                        System.out.println("Enter a valid Answer");
                        break;
                    }
            }
            scan.close();
        }
     }



    /**
     * Name: loadContacts
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads contacts from <fileName>;
     *   • 2. From the manager object, it adds all contacts to the contacts list.
     *        Hint: use scan.next to grab the next String separated by white space.
     */

    public static void loadContacts(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        while (scanFile.hasNextLine()) {
            try{
                Contact contact = new Contact(scanFile.next(), scanFile.next(), scanFile.next());
            }
            catch (ParseException e) {
                System.out.print(e.getMessage());
            }
            
        }
        scanFile.close();
     }

}
