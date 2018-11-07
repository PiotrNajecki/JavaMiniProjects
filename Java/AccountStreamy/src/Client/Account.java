package Client;

/**
 * Created by TOSHIBA-L775 on 2018-02-25.
 */

/*
Stwórz klasę Account (reprezentującą konto bankowe), która będzie zawierać pola:
        - accountNumber, balance.
Dodaj konstruktor ustawiający pola, gettery, settery, equals i hashcode, toString.
*/


public class Account {

    private int AccountNumber;
    private double Balance;

    public Account(int accountNumber, double balance) {
        AccountNumber = accountNumber;
        Balance = balance;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccountNumber=" + AccountNumber +
                ", Balance=" + Balance +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (getAccountNumber() != account.getAccountNumber()) return false;
        return getBalance() == account.getBalance();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getAccountNumber();
        temp = Double.doubleToLongBits(getBalance());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
