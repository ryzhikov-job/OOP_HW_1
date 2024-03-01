package VetClinic.Animal;

import VetClinic.Animal.AnimalInterface.Flyable;
import VetClinic.Animal.AnimalInterface.Goable;
import VetClinic.Animal.AnimalInterface.Swimable;
import VetClinic.Clients.Owner;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Goable, Swimable {
    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double fly() {
        return 10;
    }

    @Override
    public double run() {
        return 1;
    }

    @Override
    public double swim() {
        return 3;
    }
}
