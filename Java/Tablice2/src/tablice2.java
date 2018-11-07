
import java.util.Random;


/**
 * Created by TOSHIBA-L775 on 2018-01-22.
 */
public class tablice2 {
    public static void main(String[] args) {
        int[] tablica2 = new int[20];
        int[] tablica3 = new int[10];
        Random generator = new Random();

        for (int i = 0; i < tablica2.length; i++) {
            tablica2[i] = generator.nextInt(10)+1 ;
            System.out.print(tablica2[i] + " ");
        }

        for (int i = 0; i < tablica3.length; i++) {
          tablica3[i]=0;
        }

        for (int i = 0; i < tablica2.length; i++) {
            tablica3[tablica2[i]-1]=tablica3[tablica2[i]-1]+1; }

        System.out.println();

        for (int i = 0; i < tablica3.length; i++) {
            if (tablica3[i]!=0) {
            System.out.println((i+1)+" - "+tablica3[i]); }
         }
}
}


