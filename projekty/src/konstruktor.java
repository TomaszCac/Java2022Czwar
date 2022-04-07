import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

//public class konstruktor {
  //  public static void main(String[] args) throws FileNotFoundException {
   //     PrintWriter konstruktor = new PrintWriter("ala.txt");
   //     konstruktor.println("Ala ma kota, a kot ma Alę");
    //    konstruktor.close();
  //  }
//}

public class Odczyt {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner odczyt = new Scanner(new File("ala.txt"));
        String text = odczyt.nextLine();

        File file = new File("ala.txt");
       Scanner in = new Scanner(file);

        String zdanie = in.nextLine();
        System.out.println(zdanie);
    }
}
