package az.iktlab.java8.stepproject.readme_4;

import java.util.Random;
import java.util.Set;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;

    public Pet(String nickname) {
        this.nickname = nickname;
        this.trickLevel = setTrickLevel();
    }

    public Pet(String nickname, int age, Set<String> habits) {

        setSpecies(Species.UNKNOWN);
        this.nickname = nickname;
        this.age = setAge(age);
        this.trickLevel = setTrickLevel();
        this.habits = habits;
    }

    public Pet() {
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void eat() {
        System.out.println("I am eating.");
    }

    public abstract void respond();

    public int setAge(int age) {
        if (age < 0) {
            return 0;
        } else return this.age = age;
    }

    public int setTrickLevel() {
        Random rn = new Random();
        this.trickLevel = rn.nextInt(100) + 1;
        return this.trickLevel;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species=" + species +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector collects Pet...");
    }
}
