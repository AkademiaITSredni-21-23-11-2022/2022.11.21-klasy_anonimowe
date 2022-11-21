package pl.it.akademia.klasy.anonimowe;

import java.util.Comparator;

public class PorownywaczSamochodowPoCenie implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.price - o2.price == 0 ? o1.brand.compareTo(o2.brand) : o1.price - o2.price;
    }
}
