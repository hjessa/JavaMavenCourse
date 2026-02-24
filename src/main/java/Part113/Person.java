package Part113;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age){
        if(name == null || name.isEmpty() || name.length()>40){
            throw new IllegalArgumentException("Imie nie może być null, pusty i dłuższy niż 40 znaków");
        }
        if(age>120 || age<0){
            throw new IllegalArgumentException("Imie nie może być mniejsze niż 0 i większe niż 120");
        }

        this.age = age;
        this.name = name;
    }
}
