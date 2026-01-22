package Part102;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Student a = new Student("c");
        Student b = new Student("a");

        System.out.println(b.compareTo(a));

        Human ja = new Human("ja",2000);
        Human ty = new Human("ty",1000);

        ArrayList<Human> humans = new ArrayList<>();
        humans.add(ja);
        humans.add(ty);

        humans.stream()
                .sorted()
                .forEach(human -> System.out.println(human.getWage()));
        System.out.println();
        humans.stream()
                .forEach(human -> System.out.println(human.getWage()));
    }
}
