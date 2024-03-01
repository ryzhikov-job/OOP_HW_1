package VetClinic.Animal;

import VetClinic.Animal.AnimalInterface.Flyable;
import VetClinic.Clients.Owner;

import java.time.LocalDate;

public class Hummingbird extends Animal implements Flyable {
    public Hummingbird(String name, double weight, LocalDate age, Owner owner) {
        super(name, (float) weight, age, owner);
    }

    @Override
    public double fly() {
        return 5;
    }
}
