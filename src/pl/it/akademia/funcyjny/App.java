package pl.it.akademia.funcyjny;

import pl.it.akademia.klasy.anonimowe.Car;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> function = parametr -> parametr + " taka liczba";

        String wynik = function.apply(5);
        System.out.println(wynik);

        metoda(3, 5, "abc", function);

        Function<Integer, String> function2 = x -> "to jest liczba: " + x;

        metoda(3, 5, "abc", function2);

        BiFunction<Integer, Double, String> biFunction = (i, d) -> i + d + " - wynik";

        System.out.println(biFunction.apply(4, 6.6));

        UnaryOperator<Double> unaryOperator = d -> d * 7;

        System.out.println(unaryOperator.apply(5.3));

        Predicate<String> predicate = s -> {
            if(s.contains("xy")) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println(predicate.test("abc"));
        System.out.println(predicate.test("xyz"));

        //final String rynek = "Europa";

        Supplier<Car> supplier = () -> new Car("default", "default", 0);

        /*Supplier <Car> supplier2 = new Supplier<Car>() {
            @Override
            public Car get() {
                if(rynek.equals("Europa")) {
                    return new Car("Toyota", "default", 0);
                } else {
                    return new Car("default", "default", 0);
                }
            }
        };*/

        /*System.out.println(supplier.get());
        System.out.println(supplier.get());*/

        Consumer<Car> consumer = System.out::println;

        consumer.accept(supplier.get());
        consumer.accept(new Car("Toyota", "Corolla", 1000));

        BiFunction<Integer, Integer, Integer> suma = Integer::sum;

        Function<Car, String> model = Car::getModel;
    }

    public String function(Integer a) {
        return a + " taka liclzba";
    }

    public static void metoda(int a, int b, String cos, Function<Integer, String> f) {
        String w1 = f.apply(a);
        String w2 = f.apply(b);
        System.out.println(cos + " " + w1 + " " + w2);
    }
}
