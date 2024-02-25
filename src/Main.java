import Clients.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Lion leva = new Lion("Лева", 200, LocalDate.now(), new Owner());
//        Lion puzo = new Lion("Кот", 450, LocalDate.now(), new Owner());
//        Dog pec = new Dog("Дружок", 30, LocalDate.now(), new Owner());
//        System.out.println(leva.getWeight());
//        leva.setWeight(250);
//        System.out.println(leva.getWeight());
//        puzo.live();
//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(puzo);
//        animals.add(leva);
//        animals.add(pec);
//        System.out.println(animals);
//
//        System.out.println(puzo);
//        System.out.println(puzo.getType());
//        System.out.println(pec);
//        System.out.println(pec.getType());
        Dog pastuh = new Dog("Пастух", 15, LocalDate.now(), new Owner());
        pastuh.toGo();
        pastuh.fly();
        pastuh.swim();
        Duck krya = new Duck("Кря", 3, LocalDate.now(), new Owner());
        krya.toGo();
        krya.fly();
        krya.swim();
        Hippopotamus popastiy = new Hippopotamus("Попастый", 1600, LocalDate.now(), new Owner());
        popastiy.toGo();
        popastiy.fly();
        popastiy.swim();
        Hummingbird gramm7 = new Hummingbird("Грамм7", 0.007, LocalDate.now(), new Owner());
        gramm7.toGo();
        gramm7.fly();
        gramm7.swim();
        Lion puzo = new Lion("Пузо", 190, LocalDate.now(), new Owner());
        puzo.toGo();
        puzo.fly();
        puzo.swim();
        Snake polzun = new Snake("Ползун", 5, LocalDate.now(), new Owner());
        polzun.toGo();
        polzun.fly();
        polzun.swim();
    }
}