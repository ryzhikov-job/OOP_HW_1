package VetClinic.Staff;

import VetClinic.Animal.Animal;
import VetClinic.Clients.Owner;
import VetClinic.Staff.StaffInterface.Consult;

public class Administrator extends Workers implements Consult {
    public Administrator(String name, int age, int experience, int salary) {
        super(name, age, experience,salary);
    }

    @Override
    public void toWork(Animal animal) {
        System.out.printf("%s %s делает запись на прием %s по имени %s%n", getJob(), getName(), animal.getType(), animal.getName());
    }

    @Override
    public int numberConsultation() {
        return 3;
    }

    @Override
    public String consult(Workers workers, Animal animal, Owner owner) {
        return Consult.super.consult(workers, animal, owner);
    }
}
