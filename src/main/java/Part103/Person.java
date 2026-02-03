package Part103;

public class Person {

    private String name;
    private Education grade;

    public Person(String name, Education grade){
        this.name = name;
        this.grade = grade;
    }

    public String toString(){
        return this.name+","+this.grade;
    }

    public Education getGrade(){
        return this.grade;
    }
}
