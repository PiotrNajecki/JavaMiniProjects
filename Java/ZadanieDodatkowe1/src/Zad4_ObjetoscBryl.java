

/**
 * Created by TOSHIBA-L775 on 2017-12-16.
 */
// * Treść zadania:
// * Proszę napisać program obliczający objętości następujących brył: kula, stożek, walec, sześcian.
//   Program powinien wyświetlić menu pozwalające wybrać figurę, a następnie powinien pozwolić użytkownikowi podać potrzebne dane
//   i wyświetlić wynik obliczenia.
import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;

public class Zad4_ObjetoscBryl {
    public static void main(String[] args) {
        Scanner keyboardListener = new Scanner(System.in);
        String wyborString;
        char wybor = 't';
        while (wybor != 'q') {
            System.out.println("Obliczanie objetosci figur geometrycznych. Wybierz figurę, którą chcesz policzyć:");
            wyborString = keyboardListener.nextLine();
            wybor = wyborString.charAt(0);
            switch (Character.getNumericValue(wybor)) {
                case 20: {
                    System.out.println("Objetosc kuli wynosi: " + kula());
                    break;
                }
                case 28: {
                    System.out.println("Objetosc stozka wynosi: " + stozek());
                    break;
                }
                case 32: {
                    System.out.println("Objetosc stozka wynosi: " + walec());
                    break;
                }
                case 11: {
                    System.out.println("Objetosc stozka wynosi: " + szescian());
                }
                default: {
                    System.out.println("Niepoprawny wybor. Wpisz k dla objetosci kuli, s dla objetosci stozka, w dla objetosci walca, b dla objeotosci szesciany ");
                }
            }

        }
    }

    /// Obliczanie Kuli
    public static double kula() {
        System.out.println("Podaj promien kuli:");
        Scanner keyboardListener = new Scanner(System.in);
        double ballRadius = keyboardListener.nextDouble();
        double objetoscV = 4 / 3 * Math.pow(ballRadius, 3);
        return objetoscV;
    }

    /// Obliczanie Stożka
    public static double stozek() {
        Scanner keyboardListener = new Scanner(System.in);
        System.out.println("Podaj promien podstawy stozka:");
        double coneRadius = keyboardListener.nextDouble();
        System.out.println("Podaj wysokosc stozka:");
        double coneHeight = keyboardListener.nextDouble();
        double objetoscV = 1 / 3 * Math.PI * Math.pow(coneRadius, 2) * coneHeight;
        return objetoscV;

    }

    /// Obliczanie Walec
    public static double walec() {
        Scanner keybordListener = new Scanner(System.in);
        System.out.println("Podaj promien podstawy stozka:");
        double cylinderRadius = keybordListener.nextDouble();
        System.out.println("Podaj wysokosc stozka:");
        double cylinderHeight = keybordListener.nextDouble();
        double objetoscV = Math.PI * Math.pow(cylinderRadius, 2) * cylinderHeight;
        return objetoscV;


    }

    /// Obliczanie Szcześcianu
    public static double szescian() {
        Scanner keybordListener = new Scanner(System.in);
        System.out.println("Podaj bok szescianu:");
        double cubeHeight = keybordListener.nextDouble();
        double objetoscV = Math.pow(cubeHeight, 3);
        return objetoscV;

    }
}
