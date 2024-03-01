package VetClinic.Staff.StaffInterface;

import VetClinic.Animal.Animal;
import VetClinic.Clients.Owner;
import VetClinic.Staff.Workers;

public interface Consult {
    int numberConsultation();
    default String consult(Workers workers, Animal animal, Owner owner){
        System.out.printf("%s %s проведена консультация %s %s %s%n", workers.getJob(), workers.getName(), new Owner(), animal.getType(), animal.getName());
        return null;
    }
}
