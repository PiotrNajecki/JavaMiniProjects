/**
 * Created by TOSHIBA-L775 on 2018-01-26.
 */
public class Stack {

    private int pojemnosc;
    private int[] data;
    private int rozmiar;

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(5);
        System.out.println(stack.getrozmiar());
        System.out.println(stack.pop());
        stack.printstack();
        stack.printstack();
    }

    public Stack(int pojemnosc) {
        rozmiar = 0;
        this.pojemnosc = pojemnosc;
        data = new int[pojemnosc];
    }

    public void push(int liczba) {
        if (rozmiar < pojemnosc) {
            data[rozmiar++] = liczba;
        }
    }

    // wyciaga element ze stosu i usuwa go z tablicy
    public int pop() {
        return data[--rozmiar];
    }

    // zwraca aktualny rozmiar
    public int getrozmiar() {
        return rozmiar;
    }

    public void printstack() {
        for (int i = 1; i <= rozmiar; i++) {
            System.out.println(data[rozmiar - i]);
        }
    }
}
