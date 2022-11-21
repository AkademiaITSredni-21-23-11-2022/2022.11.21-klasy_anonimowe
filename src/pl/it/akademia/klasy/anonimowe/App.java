package pl.it.akademia.klasy.anonimowe;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Janusz");
        stringList.add("Adam");
        stringList.add("Zenon");
        stringList.add("Karol");

        System.out.println(stringList);

        Collections.sort(stringList);

        System.out.println(stringList);



        /*int wynik = User.add(4,7);
        System.out.println(wynik);*/

        /*Car car = new Car("BMW", "3", 1000);

        System.out.println(car.brand);
        System.out.println(car.model);
        System.out.println(car.price);*/


        /*int a = 8;

        if(4 == 6) {
            int a = 5;
            //??
            //??
            //??
        }*/

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "3", 1000));
        cars.add(new Car("Audi", "A5", 1500));
        cars.add(new Car("Toyota", "Corolla", 800));
        cars.add(new Car("Kia", "Ceede", 500));
        //new Car("Kia", "Ceed", "d");

        /*Car car = new Car();
        System.out.println(car.brand);*/
        //System.out.println(car.engine.capacity);

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.brand.compareTo(o2.brand);
            }
        });

        System.out.println(cars);

        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.price - o2.price == 0 ? o1.brand.compareTo(o2.brand) : o1.price - o2.price;
            }
        };
        Collections.sort(cars, comparator);

        System.out.println(cars);

        IBazaDanych bazaDanych = new IBazaDanych() {
            @Override
            public void metoda1() {
                System.out.println("metoda 1 !!");
            }

            @Override
            public void metoda2() {
                System.out.println("metoda 2 !!");
            }
        };

        bazaDanych.metoda1();
        bazaDanych.metoda2();

        Set<Car> set = new HashSet<>();

        Map<String, String> mapa = new HashMap<>();
        mapa.put("KR11", "Audi");
        mapa.put("KR22", "BMW");
        mapa.put("KR33", "Toyota");

        String wartosc = mapa.get("KR22");
        System.out.println(wartosc);

        Map<String, User> users = new HashMap<>();

        User user = users.get("karol");

        List<Integer> liczby = List.of(1,2,3,4,5,6);
        Set<Integer> liczbySet = Set.of(223,234,42,4,23);
    }
}
