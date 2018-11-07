import java.util.Random;

/**
 * Created by TOSHIBA-L775 on 2018-01-22.
 */
public class Tablice1 {
    public static void main(String[] args) {
        int[] tablica1 = new int[10];
        Random generator = new Random();

        for (int i = 0; i < tablica1.length; i++) {
            tablica1[i] = generator.nextInt(20) - 10;
            System.out.println(tablica1[i] + " ");
        }

        int max = tablica1[0];
        for (int i = 1; i < tablica1.length; i++) {
            if (max < tablica1[i]) {
                max = tablica1[i];
            }
        }

        System.out.println("Najwieksza wartosc wynosi: " + max);

        double suma1 = 0;
        for (int i = 0; i < tablica1.length; i++) {
            suma1 += tablica1[i];
        }

        double sredniaArytmetyczna = suma1 / tablica1.length;
        System.out.println("Srednia arytmetyczna wynosi: " + sredniaArytmetyczna);

        int wiekszeLiczby = 0;
        for (int i = 0; i < tablica1.length; i++) {
            if (sredniaArytmetyczna < tablica1[i]) {
                wiekszeLiczby += 1;
            }
        }
        System.out.println("Ilosc wiekszych Liczb od sredniej arytmetycznej wynosi: " + wiekszeLiczby + "" +
                "\nIlosc mniejszych Liczb od sredniej arytmetycznej wynosi: " + (tablica1.length - wiekszeLiczby));


        for (int i = 0; i < tablica1.length; i++) {
            System.out.println(tablica1[tablica1.length - i - 1] + " ");
        }
    }
}