package Part9;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){


        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
//        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
//        Book book2 = new Book("Robert Martin", "Clean Code", 1);
//        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
//
//        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
//        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
//        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);
//
//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book3);
//        System.out.println(cd1);
//        System.out.println(cd2);
//        System.out.println(cd3);


//        MisplacingBox box = new MisplacingBox();
//        box.add(new Item("Saludo", 5));
//        box.add(new Item("Pirkka", 5));
//
//        System.out.println(box.isInBox(new Item("Saludo")));
//        System.out.println(box.isInBox(new Item("Pirkka")));

    }

    public static void printPersons(ArrayList<Person> persons){
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
