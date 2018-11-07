/**
 * Created by TOSHIBA-L775 on 2017-10-14.
 */

class Thing {
    public String name;
    public static String description;
    public int id;
    public final static int LUCKY_NUMBER = 3;

    public void showName() {
        System.out.println(name);
    }

    public void showInfo() {
        System.out.println("Object id "+id+" "+description);

    }

    public static int count = 0;


    public Thing() {
        id=count;
        count++;
    }

}

public class StaicVariables {
    public static void main(String[] args) {

        System.out.println("Before creatind objects, count is: " +Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        Thing.description = "I am the thing";

        thing1.description = "cos tam";

        thing1.showInfo();
        thing2.showInfo();

        System.out.println(Thing.description);

        thing1.name = "Bob";
        thing2.name = "Sue";

        thing1.showName();
        thing2.showName();

        System.out.println(thing1.name);
        System.out.println(thing2.name);

        System.out.println(Math.PI);

        System.out.println("After creatind objects, count is: " +Thing.count);
    }
}
