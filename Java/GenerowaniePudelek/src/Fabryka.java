import java.util.ArrayList;
import java.util.Random;

/**
 * Created by TOSHIBA-L775 on 2018-02-20.
 */
public class Fabryka {
    public Random random = new Random();


    ArrayList<Box> listaBox = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Generowanie pudełek");
        Fabryka fabryka = new Fabryka();

        int licznik = 0;
        for (int i = 0; i < 100000; i++) {
            int wysokoscGlowna = fabryka.generacjaWysokosc();  //2 lub 5
            int szerokoscGlowna = fabryka.generacjaSzerokosc();  //5-10
            int dlugoscGlowna = fabryka.generacjaDlugosc();  //5
            licznik = fabryka.getBox(wysokoscGlowna, szerokoscGlowna, dlugoscGlowna, licznik);
        }
        System.out.println(licznik);
    }


    public int getBox(int wysokosc, int szerokosc, int dlugosc, int licznik) {

        if ((wysokosc != 5) && (szerokosc != 7)) {
            listaBox.add(new Box(wysokosc, szerokosc, dlugosc));
            return ++licznik;
        }
        return licznik;
    }


    public int generacjaDlugosc() {
        return 5;


    }


    public int generacjaSzerokosc() {
        int szerokosc;
        szerokosc = random.nextInt(6) + 5;
        return szerokosc;

    }


    public int generacjaWysokosc() {
        int wysokoscIndeks;
        int wysokosc = 0;
        wysokoscIndeks = random.nextInt(2);
        if (wysokoscIndeks == 0) {
            wysokosc = 2;
            return wysokosc;
        } else if (wysokoscIndeks == 1) {
            wysokosc = 5;
            return wysokosc;
        }
        return wysokosc;

    }


}
