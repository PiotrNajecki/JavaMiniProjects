/**
 * Created by TOSHIBA-L775 on 2018-02-02.
 */


//Jaka jest suma 30 pierwszych wartości ciągu Fibonacciego

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println(FibbonacciMethod(14));
        System.out.println(FibbonacciSum(14));
    }


    public static int FibbonacciSum (int n) {
        int suma = 0;
        for (int i=2; i<=(n+1); i++) {
            suma +=FibbonacciMethod(i);
        }
        return suma;
    }




    public static int FibbonacciMethod (int n) {
        if (n>0) {
            if (n == 1) {
                return 1;
            } else {
                return FibbonacciMethod(n - 1) + FibbonacciMethod(n - 2);
            }
        }
       return 0;
    }



}
