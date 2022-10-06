package HomeWork3.ArrayList.Phonebook;

import java.util.*;

public class Catalog {

    private String surname;

    private long telephoneNumber;

    public Catalog(String surname, long telephoneNumber) {
        this.surname = surname;
        this.telephoneNumber = telephoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "Catalog |" + "surname: " + surname + ",\t" +
                "telephoneNumber: " + telephoneNumber +
                "| \n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalog catalog = (Catalog) o;
        return Double.compare(catalog.telephoneNumber, telephoneNumber) == 0 && Objects.equals(surname, catalog.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, telephoneNumber);
    }


}
