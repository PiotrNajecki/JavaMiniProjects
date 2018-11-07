/**
 * Created by TOSHIBA-L775 on 2018-02-08.
 */

import java.util.Scanner;

/**
 * Created by TOSHIBA-L775 on 2018-02-08.
 */
public class KolkoiKrzyzyk {

    //private int pojemnosc;
    private char[][] tablica;
    private boolean stanTablicy = false;


    public static void main(String[] args) {

        KolkoiKrzyzyk gra = new KolkoiKrzyzyk();
        gra.generacjaTablicy();
        System.out.println("Rozpoczecie gry:");
        gra.wydrukTablicy(gra.tablica);


        while (gra.stanTablicy == false) {
            gra.wpisywanieDoTablicy(gra.tablica);
            gra.stanTablicy = gra.sprawdzenieTablicy();
        }
    }


    public void wpisywanieDoTablicy(char[][] tablica) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz numer wiersza");
        int x = scanner.nextInt();
        System.out.println("Wybierz numer kolumny");
        int y = scanner.nextInt();
        System.out.println("Podaj o - dla 0 lub x - dla X");
        String znakString = "ala ma kota";
        char znak = 'a';
        scanner.nextLine();
        znakString = scanner.nextLine();
        znak = znakString.charAt(0);


        tablica[x][y] = znak;
        System.out.println("Stan po wpisaniu:");
        wydrukTablicy(tablica);

    }


    public boolean sprawdzenieWierszy() {
        int sumaX;
        int sumaO;
        for (int i = 0; i < tablica.length; i++) {
            sumaX = 0;
            sumaO = 0;
            for (int j = 0; j < tablica.length; j++) {
                if (tablica[i][j] == 'x') {
                    sumaX++;

                } else if (tablica[i][j] == 'o') {
                    sumaO++;
                }
                if (sumaO == tablica.length) {
                    System.out.println("Wygralo Kółko");
                    return true;
                } else if (sumaX == tablica.length) {
                    System.out.println("Wygral X");
                    return true;
                }
            }
        }
        return false;
    }


    public boolean sprawdzenieTablicy() {
        this.stanTablicy = sprawdzenieKolumn();
        if (sprawdzenieKolumn() == true) {
            return true;
        }
        this.stanTablicy = sprawdzenieWierszy();
        if (sprawdzenieWierszy() == true) {
            return true;
        }
        this.stanTablicy = sprawdzeniePrzekatnych();
        if (sprawdzeniePrzekatnych() == true) {
            return true;
        }

        return false;
    }


    public boolean sprawdzenieKolumn() {
        int sumaX;
        int sumaO;
        for (int i = 0; i < tablica.length; i++) {
            sumaX = 0;
            sumaO = 0;
            for (int j = 0; j < tablica.length; j++) {
                if (tablica[j][i] == 'x') {
                    sumaX++;
                } else if (tablica[i][j] == 'o') {
                    sumaO++;
                }
                if (sumaO == tablica.length) {
                    System.out.println("Wygralo Kółko");
                    return true;
                } else if (sumaX == tablica.length) {
                    System.out.println("Wygral X");
                    return true;
                }
            }


        }
        return false;
    }


    public boolean sprawdzeniePrzekatnych() {
        int sumaXPrzekatna1 = 0;
        int sumaXPrzekatna2 = 0;
        int sumaOPrzekatna1 = 0;
        int sumaOPrzekatna2 = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i][i] == 'x') {
                sumaXPrzekatna1++;
            } else if (tablica[i][i] == 'o') {
                sumaOPrzekatna1++;
            }
            if (tablica[i][tablica.length - i - 1] == 'x') {
                sumaXPrzekatna2++;
            } else if (tablica[i][tablica.length - i - 1] == 'o') {
                sumaOPrzekatna2++;
            }
        }

        if ((sumaOPrzekatna1 == tablica.length) || (sumaOPrzekatna2 == tablica.length)) {
            System.out.println("Wygralo Kółko");
            return true;
        } else if ((sumaXPrzekatna1 == tablica.length) || (sumaXPrzekatna2 == tablica.length)) {
            System.out.println("Wygral X");
            return true;
        }

        return false;
    }


    public void generacjaTablicy() {
        int pojemnosc = 0;
        System.out.println("Okresl rozmiar tablicy:");
        Scanner scanner = new Scanner(System.in);
        pojemnosc = scanner.nextInt();
        //this.pojemnosc = pojemnosc;
        char[][] tablica = new char[pojemnosc][pojemnosc];
        wypelnienieZeramiTablicy(tablica);
        this.tablica = tablica;


    }


    public void wypelnienieZeramiTablicy(char[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++)
                tablica[i][j] = '0';
        }
    }

    public void wydrukTablicy(char[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.println();
            for (int j = 0; j < tablica.length; j++)
                System.out.print(tablica[i][j] + " ");
        }

        System.out.println();
    }

}

