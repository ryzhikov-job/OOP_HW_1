package VetClinic.Staff.StaffInterface;

import VetClinic.Animal.Animal;
import VetClinic.Staff.Workers;

public interface Vaccinate {
    int numberOfVaccine();
    default String vaccinate(Workers workers, Animal animal){
        System.out.printf("%s %s проведена вакцинация %s %s%n", workers.getJob(), workers.getName(), animal.getType(), animal.getName());
        return null;
    }
}
