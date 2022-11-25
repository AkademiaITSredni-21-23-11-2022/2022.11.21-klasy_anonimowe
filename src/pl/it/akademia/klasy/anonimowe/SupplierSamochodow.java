package pl.it.akademia.klasy.anonimowe;

import java.util.function.Supplier;

public class SupplierSamochodow implements Supplier<Car> {
    @Override
    public Car get() {
        if("Europa".equals("Europa")) {
            return new Car("Toyota", "default", 0);
        } else {
            return new Car("default", "default", 0);
        }
    }
}
