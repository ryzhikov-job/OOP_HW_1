package VetClinic.Staff;

import VetClinic.Animal.Animal;

public abstract class Workers {
    protected String name;
    protected int age;
    protected int experience;
    protected int salary;

    public Workers (String name, int age, int experience, int salary) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
    }

    public abstract void toWork(Animal animal);

    public String getJob() {
        return getClass().getSimpleName();
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getExperience() {
        return experience;
    }
    public int getSalary() {
        return salary;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return String.format("name = %s, age = %s, experience = %s", name, age, experience);
    }
}