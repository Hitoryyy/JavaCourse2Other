package HomeWork3.ArrayList.Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhonebookApp {

    public static void main(String[] args) {

        Catalog contact = new Catalog("Karaskevich", 156433076);
        Catalog contact1 = new Catalog("Karaskevich", 156558625);
        Catalog contact2 = new Catalog("Pavlov", 04453122);
        Catalog contact3 = new Catalog("Pavlov", 821341424);
        Catalog contact4 = new Catalog("Kubrakov", 1231231233);
        Catalog contact5 = new Catalog("Radchenkov", 1232132143);
        Catalog contact6 = new Catalog("Ivanov", 1489421429);

        List<Catalog> contacts = new ArrayList<>();
        contacts.add(contact);
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);
        contacts.add(contact5);
        contacts.add(contact6);

        System.out.println(contacts);

        Map<String, Long> mapContacts = new HashMap<>();

    }
}
