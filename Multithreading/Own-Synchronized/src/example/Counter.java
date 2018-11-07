package example;

public class Counter {
    int count = 0;

    public int add(int value) {
        this.count += value;
        System.out.println(this.count);
        return this.count;
    }
}
