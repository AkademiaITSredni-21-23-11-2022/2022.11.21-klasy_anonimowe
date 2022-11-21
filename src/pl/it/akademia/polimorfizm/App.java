package pl.it.akademia.polimorfizm;

import pl.it.akademia.interfejsy.MathConstants;
import pl.it.akademia.klasy.anonimowe.Car;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Pet pet = new Pet();

        dog.szczekaj();
        dog.oddychaj();

        pet.oddychaj();

        Pet pies = new Dog();
        //Dog zwierze = new Pet();
        //Dog kot = new Cat();

        List<Pet> zwierzeta = new ArrayList<>();
        zwierzeta.add(new Dog());
        zwierzeta.add(new Cat());

        pies.oddychaj();
        if(pies instanceof Dog) {
            Dog d = (Dog) pies;
            d.oddychaj();
            d.szczekaj();
        }

        final int a = 5;
        //a = 6;
        final Car car = new Car();

        //a = 7;
        //car = new Car();
        car.brand = "BMW";

        car.brand = "Audi";

        final Integer b = 7;
    }
}
