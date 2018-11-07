/**
 * Created by TOSHIBA-L775 on 2018-02-20.
 */
public class Box {

    private int wysokosc;  // 2 albo 5
    private int szerokosc; // 5 - 10
    private int dlugosc; // 5

    public int getWysokosc() {
        return wysokosc;
    }


    public int getSzerokosc() {
        return szerokosc;
    }


    public Box(int wysokosc, int szerokosc, int dlugosc) {
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
    }


}
