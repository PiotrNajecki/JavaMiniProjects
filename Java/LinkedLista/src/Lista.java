/**
 * Created by TOSHIBA-L775 on 2018-02-01.
 */
public class Lista {

    private Node head;

    public void add(int value) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            head = node;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node;
        }

    }


    public void contains(int value) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.value == value) {
                System.out.println("Podana wartość: " + value + " znajduje sie w łancuchu listy.");
            } else {
                System.out.println("Podana wartosc z lancucha nie znajduje sie w liscie");
            }
            tmp = tmp.next;
        }
    }


    public void remove(int value) {
        Node tmp = head;
        Node prevtmp = tmp;
        // for ( Node node = head; node.next!=null; tmp=tmp.next) { }
        if (head == null) {
            throw new NullPointerException();
        }

        if ((head.value == value) && (head.next == null)) {
            head = null;

        }

        else if (head.value == value) {
             head = tmp.next;
        }

        else {

            while (tmp != null) {
                if (tmp.value == value) {
                    prevtmp.next = tmp.next;

                }

                prevtmp = tmp;
                tmp = tmp.next;

            }

        }
    }


    public void printAll() {
        Node tmp = head;
        // for ( Node node = head; node.next!=null; tmp=tmp.next) { }
        while (tmp.next != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
        System.out.println(tmp.value);
    }


    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.printAll();
        System.out.println();
        lista.remove(20);
        lista.printAll();
        System.out.println();
        lista.remove(10);
        lista.printAll();
        lista.remove(40);
        System.out.println();
        lista.printAll();
    }

}