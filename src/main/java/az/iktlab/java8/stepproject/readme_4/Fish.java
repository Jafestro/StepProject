package az.iktlab.java8.stepproject.readme_4;

import java.util.Set;

public class Fish extends Pet{
    public Fish(String nickname) {
        super(nickname);
    }

    public Fish(String nickname, int age, Set<String> habits) {
        super(nickname, age, habits);
    }

    public Fish() {
    }

    @Override
    public void respond() {
        System.out.println("Fish speaks Blob blob");
    }
}
