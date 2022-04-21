public class Slowa {
    public void liczZnakiSlowa(String data) {

    }
    public int liczBialeZnaki(String data) {
        int licznik = 0;
        for(int x = 0; x < data.length(); x++) {
            if (data.charAt(x) == '\t') {
                licznik++;
                continue;
            }
            if (data.charAt(x) == ' ') {
                licznik++;
                continue;
            }
            if (data.charAt(x) == '\n') {
                licznik++;
                continue;
            }
        }
        return licznik;
    }
    public int liczSlowa(String data) {
        int licznik = 0;
        if(data.charAt(0) != ' ') {
            licznik++;
            for (int x = 0; x < data.length(); x++) {
                if (data.charAt(x) == ' ') {
                    licznik++;
                }
            }
        }
        return licznik;
    }
}
