/**
 * Created by TOSHIBA-L775 on 2017-12-13.
 */

public class zad2 {

    public static void main(String args[]) {
        int minuta = 45;
        int godzina = 18;
        int rok = 2017;
        int miesiac = 12;
        int dzien = 13;
        System.out.println("Czas: " + godzina + ":" + minuta + " " + dzien + "." + miesiac + "." + rok);
        int minuty = (godzina * 60) + minuta;
        System.out.println("Ilosc minut od polnocy: " + minuty);
        float procentDoby = 100 * minuty / 1440;
        System.out.println("Procent Doby: " + procentDoby);
        int sekundy = (60 * 60 * 24) - (minuty * 60);
        System.out.println(sekundy);
    }
}
