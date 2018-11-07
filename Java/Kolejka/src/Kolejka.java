/**
 * Created by TOSHIBA-L775 on 2018-01-26.
 */
public class Kolejka {
    private int pojemnosc;
    private int[] data;
    private int rozmiar;
    private int indekspop;
    private int indekspush;

    public static void main(String[] args) {

        Kolejka kolejka = new Kolejka(10);
        kolejka.push(1);
        kolejka.push(2);
        kolejka.push(5);
        System.out.println(kolejka.getrozmiar());
        try {
            System.out.println(kolejka.pop());

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(kolejka.indekspop);
        kolejka.printKolejka();
    }

    public Kolejka(int pojemnosc) {
        rozmiar = 0;
        indekspop = 0;
        indekspush = 0;
        this.pojemnosc = pojemnosc;
        data = new int[pojemnosc];
    }

    public void push(int liczba) {

        if (rozmiar < pojemnosc) {
            data[rozmiar++] = liczba;
        }

    }

    // wyciaga element z kolejki

    public int pop() throws IllegalAccessException {
        indekspop = 0;
        if (indekspop < pojemnosc) {
            return data[indekspop++];
        } else if (indekspop > pojemnosc) {
            indekspop = 0;
            return data[indekspop++];
        }
        throw new IllegalAccessException("nie ma elementów");
    }

    // zwraca aktualny rozmiar

    public int getrozmiar() {
        return rozmiar;
    }

    public void printKolejka() {
        for (int i = indekspop; i < rozmiar; i++) {
            System.out.println(data[i]);
        }
    }
}