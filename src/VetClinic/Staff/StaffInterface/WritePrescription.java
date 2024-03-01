package VetClinic.Staff.StaffInterface;

import VetClinic.Animal.Animal;
import VetClinic.Staff.Workers;

public interface WritePrescription {
    int numberPrescription();
    default String prescription(Workers workers, Animal animal){
        System.out.printf("%s %s выписан рецепт для %s %s%n", workers.getJob(), workers.getName(), animal.getType(), animal.getName());
        return null;
    }
}
