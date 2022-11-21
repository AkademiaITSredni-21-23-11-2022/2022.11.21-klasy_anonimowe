package pl.it.akademia.interfejsy.przyklad;

public abstract class Algorytm {

    public void start() {
        wczytajDane();
        krokPierwszyLiczenia();
        krokDrugiLiczenia();
        krokTrzeciLiczenia();
        zapiszDane();
    }

    public abstract void wczytajDane();

    private void krokPierwszyLiczenia() {
        System.out.println("Krok pierweszy");
    }

    private void krokDrugiLiczenia() {
        System.out.println("Krok drugi");
    }

    private void krokTrzeciLiczenia() {
        System.out.println("Krok trzeci");
    }

    public abstract void zapiszDane();
}
