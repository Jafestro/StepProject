package az.iktlab.java8.stepproject.readme_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int dateOfBirth;
    private int iq;
    private Family family;
    private Map<DayOfWeek,String> schedule;


    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = setIQ();
    }

    public Human(String name, String surname, int dateOfBirth, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.family = new Family(mother,father);
        this.iq = setIQ();
    }

    public Human(String name, String surname, int dateOfBirth, Human mother, Human father, Map<DayOfWeek,String> schedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = setIQ();
        this.family = new Family(mother,father);
        this.schedule = schedule;
    }

    public Human() {
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Map<DayOfWeek,String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayOfWeek,String> schedule) {
        this.schedule = schedule;
    }

    public int getIq() {
        return iq;
    }

    public void greetPet(){
        List<Pet>petNames = new ArrayList<>(family.getPet());
        for (Pet pet : petNames) {
            System.out.printf("Hello, %s,\n", pet.getNickname());
        }

    }
    public void describePet() {
        family.getPet().stream().filter(a -> a.getTrickLevel() > 50)
                .forEach(a -> System.out.printf("I have a %s, he is %s years old, he is very sly.\n",a.getSpecies(),a.getAge()));
        family.getPet().stream().filter(a -> a.getTrickLevel() < 50)
                       .forEach(a -> System.out.printf("I have a %s, he is %s years old, he is almost not sly.\n",a.getSpecies(),a.getAge()));
                }
    public int setIQ(){
        Random rn = new Random();
        this.iq = rn.nextInt(101) + 1;
        return this.iq;
    }

    public void feedPet(boolean feed){
    Random reqem = new Random();
    int refer = reqem.nextInt(101);
    if(feed){
        System.out.println("Feeding pets");
    }
    else {
        family.getPet().stream().filter(a -> a.getTrickLevel() > refer)
                .forEach(a -> System.out.printf("Hmm... I think i will feed %s.\n",a.getNickname()));
        family.getPet().stream().filter(a -> a.getTrickLevel() < refer)
                .forEach(a -> System.out.printf("I think %s is not hungry.\n",a.getNickname()));
    }
}

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", iq=" + iq +
                ", family=" + family +
                ", schedule=" + schedule +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector collects Human...");
    }

}
