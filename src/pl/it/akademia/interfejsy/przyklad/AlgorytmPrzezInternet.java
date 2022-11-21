package pl.it.akademia.interfejsy.przyklad;

public class AlgorytmPrzezInternet extends Algorytm {
    @Override
    public void wczytajDane() {
        System.out.println("wczytuje z internetu");
    }

    @Override
    public void zapiszDane() {
        System.out.println("zapisuje do internetu");
    }
}
