package pl.sda.pl.sda.beverage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by TOSHIBA-L775 on 2018-02-22.
 */
public class BeverageMain {

    static List<Beverage> list = new ArrayList<>();

    static LocalDate date = LocalDate.now();

    static {
        list.add(new Beverage(3.3, 1.0, "Pepsi", date.plusMonths(3), BeverageType.GAS));
        list.add(new Beverage(2.0, 0.33, "Fanta", date.plusMonths(4), BeverageType.GAS));
        list.add(new Beverage(4.6, 2.5, "Mirinda", date.minusDays(10), BeverageType.GAS));
        list.add(new Beverage(3.2, 1.5, "Coca cola", date.minusDays(100), BeverageType.GAS));
        list.add(new Beverage(5.2, 2.25, "Ustronianka", date.plusDays(10), BeverageType.NO_GAS));
        list.add(new Beverage(4.1, 0.25, "Tiger", date.plusWeeks(10), BeverageType.GAS));
    }


    public void printBeveragesWithExpiredDate() {
        list.stream()
                .filter(b -> b.getExpireDate().isBefore(LocalDate.now()))
                .forEach(System.out::println);

    }

    public void printNameandPrice() {
        list.stream()
                .map(e -> e.getName() + ": " + e.getPrice())
                .forEach(e -> System.out.println(e));
    }

    public void filtrCeny(double cenaPoczatkowa, double cenaKoncowa) {
        list.stream()
                .filter(b -> ((b.getPrice() > cenaPoczatkowa) && (b.getPrice() < cenaKoncowa)))
                .sorted((a, b) -> (int) ((b.getPrice() * 100) - (a.getPrice() * 100)))
                .map(e -> e.getName() + ": " + e.getPrice())

                .forEach(System.out::println);
    }


    public static void typBeverage(BeverageType e) {
        list.stream()
                .filter(b -> b.getBeverageType() == e)
                .forEach(System.out::println);
    }


    public static void NazwaNapojuzNajwiekszaPojemnoscia() {
        list.stream()
                .max(Comparator.comparing(Beverage::getCapacity))
                //.map(Beverage::getName)
                .map(b -> b.getName())
                .ifPresent(System.out::println);
    }

    public static void StosunekCenydoPojemnosci() {
        list.stream()
                .min(Comparator.comparing(b -> b.getPrice() / b.getCapacity()))
                //.map(Beverage::getName)
                .map(b -> b.getName())
                .ifPresent(System.out::println);
    }

    public static void main(String[] args) {

        BeverageMain g = new BeverageMain();
        g.printNameandPrice();
        System.out.println();
        g.filtrCeny(4, 20);
        System.out.println();
        typBeverage(BeverageType.GAS);
        System.out.println();
        NazwaNapojuzNajwiekszaPojemnoscia();
        System.out.println();
        StosunekCenydoPojemnosci();

    }
}
