package Clients;

import java.time.LocalDate;

public class Hippopotamus extends Animal{
    public Hippopotamus(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void fly(){
        System.out.println(getType() + " not fly");
    }
}
