import java.util.ArrayList;

public class AddressBookMain {

    public static void main(String[] args){
        
        System.out.println("Welcome to Address Book Program");

        ArrayList arrayList = new ArrayList();
        AddressBook addressBook = new AddressBook();
        addressBook.addDetails(arrayList);
        addressBook.multipleContact(arrayList);
    }

}
