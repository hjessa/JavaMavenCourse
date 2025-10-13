package LargePrograms;

import java.util.ArrayList;

public class Grades {

    public ArrayList<Integer> grades;
    public ArrayList<Integer> passGrades;

    public Grades(){
        this.grades = new ArrayList<>();
        this.passGrades = new ArrayList<>();
    }

    public void add(int input){
        this.grades.add(input);
    }

    public void addPassing(int input){
        this.passGrades.add(input);
    }

    public double average(){
        int counter = this.grades.size();
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double) sum/counter;
    }

    public double averagePass(){
        int counter = this.passGrades.size();
        int sum = 0;
        for (Integer grade : passGrades) {
            sum += grade;
        }
        return (double) sum/counter;
    }
}
