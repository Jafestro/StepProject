package az.iktlab.java8.stepproject.readme_4;

import java.util.Set;

public class Dog extends Pet implements PetsFoul{
    public Dog(String nickname) {
        super(nickname);
    }

    public Dog(String nickname, int age, Set<String> habits) {
        super(nickname, age, habits);
    }

    public Dog() {
    }

    @Override
    public void respond() {
        System.out.println("Bark Bark!");
    }
}
