/**
 * Created by TOSHIBA-L775 on 2017-10-13.
 */

class Machine {
    private String name;
    private int code;


    public Machine() {
        this("Ola", 31);
        System.out.println("Constructor running!");
         name = "Arnie";
    }

    public Machine(String name) {
        System.out.println("Second constructor running "+name);
        this.name=name;
    }

    public Machine(String name, int code) {
        this.name=name;
        this.code=code;
        System.out.println("Wyswietl: "+name+"\n"+code);
    }
}

public class App4 {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        }
}
