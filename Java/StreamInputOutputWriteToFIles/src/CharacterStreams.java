import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by TOSHIBA-L775 on 2018-01-21.
 */


/*
CharacterStrams
odczyt.zapis znaków
klasy bazowe dla strumieni znaków: java.io.Reader
public abstract void close() throws IOException
public abstract in tead(char[] cbuf, int off, int len) throws IOException
czyta maks długość znaków, zapisuje jet do zmiennej cbuf, zaczynając od indeksu off
zwraca ilość przeczytancyh znaków
jesli nie ma wiecej znaków do odczytu to zwraca -1
metoda blokuje wykonywanie programu dopóki nie ma danych do odczytania lub nie wykryje końca strumienia

java.io.Reader

java.io.OutputStream
public abstract void close() throws IOException
public abstract void flush() throws IOException
public abstract void write (char[] cbuf, int off, int len) throws IOException

zapisuje len znaków z cbuf, począwszy od indesku off

 */


public class CharacterStreams  {

    public static void main(String[] args) throws IOException {



   FileReader inputStream = null;
   FileWriter outputStream = null;
   char[] cbuf = new char[10];

   try {
       inputStream = new FileReader("input.txt");
       outputStream = new FileWriter("output.txt");
       int c;

       while ((c=inputStream.read(cbuf, 0, cbuf.length)) !=-1) {
           outputStream.write(cbuf, 0, c);

       }

    } finally {
       if (inputStream !=null) {
           inputStream.close();
       }
       if (outputStream !=null) {
           outputStream.close();
       }

    }


    }




}
