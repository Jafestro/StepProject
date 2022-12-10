package az.iktlab.java8.stepproject.readme_4;

import java.util.Set;

public class DomesticCat extends Pet implements PetsFoul{
    public DomesticCat(String nickname) {
        super(nickname);
    }

    public DomesticCat(String nickname, int age, Set<String> habits) {
        super(nickname, age, habits);
    }

    public DomesticCat() {
    }

    @Override
    public void respond() {
        System.out.println("Meow. Purrrr");
    }
}
