package Part103;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    List<Person> employees;

    public Employees(){
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd){
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        this.employees.addAll(peopleToAdd);
    }

    public void print(){
        this.employees.forEach(System.out::println);
    }

    public void print(Education education){
        Iterator<Person> interator = this.employees.iterator();

        while(interator.hasNext()){
            Person person = interator.next();
            if(person.getGrade() == education)
                System.out.println(person);
        }
    }
}
