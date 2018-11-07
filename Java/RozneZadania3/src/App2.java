/**
 * Created by TOSHIBA-L775 on 2017-10-13.
 */
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
    Muzyk muzyk = new Muzyk();
    muzyk.zwrocImieiNazwisko();
    System.out.println("Pozostalo mi do emerytury: "+muzyk.obliczEmeryture(32)+" lat pracy.");
    }
}


class Muzyk{
    String imie;
    String nazwisko;
    int wiek;
    int obliczEmeryture(int wiek) {
        int x=65-wiek;
        return x;
    }


    void zwrocImieiNazwisko() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imię");
        String imie = input.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko = input.nextLine();
        System.out.println("Moje imię to "+imie+", a naziwsko to "+nazwisko);
    }
}