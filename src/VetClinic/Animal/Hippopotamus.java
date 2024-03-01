package VetClinic.Animal;

import VetClinic.Animal.AnimalInterface.Goable;
import VetClinic.Animal.AnimalInterface.Swimable;
import VetClinic.Clients.Owner;

import java.time.LocalDate;

public class Hippopotamus extends Animal implements Goable, Swimable {
    public Hippopotamus(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double run() {
        return 4;
    }

    @Override
    public double swim() {
        return 2;
    }
}
