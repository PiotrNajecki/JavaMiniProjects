package Client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
Następnie utwórz listę obiektów typu Client, dodaj kilku klientów i wykonaj zadania wykorzystując streamy oraz podejście tradycyjne (pętle):
1. Wyświetl klienta z danym numerem pesel. (Wykorzystaj metodę findFirst)
2. Wyświetl klientów, którzy urodzili się w danym roku. (należy sparsować odpowiednio pesel)
3. Wyświetl klientów, którzy mieszkają na danej ulicy i pod danym numerem domu.
4. Wyświetl klientów posortowanych po nazwie miasta od A do Z.
5. Wyświetl wszystkie konta klienta. (Wykorzystaj flatMap)
6. Wyświetl tych klientów, którzy mają stan konta większy niż 1000. (Na obojętnie którym koncie)
7. Wyświetl klienta, który jest posiadaczem konta o podanym numerze.
8. Wyświetl konta klienta o danym numerze pesel, których stan jest między zadanym przedziałem



 */
public class ClientMain {
    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();
        Account konto1 = new Account(1000, 456.03);
        Account konto2 = new Account(1001, 1980.56);
        Account konto3 = new Account(1654, 0.99);
        Account konto4 = new Account(1656, 1000009.1);
        Account konto5 = new Account(1722, 10111.6);
        Account konto6 = new Account(1731, 0);
        Account konto7 = new Account(1900, 555.66);
        Account konto8 = new Account(1901, 2356.78);
        Account konto9 = new Account(2234, 1004.56);
        Account konto10 = new Account(1235, 1006.09);
        accountList.add(konto1);
        accountList.add(konto2);
        accountList.add(konto3);
        accountList.add(konto4);
        accountList.add(konto5);
        accountList.add(konto6);
        accountList.add(konto7);
        accountList.add(konto8);
        accountList.add(konto9);
        accountList.add(konto10);


        List<Client> listaKlientow = new ArrayList<>();

        Client klient1 = new Client("Jacek", "Wiejski", "86043021314", "Samsonowicza", "61/19", "Warszawa", accountList.subList(0,2));
        Client klient2 = new Client("Dorota", "Miejscka", "90053028917", "Karska", "20/33", "Lublin", accountList.subList(2,4));
        Client klient3 = new Client("Maciek", "Robot", "74041128919", "Dowcip", "87/45", "Opole", accountList.subList(4,6));
        Client klient4 = new Client("Orfeusz", "Java", "69011728000", "Jaskolcza", "90/90", "Poznan", accountList.subList(6,8));
        Client klient5 = new Client("Piotr", "Sikorski", "57024988034", "Olecka", "5", "Gdynia", accountList.subList(8,10));
        listaKlientow.add(klient1);
        listaKlientow.add(klient2);
        listaKlientow.add(klient3);
        listaKlientow.add(klient4);
        listaKlientow.add(klient5);


//------- 1. Wyświetl klienta z danym numerem pesel. (Wykorzystaj metodę findFirst)
        System.out.println("Zadanie 1");
        Optional<Client> klient = listaKlientow.stream().
                filter(e -> (e.getPesel()=="74041128919"))
                .findFirst();

        if (klient.isPresent()) {
            System.out.println("Klient z tym Peselem to: " + klient.toString().substring(9, klient.toString().length()-2));
        }


//------- 2. Wyświetl klientów, którzy urodzili się w danym roku. (należy sparsować odpowiednio pesel)
        System.out.println("\nZadanie 2:");
        List<String> kolekcja2 = listaKlientow.stream()
                .filter(e -> (e.getPesel().substring(0,2)).equals("69"))
                .map(e -> e.getName() + " "+ e.getSurname())
                .collect(Collectors.toList());

        kolekcja2.forEach(System.out::println);


//------- 3. Wyświetl klientów, którzy mieszkają na danej ulicy i pod danym numerem domu.
        System.out.println("\nZadanie 3");
        List<String> kolekcja3 = listaKlientow.stream()
                .filter(e -> ((e.getStreet().equals("Olecka")) && (e.getStreetNumber().equals("5"))))
                .map(e -> e.getName() + " "+ e.getSurname())
                .collect(Collectors.toList());
                kolekcja3.forEach(System.out::println);


//------- 4. Wyświetl klientów posortowanych po nazwie miasta od A do Z.
        System.out.println("\nZadanie 4");
        listaKlientow.stream()
                .sorted(Comparator.comparing(e -> e.getCity()))
                .map(e -> e.getCity())
                .collect(Collectors.toList())
                .forEach(System.out::println);


//------- 5. Wyświetl wszystkie konta klienta. (Wykorzystaj flatMap)
        System.out.println("\nZadanie 5");
        listaKlientow.stream()
                .map(e -> e.getName()+ " " + e.getSurname() + ": "+e.getListaKont())
                .forEach(System.out::println);


//------- 6. Wyświetl tych klientów, którzy mają stan konta większy niż 1000. (Na obojętnie którym koncie)
        System.out.println("\nZadanie 6");
        listaKlientow.stream()
                .map(e -> e.getListaKont())
                .flatMap(b -> b.stream())
                .filter(a -> a.getBalance()>1000)
                .map(c -> c)
                .forEach(System.out::println);

//------- 7. Wyświetl klienta, który jest posiadaczem konta o podanym numerze.
        System.out.println("\nZadanie 7");
        listaKlientow.stream()
                .map(e -> e.getListaKont())
                .flatMap(b -> b.stream())
                .filter(a -> a.getBalance()>1000)
                .forEach(System.out::println);

        //------- 8. Wyświetl konta klienta o danym numerze pesel, których stan jest między zadanym przedziałem
        System.out.println("\nZadanie 8");
        listaKlientow.stream()
                .map(e -> e.getListaKont())
                .flatMap(b -> b.stream())
                .filter(a -> a.getBalance()>1000)
                .map(c -> c)
                .forEach(System.out::println);

    }

}
