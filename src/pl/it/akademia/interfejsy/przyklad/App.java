package pl.it.akademia.interfejsy.przyklad;

public class App {
    public static void main(String[] args) {
        Algorytm algorytm = new AlgorytmDoBazyDanych();
        algorytm.start();

        Algorytm algorytm2 = new AlgorytmPrzezInternet();
        algorytm2.start();
    }
}
