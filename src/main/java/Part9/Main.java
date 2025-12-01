package Part9;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){


        // the usual:
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3

// however, history() still doesn't work properly:
        System.out.println(juice.history()); // [1000.0]

// so we only get the initial state of the history set by the constructor...
//        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
//        juice.addToWarehouse(1000.0);
//        juice.takeFromWarehouse(11.3);
//        System.out.println(juice.getName()); // Juice
//        juice.addToWarehouse(1.0);
//        System.out.println(juice);
//        ArrayList<Person> persons = new ArrayList<Person>();
//        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
//        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
//
//        printPersons(persons);
    }

    public static void printPersons(ArrayList<Person> persons){
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
