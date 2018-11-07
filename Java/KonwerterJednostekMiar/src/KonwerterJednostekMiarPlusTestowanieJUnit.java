/**
 * Created by TOSHIBA-L775 on 2018-01-15.
 */
/*
Zadanie:
Stwórz własny konwerter jednostek różnych miar
(np. kkilogramy/funty, metry/stopy. Celsjusze/Fahrenheity).
Napisz testy jednostkowe weryfikujące poprawność działania Twojego konwertera.

 */


public class KonwerterJednostekMiarPlusTestowanieJUnit {
    private double kilogramy;
    private double metry;
    private double celsjusze;

    public static void main(String[] args) {
        KonwerterJednostekMiarPlusTestowanieJUnit obiekt = new KonwerterJednostekMiarPlusTestowanieJUnit();

        System.out.println("Ilosc funtow: "+obiekt.konwerterKilogramyFunty(33.5));
        System.out.println("Ilosc funtow: "+obiekt.konwerterMetryStopy(20));
        System.out.println("Ilosc funtow: "+obiekt.konwerterCelsjuszFahrenheit(25));

    }

    public double konwerterKilogramyFunty(double kilogramy) {
        this.kilogramy = kilogramy;
        return 2.204*kilogramy;

    }

    private double konwerterMetryStopy (double metry) {
        this.metry = metry;
        return 3.28084*metry;

    }

    private double konwerterCelsjuszFahrenheit (double celsjjuesze) {
        this.celsjusze = celsjjuesze;
        return 33.8*celsjusze;

    }



}
