import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by TOSHIBA-L775 on 2018-01-21.
 */
// I/O Input Output
// New I/O  Nowy Input Output
// Stream -Strumien danych, sekwench aodczytywanych/zapisywanych danych

       /* Byte Streams - odczyt/zapis bajtów, klasy bazowe dla strumieni bajtów: java.io.InputStream, java.io.OutputStream
                public abstract int read() throws IOExceprion
                zwraca bajt danych (liczba z przedziału 0-255)

                jeśli nie ma więcej bajtow do odczytu zwraca -1
                metoda blokuje wykonywanie programu dopóki nie odczyta bajta danych lub nie wykryje końca strumienia

                java.io.OuputStream
                public abstract void write(int b) throws IOException
                zapisywanych jest 8 najmniej znaczących bitów b

*/

public class Streams  {
    public static void main(String[] args) throws IOException  {
      FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");
           int c;

            while ((c=in.read()) !=-1) {
                out.write(c); }


            }




      //  catch(IOException e){
        //System.out.println("Wyjatek " + e);
       // }

        finally {
            if (in != null) {
                in.close();
            }

            if (out !=null) {
                out.close();
            }
        }








    }



}
