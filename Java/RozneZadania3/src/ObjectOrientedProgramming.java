/**
 * Created by TOSHIBA-L775 on 2017-10-13.
 */
public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Joe";
        person1.wiek = 34;
        person1.nazwisko = "Biggs";
        person1.speak();
        person1.czasdoEmerytury();
        int years = person1.czasdoEmerytury1();

    }



}


class Person {
    String name;
    String nazwisko;
    int wiek;

    void speak() {
        System.out.println("Hello to "+name+" "+nazwisko);

    }
    void sayHello() {
        System.out.println("nie mogę");

    }

    void czasdoEmerytury() {
        int emerytura = 65-wiek;

        System.out.println(emerytura);
    }

    int czasdoEmerytury1() {
        int emerytura = 65-wiek;
        return emerytura;

    }




}