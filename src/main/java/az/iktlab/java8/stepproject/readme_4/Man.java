package az.iktlab.java8.stepproject.readme_4;

import java.util.Map;

public final class Man extends Human {
    public Man(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Man(String name, String surname, int dateOfBirth, Human mother, Human father) {
        super(name, surname, dateOfBirth, mother, father);
    }

    public Man(String name, String surname, int dateOfBirth, Human mother, Human father, Map<DayOfWeek, String> schedule) {
        super(name, surname, dateOfBirth, mother, father, schedule);
    }

    public Man() {
    }

    @Override
    public void greetPet() {
        super.greetPet();
    }
    public void carRepair(){
        System.out.println("Repairing my car.");
    }

}
