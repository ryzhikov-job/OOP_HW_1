package VetClinic.Animal;

import VetClinic.Animal.AnimalInterface.Swimable;
import VetClinic.Clients.Owner;

import java.time.LocalDate;

public class Snake extends Animal implements Swimable {
    public Snake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double swim() {
        return 2;
    }
}
