package pl.it.akademia.interfejsy;

public class App {
    public static void main(String[] args) {
        UmowaNaBazeDanych db = new DB();
        int a = db.wczytajDane();
        a = a +4;
        db.zupdateujDane(a);


        db.usunDane(6);

        Abstrakcyjna abstrakcyjna = new DzieckoAbstrakcyjnej();
        abstrakcyjna.jakasAbstrakcyjnaMetoda();
    }
}
