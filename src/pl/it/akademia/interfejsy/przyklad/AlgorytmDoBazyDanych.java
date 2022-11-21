package pl.it.akademia.interfejsy.przyklad;

public class AlgorytmDoBazyDanych extends Algorytm {
    @Override
    public void wczytajDane() {
        System.out.println("wczytuje z bazy");
    }

    @Override
    public void zapiszDane() {
        System.out.println("zapis do bazy");
    }
}
