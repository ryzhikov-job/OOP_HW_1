import VetClinic.Animal.*;
import VetClinic.Clients.Owner;
import VetClinic.Staff.Administrator;
import VetClinic.Staff.Doctor;
import VetClinic.Staff.Nurse;
import VetClinic.VeterinaryClinic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static VetClinic.VeterinaryClinic.*;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Палкан", 15, LocalDate.now(), new Owner());
        Duck duck = new Duck("Кря", 3, LocalDate.now(), new Owner());
        Hippopotamus popastiy = new Hippopotamus("Попастый", 1600, LocalDate.now(), new Owner());
        Hummingbird hummingbird = new Hummingbird("Шустрый", 0.007, LocalDate.now(), new Owner());
        Lion lion = new Lion("Король", 250, LocalDate.now(), new Owner());
        Snake snake = new Snake("Проныра", 1, LocalDate.now(), new Owner());
        List<Animal> animals = new ArrayList<>(List.of(dog, duck, popastiy, hummingbird, lion, snake));
        List<Animal> runningAnimals = VeterinaryClinic.getRunningAnimals(animals);
        List<Animal> flyingAnimals = VeterinaryClinic.getFlyingAnimals(animals);
        List<Animal> swimmingAnimals = VeterinaryClinic.getSwimmingAnimals(animals);
        System.out.println(runningAnimals);
        System.out.println(flyingAnimals);
        System.out.println(swimmingAnimals);
        Doctor doc = new Doctor("Василий", 33, 8, 200000);
        Administrator adm = new Administrator("Владлена", 25, 1, 50000);
        Nurse nurse = new Nurse("Василиса", 27, 2, 100000);
        adm.toWork(popastiy);
        adm.consult(adm, popastiy, popastiy.getOwner());
        System.out.println(adm.numberConsultation());
        adminTests(adm, popastiy);
        doc.toWork(popastiy);
        doc.consult(doc, popastiy, popastiy.getOwner());
        doctorTests(doc, popastiy);
        System.out.println(doc.numberConsultation());
        doc.operation(doc, popastiy);
        doc.numberOperation();
        doc.vaccinate(doc, popastiy);
        doc.prescription(doc, popastiy);
        System.out.println(doc.numberPrescription());
        nurse.toWork(popastiy);
        nurseTests(nurse, popastiy);
        nurse.operation(nurse, popastiy);
        System.out.println(nurse.numberOperation());
        nurse.vaccinate(nurse, popastiy);
        System.out.println(nurse.numberOfVaccine());

    }
}