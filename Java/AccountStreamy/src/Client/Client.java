package Client;

import java.util.List;

/*
Stwórz klasę Client, która będzie zawierać pola:
name, surname, pesel, street, streetNumber, city, List<Account> (lista kont bankowych).
Dodaj konstruktor ustawiający pola, gettery, settery, equals i hashcode, toString.
*/

public class Client {

    private String name;
    private String surname;
    private String pesel;
    private String street;
    private String streetNumber;
    private String city;
    private List<Account> listaKont;

    public Client(String name, String surname, String pesel, String street, String streetNumber, String city, List<Account> listaKont) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.listaKont = listaKont;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Account> getListaKont() {
        return listaKont;
    }

    public void setListaKont(List<Account> listaKont) {
        this.listaKont = listaKont;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (!getName().equals(client.getName())) return false;
        if (!getSurname().equals(client.getSurname())) return false;
        if (!getPesel().equals(client.getPesel())) return false;
        if (!getStreet().equals(client.getStreet())) return false;
        if (!getStreetNumber().equals(client.getStreetNumber())) return false;
        if (!getCity().equals(client.getCity())) return false;
        return getListaKont().equals(client.getListaKont());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getSurname().hashCode();
        result = 31 * result + getPesel().hashCode();
        result = 31 * result + getStreet().hashCode();
        result = 31 * result + getStreetNumber().hashCode();
        result = 31 * result + getCity().hashCode();
        result = 31 * result + getListaKont().hashCode();
        return result;
    }



    @Override
    public String toString() {
        return "Tym klientem jest Pan/Pani: " +
                name + ' ' + surname + " o PESELu: " +
                pesel + " mieszkajaca w mieście: "+ city+ " przy ulicy: "
                + street + " " + streetNumber;
    }
}

