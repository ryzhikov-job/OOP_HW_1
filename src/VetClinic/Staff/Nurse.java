package VetClinic.Staff;

import VetClinic.Animal.Animal;
import VetClinic.Staff.StaffInterface.Operate;
import VetClinic.Staff.StaffInterface.Vaccinate;

public class Nurse extends Workers implements Operate, Vaccinate {
    public Nurse(String name, int age, int experience, int salary) {
        super(name, age, experience,salary);
    }

    @Override
    public void toWork(Animal animal) {
        System.out.printf("%s %s записывает результаты обследования в медицинскую карточку %s по имени %s%n", getJob(), getName(), animal.getType(), animal.getName());
    }

    @Override
    public int numberOperation() {
        return 2;
    }

    @Override
    public String operation(Workers workers, Animal animal) {
        return Operate.super.operation(workers, animal);
    }

    @Override
    public int numberOfVaccine() {
        return 1;
    }

    @Override
    public String vaccinate(Workers workers, Animal animal) {
        return Vaccinate.super.vaccinate(workers, animal);
    }
}
