package az.iktlab.java8.stepproject.readme_4;

import java.util.Set;

public class RoboCat extends Pet implements PetsFoul{
    public RoboCat(String nickname) {
        super(nickname);
    }

    public RoboCat(String nickname, int age, Set<String> habits) {
        super(nickname, age, habits);
    }

    public RoboCat() {
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner.I am %s.I miss you!\n", this.getNickname());
    }
}
