package pl.sda.functionalexample;

/**
 * Created by TOSHIBA-L775 on 2018-02-21.
 */
public class StringPerformerMain {
    public static void main(String[] args) {

        StringForFormer toUpperCaseForFormer = (a) -> {
            return a.toUpperCase();
        };
        System.out.println(toUpperCaseForFormer.perform("ala ma konta"));

        StringForFormer toReverse = (a) -> {
            char[] chars = a.toCharArray();
            String result = "";
            for (int i = 0; i < chars.length; i++) {
                result = result + chars[chars.length - 1 - i];

            }
            return result;

        };
        System.out.println(toReverse.perform("ala ma kota"));
    }
}
