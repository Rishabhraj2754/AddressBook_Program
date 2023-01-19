import java.util.Scanner;

public class AddressBook {
    Scanner scan = new Scanner(System.in);

    public void CreateContact(){
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


    }


}
