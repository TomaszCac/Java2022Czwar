public class Szkola {
    public Szkola(int liczbaLawek, int liczbaUczniow) {
        this.liczbaLawek = liczbaLawek;
        this.liczbaUczniow = liczbaUczniow;
    }
    static int czasLekcji = 60;
    static void koniecLekcji() {
        System.out.println("Koniec Lekcji");
    }
    int liczbaLawek;
    int liczbaUczniow;
}
