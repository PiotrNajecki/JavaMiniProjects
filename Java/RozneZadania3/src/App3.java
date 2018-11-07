/**
 * Created by TOSHIBA-L775 on 2017-10-13.
 */
class Frog {
    private String name;
    private int age;


    public String setName(String name) {
        return this.name = name;
    }

    public int setAge(int age) {
        return this.age = age;

    }


    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class App3 {
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.setInfo("Bertie", 23);
        System.out.println(frog.getName());
        System.out.println(frog.getAge());

    }


}
