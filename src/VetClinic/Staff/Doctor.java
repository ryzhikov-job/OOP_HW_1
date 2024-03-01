package VetClinic.Staff;


import VetClinic.Animal.Animal;
import VetClinic.Clients.Owner;
import VetClinic.Staff.StaffInterface.Consult;
import VetClinic.Staff.StaffInterface.Operate;
import VetClinic.Staff.StaffInterface.Vaccinate;
import VetClinic.Staff.StaffInterface.WritePrescription;

public class Doctor extends Workers implements Consult, Operate, Vaccinate, WritePrescription {
    public Doctor(String name, int age, int experience, int salary) {
        super(name, age, experience,salary);
    }

    @Override
    public void toWork(Animal animal) {
        System.out.printf("%s %s проводит обследование %s по имени %s%n", getJob(), getName(), animal.getType(), animal.getName());
    }

    @Override
    public int numberConsultation() {
        return 5;
    }

    @Override
    public String consult(Workers workers, Animal animal, Owner owner) {
        return Consult.super.consult(workers, animal, owner);
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

    @Override
    public int numberPrescription() {
        return 3;
    }

    @Override
    public String prescription(Workers workers, Animal animal) {
        return WritePrescription.super.prescription(workers, animal);
    }
}