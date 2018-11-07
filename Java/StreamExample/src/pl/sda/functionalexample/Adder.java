package pl.sda.functionalexample;

/**
 * Created by TOSHIBA-L775 on 2018-02-21.
 */
public class Adder implements Computable {

    @Override
    public int compute(int a, int b) {
        return a+b;
    }
}
