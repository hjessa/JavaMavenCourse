package Part9;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        MisplacingBox box = new MisplacingBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));

    }

    public static void printPersons(ArrayList<Person> persons){
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
