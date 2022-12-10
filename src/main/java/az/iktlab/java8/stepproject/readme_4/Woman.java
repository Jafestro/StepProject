package az.iktlab.java8.stepproject.readme_4;

import java.util.Map;

public final class Woman extends Human{
    public Woman(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Woman(String name, String surname, int dateOfBirth, Human mother, Human father) {
        super(name, surname, dateOfBirth, mother, father);
    }

    public Woman(String name, String surname, int dateOfBirth, Human mother, Human father, Map<DayOfWeek, String> schedule) {
        super(name, surname, dateOfBirth, mother, father, schedule);
    }

    public Woman() {
    }

    @Override
    public void greetPet() {
        super.greetPet();
    }
    public void makeUp(){
        System.out.println("Getting pretty.");
    }
}
