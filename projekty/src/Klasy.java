public class Klasy {
    public static void main(String[] args) {
    Szkola.czasLekcji -= 5;
    Biuro.najnizszaKrajowa = 25;
    Biuro biur = new Biuro(14);
    Szkola skol = new Szkola(14,12);
    Biuro.koniecPracy();
    skol.koniecLekcji();
    System.out.println("Liczba pracownikow = " + biur.liczbaPracownikow);
    Test.biuroTest();
    }
}
