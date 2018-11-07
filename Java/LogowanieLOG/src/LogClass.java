
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by TOSHIBA-L775 on 2018-02-15.
 */
public class LogClass {

    private static volatile LogClass obiektLogClass;

    public LogClass() {
    }

    private LogClass(Level level, String msg) {
        try {
            LOG(level, msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static LogClass getObiektLogClass() {
        if (obiektLogClass == null) {
            obiektLogClass = new LogClass();
        }
        return obiektLogClass;
    }


    public static void main(String[] args) {
        try {
            LogClass NowyObiekt = new LogClass(Level.Error, "Nowa Wiadomosc");
            NowyObiekt.LOG(Level.Error, "Jest źle");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void LOG(Level level, String msg) throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter("log.txt");
        Date dzis = new Date();

        if (level == Level.Error) {
            zapis.println("Data: " + dzis + "Typ zwracanego błędu: " + level + "Wiadomość: " + msg);
            zapis.close();
        }

        if (level == Level.Info) {
            zapis.println("Data: " + dzis + "Typ zwracanego błędu: " + level + "Wiadomość: " + msg);
            zapis.close();
        }
    }
}
