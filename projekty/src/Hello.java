import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import java.util.*;

class Hello {
    public static void main(String[] args) {
        zadanie5();


    }
    public static void zadanie1()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ciag:");
        String ciag = scan.nextLine();
        if(!ciag.equals(""))
        {
            char znak = (ciag.charAt(ciag.length()-1));
            int licznik = 0;
            for(int x = 0; x < ciag.length(); x++)
            {
                if(ciag.charAt(x) == znak)
                {
                    licznik++;
                }
            }
            System.out.println(ciag);
            System.out.println("Ciag ma: " + licznik);
        }
        else
        {
            System.out.println("Ciag jest pusty!");
        }
    }
    public static void zadanie2() {

            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj ciag:");
            String ciag = scan.nextLine();
        if(!ciag.equals("")) {
            StringBuilder wynik = new StringBuilder(ciag);
            wynik.reverse();
            System.out.println(wynik);
        }
        else
        {
            System.out.println("Ciag jest pusty!");
        }
    }
    public static void zadanie3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ciag:");
        StringBuilder ciag = new StringBuilder(scan.nextLine());
        int y = ciag.length()-1;
        boolean test = true;
        for(int x = 0;x <= y; x++ )
        {
            if(ciag.charAt(x) != ciag.charAt(y)){
                test = false;
                break;
            }
            y--;
        }
        if(test) {
            System.out.println(ciag + " to palindrom!");
        }
        else
        {
            System.out.println(ciag + " to nie jest palindrom!");
        }


    }
    public static void zadanie4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ciag: ");
        StringBuilder ciag = new StringBuilder(scan.nextLine());

        int wynik = 0;
        for(int x = 0; x <= ciag.length()-1; x++)
        {
            if(Character.isDigit((ciag.charAt(x))))
            {
                wynik = wynik + Integer.parseInt(Character.toString(ciag.charAt(x)));
            }

        }
        System.out.println(wynik);
    }
    public static void zadanie5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyrazenie: ");
        StringBuilder ciag = new StringBuilder(scan.nextLine());
        int variablea = 0;
        int variableb = 0;
        for(int x = 0; x <= ciag.length()-1; x++)
        {
            if(ciag.charAt(x) == '(')
            {
                variablea++;
            }
            if(ciag.charAt(x) == ')')
            {
                variableb++;
            }
        }
        if(variablea == variableb)
        {
            System.out.println("OK");
        }
        else
        {
            System.out.println("Bledne sparowanie nawiasow");
        }
    }
}
