package pl.it.akademia.klasy.anonimowe;

import java.util.Comparator;

public class PorownywaczSamochodowPoMarce implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.brand.compareTo(o2.brand);
    }
}
