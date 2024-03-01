package VetClinic;

import VetClinic.Animal.Animal;
import VetClinic.Animal.AnimalInterface.Flyable;
import VetClinic.Animal.AnimalInterface.Goable;
import VetClinic.Animal.AnimalInterface.Swimable;
import VetClinic.Staff.Administrator;
import VetClinic.Staff.Doctor;
import VetClinic.Staff.Nurse;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {

    public static List<Animal> getRunningAnimals(List<Animal> animals) {
        List<Animal> runningAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Goable) {
                runningAnimals.add(animal);
            }
        }
        return runningAnimals;
    }
    public static List<Animal> getFlyingAnimals(List<Animal> animals) {
        List<Animal> flyingAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                flyingAnimals.add(animal);
            }
        }
        return flyingAnimals;
    }
    public static List<Animal> getSwimmingAnimals(List<Animal> animals) {
        List<Animal> swimmingAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                swimmingAnimals.add(animal);
            }
        }
        return swimmingAnimals;
    }

    public static void doctorTests(Doctor doctor, Animal animal) {
        System.out.printf("%s %s направляет на анализы %s по имени %s%n",
                doctor.getJob(), doctor.getName(), animal.getType(), animal.getName());
    }
    public static void nurseTests(Nurse nurse, Animal animal) {
        System.out.printf("%s %s берет анализы у %s по имени %s%n",
                nurse.getJob(), nurse.getName(), animal.getType(), animal.getName());
    }
    public static void adminTests(Administrator administrator, Animal animal) {
        System.out.printf("%s %s делает запись на сдачу анализов %s по имени %s%n",
                administrator.getJob(), administrator.getName(), animal.getType(), animal.getName());
    }

}
