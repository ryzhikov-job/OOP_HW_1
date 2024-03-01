package VetClinic.Staff.StaffInterface;

import VetClinic.Animal.Animal;
import VetClinic.Staff.Workers;

public interface Operate {
    int numberOperation();
    default String operation(Workers workers, Animal animal){
        System.out.printf("%s %s проведена операция %s %s%n", workers.getJob(), workers.getName(), animal.getType(), animal.getName());
        return null;
    }
}
