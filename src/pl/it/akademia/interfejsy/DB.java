package pl.it.akademia.interfejsy;

public class DB implements UmowaNaBazeDanych, Umowa2 {
    @Override
    public void zapiszDane(int a) {
        System.out.println("Zapisuje !!!");
    }

    @Override
    public int wczytajDane() {
        return 5;
    }

    @Override
    public void zupdateujDane(int a) {
        System.out.println("updateuje !!");
    }

    @Override
    public void usunDane(int a) {
        System.out.println("usuwam !!!");
    }

    @Override
    public void a() {

    }
}
