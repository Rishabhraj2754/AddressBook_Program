import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner scan = new Scanner(System.in);

    public Contact addDetails(ArrayList arrayList){
     Contact contact = new Contact();
        System.out.println("Enter your first name");
        String firstName = scan.next();
        contact.setFirstname(firstName);
        System.out.println("Enter last name");
        String lastName = scan.next();
        contact.setLastName(lastName);
        System.out.println("Enter the email");
        String email = scan.next();
        contact.setEmail(email);
        System.out.println("Enter the address");
        String address = scan.next();
        contact.setAddress(address);
        System.out.println("Enter your city");
        String city = scan.next();
        contact.setCity(city);
        System.out.println("Enter your state");
        String state = scan.next();
        contact.setState(state);
        System.out.println("Enter your zip ");
        int zip = scan.nextInt();
        contact.setZip(zip);
        System.out.println("Enter your phone number");
        long phoneNumber = scan.nextLong();
        contact.setPhoneNumber(phoneNumber);
        arrayList.add(contact);
        return contact;
    }
   public void multipleContact(ArrayList arrayList){
      AddressBook addressBook = new AddressBook();
      String charcter;
      do {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter choice 1.to add Contact ");
         int choice;
         choice = scan.nextInt();
         switch (choice) {

            case 1:
               addressBook.addDetails(arrayList);
               break;
            default:
               System.out.println("Invalid Input");
         }
         System.out.println("DO YOU WANT TO ADD MORE CONTACT (PRESS y to continue)");
         charcter = scan.next();
      } while (charcter.equals("y") || charcter.equals("Y"));
      System.out.println(arrayList);
   }

}
