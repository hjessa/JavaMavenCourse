package Part101;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonUI {

    public static void addPerson(Scanner scanner){

        ArrayList<Person> persons = new ArrayList<>();

        String input = "";
        String firstName = "";
        String lastName = "";
        int bDate = 0;
        while(true){

            System.out.println("Continue personal information input? \"quit\" ends:");
            input = scanner.nextLine();
            if(input.equals("quit")){
                break;
            }
            System.out.println("Input 1st name: ");
            firstName = scanner.nextLine();
            System.out.println("Input 2nd name: ");
            lastName = scanner.nextLine();
            System.out.println("B-date: ");
            bDate = Integer.valueOf(scanner.nextLine());

            persons.add(new Person(firstName,lastName,bDate));

        }

        persons.stream()
                .map(person -> person.getLastName())
                .distinct()
                .forEach(surname -> System.out.println(surname));
    }
}
