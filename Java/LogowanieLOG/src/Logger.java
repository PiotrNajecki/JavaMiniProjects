import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
/**
 * Created by TOSHIBA-L775 on 2018-02-15.
 */
public class Logger {

    PrintWriter printWriter;

    Logger() {
        try {
            PrintWriter printWriter = new PrintWriter("log.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void LOG(Level level, String msg) {
        printWriter.println(LocalDateTime.now()+ " "+level+" "+msg);
        printWriter.flush();

    }
}

