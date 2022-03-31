import java.util.*;
public class zegarTC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] wynik = new int[30];
        int[] ciagSprawdzany = new int[4];
        System.out.println("Podaj 4 cyfry");
        int ciag = scan.nextInt();
        int x, y ,z, e;
        int licznik = 0;
        ciagSprawdzany[0] = (ciag / 1000);
        ciagSprawdzany[1] = (ciag / 100) % 10;
        ciagSprawdzany[2] = (ciag / 10) % 10;
        ciagSprawdzany[3] = ciag % 10;
        for(int d = 0; d < 4; d++)
        {
            if(ciagSprawdzany[d] >= 0 && ciagSprawdzany[d] <= 2)
            {

                for(int g = 0; g< 4; g++)
                {
                    if(g != d) {
                        if(ciagSprawdzany[d] != 2) {

                            for(int h = 0; h < 4; h++){
                                    if(h != d && h != g){
                                       if(ciagSprawdzany[h] >= 0 && ciagSprawdzany[h] <=5){

                                             for(int o = 0; o < 4; o++){
                                                 if(o != h && o != d && o != g){

                                                     wynik[licznik] = (ciagSprawdzany[d]*1000) + (ciagSprawdzany[g]*100) + (ciagSprawdzany[h]*10)+ciagSprawdzany[o];
                                                     licznik++;
                                                 }
                                             }
                                       }
                                }
                            }
                        }
                        else {
                            if(ciagSprawdzany[g] >= 0 && ciagSprawdzany[g] <= 3){

                                for(int h = 0; h < 4; h++){
                                    if(h != d && h != g){
                                        if(ciagSprawdzany[h] >= 0 && ciagSprawdzany[h] <=5){

                                            for(int o = 0; o < 4; o++){
                                                if(o != h && o != d && o != g){

                                                    wynik[licznik] = (ciagSprawdzany[d]*1000) + (ciagSprawdzany[g]*100) + (ciagSprawdzany[h]*10)+ciagSprawdzany[o];
                                                    licznik++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
        int test = 0;
        for (int d: wynik
             ) {
            if(test < d)
            {
                test = d;
            }

        }
        if(test == 0) {
            System.out.println("Nie ma takiej godziny");
        }
        else {
            System.out.println(test);
        }


    }
}
