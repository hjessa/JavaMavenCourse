package Part102;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        BookUI ui = new BookUI(scanner);
        ui.run();
//        ArrayList<Literacy> literacyList = new ArrayList<>();
//        literacyList = LiteracyImport.fileImport("src/main/java/Part102/literacy.csv");
//        LiteracyImport.sortLiteracyList(literacyList);

//        Student a = new Student("c");
//        Student b = new Student("a");
//
//        System.out.println(b.compareTo(a));
//
//        Human ja = new Human("ja",2000);
//        Human ty = new Human("ty",1000);
//
//        ArrayList<Human> humans = new ArrayList<>();
//        humans.add(ja);
//        humans.add(ty);
//
//        humans.stream()
//                .sorted()
//                .forEach(human -> System.out.println(human.getWage()));
//        System.out.println();
//        humans.stream()
//                .forEach(human -> System.out.println(human.getWage()));
    }
}
