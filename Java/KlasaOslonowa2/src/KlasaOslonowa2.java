/**
 * Created by TOSHIBA-L775 on 2017-09-30.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class KlasaOslonowa2 {

    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj cyfrę od 0 do 9");
        String str = br.readLine();
        int liczba = 0;
        if (str.length() == 1 && Character.isDigit(str.charAt(0))) {
            System.out.println("hurra podałeś cyfrę");
        } else {
            System.out.println("podales zle dane");
        }
        Integer intA = 1000;
        Integer intB = 1000;
        System.out.println(intA.equals(intB));
    }
}
