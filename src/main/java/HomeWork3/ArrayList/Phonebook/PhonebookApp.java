package HomeWork3.ArrayList.Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
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
        Catalog contacts7 = new Catalog("Tom", 1414242145);


        Catalog[] arrayContacts = new Catalog[]{contact, contact1, contact2,
                contact3, contact4, contact5, contact6};

        ArrayList<Catalog> listContacts = new ArrayList<>();

        for (Catalog c : arrayContacts) {
            listContacts.add(c);
        }
//        System.out.println(listContacts);

        Map<String, Long> mapContacts = new HashMap<>();

        for (Catalog c: arrayContacts) {
            mapContacts.put(c.getSurname(), c.getTelephoneNumber());
        }



        System.out.println(mapContacts);


    }
}
