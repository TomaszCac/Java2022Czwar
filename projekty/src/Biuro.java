public class Biuro {
    static int najnizszaKrajowa = 20;

    public Biuro(int liczbaPracownikow) {
        this.liczbaPracownikow = liczbaPracownikow;
    }

    static void koniecPracy() {
        System.out.println("koniec pracy!");
    }
    int liczbaPracownikow;

}
