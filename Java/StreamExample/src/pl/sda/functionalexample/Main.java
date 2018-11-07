package pl.sda.functionalexample;

/**
 * Created by TOSHIBA-L775 on 2018-02-21.
 */
public class Main {

    public static void main(String[] str) {
        Computable adder = (a, b) -> a + b;
        int result = adder.compute(15, 20);
        System.out.println("Result: " + result);

        ////////////---------------------------------------------------------

        Computable adder2 = new Adder();
        int result2 = adder2.compute(15, 20);
        System.out.println("Result2: " + result2);

        ////////////---------------------------------------------------------

        Computable substractor = (a, b) -> a - b;
        int result3 = substractor.compute(15, 20);
        System.out.println("Result 3: " + result3);

        ////////////---------------------------------------------------------
        // KLASA ANONIMOWA

        Computable power = new Computable() {
            @Override
            public int compute(int a, int b) {
                if (b == 0) {
                    return 1;
                }
                int result = 1;
                for (int i = 0; i < b; i++) {
                    result = result * a;
                }
                return result;
            }
        };
        System.out.println("Rezultat potegowania: " + power.compute(2, 1));


        Computable powerLambda = (a, b) -> {
            if (b == 0) {
                return 1;
            }

            int resultPower = 1;
            for (int i = 0; i < b; i++) {
                resultPower = resultPower * a;
            }
            return resultPower;
        };
    }
}
