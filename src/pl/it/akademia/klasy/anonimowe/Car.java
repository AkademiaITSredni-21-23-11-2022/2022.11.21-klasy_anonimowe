package pl.it.akademia.klasy.anonimowe;

public class Car {
    public String brand;
    String model;
    int price;

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        String s = "ABC";
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    /*@Override
    public int compareTo(Car o) {
        if() {

        }
        return -this.brand.compareTo(o.brand);
    }*/
}
