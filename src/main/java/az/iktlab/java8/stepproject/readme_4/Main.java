package az.iktlab.java8.stepproject.readme_4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Human ana = new Human("Ariel","Light",1799);
        Human ata = new Human("Jacob","Light",1798);
        Pet jony = new Dog("Jony",3,new HashSet<String>(Arrays.asList("Barking")));

        Map<DayOfWeek,String> jackSchedule = new HashMap<>();
                jackSchedule.put(DayOfWeek.MONDAY, "Doing something");
                jackSchedule.put(DayOfWeek.TUESDAY, "Eating...");
                jackSchedule.put(DayOfWeek.WEDNESDAY, "Walking");
                jackSchedule.put(DayOfWeek.THURSDAY, "Running...");
                jackSchedule.put(DayOfWeek.FRIDAY, "Swimming...");
                jackSchedule.put(DayOfWeek.SATURDAY,"Reading...");
                jackSchedule.put(DayOfWeek.SUNDAY,"Studying...");

        Human jack = new Human("Jack", "Light", 1821, ana, ata, jackSchedule);

        //System.out.println(jack);

        Family f1 = new Family(ana,ata);
        HashSet<Pet> pets = new HashSet<>();
        pets.add(jony);
        f1.addChild(jack);
        f1.setPet(pets);
        System.out.println(f1.countFamily());
        System.out.println(f1);
        jack.setFamily(f1);
        jack.feedPet(false);
        f1.deleteChild(0);
        System.out.println(f1.countFamily());
        System.out.println(f1);


//        for (int i = 0; i < 1_000_000; i++) {
//            new Human();
//        }

    }
}
