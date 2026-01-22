package Part102;

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name){
        this.name =name;
    }

    public String getName(){
        return this.name;
    }

    public int compareTo(Student student){
        return this.name.compareToIgnoreCase(student.getName());
    }



}
